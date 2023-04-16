package ced.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import android.view.View;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import ekd.m1;

public class u1 extends PresenterV2	// class@000582
{
    public SearchResultExtParams p;
    public View q;
    public View r;
    public SearchSwitcherEntryView s;

    public void u1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "3")) {
          return;
       }
       if (this.p.mInvalid == null) {
          return;
       }
       this.q.setVisibility(8);
       this.s.setClickable(false);
       this.r.setAlpha(0x3f800000);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3f7b);
       this.q = m1.f(p0, 0x7f0a3d20);
       this.s = m1.f(p0, 0x7f0a3d1e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u1.class, "1")) {
          return;
       }
       this.p = this.r8("TagInfoExtParams");
       return;
    }
}
