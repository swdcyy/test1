package dz9.o;
import dz9.c0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e0a.j;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import id5.o;

public final class o extends c0	// class@00201d
{
    public final m0 C;
    public final SlidePageConfig D;

    public void o(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super();
       this.C = p0;
       this.D = p1;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D.a0() && (j.e() && !o.d(this.C.c.mPhoto)))? true: false;
       return b;
    }
}
