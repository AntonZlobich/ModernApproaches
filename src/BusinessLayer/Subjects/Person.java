package BusinessLayer.Subjects;

public abstract class Person {
    String FirstName;
    String SurName;
    String Mail;
    String PhoneNumber;

    public String getInfo(){
        return this.FirstName + ' ' + this.SurName + "; " + this.Mail + "; " + this.PhoneNumber + '.';
    }
}
