 class Student {
  //属性（変数）
  String name;
  int engScore;
  int mathScore;

  //操作(メソッド)
  void display(){
    System.out.println(name+"さん");
    System.out.println("英語"+engScore+"点・数学"+mathScore+"点");
  }
  void setScore(int eng, int math){
    engScore = eng;
    mathScore = math;
  }

  double getAvg(){
    double avg = (engScore+mathScore)/2.0;
    return avg;
  }
}
