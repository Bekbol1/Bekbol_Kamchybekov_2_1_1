public final class Movie extends Film_Production {
    private String nameOfMovie;
    private int yearOfRelease;

    public Movie(String nameOfMovie, int yearOfRelease, Genre genre, String nameProd, String countryOfProd) {
        super(nameProd, countryOfProd, genre);
        this.nameOfMovie = nameOfMovie;
        this.yearOfRelease = yearOfRelease;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
    @Override
    public void voiceover1(String voiceover1) {
        System.out.println(voiceover1);
    }

    @Override
    public String getInfo() {
        voiceover1("Дубляж");
        return super.getInfo()+"\nНазвание фильма: " + nameOfMovie+
                "\nГод выпуска: " + yearOfRelease+
                "\nОзвучка фильма: Дубляж";
    }
}