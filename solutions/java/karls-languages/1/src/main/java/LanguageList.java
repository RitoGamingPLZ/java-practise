import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // throw new UnsupportedOperationException("Please implement the isEmpty() method");
        return this.languages.isEmpty();
    }

    public void addLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the addLanguage() method");
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the removeLanguage() method");
        this.languages.remove(language);
    }

    public String firstLanguage() {
        // throw new UnsupportedOperationException("Please implement the firstLanguage() method");
        return this.languages.get(0);
    }

    public int count() {
        // throw new UnsupportedOperationException("Please implement the count() method");
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the containsLanguage() method");
        return this.languages.indexOf(language) != -1;
    }

    public boolean isExciting() {
        // throw new UnsupportedOperationException("Please implement the isExciting() method");
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
