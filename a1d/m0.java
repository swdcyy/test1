package a1d.m0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w0d.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.l0;
import erd.r;
import brd.t;
import a1d.k0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.widget.ProgressBar;
import android.view.View;
import android.app.Activity;
import com.yxcorp.login.authorization.AuthActivity;
import com.kwai.feature.api.social.login.model.AuthSource;
import im8.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w0d.f;
import java.util.ArrayList;
import k2b.e0;
import w0d.e;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class m0 extends PresenterV2	// class@00003d
{
    public PublishSubject A;
    public ProgressBar B;
    public View C;
    public View D;
    public View E;
    public g F;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public AuthSource x;
    public f y;
    public f z;

    public void m0(g p0){
       super();
       this.F = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "3")) {
          return;
       }
       this.X7(this.A.filter(l0.b).subscribe(new k0(this), Functions.d()));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "4")) {
          return;
       }
       this.B = null;
       this.F = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "6")) {
          return;
       }
       m0 tB = this.B;
       if (tB != null) {
          tB.setVisibility(8);
       }
       tB = this.C;
       if (tB != null) {
          tB.setVisibility(0);
       }
       tB = this.D;
       if (tB != null) {
          tB.setVisibility(0);
       }
       tB = this.E;
       if (tB != null) {
          tB.setVisibility(0);
       }
       return;
    }
    public final void R8(){
       boolean b;
       AuthInfoResponse$Scope mPhoneNumLis;
       m0 om0 = m0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om0, "8")) {
          return;
       }
       Activity uActivity = this.getActivity();
       int value = this.x.getValue();
       m0 ts = this.s;
       Object obj = this.y.get();
       m0 tp = this.p;
       AuthInfoResponse obj1 = PatchProxy.apply(objArray, this, om0, "9");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = this.z.get();
          objArray = 0;
          if (obj1 != null) {
             obj1 = obj1.mScopeList;
             if (obj1 != null) {
                Iterator iterator = obj1.iterator();
                while (iterator.hasNext()) {
                   AuthInfoResponse$Scope scope = iterator.next();
                   if (!TextUtils.x(this.y.get()) && (this.y.get()).equals(scope.mScope)) {
                      if (f.a(scope.mScope)) {
                         mPhoneNumLis = scope.mPhoneNumList;
                         if (mPhoneNumLis == null || mPhoneNumLis.size() <= 0) {
                            break ;
                         }
                      }else {
                         mPhoneNumLis = scope.mUserInfoList;
                         if (mPhoneNumLis == null || mPhoneNumLis.size() <= 0) {
                            break ;
                         }
                      }
                      objArray = 1;
                      break ;
                   }
                }
             }
          }else {
          }
       }
       e.a(uActivity, value, ts, obj, tp, b);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "5")) {
          return;
       }
       m0 tB = this.B;
       if (tB != null) {
          tB.setVisibility(0);
       }
       tB = this.C;
       if (tB != null) {
          tB.setVisibility(8);
       }
       tB = this.D;
       if (tB != null) {
          tB.setVisibility(8);
       }
       tB = this.E;
       if (tB != null) {
          tB.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a0feb);
       this.C = m1.f(p0, 0x7f0a0301);
       this.D = m1.f(p0, 0x7f0a05bf);
       this.E = m1.f(p0, 0x7f0a0f95);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       this.p = this.r8("PARAM_APP_ID");
       this.q = this.r8("PARAM_REMOTE_DID");
       this.r = this.r8("PARAM_REQUEST_TYPE");
       this.s = this.r8("PARAM_REQUEST_SCOPE");
       this.t = this.r8("PARAM_STATE");
       this.u = this.r8("PARAM_REQUEST_URL");
       this.v = this.r8("PARAM_PACKAGE_NAME");
       this.w = this.r8("PARAM_SIGNATURE");
       this.x = this.r8("AUTH_SOURCE");
       this.y = this.x8("CURRENT_SHOW_SCOPE");
       this.z = this.x8("AUTH_INFO_RESPONSE");
       this.A = this.r8("EVENT_PUBLISH_SUBJECT");
       return;
    }
}
