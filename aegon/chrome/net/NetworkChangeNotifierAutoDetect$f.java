package aegon.chrome.net.NetworkChangeNotifierAutoDetect$f;
import java.lang.String;
import java.lang.Object;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;

public class NetworkChangeNotifierAutoDetect$f	// class@00007d
{
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;

    public void NetworkChangeNotifierAutoDetect$f(boolean p0,int p1,int p2,String p3,boolean p4,String p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p3 == null) {
          p3 = "";
       }
       this.d = p3;
       this.e = p4;
       if (p5 == null) {
          p5 = "";
       }
       this.f = p5;
       return;
    }
    public int a(){
       if (!this.g()) {
          return 1;
       }
       int i = this.e();
       if (i && (i != 4 && i != 5)) {
          return 0;
       }
       switch (this.d()){
           case 1:
             return 7;
           case 2:
             return 8;
           case 3:
             return 9;
           case 4:
             return 5;
           case 5:
             return 10;
           case 6:
             return 11;
           case 7:
             return 6;
           case 8:
             return 14;
           case 9:
             return 15;
           case 10:
             return 12;
           case 11:
             return 4;
           case 12:
             return 13;
           case 13:
             return 18;
           case 14:
             return 16;
           case 15:
             return 17;
           default:
             return 0;
       }
    }
    public int b(){
       if (!this.g()) {
          return 6;
       }
       return NetworkChangeNotifierAutoDetect.d(this.e(), this.d());
    }
    public String c(){
       return this.d;
    }
    public int d(){
       return this.c;
    }
    public int e(){
       return this.b;
    }
    public String f(){
       return this.f;
    }
    public boolean g(){
       return this.a;
    }
    public boolean h(){
       return this.e;
    }
}
