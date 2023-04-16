package com.feature.post.bridge.m$a;
import pm6.e$b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import f55.g;
import java.lang.Object;
import pm6.g;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import o79.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;
import w69.i$a;
import w69.b$a;
import android.content.Intent;
import android.os.Bundle;
import w69.b;
import w69.k$a;
import android.content.res.Resources;
import w69.k;
import w69.f$a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import x79.e;
import e16.a$a;
import e16.a;
import android.content.Context;
import brd.a0;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import lnc.y6;
import mg.f1;
import erd.o;
import com.feature.post.bridge.l;
import mg.c1;
import erd.g;
import crd.b;
import java.lang.Exception;
import o56.a;
import android.app.Application;
import com.kwai.plugin.dva.work.c$c;
import sj7.d;

public class m$a implements e$b	// class@0014ab
{
    public final Activity a;
    public final JsSelectAndUploadMediaParams b;
    public final g c;

    public void m$a(Activity p0,JsSelectAndUploadMediaParams p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean c(){
       return g.a(this);
    }
    public void j(List p0){
       a0 uoa0;
       m$a ta = this.a;
       m$a tb = this.b;
       m$a tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsSelectAndUploadMediaF", "selectAndUploadMediaReal: ", objArray);
       if (!ta instanceof GifshowActivity) {
       }else {
          String str = "image";
          if (tb.mSourceTypes.contains("album")) {
             int[] c = ((tb.mMediaType).equals(str))? a.c: a.d;
             ArrayList uArrayList = new ArrayList();
             JsSelectAndUploadMediaParams mFileType = tb.mFileType;
             Objects.requireNonNull(mFileType);
             int i1 = mFileType.hashCode();
             if (i1 != 0x1a6f1) {
                if (i1 != 0x1b229) {
                   if (i1 != 0x31e068 || !mFileType.equals("jpeg")) {
                   label_0075 :
                      i = -1;
                   }else {
                      i = 2;
                   }
                }else if(!mFileType.equals("png")){
                   goto label_0075 ;
                }else {
                   i = 1;
                }
             }else if(!mFileType.equals("mp4")){
                goto label_0075 ;
             }
             if (i) {
                if (i != 1) {
                   if (i == 2) {
                      uArrayList.add(Pattern.compile(".*\\.jpe?g$"));
                   }
                }else {
                   uArrayList.add(Pattern.compile(".*\\.png$"));
                }
             }else {
                uArrayList.add(Pattern.compile(".*\\.mp4$"));
             }
             b$a uoa = new b$a();
             uoa.c(true);
             uoa.b(ta.getIntent().getExtras());
             f$a uoa1 = new f$a();
             uoa1.g(c);
             uoa1.h(tb.mSourceTypes.contains("camera"));
             AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
             uBuilder.p(true);
             uoa0 = a0.B(e.f().a(ta, new a$a().g(new i$a().a(uoa.a()).m(new k$a().c(ta.getResources().getString(R.string.arg_RES_7f104618)).b()).d(uoa1.a()).f(uBuilder.b(uArrayList).d()).b()).f()));
          }else if(tb.mSourceTypes.contains("camera")){
             TakePictureType sHOOT_IMAGE = ((tb.mMediaType).equals(str))? TakePictureType.SHOOT_IMAGE: TakePictureType.SHARE;
             uoa0 = y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).C(new f1(ta, sHOOT_IMAGE));
          }
          uoa0.R(new l(ta, tb, tc), new c1(tc));
       }
       return;
    }
    public void onFailed(Exception p0){
       Object[] objArray = new Object[0];
       l.D().w("JsSelectAndUploadMediaF", "selectAndUploadMedia: asyncLoadWithDialog onClickCancel", objArray);
       this.c.a(412, a.B.getString(R.string.arg_RES_7f1042c6), new Bundle());
    }
    public void onProgress(float p0){
       g.c(this, p0);
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.j(p0);
    }
}
