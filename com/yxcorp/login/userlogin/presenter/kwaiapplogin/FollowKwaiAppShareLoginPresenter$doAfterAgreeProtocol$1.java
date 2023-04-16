package com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1;
import u45.a;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.kwai.auth.common.InternalResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.Map;
import p1d.b;
import q1d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g2d.a;
import brd.t;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1;
import j2d.b;
import msd.l;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2;
import erd.g;
import crd.b;
import java.lang.Integer;
import mrd.c;
import java.lang.Boolean;
import brd.y;

public final class FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1 implements a	// class@001bbf
{
    public final FollowKwaiAppShareLoginPresenter a;
    public final ProgressFragment b;

    public void FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1(FollowKwaiAppShareLoginPresenter p0,ProgressFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(InternalResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1.class, "1")) {
          return;
       }
       a.p(p0, "response");
       this.b.dismiss();
       String code = p0.getCode();
       HashMap hashMap = new HashMap();
       a.o(code, "resultCode");
       hashMap.put("code", code);
       t ot = a.a(11).b(this.a.c(), hashMap);
       ot.subscribe(new b(new FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$1(this.a)), new b(new FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1$onSuccess$2(this.a)));
       return;
    }
    public void b(String p0,int p1,String p2){
       if (PatchProxy.isSupport(FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1.class, "2")) {
          return;
       }
       this.b.dismiss();
       c uoc = this.a.e();
       if (uoc != null) {
          uoc.onNext(Boolean.TRUE);
       }
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, FollowKwaiAppShareLoginPresenter$doAfterAgreeProtocol$1.class, "3")) {
          return;
       }
       this.b.dismiss();
       c uoc = this.a.e();
       if (uoc != null) {
          uoc.onNext(Boolean.TRUE);
       }
       return;
    }
}
