/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

var N = parseInt(readline()); // Number of elements which make up the association table.
var Q = parseInt(readline()); // Number Q of file names to be analyzed.
var EXT = [], MT = [];
for (var i = 0; i < N; i++) {
    var inputs = readline().split(' ');
    EXT.push(inputs[0]); // file extension
    MT.push(inputs[1]); // MIME type.
}
for (var i = 0; i < Q; i++) {
    var FNAME = readline(), // One file name per line.
    res = "",
    noDot = true;

    for(var k = FNAME.length - 1; k >= 0; k--)
    {
        if(FNAME[k] === ".")
        {
            noDot = false;
            break;
        }
        res = FNAME[k] + res;
    }
    if(!noDot && res !=="")
    {
        for(var j = 0, check = false; j < N; j++)
        {
            if(res.toUpperCase() === EXT[j].toUpperCase())
            {
                print(MT[j]);
                check = true;
                break;
            }
        }
            if(!check)
                print('UNKNOWN');
    }
    else
        print('UNKNOWN');
}