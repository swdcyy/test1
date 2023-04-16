package com.yxcorp.gifshow.music.b;
import a46.c;
import java.lang.Object;
import java.io.File;
import com.kuaishou.android.model.music.Music;
import android.util.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.music.utils.g;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import ekd.k1;
import com.yxcorp.gifshow.media.util.c;
import kob.k;
import java.lang.Long;
import java.lang.Integer;
import q87.c;
import r6b.b;
import java.lang.Throwable;
import w46.b;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.upload.LocalMusicUploadInitModule;
import brd.t;
import tkd.b;
import tkd.d;
import om6.r;
import kqb.b0;
import qkd.b;
import kob.s;
import io.reactivex.g;
import t16.a;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.music.singer.ArtistActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.music.data.MusicSource;
import d46.c;
import com.yxcorp.gifshow.music.util.a$a;
import com.yxcorp.gifshow.music.b$a;
import com.yxcorp.utility.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import d46.b;
import com.yxcorp.gifshow.music.b$b;
import java.util.List;
import kob.i;
import voc.a0;
import brd.a0;
import t45.d;
import brd.z;
import kob.t;
import erd.o;
import d46.d;
import jqb.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import k2b.e0;
import android.os.Bundle;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.music.cloudmusic.bubble.MusicBubbleItem;
import ra9.c;
import lnc.e7;
import upb.a;
import upb.f;
import cjd.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;

public class b implements c	// class@001fdc
{

    public void b(){
       super();
    }
    public static Pair m70(File p0,Music p1,boolean p2){
       MusicType obj;
       File uFile1;
       Object[] objArray3;
       long l3;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = TimeUnit.MINUTES.toMillis(1);
       obj = (p2)? null: g.a(p1);
       long l1 = obj;
       Music mType = p1.mType;
       int i = 1;
       if (mType == MusicType.SOUNDTRACK || mType == MusicType.LIP) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p1.mType.getValue());
          Object[] objArray1 = new Object[0];
          k.D().w("MusicPluginImpl", String.format("origin file type=%d", objArray), objArray1);
          return new Pair(p1, p0);
       }else {
          File uFile = PostUtils.g("[>|4|>]");
          String str = "audio-"+k1.j()+".mp4";
          try{
             uFile1 = new File(uFile, str);
             long l2 = (long)c.i(p0.getPath());
             Object[] objArray2 = new Object[]{p0.getAbsolutePath(),uFile1.getAbsolutePath(),Long.valueOf(l1),Long.valueOf(l2),Long.valueOf(l),Integer.valueOf(p1.mType.getValue())};
             objArray3 = new Object[0];
             k.D().w("MusicPluginImpl", String.format("clip input=%s, output=%s, start=%d, d=%d, newD=%d, t=%d", objArray2), objArray3);
             b.g(p0, l2, uFile1, l1, l);
             return new Pair(p1, uFile1);
          }catch(java.io.IOException e0){
             objArray3 = new Object[v11];
             k.D().u(v2, e0, objArray3);
             uFile1.delete();
             return new Pair(p1, p0);
          }
       }
    }
    public a E6(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LocalMusicUploadInitModule();
    }
    public t EG(int p0,Music p1){
       Object[] obj;
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       b = g.c(p1, d.a(-831446984).uK(p0), i);
       File uFile = (b)? b0.j(p1): b0.h(p1);
       if (b.S(uFile)) {
          Object[] objArray = new Object[]{Boolean.valueOf(b),uFile.getAbsolutePath()};
          obj = new Object[i];
          k.D().w("MusicPluginImpl", String.format("use cached file snip=%b, file=%s", objArray), obj);
          return t.just(b.m70(uFile, p1, b));
       }else {
          return t.create(new s(this, p1, b, uFile));
       }
    }
    public void EM(a p0,Music p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       File uFile = b0.h(p1);
       if (b.S(uFile)) {
          Object[] objArray = new Object[]{uFile.getAbsolutePath()};
          Object[] objArray1 = new Object[0];
          k.D().w("MusicPluginImpl", String.format("use cached file file=%s", objArray), objArray1);
          return;
       }else {
          b.a(-905856758).i(p0, p1, p1.mUrl, p1.mUrls, null);
          return;
       }
    }
    public Intent I8(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Intent(p0, ArtistActivity.class);
    }
    public void OF(GifshowActivity p0,Music p1,MusicSource p2,long p3,long p4,boolean p5,boolean p6,c p7){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p7;
       if (PatchProxy.isSupport2(b.class, "2")) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Long.valueOf(p3),Long.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6),oobject3};
          if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
             return;
          }
       }
       a$a uoa = new a$a(p0);
       uoa.c(p1);
       uoa.e(p2);
       uoa.d(p3);
       uoa.f(p4);
       uoa.g(p5);
       uoa.b(p6);
       uoa.a(1);
       Void[] voidArray = new Void[0];
       new b$a(this, uoa, oobject3).e(AsyncTask.l, voidArray);
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void Wj(GifshowActivity p0,Music p1,MusicSource p2,b p3,boolean p4,boolean p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       a$a uoa = new a$a(p0);
       uoa.c(p1);
       uoa.e(p2);
       uoa.f(g.a(p1));
       uoa.g(0);
       a$a uoa1 = a$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          uoa1 = PatchProxy.applyOneRefs(Boolean.TRUE, uoa, uoa1, "1");
          if (uoa1 != PatchProxyResult.class) {
          label_005f :
             uoa1.a(p4);
             uoa1.b(0);
             uoa1.h = p5;
             Void[] voidArray = new Void[0];
             new b$b(this, uoa, p3).e(AsyncTask.l, voidArray);
             return;
          }
       }
       uoa.i = Boolean.TRUE;
       uoa1 = uoa;
       goto label_005f ;
    }
    public t el(List p0){
       a0 obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x2be267d).Af();
       return obj.load().G(d.a).w(new t(p0, obj));
    }
    public d hN(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
    public boolean isAvailable(){
       return true;
    }
    public void mU(BaseFragment p0,int p1,SearchMusicPanelInteraction p2,int p3,String p4,int p5,e0 p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Integer.valueOf(p3),p4,Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, uob, "13")) {
             return;
          }
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("enter_type", p3);
       uBundle.putString("photo_task_id", p4);
       uBundle.putInt("duration", p5);
       MusicSearchPanelFragment musicSearchP = new MusicSearchPanelFragment();
       musicSearchP.setArguments(uBundle);
       if (!PatchProxy.applyVoidOneRefs(p2, musicSearchP, MusicSearchPanelFragment.class, "1")) {
          a.p(p2, "<set-?>");
          musicSearchP.j = p2;
       }
       if (!PatchProxy.applyVoidOneRefs(p6, musicSearchP, MusicSearchPanelFragment.class, "8")) {
          a.p(p6, "<set-?>");
          musicSearchP.n = p6;
       }
       e uoe = p0.getChildFragmentManager().beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       uoe.w(p1, musicSearchP, "music_search_panel_fragment");
       uoe.o();
       return;
    }
    public void n40(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       e7.b(MusicBubbleItem.KTV_ENTRY_MOVE.getBubbleKey(), 0);
       return;
    }
    public void o3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       f.a().o3(p0).map(new e()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public CloudMusicHelper px(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VSVCloudMusicHelper();
    }
}
