package bc9.g;
import u79.a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.assistant.recommend.KSPreviewViewBinder;
import java.util.Iterator;
import java.lang.Iterable;
import u79.o;
import bc9.b;
import java.lang.Number;

public final class g extends a	// class@0003ec
{
    public final String f;
    public final String g;
    public int h;
    public int i;
    public final Fragment j;

    public void g(Fragment p0){
       a.p(p0, "fragment");
       super();
       this.j = p0;
       this.f = "AssistKSRecommendPagerAdapter";
       this.g = "#";
    }
    public AbsPreviewItemViewBinder A(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KSPreviewViewBinder(this.j, 1);
    }
    public void I(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "2")) {
          return;
       }
       super.I(p0);
       this.B();
       return;
    }
    public final void J(int p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "5")) {
          return;
       }
       this.h = p0;
       this.i = p1;
       a td = this.d;
       a.o(td, "mItemList");
       Iterator iterator = td.iterator();
       while (iterator.hasNext()) {
          o oo = iterator.next();
          if (oo instanceof b) {
             oo.I = p0;
             oo.J = p1;
          }
       }
       return;
    }
    public int k(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "object");
       return -2;
    }
}
