package com.yxcorp.gifshow.camera.record.base.f;
import com.yxcorp.gifshow.camera.record.base.b$b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.e;
import java.lang.Iterable;
import ok.o;
import qk.y;

public class f implements b$b	// class@000daa
{
    public final boolean b;
    public static final f c;

    static {
       f.c = new f(false);
    }
    public void f(boolean p0){
       super();
       this.b = p0;
    }
    public Object d(List p0){
       f uof = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(y.c(p0, e.b));
       }
       return uof;
    }
}
