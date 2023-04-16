package gx9.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gx9.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.util.List;

public final class m extends PresenterV2	// class@002500
{
    public QPhoto p;
    public ViewPager q;
    public TabsPanelHostFragment r;
    public List s;
    public final m$a t;

    public void m(){
       super();
       this.t = new m$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       m tq = this.q;
       if (tq == null) {
          a.S("mViewPager");
       }
       tq.addOnPageChangeListener(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       m tq = this.q;
       if (tq == null) {
          a.S("mViewPager");
       }
       tq.removeOnPageChangeListener(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("COMMENT_PANEL_TAB_VIEWPAGER");
       a.o(obj, "inject\(TabsPanelAccessId¡­MENT_PANEL_TAB_VIEWPAGER\)");
       this.q = obj;
       obj = this.q8(TabsPanelHostFragment.class);
       a.o(obj, "inject\(TabsPanelHostFragment::class.java\)");
       this.r = obj;
       obj = this.q8(List.class);
       a.o(obj, "inject\(MutableList::class.java\)");
       this.s = obj;
       return;
    }
}
