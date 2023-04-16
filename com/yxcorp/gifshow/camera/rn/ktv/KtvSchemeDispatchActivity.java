package com.yxcorp.gifshow.camera.rn.ktv.KtvSchemeDispatchActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import um6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import li9.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.Exception;
import java.lang.Integer;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import um6.h;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import yxa.b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import com.yxcorp.gifshow.camera.rn.ktv.b;
import com.yxcorp.gifshow.camera.rn.ktv.a;
import erd.g;
import crd.b;

public class KtvSchemeDispatchActivity extends GifshowActivity	// class@000fef
{
    public j A;
    public boolean B;
    public ProgressFragment C;
    public d y;
    public boolean z;
    public static final int D;

    public void KtvSchemeDispatchActivity(){
       super();
       this.y = new d();
       this.B = true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, KtvSchemeDispatchActivity.class, "22")) {
          return;
       }
       super.finish();
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0028 :
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KtvSchemeDispatchActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://ktv_dispatch";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       boolean b;
       boolean b1;
       String str;
       KtvSchemeDispatchActivity ktvSchemeDis = KtvSchemeDispatchActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ktvSchemeDis, "1")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       this.overridePendingTransition(i, i);
       Intent obj = PatchProxy.apply(null, this, ktvSchemeDis, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.getIntent();
          if (obj == null || obj.getData() == null) {
             b = false;
          }else {
             Uri data = obj.getData();
             this.y.q(x0.a(data, "duetMode"));
             Object[] objArray1 = new Object[i];
             a.C().w("ktv_log", "parseSchema "+data, objArray1);
             if (!PatchProxy.applyVoidOneRefs(data, this, ktvSchemeDis, "13")) {
                this.y.z(x0.a(data, "tag"));
                if (TextUtils.x(this.y.m())) {
                   this.y.z(x0.a(data, "topic"));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(data, this, ktvSchemeDis, "17")) {
                this.y.x(x0.a(data, "recordMode"));
             }
             if (!PatchProxy.applyVoidOneRefs(data, this, ktvSchemeDis, "16")) {
                this.y.y(x0.a(data, "songMode"));
             }
             if (!PatchProxy.applyVoidOneRefs(data, this, ktvSchemeDis, "18")) {
                try{
                   this.y.t(Long.parseLong(x0.a(data, "minDuration")));
                }catch(java.lang.NumberFormatException e0){
                }
             }
          }
       }
       if (!b) {
          Object[] objArray = new Object[i];
          a.C().w("ktv_log", "parseSchema fail", objArray);
          this.finish();
          return;
       }else {
          this.setContentView(R.layout.arg_RES_7f0d0713);
          b.a(this.getWindow());
          this.u3();
          return;
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KtvSchemeDispatchActivity.class, "6")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       return;
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvSchemeDispatchActivity.class, "4")) {
          return;
       }
       p0.addFlags(0x2000000);
       super.startActivity(p0);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       if (PatchProxy.isSupport(KtvSchemeDispatchActivity.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KtvSchemeDispatchActivity.class, "5")) {
          return;
       }
       p0.addFlags(0x2000000);
       super.startActivityForResult(p0, -1);
       return;
    }
    public final void u3(){
       KtvSchemeDispatchActivity ktvSchemeDis = KtvSchemeDispatchActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ktvSchemeDis, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ktvSchemeDis, "7")) {
          ProgressFragment progressFrag = new ProgressFragment();
          this.C = progressFrag;
          progressFrag.show(this.getSupportFragmentManager(), "runner");
       }
       b.r(h.class, LoadPolicy.SILENT_IMMEDIATE).g(this.E2(ActivityEvent.DESTROY)).R(new b(this), new a(this));
       return;
    }
}
