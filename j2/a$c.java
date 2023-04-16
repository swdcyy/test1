package j2.a$c;
import java.lang.String;
import java.lang.Object;

public class a$c	// class@00221c
{
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public void a$c(String p0,int p1,int p2){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = -1;
    }
    public void a$c(String p0,int p1,int p2,int p3){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean a(int p0){
       a$c tc = this.c;
       int i = 7;
       if (tc == i || (p0 != i && tc != p0)) {
          a$c td = this.d;
          if (td != p0) {
             int i1 = 4;
             if (tc == i1 || (td == i1 && p0 == 3)) {
                return true;
             }else {
                i1 = 9;
                if (tc == i1 || (td == i1 && p0 == 8)) {
                   return true;
                }else if(tc == 12 || (td == 12 && p0 == 11)){
                   return true;
                }else {
                   return false;
                }
             }
          }
       }
       return true;
    }
}
