/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.onload = function() {
    let tlacitko = document.getElementById("tlacitko");
    let tlacitko1 = document.getElementById("tlacitko1");
    let cislo1 = document.getElementById("cislo1");
    let cislo2 = document.getElementById("cislo2");

    tlacitko.onclick = function() {
        alert(parseInt(cislo1.value) + parseInt(cislo2.value));
    };

    tlacitko1.onclick = function() {
        alert(parseInt(cislo1.value) - parseInt(cislo2.value));
    };
}

