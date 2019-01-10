package training.stack.networking.Threading;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import training.stack.Playlist;
import training.stack.Song;

public class stream {
	public static void main(String[] args) throws IOException
	{
		List<String> nameList = Arrays.asList(new String[] {"F","B","C","D","E","A"});
		nameList.stream().sorted().forEach(System.out::print);
		
		//nameList.stream().filter((x)-> x.equals("F")).forEach(System.out::println);
		//nameList.stream().filter((x)-> x.equals("F")).map((y)-> y+"A").forEach(System.out::println)
		
		List<String> filteredWithMappedList = nameList.stream().filter((x)->x.contentEquals("F")).
															map((y)->y+"A")
															.collect(Collectors.toList());
		System.out.print("\n"+nameList);
		System.out.println("\n"+filteredWithMappedList);
		
		Playlist playlist = new Playlist();
		ArrayList<Song> songs = playlist.getSongsFromFile();
		
		songs.parallelStream().sorted((s1,s2)->s1.getTitle().compareTo(s2.getTitle())).forEach(System.out::println);
	}
}
