package com.kuaishou.tuna_router.router.thanos_detail.a;
import p25.i;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_router.router.thanos_detail.b;
import com.kuaishou.tuna_router.router.thanos_detail.a$a;
import qvb.q;
import qvb.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h05.d;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import xn4.a;
import msd.a;
import c15.b;
import android.content.Intent;
import java.lang.StringBuilder;
import ekd.w0;
import e17.i;
import android.widget.FrameLayout;
import qvb.n0;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import s25.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.utility.n;
import lnc.a1;
import s25.b;

public class a extends i	// class@001183
{
    public KwaiLoadingView q;
    public KwaiEmptyStateView r;
    public b s;

    public void a(){
       super();
    }
    public void R8(Uri p0){
       boolean b;
       Object obj = this;
       a$a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, "3")) {
          return;
       }
       String queryParamet = obj1.getQueryParameter("url");
       String queryParamet1 = obj1.getQueryParameter("param");
       String queryParamet2 = obj1.getQueryParameter("photoId");
       String queryParamet3 = obj1.getQueryParameter("parsePath");
       String queryParamet4 = obj1.getQueryParameter("page");
       String queryParamet5 = obj1.getQueryParameter("h5_page");
       String queryParamet6 = obj1.getQueryParameter("headerUrl");
       String queryParamet7 = obj1.getQueryParameter("poiTitle");
       String queryParamet8 = obj1.getQueryParameter("poiAddress");
       String queryParamet9 = obj1.getQueryParameter("isCollected");
       String queryParamet10 = obj1.getQueryParameter("poiId");
       String queryParamet11 = obj1.getQueryParameter("startTs");
       obj1 = PatchProxy.applyFourRefs(queryParamet2, queryParamet, queryParamet1, queryParamet3, this, a.class, "6");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else if(!TextUtils.x(queryParamet2) && (!TextUtils.x(queryParamet) && (!TextUtils.x(queryParamet1) && !TextUtils.x(queryParamet3)))){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          this.P8();
          return;
       }else {
          b uob = new b(queryParamet2, queryParamet, queryParamet1, queryParamet3, TextUtils.n("sidebar", queryParamet4));
          obj.s = v1;
          obj1 = queryParamet3;
          b uob1 = v1;
          b uob2 = uob1;
          a$a uoa = queryParamet3;
          obj1 = new a$a(this, queryParamet5, queryParamet4, queryParamet6, queryParamet7, queryParamet8, queryParamet9, queryParamet10, queryParamet11, queryParamet2);
          uob2.h(uoa);
          this.a();
          return;
       }
    }
    public void S8(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5")) {
          return;
       }
       this.q.setVisibility(8);
       boolean b = false;
       CharSequence uCharSequenc = null;
       this.q.g(b, uCharSequenc);
       if (p1 && p0.C(a.b())) {
          Activity activity = this.getActivity();
          if (activity != null) {
             Object obj = PatchProxy.applyTwoRefs(activity, p0, uCharSequenc, d.class, "4");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else if(TextUtils.x(p0)){
                b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("jumpPhotoDetail"), a.b);
             }else {
                activity.startActivity(new Intent("android.intent.action.VIEW", w0.f("kwai://work/"+p0)));
             }
             this.P8();
          }
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          this.r.setVisibility(b);
       }
       return;
    }
    public final void a(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (this.s != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             this.q.setVisibility(0);
             this.q.g(true, objArray);
             this.r.setVisibility(8);
          }
          this.s.a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a05a1);
       KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.empty_view);
       this.r = kwaiEmptySta;
       kwaiEmptySta.p(new a(this));
       p0 = p0.findViewById(R.id.tuna_router_detail_back_btn);
       FrameLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = n.A(p0.getContext()) + a1.e(2.00f);
       p0.setLayoutParams(layoutParams);
       p0.setOnClickListener(new b(this));
       return;
    }
}
