package com.yugao.avajlauncher;

import com.yugao.avajlauncher.aircraft.Simulator;
import com.yugao.avajlauncher.exception.InputException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Entry {
    public static void main(String[] args) {
        try {
            if (args.length !=  1) {
                throw new InputException("Usage: java Simulator path");
            }
            PrintStream fileOut = new PrintStream(new FileOutputStream("simulation.txt"));
            System.setOut(fileOut);
            Simulator sim = new Simulator(args[0]);
            sim.simulationStart();

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
    }
}
