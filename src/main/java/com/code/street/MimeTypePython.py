import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input()) # Number of elements which make up the association table.
q = int(input()) # Number Q of file names to be analyzed.

mime_type_map = {}

for i in range(n):
     # ext: file extension
     # mt: MIME type.

    ext, mt = input().split()
    mime_type_map[ext.lower()]=mt

for i in range(q):
    fname = input() # One file name per line
    if not "." in fname:
        print("UNKNOWN")
        continue
    f_ext = fname.split(".")[-1].lower()
    if mime_type_map.get(f_ext):
        print(mime_type_map[f_ext])
    else:
        print("UNKNOWN")