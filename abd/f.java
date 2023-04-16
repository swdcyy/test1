package abd.f;
import x9d.g;
import nfd.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import android.widget.LinearLayout;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxObjectModel;
import com.yxcorp.plugin.search.entity.kbox.KboxMovieTab;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Math;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.kbox.MovieTab;
import java.lang.CharSequence;
import nfd.o3;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import abd.f$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import abd.f$b;
import android.view.View$OnClickListener;
import java.lang.Throwable;
import z6d.l;
import z6d.k;
import brd.t;
import cjd.e;
import erd.o;
import abd.e;
import abd.d;
import erd.g;
import crd.b;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;

public class f extends g	// class@0000c5
{
    public KBoxItem A;
    public KboxMovieTab B;
    public g C;
    public boolean D;
    public int E;
    public int F;
    public MovieTab G;
    public LinearLayout y;
    public RecyclerView z;
    public static final int H;

    static {
       f.H = t0.Y;
    }
    public void f(){
       super();
       this.D = false;
       this.E = 0;
       this.F = 0;
    }
    public void E8(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       if (this.A != this.w.mKBoxItem) {
          this.G = objArray;
          this.y.removeAllViews();
          this.a9();
          SearchItem mKBoxItem = this.w.mKBoxItem;
          this.A = mKBoxItem;
          KBoxItem mKboxModel = mKBoxItem.mKboxModel;
          int i = 0;
          if (mKboxModel != null) {
             KBoxObjectModel mKboxMovieTa = mKboxModel.mKboxMovieTab;
             if (mKboxMovieTa != null) {
                this.B = mKboxMovieTa;
                if (!q.f(mKboxMovieTa.mTabs)) {
                   i1 = this.B.mTabs.size();
                label_0041 :
                   i1 = Math.min(6, i1);
                   if (!i1) {
                      this.y.setVisibility(8);
                      return;
                   }else {
                      this.E = n.k(this.getActivity()) - t0.J;
                      this.F = i;
                      this.y.setVisibility(i);
                      for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                         SelectShapeTextView selectShapeT = a.a(this.getContext(), R.layout.arg_RES_7f0d1645);
                         selectShapeT.setMaxWidth(t0.b0);
                         MovieTab movieTab = this.B.mTabs.get(i2);
                         o3.G(selectShapeT, movieTab.mTabName);
                         LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, t0.C);
                         layoutParams.setMargins(i, i, t0.i, i);
                         selectShapeT.setLayoutParams(layoutParams);
                         f tG = this.G;
                         boolean b = true;
                         if (tG != null) {
                            if (tG != movieTab) {
                            label_00a3 :
                               b = false;
                            }
                         }else if(!i2){
                         }
                         g.b9(selectShapeT, b);
                         this.y.addView(selectShapeT);
                         selectShapeT.getViewTreeObserver().addOnGlobalLayoutListener(new f$a(this, selectShapeT));
                         selectShapeT.setOnClickListener(new f$b(this, selectShapeT, movieTab));
                      }
                   }
                }
             }
          }
          i1 = 0;
          goto label_0041 ;
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.G == null) {
          return;
       }
       this.Z8();
       this.c9(this.G);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       this.D = false;
       super.X8();
       return;
    }
    public void Y8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       this.D = false;
       super.Y8(p0);
       return;
    }
    public final void c9(MovieTab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       f tB = this.B;
       k.b().g(p0.mTabId, tB.mKey, tB.mRank, tB.mSessionId).map(new e()).subscribe(new e(this), new d(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.y = m1.f(p0, 0x7f0a3838);
       this.z = m1.f(p0, 0x7f0a06d2);
       return;
    }
}
