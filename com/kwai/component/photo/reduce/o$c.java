package com.kwai.component.photo.reduce.o$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QRecoTag;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import java.util.ArrayList;
import android.view.View;
import ekd.m1;
import yf5.v2;
import android.view.View$OnClickListener;

public class o$c extends PresenterV2	// class@000afe
{
    public FeedNegativeFeedback$NegativeReason p;
    public f q;
    public QRecoTag r;
    public TextView s;
    public final o t;

    public void o$c(o p0){
       this.t = p0;
       super();
    }
    public void E8(){
       o$c uoc = o$c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "3")) {
          return;
       }
       this.s.setText(TextUtils.I(this.r.mName));
       int i = this.q.get().intValue();
       int i1 = this.p.mDetailReason.size();
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, uoc, "5")) {
          if (i == (i1 - 1) && this.t.w.getVisibility()) {
             this.s.setBackgroundResource(R.drawable.arg_RES_7f081aee);
          }else {
             this.s.setBackgroundResource(R.drawable.arg_RES_7f081aef);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3430);
       m1.a(p0, new v2(this), R.id.reason);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "1")) {
          return;
       }
       this.p = this.r8("PHOTO_REDUCE_FIRST_REASON");
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.q8(QRecoTag.class);
       return;
    }
}
