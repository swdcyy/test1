package com.yxcorp.gifshow.growth.interest.activity.BaseInterestTagEditActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yna.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import kotlin.Result;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.growth.interest.InterestChangeEvent;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import cra.w;
import q87.c;
import android.os.Bundle;
import k2b.e0;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import zna.a;
import android.content.Context;
import n3d.a;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import java.util.Objects;
import com.yxcorp.gifshow.growth.interest.fragment.InterestEditTopFragment;
import com.yxcorp.gifshow.growth.interest.fragment.BaseInterestEditFragment;
import com.yxcorp.gifshow.growth.interest.fragment.InterestEditBottomFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import java.lang.Integer;

public class BaseInterestTagEditActivity extends GifshowActivity	// class@0013bf
{
    public BaseInterestEditFragment A;
    public g y;
    public BaseInterestEditFragment z;

    public void BaseInterestTagEditActivity(){
       super();
       this.y = new g();
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, BaseInterestTagEditActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.y.g())) {
          return "source="+this.y.g();
       }
       a.o("", "super.getPageParams\(\)");
       return "";
    }
    public String o(){
       return "TAG_SETTINGS";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, BaseInterestTagEditActivity.class, "6")) {
          return;
       }
       this.y.c().onNext(new InterestChangeEvent(6, ""));
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          w.C().e("interestEdit", "onBackPressed", obj);
       }
       return;
    }
    public void onCreate(Bundle p0){
       BaseInterestTagEditActivity uBaseInteres = BaseInterestTagEditActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBaseInteres, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d055b);
       u1.L0(this);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       Object[] objArray = null;
       if (!mE.isLogined()) {
          if (!PatchProxy.applyVoid(objArray, this, uBaseInteres, "5")) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f1046e3));
             d.a(-1712118428).x00(this, 144, uoa.a(), new a(this));
             uoa = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(uoa);
             if (throwable != null) {
                w.C().e("interestEdit", "onUnLoginOpen", throwable);
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, uBaseInteres, "3")){
          Intent intent = this.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data == null || data.isHierarchical() != true) {
                this.finish();
             }else {
                Uri data1 = intent.getData();
                if (data1 != null) {
                   objArray = data1.getQueryParameter("from");
                }
                BaseInterestTagEditActivity ty = this.y;
                String str = String.valueOf(objArray);
                Objects.requireNonNull(ty);
                if (!PatchProxy.applyVoidOneRefs(str, ty, g.class, "4")) {
                   a.p(str, "<set-?>");
                   ty.j = str;
                }
             }
          }
       }
       this.u3();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseInterestTagEditActivity.class, "8")) {
          return;
       }
       a.p(p0, "outState");
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, BaseInterestTagEditActivity.class, "4")) {
          return;
       }
       this.y.a = this;
       InterestEditTopFragment interestEdit = new InterestEditTopFragment();
       interestEdit.dh(this.y);
       this.z = interestEdit;
       InterestEditBottomFragment interestEdit1 = new InterestEditBottomFragment();
       interestEdit1.dh(this.y);
       this.A = interestEdit1;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       BaseInterestTagEditActivity tz = this.z;
       a.m(tz);
       uoe.v(R.id.fragment_top, tz);
       uoe.m();
       uoe = this.getSupportFragmentManager().beginTransaction();
       tz = this.A;
       a.m(tz);
       uoe.v(R.id.fragment_bottom, tz);
       Throwable obj = Result.constructor-impl(Integer.valueOf(uoe.m()));
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          w.C().e("interestEdit", "bindFragment", obj);
       }
       return;
    }
}
