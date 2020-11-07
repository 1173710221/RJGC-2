//对C4的文件进行修改
D:\软件过程与工具\lab2\克隆仓库\RJGC-2\实验一\operation3.0\src\Addition.java
package operation;

public class Addition {//加法类
  private int num1;//加数
  private int num2;//被加数
  private int sum;//和

  public Addition(int sum, int a) {
    this.num1 = a;
    this.sum = sum;
    this.num2 = sum - a;
  }

  public int getNum1() {
    int a = num1;
    return a;
  }

  public int getNum2() {
    int b = num2;
    return b;
  }

  public int getSum() {
    int s = sum;
    return s;
  }

  @Override
  public String toString() {
    return num1 + "+" + num2 + "=";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }

    Addition other = (Addition) obj;
    if (this.getSum() == other.getNum1()
        && (this.getNum1() == other.getNum1() || this.getNum1() == other.getNum2())) {
      return true;
    } else {
      return false;
    }
  }
}
