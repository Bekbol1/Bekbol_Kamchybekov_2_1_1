public class Main {
    public static void main(String[] args) {
        String[] voiceover = {"Дубляж"};
        Movie movie = new Movie("Титаник", 1997,
                Genre.DRAMA, "20th Century Fox", "США");
        System.out.println(movie.getInfo());
        System.out.println("---------------------------------------------------------------------------------------");
        Movie movie1 = new Movie("Один дома", 1990,Genre.COMEDY,
                "Hughes Entertainment","США");
        System.out.println(movie1.getInfo());
        System.out.println("----------------------------------------------------------------------------------------");
        Film_Production filmProduction = new Film_Production("Universal","США",Genre.ALL);
        System.out.println(filmProduction.getInfo());
    }
}