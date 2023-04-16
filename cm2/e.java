package cm2.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import com.kwai.library.widget.popup.common.c;
import cm2.e$a;
import com.kwai.library.widget.popup.common.c$b;
import io.reactivex.subjects.PublishSubject;
import cm2.q;
import cm2.a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm2.p;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import brd.y;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import java.util.ArrayList;
import ekd.j;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import cm2.j;
import java.util.Map;
import java.util.HashMap;

public class e extends c implements PopupInterface$f, g	// class@00055c
{
    public e$a p;
    public p q;
    public View r;
    public q s;
    public a t;
    public m u;
    public c v;
    public c w;

    public void e(e$a p0){
       super(p0);
       this.v = PublishSubject.g();
       this.w = PublishSubject.g();
       p0.P(false);
       p0.z(true);
       p0.A(false);
       p0.L(this);
       this.p = p0;
       this.s = new q();
       this.t = new a();
    }
    public void O(Bundle p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "2")) {
          e tp = this.p;
          uoe = this.s;
          uoe.a = tp.H;
          uoe.c = tp.I;
          uoe.g = tp.K;
          uoe.d = tp.L;
          uoe.i = tp.J;
          uoe.e = tp.M;
          uoe.f = tp.N;
          uoe.h = tp.O;
          this.u = tp.G;
          p op = new p();
          this.q = op;
          op.f(this.r);
          Object[] objArray = new Object[]{this,this.s};
          this.q.i(objArray);
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.f(p1, R.layout.arg_RES_7f0d0e7e, p2);
       this.r = view;
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.q.destroy();
       return;
    }
    public void b0(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       e tt = this.t;
       tt.c = true;
       tt.a = p0;
       this.v.onNext(tt);
       return;
    }
    public void c0(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "5")) {
          return;
       }
       this.t.e = p0;
       this.w.onNext(Long.valueOf(p0));
       return;
    }
    public void d0(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       e tt = this.t;
       tt.a = p0;
       this.v.onNext(tt);
       return;
    }
    public void e0(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "10")) {
          return;
       }
       uoe = this.t;
       uoe.b = p0;
       this.v.onNext(uoe);
       return;
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       e tt = this.t;
       tt.d = true;
       this.v.onNext(tt);
       return;
    }
    public void g0(LiveVoteOption[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       a a = this.t.a;
       if (a != null) {
          LiveVoterResponse mVote = a.mVote;
          if (mVote != null) {
             mVote.mOptions = j.a(p0);
          }
       }
       this.v.onNext(this.t);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new j());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
}
