package cic.h$a;
import erd.o;
import android.graphics.Bitmap;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import com.yxcorp.gifshow.video.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import cic.g;
import io.reactivex.g;
import brd.t;

public final class h$a implements o	// class@0005ac
{
    public final Bitmap b;
    public final BaseFeed c;
    public final boolean d;

    public void h$a(Bitmap p0,BaseFeed p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = t.create(new g(this, p0));
       }
       return ot;
    }
}
