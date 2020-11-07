//对B3的文件进行修改
D:\软件过程与工具\lab2\克隆仓库\RJGC-2\实验一\operation2.0\src\Subtraction
package operation;

public class Subtraction {
    private int num1;
    private int num2;
    private int diff;

    public Subtraction(int a, int b){
        this.num1 = a;
        this.num2 = b;
        this.diff = a-b;

    }

    public int getNum1() {
        int a = num1;
        return a;
    }

    public int getNum2() {
        int b = num2;
        return b;
    }

    public int getDiff(){
        int d = diff;
        return d;
    }

    @Override
    public String toString(){
        return num1 + "-" + num2 + "=";
    }



}
