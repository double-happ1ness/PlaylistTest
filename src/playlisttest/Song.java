package playlisttest;

public class Song{
    private String title;
    private String artist;
    private String year;

    public Song(String title, String artist, String year){
        this.title=title;
        this.artist=artist;
        this.year=year;
    }
	
    public void changeArtist(String newArtist){
        this.artist=newArtist;
    }
	
    public Boolean matchFound(String year){
        return this.year.equals(year);
    }

    public String toString(){
        return "title: "+this.title+" artist: "+this.artist+" year: "+this.year;
    }
}
