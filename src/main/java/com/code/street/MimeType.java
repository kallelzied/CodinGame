package com.code.street;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class MimeType{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String[] EXT   = new String[N];
        String[] MT    = new String[N];

        for (int i = 0; i < N; i++)
        {
            EXT[i] = in.next(); // file extension
            MT[i]  = in.next(); // MIME type.
        }
        in.nextLine();
        for (int i = 0; i < Q; i++)
        {
            String FNAME = in.nextLine();// One file name per line.
            String extension = "";

            int index = FNAME.lastIndexOf(".");
            if (index >= 0)
            {
                extension = FNAME.substring(index + 1);
                boolean found = false;
                // String extToSearch = arrayExt[arrayExt.length - 1];
                for(int j = 0; j < N; j++)
                {
                    if(extension.equalsIgnoreCase(EXT[j]))
                    {
                        System.out.println(MT[j]);
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.println("UNKNOWN");
            }
            else
                System.out.println("UNKNOWN");
        }
    }
}
