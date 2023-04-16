package com.yxcorp.gifshow.growth.test.newdevice.TestNewDeviceSettingActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import android.content.Context;
import o56.f;

public final class TestNewDeviceSettingActivity extends GifshowActivity	// class@00154b
{

    public void TestNewDeviceSettingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TestNewDeviceSettingActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://test_new_device";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TestNewDeviceSettingActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       f.d(this);
       this.finish();
       return;
    }
}
