package c96.a;
import f66.i;
import java.lang.String;
import c96.a$a;
import c96.a$b;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.c;

public final class a extends i	// class@00066d
{

    public void a(){
       super("KrnInit", false);
    }
    public void a(a$a p0){
       super("KrnInit", false);
    }
    public static a D(){
       return a$b.a;
    }
    public void C(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       this.e("ReactNative", p0, p1);
       return;
    }
    public void E(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.w("ReactNative", p0, p1);
       return;
    }
}
