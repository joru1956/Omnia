/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  document.write("<nav id='menu'>");
  document.write("<ul>");
    document.write("<li><a href='index.html'>Home</a></li>");
    document.write("<li><a class='dropdown-arrow' href='http://'>Products</a>");
      document.write("<ul class='sub-menus'>");
        document.write("<li><a href='Prvni.html'>Products 1</a></li>");
        document.write("<li><a href='Druha.html'>Products 2</a></li>");
        document.write("<li><a href='Treti.html'>Products 3</a></li>");
        document.write("<li><a href='Ctvrta.html'>Kalkulačka</a></li>");
        document.write("<li><a href='Kalkulacka-2.html'>Kalkulačka-2</a></li>");
      document.write("</ul>");
    document.write("</li>");
    document.write("<li><a href='http://'>About</a></li>");
    document.write("<li><a class='dropdown-arrow' href='http://'>Services</a>");
      document.write("<ul class='sub-menus'>");
        document.write("<li><a href='Sest.html'>Soubor</a></li>");
        document.write("<li><a href='sedum.html'>Test 2</a></li>");
        document.write("<li><a href='Osum.html'>Čtení souboru</a></li>");
      document.write("</ul>");
    document.write("</li>");
    document.write("<li><a href='http://'>Contact Us</a></li>");
  document.write("</ul>");
document.write("</nav>");


