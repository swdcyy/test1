package me9.q$c;
import erd.o;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class q$c implements o	// class@00300e
{
    public static final q$c b;

    static {
       q$c.b = new q$c();
    }
    public void q$c(){
       super();
    }
    public Object apply(Object p0){
       Integer integer;
       int i = p0.intValue();
       q$c uoc = q$c.class;
       if (PatchProxy.isSupport(uoc)) {
          integer = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoc, "1");
          if (integer != PatchProxyResult.class) {
          label_0027 :
             return integer;
          }
       }
       integer = Integer.valueOf(((i * 20) / 100));
       goto label_0027 ;
    }
}
