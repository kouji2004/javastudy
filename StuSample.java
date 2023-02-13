class StuSample {
  public static void main(String[] args) {
    Student stu1 = new Student();
    
    stu1.name = "ミウラ";
    stu1.setScore(100, 100);

    stu1.display();
    System.out.println("平均" + stu1.getAvg() + "点");
  }
}
