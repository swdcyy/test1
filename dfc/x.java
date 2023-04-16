package dfc.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dfc.x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import dfc.x$b;
import androidx.viewpager.widget.ViewPager$i;
import sy6.a;
import dfc.x$c;
import qvb.q;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import hm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import wnc.a;
import com.yxcorp.gifshow.reminder.news.guide.NewsSlidePlayGuideFragment;
import qa9.q;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.os.Bundle;
import qa9.s;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class x extends PresenterV2	// class@0021bc
{
    public a p;
    public ViewPager$i q;
    public q r;
    public Runnable s;

    public void x(){
       super();
       this.s = new x$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       if (!this.P8().booleanValue()) {
          return;
       }
       if (this.p == null) {
          return;
       }
       if (this.q == null) {
          this.q = new x$b(this);
       }
       this.p.i(this.q);
       if (this.r == null) {
          this.r = new x$c(this);
       }
       this.p.e(this.r);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x.class, "7")) {
          return;
       }
       x tp = this.p;
       if (tp != null) {
          x tq = this.q;
          if (tq != null) {
             tp.g(tq);
             this.q = objArray;
          }
       }
       tp = this.p;
       if (tp != null) {
          x tr = this.r;
          if (tr != null) {
             tp.b(tr);
          }
       }
       k1.m(this.s);
       return;
    }
    public final Boolean P8(){
       Object obj = PatchProxy.apply(null, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(a.a.getBoolean(b.d("user")+"enableShowNewsSlidePlayGuide", true));
    }
    public void R8(int p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "3")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       boolean b = true;
       String str = "4";
       if (PatchProxy.isSupport(ox)) {
          x obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ox, str);
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
          label_0035 :
             obj = this.p;
             b1 = (obj != null && obj.G0(p0) != 30)? true: false;
          }
       }else {
          goto label_0035 ;
       }
       if (b1 && !PatchProxy.applyVoid(null, this, ox, "5")) {
          ox = this.p;
          if (ox != null) {
             Fragment uFragment = ox.t();
             if (uFragment != null && (uFragment.getActivity() != null && (this.P8().booleanValue() && a.a()))) {
                FragmentActivity activity = uFragment.getActivity();
                if (PatchProxy.isSupport(NewsSlidePlayGuideFragment.class) && PatchProxy.applyTwoRefs(activity, Integer.valueOf(0), null, NewsSlidePlayGuideFragment.class, str) != patchProxyRe) {
                }else {
                   s.c(activity.getSupportFragmentManager(), NewsSlidePlayGuideFragment.class, "NewsSlidePlayGuide", null, BottomSheetParams.ofStateless().setCancelable(0, b).setNeedPageLogger(0).setBottomMargin(0).setContentHeight((int)((float)n.j(activity) * 0x3f1e353f)));
                }
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putBoolean(b.d("user")+"enableShowNewsSlidePlayGuide", 0);
                g.a(uEditor);
                if (!this.P8().booleanValue()) {
                   x tp = this.p;
                   if (tp != null) {
                      ox = this.q;
                      if (ox != null) {
                         tp.g(ox);
                         this.q = null;
                      }
                   }
                }
             }
          }
       }
    label_00f8 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
