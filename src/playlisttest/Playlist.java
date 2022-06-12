package playlisttest;

public class Playlist{
    private Song[] songs;
    private Integer numberOfSongs;

    public Playlist(Integer playlistSize){
        this.songs=new Song[playlistSize];
        this.numberOfSongs=0;
    }
	
    public void addSong(String title, String artist, String year){
        // no error checking so assumes banner id is unique and array won't overfill
        this.songs[this.numberOfSongs]=new Song(title,artist,year);
        this.numberOfSongs++;
    }

    public String changeSongArtist(String year,String newArtist){
        // no error checking so assumes year will match existing song
        // returns song details
        String songDetails=new String();
        Integer song=0;
        while(!this.songs[song].matchFound(year))
            song++;
        this.songs[song].changeArtist(newArtist);
        songDetails+=this.songs[song];
        return songDetails;
    }
	
    public String findMatch(String year){
        // returns the song details or a not found message
        String songDetails=new String();
        Integer song=0;
        while(song<this.numberOfSongs&&!this.songs[song].matchFound(year))
            song++;
        if(song<this.numberOfSongs)
            songDetails+=this.songs[song].toString();
        else
            songDetails+="no match for song with year "+year;
        return songDetails;
   }
	
    public String toString(){
        String playlistDetails=new String();
        if (this.numberOfSongs!=0)
            for(Integer song=0;song<this.numberOfSongs;song++)
                playlistDetails+=this.songs[song]+"\n";
        else
            playlistDetails+="song list is empty";
        return playlistDetails;
    }
}
