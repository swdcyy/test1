package com.yxcorp.login.authorization.AddUserInfoActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import ekd.j0;
import zf6.l;
import ekd.i;
import k2b.e0;
import w0d.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.authorization.fragment.AddUserInfoFragment;

public class AddUserInfoActivity extends SingleFragmentActivity	// class@001a2c
{
    public int A;
    public String y;
    public String z;
    public static final int B;

    public void AddUserInfoActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AddUserInfoActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       AddUserInfoActivity uAddUserInfo = AddUserInfoActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAddUserInfo, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uAddUserInfo, "4")) {
          Intent intent = this.getIntent();
          if (intent != null) {
             this.y = j0.f(intent, "key_app_id");
             this.z = j0.f(intent, "key_scope");
             this.A = j0.b(intent, "key_auth_source", -1);
          }
       }
       super.onCreate(p0);
       i.h(this, 0, l.r());
       e.e(this, this.A, this.z, this.y);
       return;
    }
    public Fragment u3(){
       AddUserInfoFragment obj = PatchProxy.apply(null, this, AddUserInfoActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AddUserInfoFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("key_app_id", this.y);
       obj.setArguments(uBundle);
       return obj;
    }
}
