package ru.netology.javaqa.domain;

public class Afisha {

    private String[] movies = new String[0];
    private final int limit;

    public Afisha() {
        limit = 10;
    }

    public void add(String movie) {

        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int length = Math.min(movies.length, limit);
        String[] tmp = new String[length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
