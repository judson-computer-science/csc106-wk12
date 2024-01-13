import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Main {

	public static void main(String[] args) throws Exception {

		Path path = Paths.get(args[0]);

		if(Files.exists(path)) {

			if(Files.isDirectory(path)) {

                             // print out all files in the directory

			} else {

                            // print lastModified time and file contents

			}
			
		} else {
			System.out.println(path + " does not exist!");
		}
	}
}

