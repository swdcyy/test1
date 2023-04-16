package com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl$a;
import n3d.a;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class LoginPluginImpl$a implements a	// class@001b93
{
    public final GifshowActivity b;
    public final LoginPluginImpl c;

    public void LoginPluginImpl$a(LoginPluginImpl p0,GifshowActivity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(LoginPluginImpl$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LoginPluginImpl$a.class, "1")) {
          return;
       }
       if (p1 == -1) {
          this.b.finish();
       }
       return;
    }
}
