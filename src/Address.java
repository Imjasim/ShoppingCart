public class Address {
    private String user_address;


    public  Address  ()
    {
    }

    public  Address  (String addre)
    {
        user_address = addre;
    }

    public String getFullAddress()
    {
        return user_address ;
    }
}
