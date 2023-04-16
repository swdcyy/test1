package a1d.b1;
import x0d.b;
import x0d.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.a1;
import erd.r;
import brd.t;
import a1d.z0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a1d.w0;
import lnc.c3$a;
import lnc.c3;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import a1d.x0;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.ArrayList;
import x0d.j;
import b1d.c;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import w0d.f;
import android.app.Application;
import o56.a;
import x0d.c;
import java.lang.Integer;
import wkd.b;
import m1d.a;
import m1d.e;
import java.lang.StringBuilder;
import cjd.e;
import erd.o;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
import com.yxcorp.login.authorization.mode.AuthEvent;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import java.lang.Boolean;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;

public class b1 extends PresenterV2 implements b, a	// class@000017
{
    public c A;
    public Button B;
    public int C;
    public b D;
    public f p;
    public PublishSubject q;
    public boolean r;
    public f s;
    public String t;
    public c u;
    public String v;
    public boolean w;
    public RecyclerView x;
    public q y;
    public j z;

    public void b1(){
       super();
       this.C = 0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "3")) {
          return;
       }
       this.X7(this.q.filter(a1.b).subscribe(new z0(this), Functions.d()));
       c3.c(this.getActivity(), new w0(this));
       return;
    }
    public void G5(){
       if (PatchProxy.applyVoid(null, this, b1.class, "10")) {
          return;
       }
       this.y.k0();
       return;
    }
    public List G7(){
       Object obj = PatchProxy.apply(null, this, b1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.Q0();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "4")) {
          return;
       }
       c3.c(this.getActivity(), new x0(this));
       return;
    }
    public final AuthInfoResponse$Scope P8(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, b1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p.get().mScopeList.iterator();
       while (obj.hasNext()) {
          AuthInfoResponse$Scope scope = obj.next();
          if ((this.s.get()).equals(scope.mScope)) {
             objArray = scope;
             break ;
          }
       }
       return objArray;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "7")) {
          return;
       }
       AuthInfoResponse$Scope scope = this.P8();
       if (scope != null) {
          AuthInfoResponse$Scope mUserInfoLis = scope.mUserInfoList;
          if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
             this.y.W0(scope.mUserInfoList);
             this.y.k0();
          }else {
             mUserInfoLis = scope.mPhoneNumList;
             if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                if (this.z == null) {
                   this.z = new j(scope.mPhoneNumList, this.u, this, (this.w ^ 1));
                }
                if (!this.z.equals(this.x.getAdapter())) {
                   this.x.setAdapter(this.z);
                }
                this.z.W0(scope.mPhoneNumList);
                this.z.k0();
                this.B.setEnabled(1);
             }else if(f.a(scope.mScope)){
                scope = scope.mPhoneNumList;
                if (scope != null && !scope.size()) {
                   if (this.A == null) {
                      ArrayList uArrayList = new ArrayList();
                      uArrayList.add(a.b().getString(R.string.arg_RES_7f1002d9));
                      this.A = new c(uArrayList);
                   }
                   if (!this.A.equals(this.x.getAdapter())) {
                      this.x.setAdapter(this.A);
                   }
                   this.A.k0();
                   this.B.setEnabled(false);
                }
             }
          }
       }
       return;
    }
    public final b S8(int p0,String p1){
       a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b1 uob1 = b1.class;
       if (PatchProxy.isSupport(uob1)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob1, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = b.a(0x5cfaafff);
       String str = PatchProxy.apply(null, null, e.class, "5");
       if (str != patchProxyRe) {
       }else {
          str = e.a()+"/oauth2/app/api/customized/resource/delete";
       }
       return obj.m(str, this.v, String.valueOf(p0), p1).map(new e()).subscribe(Functions.d(), Functions.d());
    }
    public List U5(){
       Object obj = PatchProxy.apply(null, this, b1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.Q0();
    }
    public void X2(AuthInfoResponse$PhoneNum p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "15")) {
          return;
       }
       AuthInfoResponse$Scope scope = this.P8();
       if (scope != null && scope.mPhoneNumList != null) {
          this.X7(this.S8(p0.mPhoneIndex, scope.mScope));
          scope.mPhoneNumList.remove(p0);
          if (p0.isSelected != null && scope.mPhoneNumList.size() > 0) {
             p0.isSelected = true;
          }
          this.R8();
          this.q.onNext(AuthEvent.REFRESH_MANAGER_VIEW);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a34da);
       this.B = m1.f(p0, 0x7f0a08fb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "1")) {
          return;
       }
       this.p = this.x8("AUTH_INFO_RESPONSE");
       this.q = this.r8("EVENT_PUBLISH_SUBJECT");
       this.r = this.r8("PARAM_WITH_INFO_RESPONSE").booleanValue();
       this.s = this.x8("CURRENT_SHOW_SCOPE");
       this.t = this.r8("PARAM_REQUEST_URL");
       this.u = this.r8("SLIDE_HELPER");
       this.v = this.r8("PARAM_APP_ID");
       this.w = this.r8("IS_HALF_SCREEN_AUTH_SHOW").booleanValue();
       return;
    }
    public void o7(AuthInfoResponse$UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "11")) {
          return;
       }
       AuthInfoResponse$Scope scope = this.P8();
       if (scope != null && scope.mUserInfoList != null) {
          this.X7(this.S8(p0.mUserIndex, scope.mScope));
          scope.mUserInfoList.remove(p0);
          if (p0.isSelected != null && scope.mUserInfoList.size() > 0) {
             p0.isSelected = true;
          }
          this.R8();
          this.q.onNext(AuthEvent.REFRESH_MANAGER_VIEW);
       }
       return;
    }
    public void z4(){
       if (PatchProxy.applyVoid(null, this, b1.class, "14")) {
          return;
       }
       this.z.k0();
       return;
    }
}
