package com.yxcorp.gifshow.camera.record.whatsup.WhatsUpActivity;
import q46.a;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import q46.e;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.whatsup.WhatsUpFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.BasePostActivity;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import android.view.Window;
import qka.b;

public class WhatsUpActivity extends SingleFragmentPostActivity implements a	// class@000fa3
{
    public RecordFragment O;
    public final e P;

    public void WhatsUpActivity(){
       super();
       this.P = new e(this);
    }
    public Fragment G3(){
       WhatsUpFragment obj = PatchProxy.apply(null, this, WhatsUpActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WhatsUpFragment();
       this.O = obj;
       obj.setArguments(new Bundle());
       return this.O;
    }
    public int M(){
       return 9;
    }
    public int P2(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, WhatsUpActivity.class, "4")) {
          return;
       }
       super.finish();
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpActivity", "finish", objArray);
       this.P.b(this);
       this.overridePendingTransition(R.anim.arg_RES_7f010031, 0x7f0100e6);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WhatsUpActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://whats_up";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public boolean o1(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, WhatsUpActivity.class, "3")) {
          return;
       }
       WhatsUpActivity tO = this.O;
       if (tO == null || !tO.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WhatsUpActivity.class, "1")) {
          return;
       }
       this.getWindow().addFlags(128);
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpActivity", "onCreate", objArray);
       this.P.a(this);
       b.a(this.getWindow());
       this.setVolumeControlStream(3);
       this.getWindow().setNavigationBarColor(this.getResources().getColor(R.color.arg_RES_7f0600a6));
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, WhatsUpActivity.class, "2")) {
          return;
       }
       super.onResume();
       this.P.a(this);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpActivity", "onResume", objArray);
       return;
    }
}
