import java.util.Random;

public class Film_Production extends Production {
    private int rating = generateRating();
    private Genre genre;
    private Production production;

    public Film_Production(String nameProd, String countryOfProd, Genre genre) {
        super(nameProd, countryOfProd);
        this.genre = genre;
        this.production = new Production(nameProd, countryOfProd);
    }

    private int generateRating() {
        Random random = new Random();
        return random.nextInt(1, 11);
    }

    public double getRating() {
        return rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public Production getProduction() {
        return production;
    }

    public String getInfo() {
        if (getNameProd() == "Universal") {
            return "\nСредний рейтинг всех фильмов: " + rating +
                    "\nЖанр: " + genre +
                    "\nНазвание киностудии: " + production.getNameProd() +
                    "\nСтрана киностудии: " + production.getCountryOfProd();
        } else {
            return "\nРейтинг фильма: " + rating +
                    "\nЖанр: " + genre +
                    "\nНазвание киностудии: " + production.getNameProd() +
                    "\nСтрана киностудии: " + production.getCountryOfProd();
        }}

    public final void voiceover () {
        System.out.println("Дубляж");
    }
    public void voiceover1 (String voiceover1){
        System.out.println(voiceover1);
    }
}