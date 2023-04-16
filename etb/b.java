package etb.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ctb.f;
import java.util.List;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import ctb.g;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import java.lang.Boolean;
import xh7.a;
import qh7.b;
import qh7.a;
import ekd.m1;
import etb.b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class b extends PresenterV2	// class@0027ea
{
    public f p;
    public RecyclerFragment q;
    public TextView r;
    public View s;
    public boolean t;

    public void b(){
       super();
    }
    public void E8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       f mTabMenus = this.p.mTabMenus;
       b = true;
       if (mTabMenus == null || mTabMenus.size() <= b) {
          b = false;
       }
       this.t = b;
       if (b) {
          this.s.setVisibility(0);
          this.r.setText(this.p.mTabName);
       }else {
          this.s.setVisibility(8);
          this.r.setText(this.p.mTabMenus.get(0).mMenuName);
       }
       return;
    }
    public final void P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       g og = this.p.mTabMenus.get(p0);
       if (og != null && !TextUtils.x(og.mMenuUrl)) {
          Activity activity = this.getActivity();
          if (activity == null) {
             return;
          }else {
             b uob1 = b.j(activity, og.mMenuUrl);
             uob1.h("com.kwai.platform.krouter.3party_app_allowed", Boolean.TRUE);
             a.b(uob1, null);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a047b);
       this.s = m1.f(p0, 0x7f0a047a);
       p0.setOnClickListener(new b$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(f.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
