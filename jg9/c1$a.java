package jg9.c1$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import jg9.c1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jg9.a1;
import nsd.u;

public final class c1$a implements b$a	// class@002a87
{
    public final c1 a;

    public void c1$a(c1 p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       a1 uoa1 = PatchProxy.apply(null, this, c1$a.class, "1");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          a1 uoa11 = new a1(this.a.c1(), false, (this.a.g2() ^ 0x01), false, true, false, true, 0, 128, null);
       }
       return uoa1;
    }
}
