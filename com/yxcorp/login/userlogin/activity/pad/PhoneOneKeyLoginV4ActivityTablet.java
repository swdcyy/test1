package com.yxcorp.login.userlogin.activity.pad.PhoneOneKeyLoginV4ActivityTablet;
import com.yxcorp.login.userlogin.activity.PhoneOneKeyLoginV4Activity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class PhoneOneKeyLoginV4ActivityTablet extends PhoneOneKeyLoginV4Activity	// class@001b1a
{

    public void PhoneOneKeyLoginV4ActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhoneOneKeyLoginV4ActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
