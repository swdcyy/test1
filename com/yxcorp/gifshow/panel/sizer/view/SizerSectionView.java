package com.yxcorp.gifshow.panel.sizer.view.SizerSectionView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import yvb.e;
import com.yxcorp.gifshow.follow.model.FilterBox;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import bwb.d;
import zvb.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.model.FilterOption;
import zvb.b;
import g9c.a;
import yvb.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$l;
import cwb.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.panel.sizer.view.SizerSectionView$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import yvb.e$b;
import mrd.a;

public class SizerSectionView extends ConstraintLayout	// class@000e32
{
    public final RecyclerView B;
    public final TextView C;
    public int D;
    public boolean E;
    public boolean F;
    public final e G;
    public float H;
    public f I;
    public a J;
    public boolean K;

    public void SizerSectionView(Context p0){
       super(p0, null);
    }
    public void SizerSectionView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SizerSectionView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.D = 3;
       this.H = 12.00f;
       this.K = false;
       a.k(this, R.layout.arg_RES_7f0d10f9, true);
       this.C = m1.f(this, 0x7f0a40d7);
       this.B = m1.f(this, 0x7f0a34da);
       this.G = new e();
    }
    public e getSectionAdapter(){
       return this.G;
    }
    public void setData(FilterBox p0){
       SizerSectionView tD;
       if (PatchProxy.applyVoidOneRefs(p0, this, SizerSectionView.class, "1")) {
          return;
       }
       if (q.f(p0.mOptions)) {
          return;
       }
       SizerSectionView tC = this.C;
       int i = 0;
       int i1 = (this.F != null)? 0: 8;
       tC.setVisibility(i1);
       this.C.setText(p0.getShowDisplayText());
       TextView[] textViewArra = new TextView[]{this.C};
       d.c(14.00f, textViewArra);
       FilterBox mOptions = p0.mOptions;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(mOptions, obj, a.class, "6");
       if (obj1 != PatchProxyResult.class) {
       }else if(mOptions == null || mOptions.isEmpty()){
          obj1 = 1;
       }else {
          obj1 = null;
       }
       if (obj1) {
          obj1 = obj;
       }else {
          obj1 = new ArrayList();
          Iterator iterator = mOptions.iterator();
          while (iterator.hasNext()) {
             Object obj2 = iterator.next();
             Object obj3 = obj2;
             FilterOption mSubOptions = obj3.mSubOptions;
             mSubOptions = (mSubOptions == null || mSubOptions.isEmpty())? 1: null;
             obj3 = (mSubOptions || !b.a(obj3.mSubOptions))? 1: null;
             if (obj3) {
                obj1.add(obj2);
             }
          }
       }
       this.G.W0(obj1);
       tC = this.G;
       tC.w = p0;
       if (this.I == null) {
          this.I = new d();
       }
       tC.z = this.I;
       tC.x = this.J;
       this.B.setAdapter(tC);
       this.B.setItemAnimator(obj);
       this.B.addItemDecoration(new a(this.G.getItemCount(), this.H));
       SizerSectionView tB = this.B;
       i = (this.E != null && obj1 != null)? obj1.size(): this.D;
       tB.setLayoutManager(new SizerSectionView$1(this, i, 1));
       return;
    }
    public void setDecorationPaddingTop(float p0){
       this.H = p0;
    }
    public void setItemClickListener(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SizerSectionView.class, "2")) {
          return;
       }
       SizerSectionView tG = this.G;
       if (tG != null) {
          tG.r1(p0);
       }
       return;
    }
    public void setSkinInfoBehaviorSubject(a p0){
       this.J = p0;
    }
}
