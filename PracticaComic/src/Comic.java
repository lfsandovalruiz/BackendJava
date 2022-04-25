public class Comic {
    private String title;
    private String editorial;
    private int numPages;

    Comic(String title, String editorial, int numPages){
        this.title = title;
        this.editorial = editorial;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getState(){
        return "Title: " + title + "\n" +
                "Editorial: " + editorial + "\n" +
                "Number of pages: " + numPages;
    }
}
