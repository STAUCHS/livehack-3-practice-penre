class Main extends ConsoleProgram {
  public void run() {
    System.out.print(countCode("codexxcode"));
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
  

  public int countCode(String str){
    int result = 0;
    int count;

    for (int i = 0; i < str.length(); i++){
      for (count = str.indexOf("code"); count < str.length(); count++){
        result += count;
      }
    }
    return result;
  }
}