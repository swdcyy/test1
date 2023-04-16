package cic.h$b;
import erd.o;
import cic.h;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.video.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import cic.i;
import io.reactivex.g;
import brd.t;
import cic.j;

public final class h$b implements o	// class@0005ad
{
    public final h b;
    public final BaseFeed c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public void h$b(h p0,BaseFeed p1,boolean p2,boolean p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, h$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = t.create(new i(this)).map(new j(this, p0));
       }
       return ot;
    }
}
