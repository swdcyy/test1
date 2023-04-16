package a1d.e1;
import android.view.View$OnClickListener;
import a1d.j1;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import w0d.f;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.login.model.AuthSource;
import a1d.f1;
import com.yxcorp.login.authorization.AddUserInfoActivity;
import java.lang.Integer;
import android.content.Intent;
import android.content.Context;
import n3d.a;
import a1d.g1;
import com.yxcorp.login.authorization.AddPhoneNumActivity;
import com.yxcorp.login.authorization.AuthActivity;
import w0d.e;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class e1 implements View$OnClickListener	// class@000020
{
    public final j1 b;

    public void e1(j1 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GifshowActivity activity;
       j1 s;
       Object[] objArray;
       HashMap hashMap;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$ThirdPartyAppPackage thirdPartyAp;
       Intent intent;
       e1 b = this.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoid(null, b, j1.class, "8")) {
       }else {
          String str = "key_auth_source";
          String str1 = "key_scope";
          String str2 = "key_app_id";
          String str3 = "1";
          int i = 6;
          int i1 = 2;
          if (f.b(b.r.get())) {
             b.v.set(Boolean.FALSE);
             activity = b.getActivity();
             s = b.s;
             String str4 = b.r.get();
             int value = b.t.getValue();
             f1 uof1 = new f1(b);
             if (PatchProxy.isSupport(AddUserInfoActivity.class)) {
                objArray = new Object[i];
                objArray[0] = activity;
                objArray[1] = s;
                objArray[i1] = str4;
                objArray[3] = Integer.valueOf(value);
                objArray[4] = Integer.valueOf(100);
                objArray[5] = uof1;
                if (!PatchProxy.applyVoid(objArray, null, AddUserInfoActivity.class, str3)) {
                }
             }else if(activity == null){
                intent = new Intent(activity, AddUserInfoActivity.class);
                intent.putExtra(str2, s);
                intent.putExtra(str1, str4);
                intent.putExtra(str, value);
                activity.t1(intent, 100, uof1);
             }
          }else if(f.a(b.r.get())){
             b.v.set(Boolean.FALSE);
             activity = b.getActivity();
             s = b.s;
             String str5 = b.r.get();
             int value2 = b.t.getValue();
             g1 og1 = new g1(b);
             if (PatchProxy.isSupport(AddPhoneNumActivity.class)) {
                objArray = new Object[i];
                objArray[0] = activity;
                objArray[1] = s;
                objArray[2] = str5;
                objArray[3] = Integer.valueOf(value2);
                objArray[4] = Integer.valueOf(100);
                objArray[5] = og1;
                if (!PatchProxy.applyVoid(objArray, null, AddPhoneNumActivity.class, str3)) {
                }
             }else if(activity == null){
                intent = new Intent(activity, AddPhoneNumActivity.class);
                intent.putExtra(str2, s);
                intent.putExtra(str1, str5);
                intent.putExtra(str, value2);
                activity.t1(intent, 100, og1);
             }
          }
       label_010f :
          Activity uActivity = b.getActivity();
          int value1 = b.t.getValue();
          s = b.u;
          str1 = b.r.get();
          j1 s1 = b.s;
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             Object[] objArray1 = new Object[]{uActivity,Integer.valueOf(value1),s,str1,s1};
             if (!PatchProxy.applyVoid(objArray1, null, uoe, "3")) {
             }
          }else {
          }
       }
       return;
    }
}
