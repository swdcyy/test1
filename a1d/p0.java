package a1d.p0;
import android.view.View$OnClickListener;
import a1d.q0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.login.authorization.mode.CheckedAgreementModel;
import java.lang.Boolean;
import brd.y;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.authorization.AuthActivity;
import com.kwai.feature.api.social.login.model.AuthSource;
import im8.f;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import w0d.f;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;
import com.yxcorp.login.http.response.AuthInfoResponse$Follow;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w0d.e;
import com.google.common.collect.Maps;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import w0d.g;

public final class p0 implements View$OnClickListener	// class@000046
{
    public final q0 b;

    public void p0(q0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       int i;
       int b1;
       q0 e;
       Iterator iterator;
       AuthInfoResponse$PhoneNum mPhoneIndex;
       p0 b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q0 oq0 = q0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, oq0, "5")) {
       }else if(b.u != null){
          i = 0;
          while (true) {
             if (i < b.u.size()) {
                if (!b.u.get(i).isChecked.booleanValue() && b.u.get(i).isNeed.booleanValue()) {
                   b.p.onNext(Boolean.TRUE);
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       Activity uActivity = b.getActivity();
       i = b.w.getValue();
       q0 x = b.x;
       String str = b.r.get();
       q0 v = b.v;
       String str1 = "7";
       Object obj = PatchProxy.apply(objArray, b, oq0, str1);
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(b.y.containsKey(b.r.get())){
          b1 = b.y.get(b.r.get()).intValue();
       }else {
          b1 = -2;
       }
       AuthInfoResponse$Scope scope = PatchProxy.apply(objArray, b, oq0, "8");
       if (scope != patchProxyRe) {
       }else {
          AuthInfoResponse uAuthInfoRes1 = b.q.get();
          if (uAuthInfoRes1 != null && !q.f(uAuthInfoRes1.mScopeList)) {
             Iterator iterator1 = uAuthInfoRes1.mScopeList.iterator();
             do {
                if (iterator1.hasNext()) {
                   scope = iterator1.next();
                   if (!(b.r.get()).equals(scope.mScope)) {
                      continue ;
                   }
                }
             } while ((b.r.get()).equals(scope.mScope));
          }
          scope = objArray;
       }
       if (scope != null) {
          if (f.a(scope.mScope)) {
             if (scope.mPhoneNumList.size() > 0) {
                iterator = scope.mPhoneNumList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      AuthInfoResponse$PhoneNum phoneNum = iterator.next();
                      if (phoneNum.isSelected != null) {
                         mPhoneIndex = phoneNum.mPhoneIndex;
                      }else {
                         continue ;
                      }
                   }else {
                   label_0122 :
                      mPhoneIndex = -2;
                   }
                }
             }else {
                mPhoneIndex = -1;
             }
          }else {
             iterator = scope.mUserInfoList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   AuthInfoResponse$UserInfo userInfo = iterator.next();
                   if (userInfo.isSelected != null) {
                      mPhoneIndex = userInfo.mUserIndex;
                   }else {
                      continue ;
                   }
                }else {
                   goto label_0122 ;
                }
             }
          }
       }else {
          goto label_0122 ;
       }
       if (b1 != mPhoneIndex) {
          b1 = true;
       }else {
          b1 = false;
       }
       String str2 = PatchProxy.apply(objArray, b, oq0, "6");
       if (str2 != patchProxyRe) {
       }else if(b.z != null){
          AuthInfoResponse uAuthInfoRes = b.q.get();
          if (uAuthInfoRes != null) {
             uAuthInfoRes = uAuthInfoRes.mFollow;
             if (uAuthInfoRes != null && !TextUtils.x(uAuthInfoRes.mText)) {
                if (b.A.get().booleanValue()) {
                   str2 = "TRUE";
                }else {
                   str2 = "FALSE";
                }
             }
          }
       }
       str2 = "NOTHING";
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray1 = new Object[]{uActivity,Integer.valueOf(i),x,str,v,Boolean.valueOf(b1),str2};
          if (PatchProxy.applyVoid(objArray1, objArray, uoe, str1)) {
          label_01df :
             b.s.add(b.r.get());
             e = b.E;
             if (e != null) {
                e.I0();
             }
          }
       }
       HashMap hashMap = Maps.s();
       hashMap.put("authorized_login_source", Integer.valueOf(i));
       hashMap.put("authorized_scopes", x);
       hashMap.put("authorized_popup_scope", str);
       hashMap.put("is_change_information", Boolean.valueOf(b1));
       hashMap.put("is_tick", str2);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = a.a.q(hashMap);
       uElementPack.action2 = "CLICK_CONFIRM_LOGIN";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$ThirdPartyAppPackage thirdPartyAp = new ClientContent$ThirdPartyAppPackage();
       uContentPack.thirdPartyAppPackage = thirdPartyAp;
       thirdPartyAp.id = v;
       u1.M("2461394", uActivity, 1, uElementPack, uContentPack, null);
       goto label_01df ;
       return;
    }
}
