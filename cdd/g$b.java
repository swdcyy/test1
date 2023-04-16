package cdd.g$b;
import ucd.n;
import cdd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.kbox.KBoxTabItem;
import com.yxcorp.plugin.search.entity.TemplateText;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.utils.j0;
import android.view.View;
import ekd.m1;
import k06.a;
import nfd.t0;
import lnc.a1;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import cdd.h;
import android.view.View$OnClickListener;
import y8c.d;

public class g$b extends n	// class@000532
{
    public SearchItem p;
    public TextView q;
    public LinearLayout r;
    public KBoxTabItem s;
    public d t;
    public final g u;

    public void g$b(g p0){
       this.u = p0;
       super();
    }
    public void E8(){
       g$b uob = g$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          a e = this.u.e;
          if (e != null && !q.f(e)) {
             g$b ts = this.s;
             if (ts != null) {
                KBoxTabItem mText = ts.mText;
                if (mText != null) {
                   TemplateText mText1 = mText.mText;
                   if (mText1 != null) {
                      this.q.setText(mText1);
                   }
                }
                if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
                   int i = this.p.mKBoxItem.mKBoxTabFeeds.size();
                   ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
                   int i1 = 2;
                   if (i == i1) {
                      layoutParams.width = j0.j(this.getContext(), i1);
                   }else {
                      i1 = 3;
                      layoutParams.width = (i == i1)? j0.j(this.getContext(), i1): j0.j(this.getContext(), 4);
                   }
                   this.r.setLayoutParams(layoutParams);
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a41af);
       this.r = m1.f(p0, 0x7f0a2899);
       a uoa = new a();
       uoa.f((float)t0.e);
       uoa.i(a1.a(R.color.arg_RES_7f061729));
       this.r.setBackground(uoa.a());
       this.P8(this.m8(), new h(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       this.t = this.r8("ADAPTER_POSITION_GETTER");
       this.p = this.q8(SearchItem.class);
       this.s = this.q8(KBoxItem.class);
       return;
    }
}
