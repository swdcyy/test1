package cm2.b;
import y8c.g;
import io.reactivex.subjects.PublishSubject;
import lnc.a1;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cm2.b$b;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.show.vote.presenter.i;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cm2.b$c;
import java.util.List;
import java.lang.Boolean;
import cm2.b$a;
import java.util.Collection;
import ekd.q;
import brd.y;

public class b extends g	// class@000558
{
    public int A;
    public LiveVoterResponse B;
    public c C;
    public b$a D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int w;
    public int x;
    public boolean y;
    public String z;

    public void b(){
       super();
       this.y = false;
       this.A = -1;
       this.H = false;
       this.I = false;
       this.C = PublishSubject.g();
       this.x = 0;
       this.E = a1.a(0x7f06143c);
       this.F = a1.a(0x7f060c88);
    }
    public f$b d1(f$b p0){
       b$b obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$b(p0);
       obj.h = this.C;
       obj.i = this.z;
       return obj;
    }
    public int f0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (this.N0(p0).mOptionId < null)? 1: 2;
       return p0;
    }
    public f h1(ViewGroup p0,int p1){
       View view;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          view = a.i(p0, R.layout.arg_RES_7f0d0e80);
          view.setLayoutParams(new RecyclerView$LayoutParams(-1, -2));
          return new f(view, new i());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0e7f);
          view.setLayoutParams(new RecyclerView$LayoutParams(-1, a1.e(40.00f)));
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new b$c(this));
          return new f(view, presenterV2);
       }
    }
    public void r1(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.A = -1;
       this.e.clear();
       this.z = null;
       this.B = null;
       this.x = 0;
       this.H = false;
       this.I = false;
       return;
    }
    public boolean s1(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.A < null && !this.t1())? true: false;
       return b;
    }
    public boolean t1(){
       b obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D;
       if (obj != null && obj.c()) {
          return true;
       }
       return false;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (q.f(this.Q0())) {
          return;
       }
       this.C.onNext(Integer.valueOf(1));
       return;
    }
}
