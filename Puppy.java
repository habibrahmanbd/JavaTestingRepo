class Puppy {
   int puppyAge;
   String cellNo;
   String Address;
   int nat;
   double AccountBal;

   public Puppy(String name, String FathersName, String MothersName) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
      System.out.println("Father's Name  :" +FathersName);
      System.out.println("Mother's Name  :" +MothersName);
   }

   public void setAge( int age, String cell, String Address, int Nat, double Bal ) {
      puppyAge = age;
      cellNo = cell;
      this.Adress = Adress;
      nat = Nat;
      AccountBal = Bal;
   }

   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy", "Alex", "Zaiomi" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 , "8801739******", "CHA - 67, Surjabash, BADDA, Dhaka - 1212, Bangladesh", 1, 1500.00);

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
