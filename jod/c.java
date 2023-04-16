package jod.c;
import jod.d;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class c extends d	// class@001722
{
    public final double i;

    public void c(int p0,int p1,String p2,double p3,String p4,float p5,String p6,double p7,String p8){
       a.p(p2, "text");
       Object obj = p4;
       a.p(obj, "filePath");
       Object obj1 = p6;
       a.p(obj1, "identifier");
       Object obj2 = p8;
       a.p(obj2, "speakerName");
       super(p0, p1, p2, p3, obj, p5, obj1, obj2);
       this.i = p7;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+"duration = "+this.i;
    }
}
