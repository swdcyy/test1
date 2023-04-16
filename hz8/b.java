package hz8.b;
import erd.g;
import hz8.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import java.util.Objects;
import java.lang.Integer;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import ol9.a;
import mxb.j0;
import mxb.i0;
import mxb.j;
import com.kuaishou.commercial.log.a;

public final class b implements g	// class@0025f5
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public final void accept(Boolean p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       c r = this.b.r;
       if (r == null) {
          a.S("mViewPager");
       }
       int lastShowType = r.getLastShowType();
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(lastShowType), tb, uoc, "4")) {
          int i = 3;
          String str = 2;
          if (lastShowType == 1) {
          label_0041 :
             i = 2;
          }else if(lastShowType == str){
             if (lastShowType == i) {
                goto label_0041 ;
             }else {
                i = 5;
             }
          }
          f0 uof0 = b.a(-762347696);
          c p = tb.p;
          if (p == null) {
             a.S("mPhoto");
          }
          uof0.r1(p.mEntity, "key_enteraction", Integer.valueOf(i));
       }
       Objects.requireNonNull(this.b);
       b tb1 = this.b;
       Objects.requireNonNull(tb1);
       a obj = PatchProxy.apply(null, tb1, uoc, "5");
       if (obj != PatchProxyResult.class) {
          lastShowType = obj.booleanValue();
       }else {
          obj = d.a(0x4ffa335e);
          r = tb1.p;
          if (r == null) {
             a.S("mPhoto");
          }
          lastShowType = obj.nJ(r) ^ 1;
       }
       if (lastShowType) {
          j0 oj0 = i0.a();
          uoc = this.b.p;
          if (uoc == null) {
             a.S("mPhoto");
          }
          oj0.i(a.a(uoc.mEntity), this.b.t);
       }
       return;
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}
