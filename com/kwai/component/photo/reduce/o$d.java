package com.kwai.component.photo.reduce.o$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.ColorDrawable;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kwai.framework.ui.daynight.DayNightCompatImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import android.view.View;
import im8.f;
import java.lang.Integer;
import java.util.List;
import ekd.m1;
import yf5.w2;
import android.view.View$OnClickListener;

public class o$d extends PresenterV2	// class@000aff
{
    public FeedNegativeFeedback$NegativeReason p;
    public f q;
    public View r;
    public DayNightCompatImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public final o w;

    public void o$d(o p0){
       this.w = p0;
       super();
    }
    public void E8(){
       o$d uod = o$d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       this.s.setPlaceHolderImage(new ColorDrawable(this.getContext().getResources().getColor(R.color.arg_RES_7f060bcc)));
       this.s.L(this.p.mIconImageUrl);
       this.t.setText(TextUtils.I(this.p.mTitle));
       int i = 0;
       int i1 = 8;
       if (TextUtils.x(this.p.mSubTitle)) {
          this.u.setVisibility(i1);
       }else {
          this.u.setVisibility(i);
          this.u.setText(TextUtils.I(this.p.mSubTitle));
       }
       if (TextUtils.x(this.p.mSubTitle)) {
          this.u.setVisibility(i1);
       }
       o$d tv = this.v;
       if (q.f(this.p.mDetailReason)) {
          i = 8;
       }
       tv.setVisibility(i);
       int i2 = this.q.get().intValue();
       i = this.w.D.size();
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), Integer.valueOf(i), this, uod, "5")) {
          if (this.w.K == null) {
             this.r.setBackgroundResource(R.drawable.arg_RES_7f081aef);
          }else {
             int i3 = 1;
             if (!i2) {
                tv = this.r;
                i3 = (i == i3)? 0x7f081af3: 0x7f081af4;
                tv.setBackgroundResource(i3);
             }else if(i2 == (i - i3)){
                this.r.setBackgroundResource(R.drawable.arg_RES_7f081aee);
             }else {
                this.r.setBackgroundResource(R.drawable.arg_RES_7f081aef);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a130c);
       this.v = m1.f(p0, 0x7f0a0239);
       this.t = m1.f(p0, 0x7f0a3430);
       this.u = m1.f(p0, 0x7f0a0a92);
       this.r = m1.f(p0, 0x7f0a0945);
       m1.a(p0, new w2(this), R.id.content);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o$d.class, "1")) {
          return;
       }
       this.p = this.q8(FeedNegativeFeedback$NegativeReason.class);
       this.q = this.x8("ADAPTER_POSITION");
       return;
    }
}
