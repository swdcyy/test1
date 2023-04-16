package bc2.t;
import bc2.d;
import yb2.i;
import bc2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.show.luckystar.util.b;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import bc2.s;
import java.lang.Runnable;
import bc2.r;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultFragmentV2;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import bc2.q;
import z1.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import android.app.Activity;
import d61.g;
import androidx.fragment.app.c;
import bc2.p;
import lnc.l1;

public class t implements d	// class@0003df
{
    public final i a;
    public final m b;
    public final b c;
    public LiveLuckyStarCurrentInfoFragmentV2 d;
    public LiveLuckyStarOpenResultFragmentV2 e;

    public void t(i p0,b p1){
       super();
       this.a = p0;
       this.b = p0.a;
       this.c = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, t.class, "8")) {
          return;
       }
       b.c(this.d);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, t.class, "9")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void c(){
       t ot = t.class;
       if (PatchProxy.applyVoid(null, this, ot, "7")) {
          return;
       }
       this.a();
       if (!PatchProxy.applyVoid(null, this, ot, "10")) {
          b.c(this.e);
       }
       return;
    }
    public boolean d(){
       t obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "3")) {
          return;
       }
       this.k();
       this.c();
       k1.s(new s(this, p0), this, 500);
       return;
    }
    public void f(){
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "5")) {
          return;
       }
       if (!this.c.E0()) {
          return;
       }
       this.k();
       if (!PatchProxy.applyVoid(objArray, this, ot, "6")) {
          k1.s(new r(this), this, 500);
       }
       return;
    }
    public boolean g(){
       t obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = true;
       if (obj != null) {
          int i = (obj.C == LiveLuckyStarOpenResultPanelState.OPENED)? 1: 0;
          if (!i && obj.isAdded()) {
          label_002d :
             return b;
          }
       }
    label_002c :
       b = false;
       goto label_002d ;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (this.c.h2()) {
          this.k();
          k1.s(new q(this), this, 500);
       }
       return;
    }
    public final void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "12")) {
          return;
       }
       if (!this.b.b().isAdded()) {
          return;
       }
       if (g.h(this.c.getActivity())) {
          return;
       }
       p0.accept(this.b.b().getChildFragmentManager());
       return;
    }
    public final void j(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "11")) {
          return;
       }
       this.c();
       this.i(new p(this, p0));
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, t.class, "13")) {
          return;
       }
       if (l1.a() && this.c.getActivity() != null) {
          this.c.getActivity().setRequestedOrientation(1);
       }
       return;
    }
}
