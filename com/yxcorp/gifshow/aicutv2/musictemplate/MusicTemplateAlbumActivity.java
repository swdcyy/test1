package com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity$a;
import nsd.u;
import tkd.b;
import tkd.d;
import h69.b;
import com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k69.f;
import i69.f;
import com.yxcorp.gifshow.aicut.logic.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import u69.e;
import java.lang.Boolean;
import android.net.Uri;
import kotlin.jvm.internal.a;
import android.text.TextUtils;
import lnc.c7;
import ekd.x0;
import java.lang.Integer;
import h69.g;
import java.lang.Throwable;
import w46.b;
import qrd.l1;
import ekd.j0;
import s69.i;
import com.yxcorp.gifshow.aicutv2.musictemplate.MusicTemplateAlbumActivity$c;
import com.yxcorp.gifshow.aicut.logic.b$a;
import java.util.List;
import q87.c;
import h69.c;
import h69.c$a;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.sdk.switchconfig.a;
import brd.t;
import u69.d;

public final class MusicTemplateAlbumActivity extends AlbumGifshowActivity	// class@0019b2
{
    public String O;
    public int P;
    public String Q;
    public d R;
    public b S;
    public f T;
    public final b U;
    public final h V;
    public static long W;
    public static final MusicTemplateAlbumActivity$a X;

    static {
       MusicTemplateAlbumActivity.X = new MusicTemplateAlbumActivity$a(null);
    }
    public void MusicTemplateAlbumActivity(){
       super();
       this.O = "";
       this.Q = "";
       this.U = d.a(-873393519);
       this.V = new MusicTemplateAlbumActivity$b(this);
    }
    public final void A3(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "8")) {
          return;
       }
       MusicTemplateAlbumActivity tT = this.T;
       if (tT != null) {
          tT.c(this.V);
       }
       tT = this.T;
       if (tT != null) {
          tT.stop();
       }
       this.T = null;
       return;
    }
    public final void B3(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "7")) {
          return;
       }
       MusicTemplateAlbumActivity tS = this.S;
       if (tS != null) {
          tS.b();
       }
       this.z3();
       this.A3();
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, MusicTemplateAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.Q)) {
          return super.getPageParams();
       }
       return "task_id="+this.Q;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicTemplateAlbumActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "4")) {
          return;
       }
       super.onBackPressed();
       this.z3();
       return;
    }
    public void onCreate(Bundle p0){
       boolean b;
       Uri data;
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicTemplateAlbumActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Boolean uBoolean = null;
       Object obj = PatchProxy.applyOneRefs(intent, uBoolean, uoe, "4");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          String obj1 = PatchProxy.applyOneRefs(intent, uBoolean, uoe, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(intent != null){
             data = intent.getData();
             if (data != null) {
                a.o(data, "uri");
                String str2 = "musictemplate";
                b = (TextUtils.equals(data.getAuthority(), str2) || TextUtils.equals(data.getAuthority(), str2))? true: false;
                uBoolean = Boolean.valueOf(b);
             }
             if (uBoolean != null) {
                b = uBoolean.booleanValue();
             }
          }
          b = false;
          if (b && intent != null) {
             data = intent.getData();
             if (data != null) {
                a.o(data, "uri");
                c7.a.c(data, intent);
                obj1 = x0.a(data, "musicId");
                if (obj1 != null) {
                   intent.putExtra("KEY_MUSIC_TEMPLATE_MUSIC_ID", obj1);
                }
                String str1 = x0.a(data, "musicType");
                if (str1 != null) {
                   try{
                      a.o(intent.putExtra("KEY_MUSIC_TEMPLATE_MUSIC_TYPE", Integer.parseInt(str1)), "srcIntent.putExtra\(KEY_M¡­TE_MUSIC_TYPE, musicType\)");
                   }catch(java.lang.Exception e0){
                      g.D().e("MusicTemplateHelper", "parse musicType error", e0);
                      a = l1.a;
                   }
                }
             }
          }
       }
    label_00cf :
       String str = j0.f(this.getIntent(), "KEY_MUSIC_TEMPLATE_MUSIC_ID");
       if (str == null) {
          str = "";
       }
       this.O = str;
       this.P = j0.b(this.getIntent(), "KEY_MUSIC_TEMPLATE_MUSIC_TYPE", 0);
       str = j0.f(this.getIntent(), "KEY_MUSIC_TEMPLATE_TASK_ID");
       if (str == null) {
          str = i.a.b();
       }
       this.Q = str;
       if (TextUtils.x(this.O)) {
          Object[] objArray = new Object[0];
          g.D().t("MusicTemplateAlbumActivity", "invalid music info", objArray);
          this.setResult(0);
          this.finish();
          return;
       }else {
          this.S = new b(60.00f, new MusicTemplateAlbumActivity$c(this), true);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       this.B3();
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "2")) {
          return;
       }
       super.onStop();
       this.z3();
       return;
    }
    public boolean w3(List p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicTemplateAlbumActivity obj = PatchProxy.applyOneRefs(p0, this, MusicTemplateAlbumActivity.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       Object[] objArray = new Object[0];
       g.D().w("MusicTemplateAlbumActivity", "handleSelectedResult invoked with "+p0.size()+" medias", objArray);
       this.B3();
       obj = this.U;
       MusicTemplateAlbumActivity tQ = this.Q;
       c uoc = PatchProxy.applyTwoRefs(p0, tQ, null, e.class, "2");
       if (uoc != patchProxyRe) {
       }else {
          a.p(p0, "medias");
          a.p(tQ, "taskId");
          c$a uoa = new c$a();
          uoa.c(p0);
          uoa.d(tQ);
          uoa.f(Workspace$Source.MUSIC_TEMPLATE);
          uoa.e(a.t().a("ai_cut_loading_timeout", 40));
          uoc = uoa.a();
       }
       f uof = obj.Br(uoc);
       uof.j(true);
       uof.v(null, 0, this.O, this.P);
       uof.d(this.V);
       uof.start();
       this.T = uof;
       return true;
    }
    public final void z3(){
       if (PatchProxy.applyVoid(null, this, MusicTemplateAlbumActivity.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.D().s("MusicTemplateAlbumActivity", "dismissProgressFragment\(\)", objArray);
       MusicTemplateAlbumActivity tR = this.R;
       if (tR != null) {
          tR.c();
       }
       this.R = null;
       return;
    }
}
