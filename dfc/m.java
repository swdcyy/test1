package dfc.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dfc.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.view.View;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import android.animation.ObjectAnimator;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import wkd.b;
import ncc.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import nfc.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class m extends PresenterV2	// class@0021aa
{
    public BaseFragment p;
    public View q;
    public ObjectAnimator r;
    public a s;
    public b t;
    public final Runnable u;

    public void m(){
       super();
       this.u = new j(this);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "2")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, om, "7");
       String str = "enableShowNewsSlideEntranceGuide";
       String str1 = "user";
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean(b.d(str1)+str, true);
       if (!b) {
          return;
       }else {
          this.q = this.k8(0x7f0a2db9);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d(str1)+str, false);
          g.a(uEditor);
          k1.r(this.u, 2000);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "8")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, m.class, "6")) {
          return;
       }
       m tt = this.t;
       if (tt != null && !tt.isDisposed()) {
          this.t.dispose();
          this.t = null;
       }
       k1.m(this.u);
       tt = this.r;
       if (tt != null && tt.isRunning()) {
          this.r.cancel();
          this.r = null;
       }
       tt = this.s;
       if (tt != null) {
          tt.o();
          this.s = null;
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, m.class, "9")) {
          return;
       }
       this.q.setBackgroundColor(a1.a(R.color.arg_RES_7f062057));
       if (b.a(-83154551).l()) {
          RxBus.f.b(new c());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("REMINDER_HOST_FRAGMENT");
       return;
    }
}
