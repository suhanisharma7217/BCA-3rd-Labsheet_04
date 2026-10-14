class WordCounter {
    static String language = "English";

    int countWords(String sentence) {
        String trimmed = sentence.trim();
        if (trimmed.isEmpty()) return 0;
        String[] words = trimmed.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        String sentence = "Java is easy to learn";
        int count = w.countWords(sentence);
        System.out.println("Language: " + language);
        System.out.println("Word count: " + count);
    }
}
