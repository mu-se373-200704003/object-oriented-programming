public class Person {
    private String Std_name;

    public String getStd_name() {
        return Std_name;
    }

    public void setStd_name(String newStd_name) {
        this.Std_name = newStd_name;
        System.out.println("student"+getStd_name()+"is learning now");
    }
    private String Prof_name;

    public String getProf_name() {
        return Prof_name;
    }

    public void setProf_name(String newProf_name) {
        this.Prof_name = newProf_name;
        System.out.println("prof"+getProf_name()+"is teaching now");

    }
}
