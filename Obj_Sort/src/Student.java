public class Student {
    private String id;
    private String fullName;
    private String academicYear;
    private double math;
    private double chemistry;
    private double physic;

    public Student(String id, String fullName, String academicYear, double math, double chemistry, double physic) {
        this.id = id;
        this.fullName = fullName;
        this.academicYear = academicYear;
        this.math = math;
        this.chemistry = chemistry;
        this.physic = physic;
    }
    public String getFirstNameStd() {
        /*
            method lay ra ten cuoi cung trong fullName
            vd: Nguyen Van A => A
         */
        int n = this.fullName.lastIndexOf(" "); // tim index cua dau space cuoi cung
        if(n<0) // neu khong co thi return ve fullName (vd "Nguyen" > return "Nguyen")
            return this.fullName;
        else return (this.fullName.substring(n+1, this.fullName.length())); //(vd "Nguyen Nam" > return "Nam")
    }
    public double getDTB() {
        return (this.chemistry + this.math + this.physic) / 3;
    }
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public double getMath() {
        return math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getPhysic() {
        return physic;

    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", academicYear='" + academicYear + '\'' +
                ", math=" + math +
                ", chemistry=" + chemistry +
                ", physic=" + physic +
                '}'+"\n";
    }
}
