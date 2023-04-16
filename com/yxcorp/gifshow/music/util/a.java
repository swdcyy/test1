package com.yxcorp.gifshow.music.util.a;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.music.util.a$a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import tkd.b;
import tkd.d;
import om6.r;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import kqb.b0;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import java.util.concurrent.CountDownLatch;
import kob.r;
import lnc.s6;
import jqb.b;
import com.yxcorp.gifshow.music.utils.a$a;
import java.util.concurrent.TimeUnit;
import lnc.a1;
import kob.k;
import w46.b;
import java.lang.Throwable;
import java.lang.InterruptedException;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import ekd.k1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.c;
import java.io.IOException;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Math;
import java.util.Collection;
import ekd.q;
import kqb.y;
import com.yxcorp.gifshow.music.utils.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import q87.c;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import com.kwai.video.editorsdk2.CommonException;
import e17.i;
import android.util.Log;
import com.yxcorp.utility.AsyncTask;
import java.util.concurrent.FutureTask;
import android.net.Uri;
import ekd.w0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import org.json.JSONObject;
import e16.b;
import java.util.List;
import lnc.r5;
import kqb.i;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import gka.r;
import java.lang.Runnable;
import jqb.a;
import android.view.View$OnClickListener;
import java.lang.Long;
import mca.a;
import android.content.Context;
import com.kwai.video.editorsdk2.RemuxTask;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.RemuxTaskInputParamsBuilder;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.RemuxTaskInputStreamType;
import com.kwai.video.editorsdk2.RemuxTaskInputParams;
import com.kwai.video.editorsdk2.RemuxTaskParamsBuilder;
import com.kwai.video.editorsdk2.RemuxTaskMode;
import com.kwai.video.editorsdk2.RemuxTaskParams;
import com.yxcorp.gifshow.music.util.a$b;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.google.gson.JsonObject;
import com.kwai.framework.cache.CacheManager;
import com.google.gson.JsonElement;
import a46.a;
import a46.b;

public class a extends d	// class@002084
{
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public File L;
    public File M;
    public Lyrics N;
    public Bitmap O;
    public String P;
    public boolean Q;
    public boolean R;
    public Music y;
    public MusicSource z;

