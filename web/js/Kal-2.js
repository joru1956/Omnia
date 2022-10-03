/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global value */

let one = '1';// promenne pro tlacitka
let two = '2';
let three = "3";
let four = "4";
let five = "5";
let six = "6";
let seven = "7";
let eight = "8";
let nine = "9";
let zero = "0";
let plus = "+";
let minus = "-";
let multiply = "*";
let divide = "/";
let decimal = ".";
let pamet = "";
let lzavorka = "(";
let rzavorka = ")";

function compute(calc) {// obj je nazev formulare
if (calc.expr.value) calc.expr.value = eval(calc.expr.value);// pokud je na displayi hodnota – vypocti ji
}
function enter(calc, string){
calc.expr.value += string;// pridava hodnotu na display
}
function mem(calc){
if (calc.expr.value) pamet = '('+calc.expr.value+')';// co je v pameti prijde do zavorek
}
}
