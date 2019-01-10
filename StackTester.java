package training.stack;

import java.io.*;
import java.util.*;

import training.stack.Song;

public class StackTester {
	
	public static void main(String args[])
	{
		Playlist playlist = new Playlist();
		try {
			ArrayList<Song> songs = playlist.getSongsFromFile();
			System.out.println(songs);
			Song s = new Song();
			Collections.sort(songs);
			System.out.println(songs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Song song = new Song(); song.setBps("90"); song.setDuration("4");
		 * song.setSinger("Arijit"); song.setTitle("tera"); song.setMovie("Genius");
		 * 
		 * System.out.println(song);
		 */
		/*
		 * String arr[] = new String[10]; FixedArray fa = new FixedArray(10);
		 * fa.push("lol",arr); fa.push("bkc",arr); fa.display(arr); fa.pop(arr);
		 * fa.pop(arr); fa.pop(arr);
		 */
	}
}
