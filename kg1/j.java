package kg1.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class j	// class@002d35
{

    public void j(){
       super();
    }
    public static int a(int p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, oj, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (j.d(p0)) {
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 != 5) {
                      if (p1 != 6) {
                         if (p1 != 7) {
                            p0 = 0x7f102d5a;
                         }
                      }
                   }else {
                   label_0046 :
                      p0 = 0x7f102d58;
                   }
                }
                p0 = 0x7f102d54;
             }
             p0 = 0x7f102d56;
          }else {
             goto label_0046 ;
          }
          return p0;
       }else if(p1 != 1){
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 5) {
                   if (p1 != 6) {
                      if (p1 != 7) {
                         p0 = 0x7f102d5b;
                      }
                   }
                }else {
                label_0062 :
                   p0 = 0x7f102d59;
                }
             }
             p0 = 0x7f102d55;
          }
          p0 = 0x7f102d57;
       }else {
          goto label_0062 ;
       }
       return p0;
    }
    public static int b(int p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, oj, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (j.d(p0)) {
          if (p1 != 1 && (p1 != 2 && (p1 != 3 && (p1 != 5 && (p1 != 6 && p1 != 7))))) {
             return a1.a(0x7f061e52);
          }else {
             return a1.a(0x7f0601d8);
          }
       }else if(p1 != 1){
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 5) {
                   if (p1 != 6) {
                      if (p1 != 7) {
                         return a1.a(0x7f061e52);
                      }
                   }
                }
             }
             return a1.a(0x7f06040f);
          }
          return a1.a(0x7f0605c5);
       }
       return a1.a(0x7f060502);
    }
    public static float c(int p0){
       if (p0 != 2 && p0 != 6) {
          return 0x3f800000;
       }
       return 0;
    }
    public static boolean d(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
}
