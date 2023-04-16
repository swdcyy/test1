package com.yxcorp.gifshow.protector.ProtectorDialogActivity;
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
import android.content.IntentFilter;
import com.yxcorp.gifshow.protector.ProtectorDialogActivity$4;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.facebook.drawee.backends.pipeline.Fresco;
import kz6.f$a;
import kz6.a$b;
import java.lang.CharSequence;
import c6c.c;
import android.content.DialogInterface$OnClickListener;
import c6c.d;
import kz6.f;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import java.lang.Boolean;
import e6c.b;
import java.lang.Integer;
import java.io.File;
import qkd.b;
import java.io.IOException;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Handler;
import android.os.Looper;
import c6c.e;
import java.lang.Runnable;

public class ProtectorDialogActivity extends GifshowActivity	// class@00160d
{
    public Handler A;
    public BroadcastReceiver y;
    public ProgressFragment z;

    public void ProtectorDialogActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ProtectorDialogActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProtectorDialogActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ProtectorDialogActivity.class, "6")) {
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("protector.intent.action.FINISH_DIALOG");
          ProtectorDialogActivity$4 u4 = new ProtectorDialogActivity$4(this);
          this.y = u4;
          UniversalReceiver.e(this, u4, intentFilter);
       }
       if (!PatchProxy.applyVoid(objArray, this, ProtectorDialogActivity.class, "3")) {
          if (!Fresco.hasBeenInitialized()) {
             Fresco.initialize(this);
          }
          f$a uoa = new f$a(this);
          f$a a = uoa.a;
          a.v = a.a.getText(0x7f103fff);
          uoa.b(false);
          uoa.c(R.string.cancel, new c(this));
          uoa.f(R.string.arg_RES_7f104000, new d(this));
          uoa.i();
       }
       if (!PatchProxy.applyVoid(objArray, this, ProtectorDialogActivity.class, "2")) {
          ProgressFragment progressFrag = new ProgressFragment();
          this.z = progressFrag;
          progressFrag.setCancelable(false);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProtectorDialogActivity.class, "7")) {
          return;
       }
       super.onDestroy();
       UniversalReceiver.f(this, this.y);
       return;
    }
    public void u3(boolean p0){
       int i;
       Handler handler;
       ProtectorDialogActivity protectorDia = ProtectorDialogActivity.class;
       if (PatchProxy.isSupport(protectorDia) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, protectorDia, "4")) {
          return;
       }
       File b = b.b;
       if (p0) {
          i = 1;
          try{
             b.q0(b, Integer.toString(i));
          }catch(java.io.IOException e1){
             e1.printStackTrace();
          }
       }else {
          i = 0;
          try{
             b.q0(b, Integer.toString(i));
          }catch(java.io.IOException e1){
             e1.printStackTrace();
          }
       }
    }
}
