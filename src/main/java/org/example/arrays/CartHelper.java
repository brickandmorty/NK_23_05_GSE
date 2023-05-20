package org.example.arrays;

public class CartHelper {

        public static int countDifferentArticles(String[] articles) {
            int count = 0;
            for (int i = 0; i < articles.length; i++) {
                boolean isDifferent = true;
                for (int j = 0; j < i; j++) {
                    if (articles[i].equals(articles[j])) {
                        isDifferent = false;
                        break;
                    }
                }
                if (isDifferent) {
                    count++;
                }
            }
            return count;
        }

        public static void printAll(String[] articles) {
            int i = 0;
            while (i < articles.length) {
                System.out.println("Index " + i + ": " + articles[i]);
                i++;
            }
        }

        public static void main(String[] args) {
            String[] cart = {"shirt", "car", "shirt", "bike"};
            int numDifferentArticles = countDifferentArticles(cart);
            System.out.println("Es befinden sich " + numDifferentArticles + " unterschiedliche Artikel im Warenkorb");
            printAll(cart);
        }
    }

