package com.kuaishou.commercial.home.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import mxb.h0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.j;
import com.kuaishou.commercial.home.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.report.ReportModuleUseTools;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class b extends PresenterV2	// class@0014d7
{
    public PhotoType p;
    public int q;
    public BaseFeed r;
    public PhotoAdvertisement s;
    public TextView t;
    public RecyclerFragment u;
    public View v;
    public TextView w;

    public void b(){
       super();
    }
    public void b(int p0){
       super();
       this.q = p0;
    }
    public void b(PhotoType p0){
       super();
       this.p = p0;
    }
    public void E8(){
       b tq;
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       if (h0.d(this.s)) {
          b tr = this.r;
          if (!PatchProxy.applyVoidOneRefs(tr, this, uob, "6") && tr != null) {
             Object obj = PatchProxy.apply(objArray, this, uob, "7");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(h0.d(this.s) || this.r instanceof AdAggregateTemplateFeed){
                b = true;
             }else {
                b = false;
             }
             if (!b || (!PatchProxy.applyVoid(objArray, this, uob, "5") && !TextUtils.x(this.s.mSubscriptDescription))) {
                tq = this.t;
                if (tq != null) {
                   tq.setText(this.s.mSubscriptDescription);
                   tq = this.t;
                   if (!PatchProxy.applyVoidOneRefs(tq, this, uob, "8")) {
                      this.w = tq;
                      if (j.w(new QPhoto(this.r))) {
                         this.w.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.P8(), 0);
                         this.w.setOnClickListener(new a(this));
                      }else {
                         this.w.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                      }
                   }
                   this.t.setVisibility(0);
                }
             }
          }
       }
    label_00a0 :
       QPhoto qPhoto = new QPhoto(this.r);
       if (this.p == PhotoType.AD_FEED_AGGREGATE_TEMPLATE) {
          ReportModuleUseTools.a("ks_feed_aggregate_template", qPhoto);
       }else {
          tq = this.q;
          if (tq == 20 || tq == 21) {
             ReportModuleUseTools.a("ks_feed_gif_or_direct", qPhoto);
          }else {
             ReportModuleUseTools.a("ks_feed_cover_image_mark", qPhoto);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.v = this.m8();
       return;
    }
    public int P8(){
       return 0x7f08009a;
    }
    public int R8(){
       return 0x7f08009b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.r8("feed");
       this.s = this.t8("AD");
       this.u = this.r8("FRAGMENT");
       return;
    }
}
