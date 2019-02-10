package com.assignment.assignment.ViewModel;



public class DictionaryViewModel {
    private String type;
    private  String meaning;
    private  String usage;

    public DictionaryViewModel(String type, String meaning, String scentence) {
        this.type = type;
        this.meaning = meaning;
        this.usage = scentence;
    }

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String getMeaning() {return meaning;}

    public void setMeaning(String meaning) {this.meaning = meaning;}

    public String getUsage() {return usage;}

    public void setUsage(String usage) {this.usage = usage;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DictionaryViewModel)) return false;
        DictionaryViewModel that = (DictionaryViewModel) o;
        if (type != null ? !type.equals(that.type) : that.type != null)
            return false;
        if (meaning != null ? !meaning.equals(that.meaning) : that.meaning != null)
            return false;
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
