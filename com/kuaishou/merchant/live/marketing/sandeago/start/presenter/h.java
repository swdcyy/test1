package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q64.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import q64.e;
import erd.g;
import crd.b;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.List;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$a;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$b;
import lnc.b9;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;
import java.util.Collection;
import ekd.q;
import android.widget.TextView;
import lnc.a1;
import j14.c;
import java.lang.CharSequence;
import android.app.Activity;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import y04.d;
import y04.c;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.f;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.g;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.c;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.e;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.d;
import brd.w;
import erd.h;
import java.util.Objects;
import t90.q;
import erd.a;
import q64.f;
import io.reactivex.internal.functions.Functions;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.robust.PatchProxyResult;
import q64.h;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import io.reactivex.subjects.PublishSubject;

public class h extends PresenterV2 implements g	// class@001a7b
{
    public h$c A;
    public r$b B;
    public TextView C;
    public LiveMerchantBaseContext p;
    public SandeagoPublish q;
    public SandeagoPublish r;
    public LiveAnchorStartSandeagoFragment s;
    public PublishSubject t;
    public PublishSubject u;
    public PublishSubject v;
    public PublishSubject w;
    public PublishSubject x;
    public b y;
    public n$b z;

    public void h(){
       super();
       this.A = new d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.X7(this.w.hide().subscribe(new e(this)));
       h tr = this.r;
       if (tr != null && tr.isSelectCategory()) {
          this.P8(this.r.mSelectCategoryList);
       }
       this.z.a(null);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       b9.a(this.y);
       return;
    }
    public final void P8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       if (p0 != null && !p0.equals(this.q.mSelectCategoryList)) {
          this.B.a();
       }else if(q.f(p0)){
          this.B.a();
       }
       this.q.mSelectCategoryList = p0;
       if (q.f(p0)) {
          this.C.setText(R.string.arg_RES_7f10436f);
          this.C.setTextColor(a1.a(R.color.arg_RES_7f061db8));
       }else {
          this.C.setText(c.b(p0));
          this.C.setTextColor(a1.a(R.color.arg_RES_7f061d77));
          this.R8(p0);
       }
       return;
    }
    public final void R8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       ProgressFragment progressFrag = z.a(this.getActivity());
       h ty = this.y;
       if (ty != null) {
          ty.dispose();
       }
       b9.a(this.y);
       Objects.requireNonNull(progressFrag);
       this.y = t.zip(c.a().w(this.p.getLiveStreamId(), c.d(p0)).map(new e()).onErrorReturn(f.b), c.a().n(c.d(p0)).map(new e()).onErrorReturn(g.b), c.a().h().map(new e()).doOnNext(c.b).onErrorReturn(e.b), d.a).doFinally(new q(progressFrag)).subscribe(new f(this), Functions.d());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a4289);
       m1.b(p0, new h$a(this), R.id.tv_start_sandeago_category_content);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new h());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASE_CONTEXT");
       this.q = this.r8("SANDEABIZ_PUBLISH");
       this.r = this.t8("SANDEABIZ_STORE_PUBLISH");
       this.s = this.r8("SANDEABIZ_START_FRAGMENT");
       this.t = this.r8("SANDEAGO_CATEGORY_CHANGED_SUBJECT");
       this.u = this.r8("SANDEAGO_PROP_CHANGED_SUBJECT");
       this.z = this.r8("SANDEAGO_PRE_AUDIT_SERVICE");
       this.B = this.r8("SANDEAGO_PROPERTY_UPDATE_SERVICE");
       this.w = this.r8("SANDEAGO_CATEGORY_SUGGEST_SUBJECT");
       this.v = this.r8("SANDEAGO_RULE_CONFIG_SUBJECT");
       this.x = this.r8("SANDEAGO_TITLE_SUBJECT");
       return;
    }
}
