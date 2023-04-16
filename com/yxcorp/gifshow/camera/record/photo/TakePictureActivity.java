package com.yxcorp.gifshow.camera.record.photo.TakePictureActivity;
import q46.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q46.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import android.content.Intent;
import ekd.j0;
import sm6.b;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import android.os.Bundle;
import java.io.Serializable;
import android.view.View;
import lnc.a1;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import android.view.KeyEvent;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import android.view.Window;
import com.kwai.feature.post.api.util.g;

public class TakePictureActivity extends GifshowActivity implements a	// class@000ea0
{
    public j A;
    public Boolean B;
    public final e C;
    public View D;
    public TakePictureFragment y;
    public TakePictureType z;

    public void TakePictureActivity(){
       super();
       this.C = new e(this);
    }
    public int M(){
       return 4;
    }
    public int P2(){
       return 1;
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, TakePictureActivity.class, "9")) {
          return;
       }
       super.finish();
       this.C.b(this);
       TakePictureActivity tz = this.z;
       if (tz != TakePictureType.SEND_IMAGE && (tz == TakePictureType.LIVE_AVATAR || tz == TakePictureType.SHOOT_IMAGE)) {
          this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }
       return;
    }
    public int getPage(){
       if (this.z == TakePictureType.STATE_IMAGE) {
          return 0;
       }
       return 96;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TakePictureActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       String str = (this.z == TakePictureType.LIVE_AUTHENTICATE)? "ks://live_authenticate": "ks://camera/takepicture/";
       return str;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, TakePictureActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == TakePictureType.STATE_IMAGE) {
          return "STATUS_EDIT_RECORD";
       }
       return super.o();
    }
    public boolean o1(){
       TakePictureActivity obj = PatchProxy.apply(null, this, TakePictureActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.B == null) {
          obj = this.z;
          this.B = (obj != TakePictureType.STATE_IMAGE && (obj == TakePictureType.LIVE_AVATAR || (this.getIntent() != null && j0.a(this.getIntent(), "disableLayoutArrangementOpt", false))))? Boolean.FALSE: Boolean.valueOf(b.d());
       }
    label_0045 :
       return this.B.booleanValue();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, TakePictureActivity.class, "8")) {
          return;
       }
       boolean b = false;
       TakePictureActivity ty = this.y;
       if (ty != null) {
          b = ty.onBackPressed();
       }
       if (!b) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TakePictureActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d1150);
       String str = "TakePictureType";
       this.z = j0.e(this.getIntent(), str);
       String str1 = "tag";
       String str2 = j0.f(this.getIntent(), str1);
       boolean b = j0.a(this.getIntent(), "key_wait_save_camera", false);
       this.C.a(this);
       View view = this.findViewById(R.id.root_layout);
       this.D = view;
       if (view != null && this.o1()) {
          this.D.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       }
       this.y = new TakePictureFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, str, this.z);
       uBundle.putString(str1, str2);
       uBundle.putBoolean("key_wait_save_camera", b);
       this.y.setArguments(uBundle);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.container_layout, this.y);
       uoe.l();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       TakePictureActivity takePictureA = TakePictureActivity.class;
       if (PatchProxy.isSupport(takePictureA)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, takePictureA, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       takePictureA = this.y;
       boolean b = (takePictureA == null || (takePictureA.onKeyDown(p0, p1) || super.onKeyDown(p0, p1)))? true: false;
       return b;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, TakePictureActivity.class, "5")) {
          return;
       }
       super.onResume();
       this.C.a(this);
       if (this.o1()) {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0606b3));
       }else {
          g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       }
       return;
    }
}
