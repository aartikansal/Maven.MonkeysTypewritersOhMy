package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        StringBuilder builder = new StringBuilder();
        while(stringIterator.hasNext()) {

            String word = stringIterator.next();

            builder.append(word + " ");
        }

        copied += builder.toString();
    }
}