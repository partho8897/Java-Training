package training.stack;
import java.io.*;
import java.util.*;

public class Playlist {
	private static final String FILE_LOCATION = "/Users/c-parthp.paul/Desktop/song.txt";
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public ArrayList<Song> getSongsFromFile() throws IOException
	{
		File file = new File(FILE_LOCATION);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line=null;
			while((line = reader.readLine()) != null)
			{
				String[] tokens = line.trim().split("#");
				Song song = new Song();
				song.setTitle(tokens[0].trim());
				song.setSinger(tokens[1].trim());
				song.setMovie(tokens[2].trim());
				song.setBps(tokens[3].trim());
				song.setDuration(tokens[4].trim());
				songs.add(song);
				//System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			//e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("IOException");
			//e.printStackTrace();
		}
		return songs;
	}
}