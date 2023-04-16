package jg9.m0;
import com.yxcorp.gifshow.bubble.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oa0.a;

public final class m0 implements b$c	// class@002aa4
{
    public static final m0 a;

    static {
       m0.a = new m0();
    }
    public void m0(){
       super();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.A();
    }
}
