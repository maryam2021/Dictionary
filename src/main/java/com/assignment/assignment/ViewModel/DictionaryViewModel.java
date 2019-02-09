package com.assignment.assignment.ViewModel;

public class DictionaryViewModel {

    private String type ;
    private String meaning ;
    private String usage ;

    public DictionaryViewModel() {
    }

    public DictionaryViewModel(String type, String meaning, String usage) {
        this.type = type;
        this.meaning = meaning;
        this.usage = usage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
