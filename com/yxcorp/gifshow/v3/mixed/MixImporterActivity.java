package com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import p16.a;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.BasePostActivity;
import faa.a;
import q87.c;
import lq.i;
import java.lang.StringBuilder;
import ekd.j0;
import java.io.Serializable;
import java.util.List;
import com.yxcorp.gifshow.util.h0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustFragment;
import wh5.c;
import e17.i;
import bwc.c;
import android.view.Window;
import lnc.a1;
import com.kwai.feature.post.api.util.g;

public class MixImporterActivity extends SingleFragmentPostActivity implements a	// class@001542
{
    public j O;
    public MixImporterFragment P;
    public TransitionEffectFragment Q;
    public MixFrameAdjustFragment R;
    public String S;

    public void MixImporterActivity(){
       super();
    }
    public Fragment G3(){
       Object obj = PatchProxy.apply(null, this, MixImporterActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.P = new MixImporterFragment();
       this.P.setArguments(this.getIntent().getExtras());
       return this.P;
    }
    public int M(){
       return 4;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MixImporterActivity.class, "8")) {
          return;
       }
       super.finish();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MixImporterActivity", "finish\(\): finishEdit", objArray);
       if (!i.h()) {
          Object[] objArray1 = new Object[i];
          a.D().A("MixImporterActivity", "finish: PostSession not available", objArray1);
          return;
       }else {
          i.m().s();
          return;
       }
    }
    public int getPage(){
       return 114;
    }
    public String getPageParams(){
       MixImporterActivity obj = PatchProxy.apply(null, this, MixImporterActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       if (obj != null) {
          return obj;
       }
       this.S = "task_id="+j0.f(this.getIntent(), "photo_task_id");
       String str = h0.e(j0.e(this.getIntent(), "intent_editor_mix_media_list"));
       if (!TextUtils.x(str)) {
          this.S = this.S+"&"+str;
       }
       return this.S;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MixImporterActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return null;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MixImporterActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MixImporterActivity.class, "9")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.P.onActivityResult(p0, p1, p2);
       return;
    }
    public void onBackPressed(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MixImporterActivity.class, "6")) {
          return;
       }
       MixImporterActivity tQ = this.Q;
       boolean b = true;
       if (tQ != null) {
          Objects.requireNonNull(tQ);
          Object obj = PatchProxy.apply(objArray, tQ, TransitionEffectFragment.class, "10");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(tQ.isVisible()){
             tQ.gh();
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             return;
          }
       }
       tQ = this.R;
       if (tQ != null) {
          Objects.requireNonNull(tQ);
          Object obj1 = PatchProxy.apply(objArray, tQ, MixFrameAdjustFragment.class, "6");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(tQ.isVisible()){
             tQ.ch(0);
          }else {
             b = false;
          }
          if (b) {
             return;
          }
       }
       this.setResult(0, new Intent());
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixImporterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MixImporterActivity", "onCreate: "+p0, objArray);
       if (!c.g()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MixImporterActivity.class, "2")) {
          return;
       }
       super.onResume();
       c.a(this);
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       MixImporterActivity mixImporterA = MixImporterActivity.class;
       if (PatchProxy.isSupport(mixImporterA) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, mixImporterA, "3")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       if (p0) {
          c.a(this);
       }
       return;
    }
    public boolean u3(){
       return true;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, MixImporterActivity.class, "4")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       return;
    }
}
