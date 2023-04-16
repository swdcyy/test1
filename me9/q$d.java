package me9.q$d;
import erd.o;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class q$d implements o	// class@00300f
{
    public static final q$d b;

    static {
       q$d.b = new q$d();
    }
    public void q$d(){
       super();
    }
    public Object apply(Object p0){
       Integer integer;
       int i = p0.intValue();
       q$d uod = q$d.class;
       if (PatchProxy.isSupport(uod)) {
          integer = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uod, "1");
          if (integer != PatchProxyResult.class) {
          label_0029 :
             return integer;
          }
       }
       integer = Integer.valueOf((((i * 70) / 100) + 20));
       goto label_0029 ;
    }
}
