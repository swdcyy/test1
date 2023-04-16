package com.yxcorp.gifshow.v3.editor.effectv2.widget.HighlightPostAlbumActivity;
import com.yxcorp.gifshow.v3.PostAlbumActivity;
import com.yxcorp.gifshow.v3.editor.effectv2.widget.HighlightPostAlbumActivity$a;
import nsd.u;
import java.lang.String;
import k2b.u1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.effectv2.widget.HighlightPostAlbumActivity$b;
import dc7.e;
import ga9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import java.lang.Boolean;
import faa.a;
import q87.c;
import android.content.Intent;
import w46.b;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.e0;
import com.kwai.framework.model.user.QCurrentUser;
import e17.i;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams;
import rqc.a;
import android.content.Context;
import n3d.a;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.f$a;
import o79.a;
import w69.f;
import w69.k$a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import w69.k;
import w69.i;
import com.yxcorp.gifshow.v3.EditorManager$StartEditorConfig;

public final class HighlightPostAlbumActivity extends PostAlbumActivity	// class@000f70
{
    public final String R;
    public String S;
    public HashMap T;
    public static final HighlightPostAlbumActivity$a U;

    static {
       HighlightPostAlbumActivity.U = new HighlightPostAlbumActivity$a(null);
    }
    public void HighlightPostAlbumActivity(){
       super();
       String str = u1.f();
       a.o(str, "Logger.generateTaskSessionId\(\)");
       this.R = str;
    }
    public void H3(IAlbumMainFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightPostAlbumActivity.class, "5")) {
          return;
       }
       a.p(p0, "albumFragment");
       p0.I3(new HighlightPostAlbumActivity$b(this));
       return;
    }
    public int M(){
       return 4;
    }
    public String a2(){
       return "";
    }
    public int getPage(){
       return 17;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, HighlightPostAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id="+this.R+"&"+"effect_id=";
       HighlightPostAlbumActivity tS = this.S;
       if (tS == null) {
          a.S("mEffectId");
       }
       return obj+tS;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, HighlightPostAlbumActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PHOTO_PICKER";
    }
    public void onCreate(Bundle p0){
       int b;
       HighlightPostAlbumActivity highlightPos = HighlightPostAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, highlightPos, "2")) {
          return;
       }
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, highlightPos, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray1 = new Object[0];
          String str = "HighlightPostAlbumActivity";
          a.D().w(str, "fillParams ", objArray1);
          Intent intent = this.getIntent();
          StringBuilder str1 = "intent";
          a.o(intent, str1);
          if (intent.getScheme() == null) {
             objArray1 = new Object[0];
             a.D().t(str, "scheme = null", objArray1);
          }else {
             intent = this.getIntent();
             a.o(intent, str1);
             Uri data = intent.getData();
             if (data == null) {
                objArray1 = new Object[0];
                a.D().w(str, "data = null ", objArray1);
             }else if(!data.isHierarchical()){
                objArray1 = new Object[0];
                a.D().w(str, "uri.isHierarchical = false", objArray1);
             }else {
                String queryParamet = data.getQueryParameter("specialEffectIdUsed");
                if (queryParamet == null) {
                   queryParamet = "";
                }
                this.S = queryParamet;
                if (TextUtils.x(queryParamet)) {
                   objArray1 = new Object[0];
                   a.D().t(str, "template id is empty", objArray1);
                }
                a uoa4 = a.D();
                str1 = "fillParams complete: templateId=";
                HighlightPostAlbumActivity tS = this.S;
                if (tS == null) {
                   a.S("mEffectId");
                }
                Object[] objArray2 = new Object[0];
                uoa4.w(str, str1+tS, objArray2);
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("参数校验失败"));
          super.onCreate(p0);
          this.finish();
          return;
       }else {
          u1.L0(this);
          if (!PatchProxy.applyVoid(objArray, this, highlightPos, "1")) {
             obj = QCurrentUser.me();
             a.o(obj, "QCurrentUser.me\(\)");
             if (!obj.isLogined()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f103078);
                d.a(-1712118428).x00(this, 0, new LoginParams(), new a(this));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, highlightPos, "4")) {
             b$a uoa = new b$a();
             uoa.c(true);
             f$a uoa1 = new f$a();
             uoa1.g(a.d);
             i$a uoa2 = new i$a().a(uoa.a()).d(uoa1.a());
             k$a uoa3 = new k$a();
             b = (PostExperimentUtils.N0())? 3: 4;
             uoa3.e(b);
             this.getIntent().putExtras(uoa2.m(uoa3.b()).b().d());
             this.getIntent().putExtra("EDIT_STATR_PARAMETER", EditorManager$StartEditorConfig.EFFECT_V2.mStartParam);
          }
          super.onCreate(p0);
          return;
       }
    }
}
