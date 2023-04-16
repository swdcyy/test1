package com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity;
import com.yxcorp.gifshow.v3.PostAlbumActivity;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$a;
import nsd.u;
import java.lang.String;
import k2b.u1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.StickerPostAlbumActivity$b;
import dc7.e;
import ga9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
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
import itc.c3;
import android.content.Context;
import n3d.a;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import w69.k;
import w69.i;

public final class StickerPostAlbumActivity extends PostAlbumActivity	// class@00120c
{
    public final String R;
    public String S;
    public String T;
    public boolean U;
    public List V;
    public AttrAnimProgressFragment W;
    public HashMap X;
    public static final StickerPostAlbumActivity$a Y;

    static {
       StickerPostAlbumActivity.Y = new StickerPostAlbumActivity$a(null);
    }
    public void StickerPostAlbumActivity(){
       super();
       String str = u1.f();
       a.o(str, "Logger.generateTaskSessionId\(\)");
       this.R = str;
       this.W = new AttrAnimProgressFragment();
    }
    public void H3(IAlbumMainFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerPostAlbumActivity.class, "5")) {
          return;
       }
       a.p(p0, "albumFragment");
       p0.I3(new StickerPostAlbumActivity$b(this));
       return;
    }
    public final boolean I3(){
       StickerPostAlbumActivity obj = PatchProxy.apply(null, this, StickerPostAlbumActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.V;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().isVideo()) {
                return false;
             }
          }
       }
       return true;
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
       StringBuilder obj = PatchProxy.apply(null, this, StickerPostAlbumActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id="+this.R+"&"+"sticker_id=";
       StickerPostAlbumActivity tS = this.S;
       if (tS == null) {
          a.S("mStickerId");
       }
       return obj+tS;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StickerPostAlbumActivity.class, "12");
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
       StickerPostAlbumActivity stickerPostA = StickerPostAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, stickerPostA, "2")) {
          return;
       }
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, stickerPostA, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray1 = new Object[0];
          String str = "StickerPostAlbumActivity";
          a.D().w(str, "fillParams ", objArray1);
          Intent intent = this.getIntent();
          String str1 = "intent";
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
                str1 = data.getQueryParameter("stickerId");
                String str2 = "";
                if (str1 == null) {
                   str1 = str2;
                }
                this.S = str1;
                if (TextUtils.x(str1)) {
                   Object[] objArray2 = new Object[0];
                   a.D().t(str, "sticker id is empty", objArray2);
                }
                a uoa3 = a.D();
                StringBuilder str3 = "fillParams complete: stickerId=";
                StickerPostAlbumActivity tS = this.S;
                if (tS == null) {
                   a.S("mStickerId");
                }
                Object[] objArray3 = new Object[0];
                uoa3.w(str, str3+tS, objArray3);
                String queryParamet = data.getQueryParameter("recoText");
                if (queryParamet != null) {
                   str2 = queryParamet;
                }
                this.T = str2;
                a uoa4 = a.D();
                str1 = "fillParams complete: stickerTitle=";
                StickerPostAlbumActivity tT = this.T;
                if (tT == null) {
                   a.S("mStickerTitle");
                }
                Object[] objArray4 = new Object[0];
                uoa4.w(str, str1+tT, objArray4);
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
          if (!PatchProxy.applyVoid(objArray, this, stickerPostA, "1")) {
             obj = QCurrentUser.me();
             a.o(obj, "QCurrentUser.me\(\)");
             if (!obj.isLogined()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f103078);
                d.a(-1712118428).x00(this, 0, new LoginParams(), new c3(this));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, stickerPostA, "4")) {
             b$a uoa = new b$a();
             uoa.c(true);
             i$a uoa1 = new i$a().a(uoa.a());
             k$a uoa2 = new k$a();
             b = (PostExperimentUtils.N0())? 3: 4;
             uoa2.e(b);
             this.getIntent().putExtras(uoa1.m(uoa2.b()).b().d());
          }
          super.onCreate(p0);
          return;
       }
    }
}
