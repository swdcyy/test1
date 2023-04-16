package com.yxcorp.gifshow.childlock.fragment.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.childlock.fragment.ChildLockDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.childlock.a;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.childlock.ChildLockSettingActivity;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.Context;
import xj9.a;
import n3d.b;
import n3d.f$b;
import n3d.f;
import n3d.e;
import android.app.Activity;
import com.yxcorp.gifshow.childlock.ChildVerifyActivity;
import wh5.c;

public final class a implements View$OnClickListener	// class@001083
{
    public final ChildLockDialog b;

    public void a(ChildLockDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       FragmentActivity activity;
       Intent intent;
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ChildLockDialog.class, "8")) {
       }else {
          b.a(-1942497302).b();
          ChildLockDialog s = tb.s;
          if (s.mMode == null) {
             if (!PatchProxy.applyVoid(objArray, tb, ChildLockDialog.class, "9")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 1;
                uElementPack.action = 1105;
                u1.u(1, uElementPack, objArray);
                if (tb.getActivity() != null) {
                   activity = tb.getActivity();
                   FragmentActivity activity1 = tb.getActivity();
                   ChildLockSettingActivity uChildLockSe = ChildLockSettingActivity.class;
                   if (PatchProxy.isSupport(uChildLockSe)) {
                      intent = PatchProxy.applyTwoRefs(activity1, Boolean.TRUE, objArray, uChildLockSe, "2");
                      if (intent != PatchProxyResult.class) {
                      label_0072 :
                         b uob = new b(activity, intent);
                         uob.b = 3;
                         uob.c = true;
                         uob.d = new a(tb);
                         f.a().a(uob).a(activity, uob, 1);
                      }
                   }
                   intent = new Intent(activity1, uChildLockSe);
                   intent.putExtra("dismiss_tips", 1);
                   goto label_0072 ;
                }
             }
          }else if(s.mCanVerifyIdCard != null){
             activity = tb.getActivity();
             String str = (tb.r != null)? "curfew_dialog": "addiction_prevention_dialog";
             ChildVerifyActivity.A3(activity, str);
          }else {
             c.a(tb.getActivity(), tb.s.mOfficialPhone);
          }
       }
       return;
    }
}
