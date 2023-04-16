package com.yxcorp.plugin.search.result.reduce.presenter.a$b;
import ucd.n;
import com.yxcorp.plugin.search.result.reduce.presenter.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.ColorDrawable;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.android.model.mix.QRecoTag;
import com.yxcorp.plugin.search.result.reduce.presenter.SearchReduceView;
import hed.a;
import android.view.View;
import android.view.View$OnClickListener;
import java.util.List;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hed.c;
import erd.g;
import crd.b;
import androidx.fragment.app.Fragment;
import hed.d;
import hed.b;
import com.kwai.library.widget.popup.common.c;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class a$b extends n	// class@00232a
{
    public FeedNegativeFeedback$NegativeReason p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public LinearLayout t;
    public List u;
    public final a v;

    public void a$b(a p0){
       this.v = p0;
       super();
       this.u = new ArrayList();
    }
    public void E8(){
       Object[] objArray1;
       a$b uob = a$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.q.setPlaceHolderImage(new ColorDrawable(this.getContext().getResources().getColor(R.color.arg_RES_7f060760)));
       this.q.L(this.p.mIconImageUrl);
       this.r.setText(TextUtils.I(this.p.mTitle));
       if (TextUtils.x(this.p.mSubTitle)) {
          this.s.setVisibility(8);
       }else {
          this.s.setVisibility(0);
          this.s.setText(TextUtils.I(this.p.mSubTitle));
       }
       a$b tp = this.p;
       if (tp != null) {
          FeedNegativeFeedback$NegativeReason mDetailReaso = tp.mDetailReason;
          if (mDetailReaso != null) {
             int i = mDetailReaso.size();
             if (i == 1) {
                QRecoTag qRecoTag = this.p.mDetailReason.get(0);
                SearchReduceView searchReduce = new SearchReduceView(this.getContext());
                searchReduce.a(qRecoTag, 0, 0);
                this.P8(searchReduce, new a(this, qRecoTag));
                this.u.add(searchReduce);
                this.t.addView(searchReduce);
             }else {
                int i1 = 0;
                int i2 = 0;
                while (i1 < i && i2 < i) {
                   QRecoTag qRecoTag1 = this.p.mDetailReason.get(i2);
                   int i3 = i - 1;
                   if (i2 == i3) {
                      objArray1 = objArray;
                   }else {
                      int i4 = i2 + 1;
                      objArray1 = this.p.mDetailReason.get(i4);
                   }
                   LinearLayout linearLayout = PatchProxy.applyTwoRefs(qRecoTag1, objArray1, this, uob, "5");
                   if (linearLayout != PatchProxyResult.class) {
                   }else {
                      LinearLayout linearLayout1 = new LinearLayout(this.getContext());
                      linearLayout1.setLayoutParams(new LinearLayout$LayoutParams(-1, -2));
                      linearLayout1.setOrientation(0);
                      SearchReduceView searchReduce1 = new SearchReduceView(this.getContext());
                      searchReduce1.a(qRecoTag1, 1, 1);
                      this.V8(searchReduce1, qRecoTag1);
                      SearchReduceView searchReduce2 = new SearchReduceView(this.getContext());
                      searchReduce2.a(objArray1, 1, 0);
                      this.V8(searchReduce2, objArray1);
                      linearLayout1.addView(searchReduce1);
                      linearLayout1.addView(searchReduce2);
                      this.u.add(searchReduce1);
                      this.u.add(searchReduce2);
                      linearLayout = linearLayout1;
                   }
                   this.t.addView(linearLayout);
                   i2 = i2 + 1;
                   i1 = i1 + 1;
                   i2 = i2 + 1;
                }
             }
             this.X7(this.v.r.n1().subscribe(new c(this)));
             this.X7(this.v.r.getParentFragment().n1().subscribe(new d(this)));
          }
       }
       return;
    }
    public final void V8(View p0,QRecoTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "6")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       this.P8(p0, new b(this, p1));
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "4")) {
          return;
       }
       this.v.t.q(4);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a130c);
       this.r = m1.f(p0, 0x7f0a3430);
       this.s = m1.f(p0, 0x7f0a0a92);
       this.t = p0.findViewById(0x7f0a354c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.p = this.q8(FeedNegativeFeedback$NegativeReason.class);
       return;
    }
}
