class Main extends ConsoleProgram {
  public void run() {
    System.out.println(shareDigit(12,44));
  }
  /**
   * make a program that repeats everyletter in a string 
   * @param str
   * @return
   */
  public String doubleChar(String str){
    String result = "";

    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      result += Character.toString(c) + Character.toString(c);

    }
    return result;
  }
  
  /**
   * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
   * @param str
   * @return
   */
  public int countCode(String str){
    int result = 0;

    for (int i = 0; i < str.length() - 3; i++){
      if (str.substring(i , i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")){
        result = result + 1;
      }
      
    }
    return result;
  }
  /**
   * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
   * @param str
   * @return
   */
  public int bobThere(String str){
    int result = 0;

    for (int i = 0; i < str.length() - 2; i++){
      if (str.substring(i , i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")){
        result = result + 1;
      }
    }
    return result;
  }
  /**
   * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
   * @param str
   * @param n
   * @return
   */
  public String repeatEnd(String str , int n){
    String result = "";

    for (int i = 0; i < n; i++){
      String lastC = str.substring(str.length() - n);
      result = result + lastC;
    }
    return result;
} 
  /**
   * 
   * @param str
   * @param n
   * @return
   */
  public boolean prefixAgain(String str , int n){
    String temp = str.substring(0 , n);
    String remaining = str.substring(n);

    if (remaining.indexOf(temp) >= 0){
      return true;
    }
    else{
      return false;
    }
    

    }
    /**
     * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
     * @param str
     * @return
     */
  public boolean sameStarChar(String str){

    for (int i = 1; i < str.length() - 1; i++){
      if (str.substring(i , i + 1).equals("*") && !str.substring(i - 1 , i).equals(str.substring(i + 1 , i + 2))){
        return false;
      }
    }
    return true;
  }
  /**
   * ask ms chen tmr
   * @param str
   * @return
   */
  public String starOut(String str){
    
    String result = "";
    int k = str.indexOf("*");
    String first = str.substring( 0 , k - 1);
    String second = str.substring( k + 2);
    result = first + second;

    return result;
    
  }
  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   * @param str
   * @return
   */
  public int countHi(String str){
    int result = 0;

    for (int i = 0; i < str.length() - 1; i++){
      if (str.substring(i , i + 2).equals("hi")){
        result++;
      }
    }
    return result;
  } 
  /**
   * 
   * @param str
   * @param sstr
   * @return
   */
  public boolean endOther(String str, String sstr){
    boolean result;

    if (str.length() < sstr.length()){
      for (int i = 0; i < sstr.length(); i++){
        if (sstr.substring(sstr.indexOf(str) , str.length()).equals(str)){
          result = true;
          return result;
        }
      }  
    }
    else if (sstr.length() < str.length()){
      for (int i = 0; i < str.length(); i++){
        if (str.substring(str.indexOf(sstr) , sstr.length()).equals(sstr)){
          result = true;
          return result;
        }
      }
    }
    else if (sstr.length() == str.length()){
      result = false;
      return result;
    }
    result = true;
    return result;
  }
  /**
   * print 1 , 0 , 2 based on you or date's fashion
   * @param you 
   * @param date
   * @return 
   */
  public int dateFashion(int you, int date){
    

    if ( you >= 8 || date >= 8){
      
      return 2;
    }
    else if ( you <= 2 || date <=2){
      
      return 0;
    }
    else {
      return 1;
    }
  }
  /**
   * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
   * @param a
   * @param b
   * @return
   */
  public int sortaSum( int a, int b){

    int intSum;
    intSum = a + b;

    if (intSum <= 19 && intSum >= 10){
      return 20;
    }
    else {
      return intSum;
    }
  }
  /**
   * 
   * @param a
   * @param outsideMode
   * @return
   */
  public boolean in1To10(int a, boolean outsideMode) {

    if ( a >= 1 && a <= 10) {
      return true;
    }
    else if ( a <= 1 || a >= 10 && outsideMode == true){
      return true;
    }
    else{
      return false;
    }
  }
  /**
   * 
   * @param n
   * @return
   */
  public boolean old35(int n) {

    if ( n % 5 == 0 || n % 3 == 0){
      return true;
    }
    else {
      return false;
    }
  }
  /**
   * 
   * @param a
   * @param b
   * @return
   */
  public int teenSum(int a , int b){

    int intSum = a + b;

    if ( a < 13 || a > 19 && b < 13 || b > 19){
      return intSum;
    }
    else if ( a >= 13 || a <= 19 || b >= 13 || b <= 19) {
      return 19;
    }
    else {
      return 19;
    }
  }
  /**
   * 
   * @param str
   * @return
   */
  public String fizzString(String str){

    if ( str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")){
      return "fizzbuzz"; 
    }
    else if ( str.substring(str.length() - 1).equals("b")){
      return "buzz";
    }
    else if ( str.substring(0, 1).equals("f")){
      return "fizz";
    } 
    else {
      return str;
    }
  }
  /**
   * 
   * @param a
   * @param b
   * @param c
   * @param bOk
   * @return
   */
  public boolean inOrder(int a, int b, int c, boolean bOk){

    if ( b > a && c > b){
      return true;
    }
    else if (b < a && c > b || b > a && c < b){
      return false;
    }
    else if (bOk == true && c > b){
      return true;
    }
    else {
      return false;
    }

  }
  /**
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public boolean lessBy10(int a, int b, int c){
    
    if ( a - b >= 10 || a - c >= 10){
      return true;
    }
    else if (b - a >= 10 || b - c >= 10){
      return true;
    }
    else if (c - a >= 10 || c - b >= 10){
      return true;
    }
    else {
      return false;
    }
  }
  /**
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public int redTicket(int a, int b, int c){

    if ( a == 2 && b == 2 && c == 2){
      return 10;
    }
    else if (a == b && b == c && a == c){
      return 5;
    }
    else {
      return 0;
    }
  }
  public boolean shareDigit(int a, int b){

    if ( a / 10 == b / 10 || a % 10 == b % 10){
      return true;
    }
    else if ( a / 10 == b % 10 || a % 10 == b / 10){
      return true;
    }
    else {
      return false;
    }
  }
}
  
