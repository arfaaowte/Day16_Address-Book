class PersonInfo {
        String name;
        String address;
        String phoneNum;
        //parameterized constructor
        public PersonInfo(String n, String a, String p){
        name = n;
        address = a;
        phoneNum = p;
	print(); 
}
        //method for displaying person record on GUI
        public void print() {
                System.out.println("Name: "+ name + " Address: "+ address + " Phone no: "+phoneNum);
 }
 }
