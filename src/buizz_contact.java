public class buizz_contact extends Person{


    private String Phone;

    public buizz_contact(String name, String email, String phone) {
        super(name, email);
        Phone = phone;
    }

    public buizz_contact(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    @Override
    public void display() {
        System.out.println("the name is "+super.getName()+" and the email is "+ super.getEmail() + " and the number is "+Phone);

    }
}

