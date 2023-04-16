package kf5.l;
import djc.k;
import kf5.l$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import le5.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.n;
import kf5.l$g;
import kf5.l$c;
import kf5.l$h;
import kf5.l$f;
import kf5.l$d;
import kf5.l$e;
import java.lang.Runnable;
import ekd.k1;
import android.view.Window;
import android.app.Activity;
import lnc.i5;
import org.greenrobot.eventbus.a;
import djc.l1;
import crd.b;
import lnc.b9;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k2b.k0;
import q87.c;
import y8c.g;
import android.app.Dialog;
import o07.d$a;
import o07.d;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import kf5.l$b;
import java.util.List;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.recycler.widget.OperationRecyclerView;
import g9c.d;
import mf5.r0;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import kf5.n;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$l;
import com.google.android.material.bottomsheet.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kf5.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.l$i;
import kf5.l$j;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;

public abstract class l extends k	// class@002d90
{
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final String E;
    public List F;
    public int G;
    public String H;
    public final double I;
    public final int J;
    public int K;
    public final Runnable L;
    public final Runnable M;
    public final l$h N;
    public final d$a O;
    public final g P;
    public final l$e Q;
    public View m;
    public View n;
    public View o;
    public final a p;
    public boolean q;
    public BottomSheetBehavior r;
    public r0 s;
    public d t;
    public View u;
    public OperationRecyclerView v;
    public l$b w;
    public final PublishSubject x;
    public final PublishSubject y;
    public QPhoto z;
    public static final int R;
    public static final int S;
    public static final l$a T;

