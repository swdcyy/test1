package com.yxcorp.gifshow.profile.presenter.profile.page.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import org.json.JSONObject;
import b5c.j;
import java.lang.Exception;
import android.net.Uri;
import ekd.x0;
import brd.t;
import j5c.c;
import t45.d;
import brd.z;
import b5c.m;
import b5c.k;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.feed.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.c;
import brd.w;
import erd.c;
import b5c.o;
import erd.o;
import b5c.l;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.util.rx.RxBus;
import ja6.a;
import b5c.n;
import java.util.Map;
import android.app.Activity;
import agc.b;
import com.kwai.framework.model.user.User;

public class d extends PresenterV2	// class@00156c
{
    public User p;
    public ProfileParam q;
    public c r;

    public void d(){
       super();
    }
    public static void P8(d p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, d.class, "7")) {
       }else {
          Log.d("CommercialReservation", p0.q.mAdExtra+"\n"+p1.getMessage());
       }
       return;
    }
    public void E8(){
       String str2;
       CharSequence uCharSequenc;
       String str3;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       Uri obj = PatchProxy.apply(objArray, this, uod, "5");
       String str = "";
       String str1 = "CommercialReservation";
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(TextUtils.isEmpty(this.q.mAdExtra) || (!QCurrentUser.me().isLogined() && !a.t().d("adProfileReservationCanLogin", true))){
          try{
             JSONObject jSONObject = new JSONObject(this.q.mAdExtra);
             str2 = jSONObject.optString("reservationInfo");
             try{
                str3 = j.b(jSONObject);
             label_0062 :
                if (!TextUtils.isEmpty(uCharSequenc)) {
                   Uri uri = x0.f(uCharSequenc);
                   if (uri == null) {
                      Log.d(str1, "scheme is error"+uCharSequenc);
                   }else {
                      objArray = new Pair(uri, str3);
                   }
                }
             }catch(java.lang.Exception e0){
             }
             Log.d(str1, e0.getMessage());
             str3 = str;
             goto label_0062 ;
          }catch(java.lang.Exception e0){
             uCharSequenc = str;
             goto label_005a ;
          }
       }
       if (objArray == null) {
          return;
       }else {
          obj = objArray.getFirst();
          String second = objArray.getSecond();
          str2 = x0.a(obj, "reservationId");
          if (TextUtils.isEmpty(second)) {
             this.X7(this.r.e().observeOn(d.a).subscribe(new m(this, obj), new k(this)));
             Log.g(str1, "photoId is null"+this.q.mAdExtra);
          }else {
             this.X7(t.zip(this.r.e(), g.e(second, str), c.a).observeOn(d.c).map(new o(this)).observeOn(d.a).doOnNext(new l(this, obj)).subscribe(Functions.d(), new k(this)));
          }
          this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new n(this, str2)));
          return;
       }
    }
    public final void R8(Uri p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null && (!activity.isFinishing() && !activity.isDestroyed())) {
          b.a(activity, p0, p1);
       }
    label_0020 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.q8(ProfileParam.class);
       this.r = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
