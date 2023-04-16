package a1d.j1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.i1;
import erd.r;
import brd.t;
import a1d.h1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import im8.f;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Iterator;
import java.util.List;
import w0d.f;
import com.yxcorp.login.http.response.AuthInfoResponse$MaxLimit;
import java.util.ArrayList;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;
import android.widget.TextView;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
import android.view.View;
import ekd.m1;
import a1d.e1;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.social.login.model.AuthSource;

public class j1 extends PresenterV2	// class@000030
{
    public f p;
    public PublishSubject q;
    public f r;
    public String s;
    public AuthSource t;
    public String u;
    public f v;
    public TextView w;
    public TextView x;

    public void j1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j1.class, "3")) {
          return;
       }
       this.X7(this.q.filter(i1.b).subscribe(new h1(this), Functions.d()));
       return;
    }
    public final void P8(){
       AuthInfoResponse$Scope mUserInfoLis;
       Iterator iterator;
       int i;
       j1 oj1 = j1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj1, "6")) {
          return;
       }
       Object[] objArray1 = PatchProxy.apply(objArray, this, oj1, "7");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          iterator = this.p.get().mScopeList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                AuthInfoResponse$Scope scope = iterator.next();
                if ((this.r.get()).equals(scope.mScope)) {
                   objArray = scope;
                }
             }
             objArray1 = objArray;
          }
       }
       if (objArray1 == null) {
          return;
       }else {
          j1 oj11 = 3;
          if (f.b(this.r.get())) {
             if (this.p.get().mMaxLimit != null) {
                oj11 = this.p.get().mMaxLimit.mUserInfoLimit;
             }
             mUserInfoLis = objArray1.mUserInfoList;
             if (mUserInfoLis != null) {
                iterator = mUserInfoLis.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().mUserIndex != null) {
                      i = i + 1;
                   }else {
                      continue ;
                   }
                }
             }else {
                i = 0;
             }
             if (i >= oj11) {
                this.x.setVisibility(0);
                this.w.setVisibility(8);
             }else {
                this.x.setVisibility(8);
                this.w.setVisibility(0);
             }
          }else if(f.a(this.r.get())){
             if (this.p.get().mMaxLimit != null) {
                oj11 = this.p.get().mMaxLimit.mPhoneLimit;
             }
             mUserInfoLis = objArray1.mPhoneNumList;
             if (mUserInfoLis != null) {
                iterator = mUserInfoLis.iterator();
                i = 0;
                while (iterator.hasNext()) {
                   if (iterator.next().mPhoneIndex != null) {
                      i = i + 1;
                   }else {
                      continue ;
                   }
                }
             }else {
                i = 0;
             }
             if (i >= oj11) {
                this.x.setVisibility(0);
                this.w.setVisibility(8);
             }else {
                this.x.setVisibility(8);
                this.w.setVisibility(0);
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2a6b);
       this.x = m1.f(p0, 0x7f0a1790);
       m1.a(p0, new e1(this), R.id.manager_text);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j1.class, "1")) {
          return;
       }
       this.p = this.x8("AUTH_INFO_RESPONSE");
       this.q = this.r8("EVENT_PUBLISH_SUBJECT");
       this.r = this.x8("CURRENT_SHOW_SCOPE");
       this.s = this.r8("PARAM_APP_ID");
       this.t = this.r8("AUTH_SOURCE");
       this.u = this.r8("PARAM_REQUEST_SCOPE");
       this.v = this.x8("FINISH_PAGE");
       return;
    }
}
