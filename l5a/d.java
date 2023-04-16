package l5a.d;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import l5a.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import crd.b;
import lnc.b9;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import l5a.a;
import java.lang.Number;
import java.lang.Boolean;
import uw9.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import l5a.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends a	// class@002d50
{
    public BaseFragment s;
    public SlidePlayViewModel t;
    public a u;
    public t v;
    public String w;
    public b x;
    public final a y;
    public static long A = 0x2710;
    public static String B = "3000";
    public static long z = 0x7d0;

    public void d(){
       super();
       this.y = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Intent intent = this.getActivity().getIntent();
       if (intent != null) {
          this.w = x0.b(intent.getData(), "shareTaskCoin", d.B);
       }
       d ts = this.s;
       if (ts != null) {
          this.t = SlidePlayViewModel.S0(ts.getParentFragment());
       }
       ts = this.t;
       if (ts != null) {
          ts.P(this.s, this.y);
       }
       if (this.s == null) {
          this.S8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.R8();
       d tt = this.t;
       if (tt != null) {
          tt.D(this.s, this.y);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       b9.a(this.x);
       d tu = this.u;
       if (tu != null) {
          tu.o();
          this.u = null;
       }
       tu = this.v;
       if (tu != null) {
          tu.o();
          this.v = null;
       }
       return;
    }
    public void S8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.apply(objArray, objArray, uoa, "6");
       int i = 0;
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          obj = PatchProxy.apply(objArray, objArray, uoa, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             long longx = c.a.getLong(b.d("user")+"shareTaskGuideLastShowTime", 0);
             b = (longx > 0 && DateUtils.H(longx))? true: false;
          }
          if (!b) {
             obj = PatchProxy.apply(objArray, objArray, uoa, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(a.a() < a.a){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                Object obj1 = PatchProxy.apply(objArray, objArray, uoa, "2");
                boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): c.a.getBoolean(b.d("user")+"shareTaskDialogHasShowed", i);
                if (!b1) {
                   i = 1;
                }else {
                   i = 2;
                }
             }
          }
       }
       if (!i) {
          return;
       }else {
          this.x = t.timer(d.z, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new c(this, i), Functions.d());
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = this.t8("DETAIL_FRAGMENT");
       return;
    }
}
