package com.alura.StarsWarsAPI.principal;
import com.alura.StarsWarsAPI.connectToAPI.ConnectAPI;
import com.alura.StarsWarsAPI.connectToAPI.StarsWars;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ConnectAPI connectAPI = new ConnectAPI();
        StarsWars starsWars = connectAPI.buscaPeliculas(2 );
        System.out.println(starsWars);
    }
}