package com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KSPostKuaiShanVideoEditActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import java.util.List;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo$Size;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.view.Window;
import com.kwai.feature.post.api.util.g;

public class KSPostKuaiShanVideoEditActivity extends SingleFragmentPostActivity	// class@001abd
{
    public String O;
    public String P;
    public static long Q;

    public void KSPostKuaiShanVideoEditActivity(){
       super();
    }
    public Fragment G3(){
       Object[] objArray = null;
       KuaishanVideoClipFragment obj = PatchProxy.apply(objArray, this, KSPostKuaiShanVideoEditActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KuaishanVideoClipFragment();
       QMedia serializable = SerializableHook.getSerializable(this.getIntent().getExtras(), "intent_key_qmedia");
       KSAssetExportInfo serializable1 = SerializableHook.getSerializable(this.getIntent().getExtras(), "intent_key_asset_info");
       obj.setArguments(this.getIntent().getExtras());
       if (serializable1 != null) {
          KSAssetExportInfo mAssetExport = serializable1.mAssetExportSizeList;
          int i = 1;
          int i1 = (mAssetExport != null)? 1: 0;
          if (mAssetExport.size() < i) {
             i = 0;
          }
          if (i1 & i) {
             serializable.mExportHeight = serializable1.mAssetExportSizeList.get(0).mHeight;
             serializable.mExportWidth = serializable1.mAssetExportSizeList.get(0).mWidth;
             return obj;
          }
       }
       return objArray;
    }
    public final boolean K3(){
       Intent obj = PatchProxy.apply(null, this, KSPostKuaiShanVideoEditActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getIntent();
       boolean b = false;
       if (obj != null && obj.getBooleanExtra("kuaishan_clip_for_swap_magic", b)) {
          b = true;
       }
       return b;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, KSPostKuaiShanVideoEditActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K3()) {
          return "task_id="+this.P+"&magic_face_id="+this.O;
       }
       return "";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KSPostKuaiShanVideoEditActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, KSPostKuaiShanVideoEditActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.K3())? "VIDEO_PREVIEW": super.o();
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPostKuaiShanVideoEditActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.O = this.getIntent().getStringExtra("INTENT_KEY_MAGIC_ID");
       this.P = this.getIntent().getStringExtra("INTENT_KEY_TASK_ID");
       return;
    }
    public void onRestoreInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPostKuaiShanVideoEditActivity.class, "2")) {
          return;
       }
       super.onRestoreInstanceState(p0);
       this.finish();
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, KSPostKuaiShanVideoEditActivity.class, "3")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
}
