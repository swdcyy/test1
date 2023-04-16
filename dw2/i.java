package dw2.i;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import kotlin.jvm.internal.a;

public abstract class i	// class@0025bb
{
    public final int a;
    public final String b;
    public final boolean c;

    public void i(int p0,String p1,boolean p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public final boolean a(){
       return this.c;
    }
    public String toString(){
       String str;
       i obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          str = a1.p(obj);
          a.o(str, "CommonUtil.string\(textResId\)");
       }else {
          str = this.b;
       }
       return str;
    }
}
