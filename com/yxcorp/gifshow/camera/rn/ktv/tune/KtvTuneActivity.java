package com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment;
import android.os.Bundle;
import li9.a;
import java.lang.StringBuilder;
import q87.c;
import org.json.JSONObject;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$a;
import java.lang.Boolean;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.lang.Throwable;

public class KtvTuneActivity extends BaseKtvKrnActivity	// class@000ff5
{
    public String P;

    public void KtvTuneActivity(){
       super();
       this.P = "recommend";
    }
    public Fragment G3(){
       Bundle uBundle1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KtvTuneKrnFragment obj = PatchProxy.apply(objArray, this, KtvTuneActivity.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new KtvTuneKrnFragment();
       KtvTuneKrnFragment$a e = KtvTuneKrnFragment.E;
       Bundle uBundle = new Bundle();
       KtvTuneActivity tP = this.P;
       String str = PatchProxy.apply(objArray, this, BaseKtvKrnActivity.class, "5");
       if (str != patchProxyRe) {
       }else {
          str = this.N3();
          int i = 0;
          a uoa = (str.length() > 0)? 1: null;
          String str1 = "BaseKtvKrnActivity";
          if (uoa) {
             objArray1 = new Object[i];
             a.C().w(str1, "parse ext params from scheme : "+str, objArray1);
          }else {
             JSONObject jSONObject = this.L3();
             if (jSONObject.keys().hasNext()) {
                str = jSONObject.toString();
                a.o(str, "jsonObject.toString\(\)");
             }
             objArray1 = new Object[i];
             a.C().w(str1, "build ext params from intent : "+str, objArray1);
          }
       }
       Objects.requireNonNull(e);
       if (PatchProxy.isSupport(KtvTuneKrnFragment$a.class)) {
          uBundle1 = PatchProxy.applyFourRefs(uBundle, tP, Boolean.TRUE, str, e, KtvTuneKrnFragment$a.class, "2");
          if (uBundle1 != patchProxyRe) {
          label_00b6 :
             obj.setArguments(uBundle1);
             return obj;
          }
       }
       uBundle1 = KtvTuneKrnFragment$a.b(e, uBundle, tP, 1, str, false, 16, 0);
       goto label_00b6 ;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KtvTuneActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://ktv_tune_schema";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvTuneActivity.class, "1")) {
          return;
       }
       try{
          if (this.getIntent() != null) {
             String str = j0.f(this.getIntent(), "ktv_tune_tab");
             if (!TextUtils.isEmpty(str)) {
                this.P = str;
             }else if(this.getIntent().getData() != null){
                this.P = this.getIntent().getData().getLastPathSegment();
             }
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.C().u("KtvTuneActivity", e0, objArray);
       }
       if (!TextUtils.equals(this.P, "recommend") && !TextUtils.equals(this.P, "used")) {
          this.P = "recommend";
       }
       super.onCreate(p0);
       return;
    }
}
