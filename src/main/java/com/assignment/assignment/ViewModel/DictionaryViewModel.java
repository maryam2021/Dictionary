package com.assignment.assignment.ViewModel;

import com.fasterxml.jackson.annotation.JsonIgnore;


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

    public String getType(String s) {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeaning(String s) {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getUsage(String s) {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DictionaryViewModel that = (DictionaryViewModel) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (meaning != null ? !meaning.equals(that.meaning) : that.meaning != null) return false;
        return usage != null ? usage.equals(that.usage) : that.usage == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (meaning != null ? meaning.hashCode() : 0);
        result = 31 * result + (usage != null ? usage.hashCode() : 0);
        return result;
    }
}
