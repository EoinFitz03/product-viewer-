package productv5;

public class music extends Product{
    private String artist;

    private String label;

    public music(){
        super();
        artist = "";
        label = "";
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "the music" +
                "artist is " + artist + '\'' +
                " and the label is " + label + '\'' ;
    }
}