    static {
       l.T = new l$a(null);
       l.R = a1.d(0x7f0702b8);
       l.S = a1.d(0x7f070308);
    }
    public void l(Context p0){
       super(p0);
       this.p = new a();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.x = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.y = publishSubje;
       this.E = "";
       this.F = new ArrayList();
       Boolean uBoolean = PatchProxy.apply(null, null, f.class, "15");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = f.s.get();
       }
       double d = (uBoolean.booleanValue())? 0x3fe0a3d70a3d70a4: 0x3fe3c6a7ef9db22d;
       this.I = d;
       this.J = (int)((double)n.u(a.b()) * d) - l.R;
       this.K = -1;
       this.L = new l$g(this);
       this.M = new l$c(this);
       this.N = new l$h(this);
       this.O = new l$f(this);
       this.P = new l$d(this);
       this.Q = new l$e();
       return;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, l.class, "22")) {
          return;
       }
       k1.m(this.M);
       k1.m(this.L);
       k tl = this.l;
       a.o(tl, "mActivity");
       i5.j(tl.getWindow(), 0xff000000);
       a.d().k(new l1(false));
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, l.class, "21")) {
          return;
       }
       k1.r(this.M, (long)200);
       a.d().k(new l1(true));
       return;
    }
    public final void C(boolean p0){
       this.B = p0;
    }
    public void dismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "20")) {
          return;
       }
       b9.a(this.p);
       if (this.q == null) {
          this.A();
          this.q = true;
       }
       l tv = this.v;
       int i = 0;
       if (tv != null) {
          String str = "mRecyclerView";
          if (tv == null) {
             a.S(str);
          }
          tv.removeOnScrollListener(this.N);
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          if (tv.getAdapter() != null) {
             tv = this.v;
             if (tv == null) {
                a.S(str);
             }
             tv.setAdapter(objArray);
             this.t = objArray;
             objArray = new Object[i];
             k0.C().w("NewBasePlayerOperationWithIMDialog", "Adapter = null", objArray);
          }
       }
       tv = this.s;
       if (tv != null) {
          if (tv == null) {
             a.S("mOperationAdapter");
          }
          tv.Z0();
          objArray = new Object[i];
          k0.C().w("NewBasePlayerOperationWithIMDialog", "Presenter.destroy\(\)", objArray);
       }
       Window window = this.getWindow();
       a.m(window);
       d.c(window, this.O);
       super.dismiss();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, l.class, "27")) {
          return;
       }
       int i = n.j(this.l) - n.A(this.l);
       Window window = this.getWindow();
       a.m(window);
       if (i <= 0) {
          i = -1;
       }
       window.setLayout(-1, i);
       return;
    }
    public void i(){
    }
    public abstract l$b j();
    public abstract List k();
    public abstract int l();
    public abstract int m();
    public final PublishSubject n(){
       return this.x;
    }
    public final PublishSubject o(){
       return this.y;
    }
    public void onCreate(Bundle p0){
       l to;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "14")) {
          return;
       }
       super.onCreate(p0);
       Window window = this.getWindow();
       a.m(window);
       window.setSoftInputMode(18);
       window = this.getWindow();
       a.m(window);
       window.clearFlags(Integer.MIN_VALUE);
       window = this.getWindow();
       a.m(window);
       d.b(window, this.O);
       this.w = this.j();
       Object[] objArray = null;
       String str = "mDesignBottomSheetView";
       if (!PatchProxy.applyVoid(objArray, this, l.class, "23")) {
          View view = a.a(this.getContext(), this.m());
          a.o(view, "KwaiLayoutInflater.inflate\(context, layoutId\)");
          this.m = view;
          view = a.a(this.getContext(), this.l());
          a.o(view, "KwaiLayoutInflater.inflate\(context, headerViewId\)");
          this.u = view;
          to = this.m;
          String str1 = "mView";
          if (to == null) {
             a.S(str1);
          }
          view = to.findViewById(R.id.rv_content);
          a.o(view, "mView.findViewById\(R.id.rv_content\)");
          this.n = view;
          if (!PatchProxy.applyVoid(objArray, this, l.class, "24")) {
             to = this.m;
             if (to == null) {
                a.S(str1);
             }
             view = to.findViewById(R.id.recycler_view);
             a.o(view, "mView.findViewById\(R.id.recycler_view\)");
             this.v = view;
             String str2 = "mRecyclerView";
             if (view == null) {
                a.S(str2);
             }
             l ol = PatchProxy.apply(objArray, this, l.class, "25");
             if (ol != PatchProxyResult.class) {
             }else {
                this.F = this.k();
                r0 or0 = new r0(this.G);
                this.s = or0;
                l tw = this.w;
                if (tw == null) {
                   a.S("mShareCallerContext");
                }
                or0.n1("SHARE_CALLER_CONTEXT", tw);
                ol = this.s;
                String str3 = "mOperationAdapter";
                if (ol == null) {
                   a.S(str3);
                }
                ol.n1("FEEDBACK_OPERATION_PANEL", this.P);
                ol = this.s;
                if (ol == null) {
                   a.S(str3);
                }
                ol.n1("SHARE_COMMENT", this.E);
                ol = this.s;
                if (ol == null) {
                   a.S(str3);
                }
                ol.W0(this.F);
                l ts = this.s;
                if (ts == null) {
                   a.S(str3);
                }
                d uod = new d(ts);
                this.t = uod;
                tw = this.u;
                if (tw == null) {
                   a.S("mHeaderView");
                }
                uod.P0(tw);
                ol = this.t;
                a.m(ol);
             }
             view.setAdapter(ol);
             if (this.G < 2) {
                to = this.v;
                if (to == null) {
                   a.S(str2);
                }
                to.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, false));
             }else {
                to = this.v;
                if (to == null) {
                   a.S(str2);
                }
                to.setLayoutManager(new GridLayoutManager(this.getContext(), this.G));
                to = this.t;
                if (to != null) {
                   ol = this.v;
                   if (ol == null) {
                      a.S(str2);
                   }
                   to.S0(ol, new n(this));
                }
             }
             to = this.v;
             if (to == null) {
                a.S(str2);
             }
             to.setMaxHeight(this.J);
             this.Q.A(0);
             to = this.v;
             if (to == null) {
                a.S(str2);
             }
             to.setItemAnimator(this.Q);
             to = this.v;
             if (to == null) {
                a.S(str2);
             }
             to.removeOnScrollListener(this.N);
             to = this.v;
             if (to == null) {
                a.S(str2);
             }
             to.addOnScrollListener(this.N);
          }
          to = this.m;
          if (to == null) {
             a.S(str1);
          }
          this.setContentView(to);
          window = this.getWindow();
          a.m(window);
          view = window.findViewById(R.id.design_bottom_sheet);
          a.o(view, "this.window!!.findViewBy¡­R.id.design_bottom_sheet\)");
          this.o = view;
          if (view == null) {
             a.S(str);
          }
          view.setBackgroundResource(0x106000d);
          window = this.getWindow();
          a.m(window);
          window.clearFlags(2);
       }
       if (!PatchProxy.applyVoid(objArray, this, l.class, "28")) {
          to = this.o;
          if (to == null) {
             a.S(str);
          }
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(to);
          a.o(uBottomSheet, "BottomSheetBehavior.from\(mDesignBottomSheetView\)");
          this.r = uBottomSheet;
       }
       this.g();
       this.i();
       this.z();
       if (!PatchProxy.applyVoid(objArray, this, l.class, "15")) {
          window = this.getWindow();
          a.m(window);
          window.findViewById(R.id.touch_outside).setOnClickListener(new m(this));
       }
       return;
    }
    public final boolean p(){
       return this.B;
    }
    public final r0 q(){
       l obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mOperationAdapter");
       }
       return obj;
    }
    public final QPhoto r(){
       return this.z;
    }
    public final OperationRecyclerView s(){
       l obj = PatchProxy.apply(null, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mRecyclerView");
       }
       return obj;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, l.class, "16")) {
          return;
       }
       k tl = this.l;
       a.o(tl, "mActivity");
       if (tl.isFinishing()) {
          return;
       }
       super.show();
       l tm = this.m;
       if (tm == null) {
          a.S("mView");
       }
       tm.post(new l$i(this));
       tm = this.r;
       String str = "mBottomSheetBehavior";
       if (tm == null) {
          a.S(str);
       }
       tm.setState(3);
       tm = this.r;
       if (tm == null) {
          a.S(str);
       }
       tm.setBottomSheetCallback(new l$j(this));
       this.B();
       return;
    }
    public final View t(){
       l obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("mRvLayout");
       }
       return obj;
    }
    public final l$b u(){
       l obj = PatchProxy.apply(null, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("mShareCallerContext");
       }
       return obj;
    }
    public final int v(){
       return this.C;
    }
    public abstract int w();
    public void x(){
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, l.class, "19")) {
          return;
       }
       Window window = this.getWindow();
       a.m(window);
       n.F(window);
       return;
    }
    public void z(){
    }
}
