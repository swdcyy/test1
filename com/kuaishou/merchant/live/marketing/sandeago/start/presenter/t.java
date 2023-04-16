package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q64.f0;
import erd.g;
import crd.b;
import brd.t;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.Map;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoCategoryInfoResponse$ServicePromise;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import io.reactivex.subjects.PublishSubject;

public class t extends PresenterV2	// class@001a90
{
    public SandeagoPublish p;
    public LiveMerchantBaseContext q;
    public PublishSubject r;
    public List s;
    public View t;
    public TextView u;
    public StartSandeagoCategoryInfoResponse v;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       this.X7(this.r.subscribe(new f0(this)));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (q.f(this.s)) {
          return;
       }
       this.p.mServiceMap.clear();
       StringBuilder str = "";
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          StartSandeagoCategoryInfoResponse$ServicePromise servicePromi = iterator.next();
          if (servicePromi.mIsOpen != null) {
             str = str+servicePromi.mName+" ";
             this.p.mServiceMap.put(servicePromi.mKey, Boolean.TRUE);
          }else {
             this.p.mServiceMap.put(servicePromi.mKey, Boolean.FALSE);
          }
       }
       if (TextUtils.x(str)) {
          this.u.setGravity(19);
       }else {
          this.u.setGravity(21);
       }
       this.u.setText(str);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a4296);
       this.u = m1.f(p0, 0x7f0a4297);
       m1.b(p0, new t$a(this), R.id.tv_start_sandeago_service);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASE_CONTEXT");
       this.r = this.r8("SANDEAGO_CATEGORY_CHANGED_SUBJECT");
       this.p = this.r8("SANDEABIZ_PUBLISH");
       return;
    }
}
