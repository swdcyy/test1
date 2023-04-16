package fna.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import fna.k$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ena.j;
import fna.k$c;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import fna.k$d;
import android.view.ViewGroup;
import android.view.View$OnTouchListener;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import java.lang.Math;
import android.animation.ValueAnimator;
import fna.k$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import gna.a;
import gna.b$d;
import com.kwai.robust.PatchProxyResult;
import gna.b$b;
import gna.b;
import gna.b$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.collections.ArraysKt___ArraysKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import gna.d$b;
import vsd.d;
import nsd.m0;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;
import gna.d;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$obtainPinnedTitleViewHolder$1;
import msd.l;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2;
import msd.p;
import gna.d$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import ena.j$a;

public final class k extends PresenterV2	// class@00298c
{
    public ArrayList p;
    public j q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final k$b z;

    public void k(){
       super();
       this.s = true;
       this.v = a1.e(4.00f);
       this.w = a1.e(280.00f);
       this.x = a1.e(60.00f);
       this.y = 10;
       this.z = new k$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tp = this.p;
       if (tp == null) {
          a.S("mCleanerAdapterDataObservers");
       }
       tp.add(this.z);
       tp = this.q;
       if (tp != null) {
          j m = tp.m;
          if (m != null && tp != null) {
             j s = tp.s;
             if (s != null && tp != null) {
                j p = tp.p;
                if (p != null && tp != null) {
                   j r = tp.r;
                   if (r != null) {
                      s.addOnScrollListener(new k$c(this));
                      r.setOnTouchListener(new k$d(this, s, m, p));
                   }
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       k tp = this.p;
       if (tp == null) {
          a.S("mCleanerAdapterDataObservers");
       }
       tp.remove(this.z);
       return;
    }
    public final void P8(View p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "5")) {
          return;
       }
       int i = GrowthCommonExtKt.b(p0);
       int i1 = p1 - i;
       if (Math.abs(i1) < this.y) {
          GrowthCommonExtKt.g(p0, p1);
          this.V8();
       }else {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          a.o(valueAnimato, "anim");
          valueAnimato.setDuration(200);
          valueAnimato.addUpdateListener(new k$a(this, p0, i, i1));
          valueAnimato.start();
       }
       return;
    }
    public final b$d R8(a p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob = p0.J0().E(p1);
       b$a uoa = null;
       if (uob != null) {
          if (uob instanceof b$d && !uob.f() instanceof b$d) {
          }else {
             b$a uoa1 = uob.f();
             if (uoa1 instanceof b$d) {
                uoa = uoa1;
             }
             uoa1 = uoa;
             while (uoa1 != null) {
                uoa = uoa1.f();
                if (uoa instanceof b$d) {
                   uoa1 = uoa;
                }
             }
          }
          return uob;
       }else {
          return uoa;
       }
    }
    public final void S8(){
       int i;
       Object[] objArray1;
       RecyclerView$ViewHolder itemView1;
       GrowthCommonExtKt growthCommon = GrowthCommonExtKt.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "8")) {
          return;
       }
       k tq = this.q;
       if (tq != null) {
          j q = tq.q;
          if (q != null) {
             q.removeAllViews();
             k tq1 = this.q;
             if (tq1 != null) {
                j s = tq1.s;
                if (s != null) {
                   RecyclerView$Adapter adapter = s.getAdapter();
                   if (!adapter instanceof a) {
                      adapter = objArray;
                   }
                   if (adapter != null) {
                      b$d obj = PatchProxy.applyOneRefs(s, objArray, growthCommon, "1");
                      if (obj != patchProxyRe) {
                         i = obj.intValue();
                      }else {
                         a.p(s, "$this$findFirstVisibleItemPosition");
                         RecyclerView$LayoutManager layoutManage1 = s.getLayoutManager();
                         if (layoutManage1 instanceof StaggeredGridLayoutManager) {
                            int[] ointArray2 = layoutManage1.findFirstVisibleItemPositions(objArray);
                            a.o(ointArray2, "lm.findFirstVisibleItemPositions\(null\)");
                            Integer integer = ArraysKt___ArraysKt.Rm(ointArray2);
                            if (integer != null) {
                               i = integer.intValue();
                            }
                         }else if(layoutManage1 instanceof GridLayoutManager){
                            i = layoutManage1.i0();
                         }else if(layoutManage1 instanceof LinearLayoutManager){
                            i = layoutManage1.i0();
                         }
                         i = -1;
                      }
                      int i1 = GrowthCommonExtKt.a(s);
                      int i2 = i1 - i;
                      if (PatchProxy.isSupport(growthCommon)) {
                         objArray1 = PatchProxy.applyTwoRefs(s, Integer.valueOf(i2), objArray, growthCommon, "3");
                         if (objArray1 != patchProxyRe) {
                         label_00b9 :
                            if (objArray1 != null) {
                               int[] ointArray = new int[2];
                               objArray1.getLocationOnScreen(ointArray);
                               int[] ointArray1 = new int[2];
                               s.getLocationOnScreen(ointArray1);
                               int i3 = ointArray[1] - ointArray1[1];
                               b$d uod = this.R8(adapter, i);
                               if (uod != null) {
                                  obj = this.R8(adapter, i1);
                                  if (obj != null) {
                                     a uoa = PatchProxy.applyTwoRefs(q, uod, adapter, a.class, "4");
                                     if (uoa != patchProxyRe) {
                                     }else {
                                        a.p(q, "parent");
                                        a.p(uod, "modelTitle");
                                        a i4 = adapter.i;
                                        if (i4 == null) {
                                           i4 = GrowthCleanerViewHolderKt.a(q, GrowthCleanerViewHolderKt.b(m0.d(d$b.class)));
                                           Objects.requireNonNull(i4, "null cannot be cast to non-null type com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolder.SelectTitle");
                                           adapter.i = i4;
                                        }
                                        uoa = i4;
                                        uoa.g(uod);
                                        uoa.p(new GrowthCleanerAdapter$obtainPinnedTitleViewHolder$1(adapter));
                                        uoa.m(new GrowthCleanerAdapter$obtainPinnedTitleViewHolder$2(adapter, uoa));
                                        if (adapter.f != null) {
                                           uoa.n();
                                        }else {
                                           uoa.k();
                                        }
                                     }
                                     uoa.itemView.setBackgroundResource(R.color.arg_RES_7f06172f);
                                     q.addView(uoa.itemView);
                                     RecyclerView$ViewHolder itemView = uoa.itemView;
                                     a.o(itemView, "header.itemView");
                                     ViewGroup$LayoutParams height = itemView.getLayoutParams().height;
                                     if (height <= null) {
                                        itemView = uoa.itemView;
                                        a.o(itemView, "header.itemView");
                                        height = itemView.getHeight();
                                     }
                                     if ((a.g(uod, obj) ^ 1) && (i3 > 0 && (height > 0 && height > i3))) {
                                        itemView1 = uoa.itemView;
                                        a.o(itemView1, "header.itemView");
                                        itemView1.setTranslationY((- (float)(height - i3)));
                                     }else {
                                        itemView1 = uoa.itemView;
                                        a.o(itemView1, "header.itemView");
                                        itemView1.setTranslationY(0);
                                     }
                                  }
                               }
                            }
                         }
                      }
                      a.p(s, "$this$getLayoutChildAt");
                      RecyclerView$LayoutManager layoutManage = s.getLayoutManager();
                      if (layoutManage instanceof StaggeredGridLayoutManager) {
                         objArray = layoutManage.getChildAt(i2);
                      }else if(layoutManage instanceof GridLayoutManager){
                         objArray = layoutManage.getChildAt(i2);
                      }else if(layoutManage instanceof LinearLayoutManager){
                         objArray = layoutManage.getChildAt(i2);
                      }
                      objArray1 = objArray;
                      goto label_00b9 ;
                   }
                }
             }
          }
       }
       return;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "4")) {
          return;
       }
       k tq = this.q;
       j m = (tq != null)? tq.m: objArray;
       float f = (float)GrowthCommonExtKt.b(m) / (float)(- this.w);
       k ok = 0x3f800000;
       if (f < 0) {
          f = 0;
       }else if(f - ok > 0){
          f = 0x3f800000;
       }
       ok = this.q;
       int i = 1;
       if (ok != null) {
          j e = ok.e;
          if (e != null) {
             e.setAlpha((float)((double)i - ((double)f * 0x3fe999999999999a)));
          }
       }
       ok = this.q;
       if (ok != null) {
          objArray = ok.j;
       }
       GrowthCommonExtKt.f(objArray, (int)((float)this.v * ((float)i - ((float)50 * f))));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = j.y.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       Object obj = this.r8("CLEANER_ADAPTER_DATA_OBSERVERS");
       a.o(obj, "inject\(CLEANER_ADAPTER_DATA_OBSERVERS\)");
       this.p = obj;
       return;
    }
}