    public void a(a$a p0){
       a$a a;
       super(p0.f, p0.j);
       long l = 0;
       this.C = l;
       boolean b = false;
       this.J = b;
       this.K = b;
       a$a f = p0.f;
       if (PatchProxy.applyVoidOneRefs(f, this, a.class, "1")) {
       }else {
          Intent intent = f.getIntent();
          if (intent != null) {
             this.F = intent.getBooleanExtra("repeat_if_not_enough", b);
             this.H = intent.getBooleanExtra("originPathAndRanges", b);
             this.D = (long)intent.getIntExtra("duration", d.a(-831446984).uK(b));
             this.I = intent.getIntExtra("enter_type", -1);
             this.G = intent.getBooleanExtra("skip_clip", b);
          }
       }
       this.A = p0.c;
       this.y = p0.a;
       this.z = p0.b;
       this.B = p0.d;
       this.K = p0.e;
       this.Q = p0.h;
       this.R = p0.j;
       a$a i = p0.i;
       if (i != null) {
          this.H = i.booleanValue();
       }
       if (p0.g != null) {
          this.L = b0.j(p0.a);
          this.C = p0.d;
          this.B = l;
       }else {
          a = p0.a;
          if (a.mType == MusicType.LOCAL) {
             this.L = new File(p0.a.mPath);
          }else {
             File uFile = b0.h(a);
             this.L = uFile;
             if (uFile == null) {
                this.L = new File(p0.a.mPath);
             }
          }
       }
       this.M = b0.e(this.y);
       return;
    }
    public void A(long p0){
    }
    public Object b(Object[] p0){
       long l;
       Object[] objArray;
       String str1;
       int c;
       Bitmap uBitmap1;
       a d;
       Lyrics lyrics = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       a obj = PatchProxy.applyOneRefs(p0, lyrics, a.class, str);
       String obj1 = null;
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else {
          try{
             obj = lyrics.L;
             if (obj != null) {
                int i = 0;
                if (!obj.isFile()) {
                   l = System.currentTimeMillis();
                   obj = -905856758;
                   CountDownLatch uCountDownLa = b.a(obj).a(lyrics.L);
                   if (uCountDownLa == null) {
                      uCountDownLa = d.a(-1687636538).rJ(b0.i(lyrics.y));
                   }
                   int i1 = 100;
                   if (uCountDownLa != null) {
                      if (s6.H()) {
                         lyrics.u(i, i1);
                         b.a(obj).c(lyrics.y, new b(lyrics));
                      }
                      uCountDownLa.await(0xea60, TimeUnit.MILLISECONDS);
                   }
                   if (s6.H()) {
                      lyrics.u(i1, i1);
                   }
                   lyrics.A(a1.o(l));
                   if (!lyrics.L.isFile()) {
                      objArray = new Object[i];
                      k.D().t("ClipMusicRunner", "doInBackground input is file false", objArray);
                      lyrics.w(i, "doInBackground input is file false", lyrics.L.getAbsolutePath());
                   }
                }
                File uFile = new File(PostUtils.g("[>|3|>]"), "audio-"+k1.j()+".mp4");
                if (!PatchProxy.applyVoid(obj1, lyrics, a.class, "7")) {
                   if (TextUtils.x(lyrics.y.mLyrics)) {
                      obj = lyrics.M;
                      if (obj != null && obj.isFile()) {
                         try{
                            lyrics.y.mLyrics = c.j(lyrics.M);
                         }catch(java.io.IOException e0){
                            e0.printStackTrace();
                         }
                      }
                   }
                }
                long l1 = 1;
                if (PatchProxy.applyVoid(obj1, lyrics, a.class, "8")) {
                label_012f :
                   str1 = "ClipMusicRunner";
                }else if(lyrics.A <= 0){
                   lyrics.A = (long)c.i(lyrics.L.getPath());
                }
                int i2 = 0x222e0;
                if (!lyrics.D - -1) {
                   lyrics.D = Math.min(lyrics.A, (long)i2);
                }
                if (!lyrics.D - -2) {
                   lyrics.D = (long)d.a(-831446984).uK(i);
                }
                a g = lyrics.G;
                if (g != null && lyrics.F != null) {
                   lyrics.E = lyrics.D;
                   goto label_012f ;
                }else {
                   a i3 = lyrics.I;
                   long l2 = 0x493e0;
                   if (i3 != l1) {
                      lyrics.D = l2;
                   }
                   a f = lyrics.F;
                   if (f != null && g != null) {
                      lyrics.E = lyrics.D;
                      goto label_012f ;
                   }else {
                      a y = lyrics.y;
                      Music mType = y.mType;
                      if (mType == MusicType.LIP) {
                         lyrics.E = Math.min(lyrics.A, (long)i2);
                         goto label_012f ;
                      }else if(mType == MusicType.SOUNDTRACK && (lyrics.K == null && i3 != l1)){
                         str1 = "ClipMusicRunner";
                         lyrics.E = Math.min((lyrics.A - lyrics.B), l2);
                      }else {
                         str1 = "ClipMusicRunner";
                         d = lyrics.D;
                         obj = y;
                         if (d - (lyrics.A - lyrics.B) < 0) {
                            if (i3 != 1) {
                               obj = lyrics.N;
                               if (obj != null && (g == null && !q.f(obj.mLines))) {
                                  lyrics.E = y.b(lyrics.N, lyrics.A, (lyrics.B + lyrics.C), lyrics.D);
                               }
                            }
                            lyrics.E = lyrics.D;
                         }else if(f != null){
                            lyrics.E = d;
                         }else {
                            Music mCopyrightTi = obj.mCopyrightTimeLimitInSecond;
                            l = (mCopyrightTi > null)? TimeUnit.SECONDS.toMillis((long)mCopyrightTi): Long.MAX_VALUE;
                            lyrics.E = Math.min((lyrics.A - lyrics.B), l);
                         }
                      }
                   }
                }
                Object[] objArray1 = null;
                if (PatchProxy.applyVoid(objArray1, lyrics, a.class, "9")) {
                   obj1 = 1;
                }else if(!TextUtils.x(lyrics.P)){
                   obj = lyrics.P;
                   Bitmap uBitmap = PatchProxy.applyOneRefs(obj, objArray1, d.class, str);
                   if (uBitmap != patchProxyRe) {
                      obj1 = 1;
                   }else if(!TextUtils.x(obj)){
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      options.inJustDecodeBounds = true;
                      BitmapFactory.decodeFile(obj, options);
                      c = d.c;
                      if (options.outWidth > c) {
                         options.outWidth = c;
                      }
                      if (options.outHeight > c) {
                         options.outHeight = c;
                      }
                      options.inJustDecodeBounds = false;
                      uBitmap1 = BitmapFactory.decodeFile(obj, options);
                   }else {
                      uBitmap1 = null;
                   }
                   if (uBitmap1 == null) {
                      uBitmap = BitmapFactory.decodeResource(a.b().getResources(), R.drawable.arg_RES_7f0823d6);
                   }else {
                      uBitmap = uBitmap1;
                   }
                   lyrics.O = uBitmap;
                }else {
                   lyrics.O = d.d(lyrics.y);
                }
                if (lyrics.H != null) {
                   objArray = new Object[0];
                   k.D().w(str1, "OriginMusicAndRange", objArray);
                   obj1 = lyrics.L.getAbsolutePath();
                }else {
                   this.v(lyrics.L.getAbsolutePath(), uFile.getAbsolutePath(), lyrics.B, lyrics.E);
                   lyrics.z(a1.o(System.currentTimeMillis()));
                   obj1 = uFile.getPath();
                }
             }
          }catch(java.lang.InterruptedException e0){
             k.D().e("ClipMusicRunner", "doInBackground ", e0);
             e0.printStackTrace();
             lyrics.A(a1.o(l));
          }
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       super.h();
       c.f(this.c.get());
       return;
    }
    public void j(Object p0){
       Intent intent;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
       }else {
          super.j(p0);
          boolean b = true;
          if (TextUtils.x(p0)) {
             Object[] objArray = new Object[0];
             k.D().t("ClipMusicRunner", "onPostExecute no file", objArray);
             this.w(b, "onPostExecute no file", null);
             this.y();
          }else if(this.Q != null){
             intent = this.p.getIntent();
          }else {
             intent = new Intent();
          }
          intent.setData(w0.c(new File(p0)));
          SerializableHook.putExtra(intent, "music", this.y);
          SerializableHook.putExtra(intent, "music_source", this.z);
          intent.putExtra("start_time", this.B);
          intent.putExtra("result_duration", this.E);
          intent.putExtra("category_id", this.y.getCategoryId());
          intent.putExtra("mark_history_folder", this.J);
          intent.putExtra("EXTRA_IS_FROM_CLIP", b);
          intent.putExtra("originPathAndRanges", this.H);
          intent.putExtra("music_meta", b.a(this.y, this.B, Math.min(this.E, this.D), false).toString());
          a tN = this.N;
          if (tN != null && !tN.mLines.isEmpty()) {
             intent.putExtra("lyric_start", (this.B + this.C));
             SerializableHook.putExtra(intent, "lyrics", y.c(this.N, (this.B + this.C), this.E));
          }
          if (this.O != null) {
             intent.putExtra("cover_bitmap", r5.b().c(this.O));
          }
          String absolutePath = this.L.getAbsolutePath();
          a tA = this.A;
          if (this.H != null) {
             p0 = "";
          }
          i.a(intent, absolutePath, tA, p0, this.B, this.E);
          this.x(intent);
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.R != null) {
          super.k();
          this.t(R.string.arg_RES_7f1005f4).s(true);
       }
       return;
    }
    public void r(ProgressFragment p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       p0.Gh(true);
       p0.Ah(R.dimen.arg_RES_7f07025f, 0x7f07025f);
       if (s6.H()) {
          int i = 0x7f100aab;
          String str1 = a1.r(i, "");
          if (PatchProxy.applyOneRefs(str1, this, d.class, str) != PatchProxyResult.class) {
          }else {
             this.r = str1;
             if (this.q != null) {
                k1.o(new r(this));
             }
          }
          p0.Jh(a1.r(i, ""));
          p0.Eh(0, 100);
          p0.vh(R.string.cancel);
          p0.xh(new a(this));
       }
       return;
    }
    public final void v(String p0,String p1,long p2,long p3){
       a$b c;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), Long.valueOf(p3), this, a.class, "5")) {
          return;
       }
       a.u();
       RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(a.b());
       ArrayList uArrayList = new ArrayList();
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       uArrayList.add(remuxTask.newRemuxInputParamsBuilder().setPath(p0).setStartTime((double)mILLISECONDS.toSeconds(p2)).setDuration((double)mILLISECONDS.toSeconds(p3)).setType(RemuxTaskInputStreamType.AUDIO).build());
       a$b uob = new a$b(null);
       remuxTask.startRemuxAsync(remuxTask.newRemuxParamsBuilder().setInputParams(uArrayList).setOutputPath(p1).setRemuxTaskMode(RemuxTaskMode.STREAM_COMBINE).build(), uob);
       if (!uob.b.await(2, TimeUnit.MINUTES)) {
          c = uob.c;
          if (c != null) {
             throw c;
          }
          throw new Throwable("remux timeout");
       }else if(uob.a == null){
          c = uob.c;
          if (c != null) {
             throw c;
          }
          throw new Throwable("remux fail");
       }else {
          return;
       }
    }
    public final void w(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, a.class, "6")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       String str = (p0)? "UNKNOWN": String.valueOf(b.a(0x5f2ddeb4).h());
       jsonObject.c0("DiskSpaceOK", str);
       if (p2 == null) {
          p2 = "UNKNOWN";
       }
       jsonObject.c0("FilePath", p2);
       jsonObject.c0("Message", p1);
       jsonObject.H("Remux", Boolean.TRUE);
       PostUtils.x("Clip_Fail", jsonObject.toString());
       return;
    }
    public void x(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       d tp = this.p;
       if (tp != null && (tp.isDestroyed() || this.p.isFinishing())) {
          Object[] objArray = new Object[0];
          k.D().w("ClipMusicRunner", "finished after context gone", objArray);
          return;
       }else {
          d.a(0x500192b6).Z3(p0);
          return;
       }
    }
    public void y(){
    }
    public void z(long p0){
    }
}
