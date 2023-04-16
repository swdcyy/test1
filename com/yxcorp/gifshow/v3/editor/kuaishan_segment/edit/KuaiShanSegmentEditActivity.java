package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaiShanSegmentEditActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.model.KeyFrameTransform;
import n3d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.System;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import w46.b;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaiShanSegmentPicEditFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.util.Objects;
import grc.f;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.view.Window;
import com.kwai.feature.post.api.util.g;

public class KuaiShanSegmentEditActivity extends SingleFragmentPostActivity	// class@001017
{
    public static long O;

    public void KuaiShanSegmentEditActivity(){
       super();
    }
    public static void K3(GifshowActivity p0,int p1,String p2,QMedia p3,long p4,KeyFrameTransform p5,a p6,boolean p7){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p5;
       object oobject4 = p6;
       int i = 0;
       if (PatchProxy.isSupport2(KuaiShanSegmentEditActivity.class, "5")) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,Long.valueOf(p4),oobject3,oobject4,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, KuaiShanSegmentEditActivity.class, "5")) {
             return;
          }
       }
       long l = System.currentTimeMillis();
       String str = "KuaiShanSegmentEditActivity";
       if ((l - KuaiShanSegmentEditActivity.O) - 2000 < 0) {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "launch: click too quickly", objArray1);
          PatchProxy.onMethodExit(KuaiShanSegmentEditActivity.class, "5");
          return;
       }else {
          KuaiShanSegmentEditActivity.O = l;
          if (p3.isVideo()) {
             if (oobject2.duration <= 0 || oobject2.mClipDuration <= 0) {
                Object[] objArray2 = new Object[i];
                a.D().t(str, "launch: duration is negative ="+oobject2, objArray2);
                PatchProxy.onMethodExit(KuaiShanSegmentEditActivity.class, "5");
                return;
             }else {
                oobject2.mExportPositionX = 0x3f800000 - oobject2.mExportPositionX;
                oobject2.mExportPositionY = 0x3f800000 - oobject2.mExportPositionY;
             }
          }
          Intent intent = new Intent(oobject, KuaiShanSegmentEditActivity.class);
          SerializableHook.putExtra(intent, "intent_key_qmedia", oobject2);
          SerializableHook.putExtra(intent, "intent_key_transform", oobject3);
          intent.putExtra("intent_key_template_grade", p1);
          intent.putExtra("intent_key_mv_asset", oobject1);
          intent.putExtra("intent_key_clip_duration", p4);
          intent.putExtra("INTENT_KEY_SHOW_SELECT_VIEW", (p7 ^ 0x01));
          oobject.t1(intent, 101, oobject4);
          oobject.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01010f);
          PatchProxy.onMethodExit(KuaiShanSegmentEditActivity.class, "5");
          return;
       }
    }
    public Fragment G3(){
       Object[] objArray = null;
       QMedia obj = PatchProxy.apply(objArray, this, KuaiShanSegmentEditActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j0.e(this.getIntent(), "intent_key_qmedia");
       if (obj == null) {
          return objArray;
       }
       if (obj.isVideo()) {
          KuaishanSegmentVideoEditFragment kuaishanSegm = new KuaishanSegmentVideoEditFragment();
          kuaishanSegm.setArguments(this.getIntent().getExtras());
          return kuaishanSegm;
       }else {
          KuaiShanSegmentPicEditFragment kuaiShanSegm = new KuaiShanSegmentPicEditFragment();
          kuaiShanSegm.setArguments(this.getIntent().getExtras());
          return kuaiShanSegm;
       }
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KuaiShanSegmentEditActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KuaiShanSegmentEditActivity.class, "4")) {
          return;
       }
       if (this.I3() instanceof KuaiShanSegmentPicEditFragment) {
          KuaiShanSegmentPicEditFragment kuaiShanSegm = this.I3();
          Objects.requireNonNull(kuaiShanSegm);
          if (!PatchProxy.applyVoid(objArray, kuaiShanSegm, KuaiShanSegmentPicEditFragment.class, "5")) {
             kuaiShanSegm = kuaiShanSegm.k;
             if (kuaiShanSegm != null && !PatchProxy.applyVoid(objArray, kuaiShanSegm, f.class, "5")) {
                kuaiShanSegm.D(false);
             }
          }
       }else {
          super.onBackPressed();
       }
       return;
    }
    public void onRestoreInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanSegmentEditActivity.class, "1")) {
          return;
       }
       super.onRestoreInstanceState(p0);
       this.finish();
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, KuaiShanSegmentEditActivity.class, "2")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
}
