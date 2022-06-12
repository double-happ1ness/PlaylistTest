package playlisttest;

public class PlaylistTest{
    public static void main(String[] args){
        Integer playlistSize=Input.getInteger("playlist size: ");
        Playlist playlist=new Playlist(playlistSize);
        String title;
        String artist;
        String year;
        Integer option;
        do{
            System.out.println("0: quit");
            System.out.println("1: add song");
            System.out.println("2: change song artist");
            System.out.println("3: match against year");
            System.out.println("4: display");
            option=Input.getInteger("option: ");
            switch (option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    title = Input.getString("title: ");
                    artist = Input.getString("artist: ");
                    year = Input.getString("year: ");
                    playlist.addSong(title, artist, year);
                    break;
                case 2:
                    year = Input.getString("year: ");
                    artist = Input.getString("new artist: ");
                    System.out.println(playlist.changeSongArtist(year, artist));
                    break;
                case 3:
                    year = Input.getString("year: ");
                    System.out.println(playlist.findMatch(year));
                    break;
                case 4:
                    System.out.println(playlist);
                    break;
                default:
                    System.out.println("invalid option");
                    
            }
        }while(option!=0);
    }
}
