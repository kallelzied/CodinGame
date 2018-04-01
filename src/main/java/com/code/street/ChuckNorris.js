/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

var MESSAGE = readline();
var binary = "";
for (var i = 0; i < MESSAGE.length; i++) {
  binary += MESSAGE[i].charCodeAt(0).toString(2);
  while(binary.length<7) binary="0" + binary;
}
var out = "";
//convert to unary and print to console
var i = 0;
var currentChar;
while (i < binary.length) {
	if (binary.charAt(i) == '0') {
		out+="00 ";
		currentChar = '0';
	}else {
		out+="0 ";
		currentChar = '1';
	}
	while(binary.charAt(i) == currentChar) {
		out+="0";
		i+=1;
		if(i >= binary.length) break;
	}
	if(i < binary.length) 	out+=" ";
}
print(out);