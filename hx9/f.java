package hx9.f;
import com.kwai.component.tabs.panel.h$b;
import hx9.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.tabs.panel.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import hn5.f0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import usd.q;
import lnc.a1;
import java.lang.CharSequence;
import hx9.f$a;
import android.view.View$OnClickListener;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class f extends h$b	// class@00272e
{
    public TabsPanelHostFragment w;
    public long x;
    public final QPhoto y;

    public void f(g p0,QPhoto p1){
       a.p(p0, "tabsPanelPageBuilder");
       a.p(p1, "mPhoto");
       super(p0);
       this.y = p1;
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uof, "3")) {
          long l = q.o(w.d0(this.y.getEntity()), (long)b.a(0x238e5b38).d(this.y.getPhotoId()));
          this.x = l;
          this.W8(l, a1.p(R.string.arg_RES_7f1042da));
       }
       this.Y8(new f$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(TabsPanelHostFragment.class);
       a.o(obj, "inject\(TabsPanelHostFragment::class.java\)");
       this.w = obj;
       return;
    }
}
