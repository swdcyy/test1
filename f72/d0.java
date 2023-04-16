package f72.d0;
import k51.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import lnc.a1;
import f72.d0$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.utility.n;
import java.util.Random;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.f;

public class d0 extends c	// class@0028c7
{
    public RecyclerFragment A;
    public LiveDoubleListParam B;
    public final q C;
    public ViewGroup p;
    public View q;
    public View r;
    public RefreshLayout s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public i z;
    public static final boolean D = false;
    public static String sLivePresenterClassName;

    static {
       d0.D = a.t().u("SOURCE_LIVE").d("enableExploreLoadSkeletonUseNewSelectApi", false);
    }
    public void d0(){
       super();
       this.u = a1.e(180.00f);
       this.v = a1.e(151.00f);
       this.w = a1.e(142.00f);
       this.x = a1.e(100.00f);
       this.y = a1.e(20.00f);
       this.C = new d0$a(this);
    }
    public void E8(){
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "3")) {
          return;
       }
       ViewGroup viewGroup = PatchProxy.apply(objArray, this, uod0, "4");
       if (viewGroup != PatchProxyResult.class) {
       }else if(this.B.mCardStyle == 1){
          viewGroup = m1.f(this.r, R.id.live_explore_skeleton_view_v4);
       }else {
          viewGroup = m1.f(this.r, R.id.live_explore_skeleton_view);
       }
       this.p = viewGroup;
       this.s = this.A.Ac();
       this.z.h(this.C);
       boolean b = (d0.D)? this.A.Vg().c(): this.A.K0();
       if (b && this.z.isEmpty()) {
          this.R8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "5")) {
          return;
       }
       this.z.f(this.C);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "7")) {
          return;
       }
       if (this.t != null) {
          this.t = false;
          this.s.setEnabled(true);
          this.q.clearAnimation();
          View[] viewArray = new View[]{this.p,this.q};
          n.Z(8, viewArray);
       }
       return;
    }
    public void R8(){
       d0 p;
       int i5;
       int i6;
       int i8;
       ViewGroup$LayoutParams layoutParams;
       ViewGroup$LayoutParams layoutParams1;
       boolean b = this;
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoid(null, b, uod0, "6")) {
          return;
       }
       if (b.t == null) {
          boolean b1 = true;
          b.t = b1;
          b.s.setEnabled(false);
          int i = 3;
          int i1 = 0x7f0a146f;
          int i2 = 0x7f0a146e;
          int i3 = 0x7f0a146d;
          int i4 = 0x7f0a146a;
          if (b.B.mCardStyle == b1) {
             p = b.p;
             if (!PatchProxy.applyVoidOneRefs(p, b, uod0, "10")) {
                Random random = new Random();
                View[] viewArray1 = new View[]{p.findViewById(i4),p.findViewById(i3),p.findViewById(i2),p.findViewById(i1),p.findViewById(0x7f0a1470),p.findViewById(0x7f0a1471),p.findViewById(0x7f0a1472),p.findViewById(0x7f0a1473)};
                if (!PatchProxy.applyVoidTwoRefs(random, viewArray1, b, uod0, "11")) {
                   i5 = b.u + random.nextInt(b.w);
                   i6 = b.u + random.nextInt(b.w);
                   viewArray1[0].getLayoutParams().height = i5;
                   viewArray1[b1].getLayoutParams().height = i6;
                   object oobject = (i5 > i6)? 1: null;
                   int i7 = Math.abs((i5 - i6));
                   d0 x = b.x;
                   if (i7 < x) {
                      i8 = x - i7;
                      if (oobject) {
                         layoutParams = viewArray1[0].getLayoutParams();
                         layoutParams.height = layoutParams.height + i8;
                      }else {
                         layoutParams = viewArray1[b1].getLayoutParams();
                         layoutParams.height = layoutParams.height + i8;
                      }
                   }
                   i7 = b.u + random.nextInt(b.w);
                   i8 = (oobject)? b.y + i7: i7;
                   if (!oobject) {
                      i7 = i7 + b.y;
                   }
                   viewArray1[2].getLayoutParams().height = i8;
                   viewArray1[i].getLayoutParams().height = i7;
                   viewArray1[4].getLayoutParams().height = i5;
                   viewArray1[5].getLayoutParams().height = i6;
                   viewArray1[6].getLayoutParams().height = i7;
                   viewArray1[7].getLayoutParams().height = i8;
                }
             }
          }else {
             p = b.p;
             if (!PatchProxy.applyVoidOneRefs(p, b, uod0, "8")) {
                Random random1 = new Random();
                View[] viewArray2 = new View[]{p.findViewById(i4),p.findViewById(i3),p.findViewById(i2),p.findViewById(i1)};
                if (!PatchProxy.applyVoidTwoRefs(random1, viewArray2, b, uod0, "9")) {
                   i5 = b.u + random1.nextInt(b.v);
                   i6 = b.u + random1.nextInt(b.v);
                   viewArray2[0].getLayoutParams().height = i5;
                   viewArray2[b1].getLayoutParams().height = i6;
                   object oobject1 = (i5 > i6)? 1: null;
                   i5 = Math.abs((i5 - i6));
                   p = b.x;
                   if (i5 < p) {
                      i6 = p - i5;
                      if (oobject1) {
                         layoutParams1 = viewArray2[0].getLayoutParams();
                         layoutParams1.height = layoutParams1.height + i6;
                      }else {
                         layoutParams1 = viewArray2[b1].getLayoutParams();
                         layoutParams1.height = layoutParams1.height + i6;
                      }
                   }
                   i5 = b.u + random1.nextInt(b.v);
                   i6 = (oobject1)? b.y + i5: i5;
                   if (!oobject1) {
                      i5 = i5 + b.y;
                   }
                   viewArray2[2].getLayoutParams().height = i6;
                   viewArray2[i].getLayoutParams().height = i5;
                }
             }
          }
          View[] viewArray = new View[]{b.p,b.q};
          n.Z(false, viewArray);
          f.h(this.getContext(), b.q);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.r = p0;
       this.q = m1.f(p0, 0x7f0a1c5e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.z = this.r8("PAGE_LIST");
       this.A = this.r8("FRAGMENT");
       this.B = this.q8(LiveDoubleListParam.class);
       return;
    }
}
