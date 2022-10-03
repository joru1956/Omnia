/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


let tabulka;
let vychoziVelikostX = 5;
let vychoziVelikostY = 3;

let aktivniBunka;

let prvniRadek = tabulka.firstElementChild;
let bunkyPrvnihoRadku = prvniRadek.childNodes;
let pocetBunekVPrvnimRadku = bunkyPrvnihoRadku.length;

/*
 * table = <TABLE>
 * table.firstElementChild = <TR>
 * table.firstElementChild.childNodes = [<TD>]
 * table.firstElementChild.childNodes.length = number
 *
 * table.   firstElementChild.  childNodes  .length
 * <TABLE>. <TR>.           [<TD>]      .length
 */

function vytvorBunku() {
    let td = document.createElement("td");

    let tdInput = document.createElement("input");

    tdInput.type = "text";
    tdInput.onfocus = function () {
        aktivniBunka = this;
    }
    td.appendChild(tdInput);

    return td;
}

function vytvorVychoziTabulku() {
    tabulka = document.createElement("table");
    document.body.appendChild(tabulka);
    for (let y = 0; y < vychoziVelikostY; y++) {
        let tr = document.createElement("tr");
        tabulka.appendChild(tr);

        for (let x = 0; x < vychoziVelikostX; x++) {
            tr.appendChild(vytvorBunku());
        }
    }
}

window.onload = function () {
    vytvorOvladaciTlacitka();
    vytvorVychoziTabulku();
}

function vytvorRadek() {
    let novyRadek = document.createElement("tr");

    for (let i = 0; i < tabulka.firstElementChild.childNodes.length; i++) {
        novyRadek.appendChild(vytvorBunku());
    }
    return novyRadek;
}

function indexRadkuAktivniBunky() {
    let cilHledani = tabulka.childNodes;
    let hledanyPrvek = aktivniBunka.parentElement.parentElement;
    return Array.prototype.indexOf.call(cilHledani, hledanyPrvek);
}

function indexSloupceAktivniBunky() {
    let bunkyVRadku = aktivniBunka.parentElement.parentElement.childNodes;
    let td = aktivniBunka.parentElement;
    return Array.prototype.indexOf.call(bunkyVRadku, td);
}

function pridejRadekNahoru() {
    let radek = vytvorRadek();
    let indexVybraneho = indexRadkuAktivniBunky();
    tabulka.insertBefore(radek, tabulka.childNodes[indexVybraneho]);
}

function pridejRadekDolu() {
    let radek = vytvorRadek();
    let indexVybraneho = indexRadkuAktivniBunky();
    if (tabulka.lastChild == tabulka.childNodes[indexVybraneho]) {
        tabulka.appendChild(radek);
    } else {
        tabulka.insertBefore(radek, tabulka.childNodes[indexVybraneho + 1]);
    }
}


function pridejSloupecDoleva() {
    let indexVybraneho = indexSloupceAktivniBunky();
    for (let i = 0; i < tabulka.childNodes.length; i++) {
        tabulka.childNodes[i].insertBefore(vytvorBunku(), tabulka.childNodes[i].childNodes[indexVybraneho]);
    }
}

function pridejSloupecDoprava() {
    let indexVybraneho = indexSloupceAktivniBunky();
    for (let i = 0; i < tabulka.childNodes.length; i++) {
        if (tabulka.childNodes[i].childNodes[indexVybraneho] == tabulka.childNodes[i].lastElementChild) {
            tabulka.childNodes[i].appendChild(vytvorBunku());
        } else {
            tabulka.childNodes[i].insertBefore(vytvorBunku(), tabulka.childNodes[i].childNodes[indexVybraneho + 1]);
        }
    }
}

function vytvorTlacitkoAVlozHo(popisek, rodic) {
    let btn = document.createElement("button");
    btn.textContent = popisek;
    rodic.appendChild(btn);
    return btn;
}

function vytvorOvladaciTlacitka() {
    vytvorTlacitkoAVlozHo("Přidat řádek dolů", document.body);
    vytvorTlacitkoAVlozHo("Přidat řádek nahoru", document.body);
    vytvorTlacitkoAVlozHo("Přidat sloupec vlevo", document.body);
    vytvorTlacitkoAVlozHo("Přidat sloupec vpravo", document.body);
    vytvorTlacitkoAVlozHo("Odstranit řádek", document.body);
    vytvorTlacitkoAVlozHo("Odstranit sloupec", document.body);
}