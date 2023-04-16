package com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import nkd.a;
import qr4.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import java.lang.Thread;
import lnc.o5;
import qr4.m$k0;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import km6.h;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import org.json.JSONException;
import java.lang.Throwable;
import lnc.i1;
import com.google.protobuf.nano.MessageNano;
import qr4.e$h;
import java.lang.CharSequence;
import fg6.a;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import qr4.m$d;
import java.util.List;
import qr4.m$c;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList$TaskInfo;
import java.lang.Integer;
import qr4.m$a0;
import com.kuaishou.android.model.music.Music;
import qr4.j$a;
import java.lang.Boolean;
import qr4.k$j;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import qr4.m$y;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import qr4.m$w;
import qr4.e$e;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import qr4.m$j0;
import com.kuaishou.android.model.mix.Location;
import lnc.p3;
import q87.c;
import qr4.m$x;
import java.lang.Float;
import java.lang.Double;
import java.util.Objects;
import java.lang.Long;
import qr4.m$k;
import qr4.k$a;
import qr4.k$b;
import qr4.k$c;
import com.kwai.feature.post.api.music.data.MusicSource;
import qr4.k$m;
import qr4.k$l;
import km6.d;
import qr4.k$l$a;
import qr4.m$c0;
import qr4.k$g;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import tkd.b;
import tkd.d;
import d36.e;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.ExifInfo;
import qr4.m$l;
import java.io.File;
import qr4.e$i;
import qr4.l$a;
import qr4.m$i;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;
import qr4.m$n;
import java.io.IOException;
import java.lang.Exception;
import qr4.m$p;
import pm6.h;
import qr4.m$m;
import km6.f;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.util.PostUtils;
import qr4.m$a;
import qr4.m$q;
import qr4.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.NumberFormatException;
import ekd.q$b;
import java.lang.Math;
import java.lang.RuntimeException;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import qr4.k$i;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Queue;
import org.json.JSONArray;

public class VideoContext	// class@000cea
{
    public i a;
    public a b;

    public void VideoContext(){
       super();
       this.b = new a();
       this.m0();
    }
    public void VideoContext(i p0){
       super();
       if (p0 != null) {
          this.a = p0;
       }
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, VideoContext.class, "207")) {
          return;
       }
       Looper.getMainLooper().getThread();
       Thread.currentThread();
       return;
    }
    public static void e2(VideoContext p0,String p1,String p2,String p3,String p4){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, videoContext, "208")) {
             return;
          }
       }
       VideoContext.b();
       p0.f0();
       p0.e1(1);
       p0.F().b.q0 = o5.c(p1);
       p1.v0 = TextUtils.k(p2);
       p1.u0 = TextUtils.k(p3);
       p0.t0 = TextUtils.k(p4);
       return;
    }
    public static VideoContext h(JSONObject p0){
       i obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj1 = null;
       VideoContext obj2 = PatchProxy.applyOneRefs(obj, obj1, VideoContext.class, "191");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = new VideoContext();
       obj1 = PatchProxy.applyOneRefs(obj, obj1, h.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          try{
             String[] stringArray = new String[]{"Author","Meta","Source","Wifi","Duration","Lat","Lon","Time","Camera","Light","Sound","Title","CoverEditTitle","Face","Filter","RecordBeauty","EditBeauty","Border","MotionArray","Separate","Import","Photo","Join","openPlatformMagicEmoji","Inherit","FromPage","IFRate","Exif","Album","CreateTime","origin_width","origin_height","origin_length","encoded_width","encoded_height","file_path","Music","EditMusic","RecordMusic","AllTitle","BeautyValue","FilterValue","EnhanceConfig","enableEnhancement","magicEmoji","effects","magic_fingers","pencilColors","cutRanges","editorVersion","encode_config_id","speed_parts","record_parts","DiscardSegmentsCount","CameraFocus","origin_duration","hw_bitrate","real_fps","atlas","rotationDegree","encode_type","decode_type_hw_or_sw","recorder_name","BeautyType","BeautifyConfig","bubbles","proportionWithFaceDetected","beautify","recordFilters","makeups","musicTag","magicFaceTag","theme","encodeCrc","uploadCrc","CustomCoverTimestamp","CoverTitleStyle","CoverIndexs","noiseReductionSwitch","humanvoiceAdjust","isTranscode","music_edit_preset","magic_has_music","is_glass","music_edit_preset","magic_has_music","longVideo","sameFrameSwitch","complex_encode_params_key","sameFrameOriginPhotoId","sameFrameAvailableDepth","JoinVideoConfig","JoinVideoTimes","activity","is_pipeline_upload","edit_music_kuaishan","TimingStop","record_music_source","edit_music_source","MusicSource","taskId","shareFromOtherApp","extraInfo","conversionTaskList","thirdPartyInfo"};
             JSONObject jSONObject = new JSONObject(obj, stringArray);
             obj = b.b(obj.optString("photoMeta"));
             if (obj == null) {
                obj = h.e();
             }
             h.c(obj, jSONObject, false);
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
             i1.c(e0);
             obj = h.e();
          }
          obj1 = obj;
       }
       obj2.k0(MessageNano.toByteArray(obj1));
       return obj2;
    }
    public String A(){
       i d = this.a.d;
       if (d != null) {
          return d.e;
       }
       return "";
    }
    public VideoContext A0(String p0){
       VideoContext obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       obj = this.a;
       if (!PatchProxy.applyVoidTwoRefs(obj, p0, null, b.class, "12") && !TextUtils.x(p0)) {
          ConversionTaskList mTaskInfoLis = a.a.h(p0, ConversionTaskList.class).mTaskInfoList;
          if (!q.f(mTaskInfoLis)) {
             obj.b.V = new m$d();
             m$c[] uocArray = new m$c[mTaskInfoLis.size()];
             obj.b.V.a = uocArray;
             for (int i = 0; i < mTaskInfoLis.size(); i = i + 1) {
                obj.b.V.a[i] = new m$c();
                obj.b.V.a[i].b = TextUtils.k(mTaskInfoLis.get(i).mMissionPhotoMeta);
                obj.b.V.a[i].a = 1;
             }
          }
       }
       return this;
    }
    public VideoContext A1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "128");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.b0();
       this.a.b.u.a = p0;
       return this;
    }
    public Music B(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(this.a.d.i);
    }
    public VideoContext B0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "157");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.c.C = p0;
       return this;
    }
    public VideoContext B1(PhotoVisibility p0,List p1,boolean p2){
       m$y obj;
       if (PatchProxy.isSupport(VideoContext.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, VideoContext.class, "205");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       if (p0 != PhotoVisibility.FRIENDS && (p0 == PhotoVisibility.PART_INVISIBLE || p0 == PhotoVisibility.PART_VISIBLE)) {
          obj = new m$y();
          if (p0 == PhotoVisibility.PART_VISIBLE) {
             int i = 1;
             obj.a = i;
             obj.c = (p2)? i: false;
          }else if(p0 == PhotoVisibility.PART_INVISIBLE){
             obj.a = 2;
          }else {
             obj.a = 0;
          }
          ArrayList uArrayList = new ArrayList();
          if (p1 != null && !p1.isEmpty()) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getId());
             }
             String[] stringArray = new String[0];
             obj.b = uArrayList.toArray(stringArray);
          }else {
             String[] stringArray1 = new String[0];
             obj.b = stringArray1;
          }
          uArrayList.l0 = obj;
       }else {
          p0.l0 = null;
       }
       return this;
    }
    public long C(){
       i b = this.a.b;
       if (b != null) {
          m$k0 f = b.f;
          if (f != null) {
             return f.c;
          }
       }
       return 0;
    }
    public VideoContext C0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.W();
       this.a.d.k.d = TextUtils.k(p0);
       return this;
    }
    public VideoContext C1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "169");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b0();
       Log.b("VideoContext", "setPhotoMovieUseMusicPoint:"+p0);
       this.a.b.u.e = p0;
       return this;
    }
    public String D(){
       i b = this.a.b;
       if (b != null) {
          m$k0 w = b.w;
          if (w != null) {
             return w.b;
          }
       }
       return "";
    }
    public VideoContext D0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.f0();
       this.a.b.m = TextUtils.k(p0);
       return this;
    }
    public void D1(Location p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "210")) {
          return;
       }
       String str = String.valueOf(p0.getId());
       String title = p0.getTitle();
       int checkType = p0.getCheckType();
       p0 = p0.mExtParams;
       VideoContext.b();
       this.c0();
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setPoiInfo: id="+str+" name="+title+"checkType="+checkType+"extraInfo="+p0, objArray);
       this.F().b.x0.a = TextUtils.k(str);
       this.F().b.x0.b = TextUtils.k(title);
       this.F().b.x0.c = checkType;
       this.F().b.x0.f = TextUtils.k(p0);
       return;
    }
    public e$h E(){
       return this.a.d;
    }
    public VideoContext E0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.W();
       this.a.d.k.k = TextUtils.k(p0);
       return this;
    }
    public void E1(boolean p0,boolean p1){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, videoContext, "224")) {
          return;
       }
       VideoContext.b();
       this.c0();
       this.F().b.x0.e = p0;
       p0.d = p1;
       return;
    }
    public i F(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "192");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       return this.a;
    }
    public VideoContext F0(String p0,String p1,boolean p2,float p3,float p4,float p5,float p6,String p7,String p8,String p9,String p10){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          Object obj = PatchProxy.apply(objArray, this, videoContext, "66");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.W();
       this.a.d.k.b = TextUtils.k(p0);
       p0.c = TextUtils.k(p1);
       e$h k = this.a.d.k;
       k.e = p2;
       k.g = p3;
       k.h = p4;
       k.i = p5;
       k.j = p6;
       k.l = TextUtils.k(p7);
       k.m = TextUtils.k(p8);
       k.n = TextUtils.k(p9);
       k.f = TextUtils.k(p10);
       return this;
    }
    public VideoContext F1(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       if (p0.isEmpty()) {
          return this;
       }
       String[] stringArray = new String[p0.size()];
       this.a.c.Z = stringArray;
       for (int i = 0; i < p0.size(); i = i + 1) {
          k$j z = this.a.c.Z;
          String str = (p0.get(i) == null)? "": p0.get(i);
          z[i] = str;
       }
       return this;
    }
    public i G(){
       return this.a;
    }
    public VideoContext G0(double p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, videoContext, "62");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.W();
       this.a.d.k.a = p0;
       return this;
    }
    public void G1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoContext, "219")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.F0 = p0;
       return;
    }
    public boolean H(){
       boolean b1;
       i b = this.a.b;
       if (b != null) {
          m$k0 u = b.u;
          if (u != null && u.e != null) {
             b1 = true;
          label_0011 :
             return b1;
          }
       }
       b1 = false;
       goto label_0011 ;
    }
    public VideoContext H0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       Objects.requireNonNull(p0);
       if (!p0.equals("HW")) {
          p0.b = (!p0.equals("SW"))? 0: 2;
       }else {
          p0.b = 1;
       }
       return this;
    }
    public VideoContext H1(double p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, videoContext, "89");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.c.i = p0;
       return this;
    }
    public int I(){
       i b = this.a.b;
       if (b != null) {
          m$k0 u = b.u;
          if (u != null) {
             return u.a;
          }
       }
       return 0;
    }
    public VideoContext I0(long p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, videoContext, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.Z();
       if (p0 - null <= 0) {
          Object[] objArray = new Object[0];
          p3.D().w("VideoContext", "setDuration return d:"+p0, objArray);
          return this;
       }else {
          this.a.b.g.c = p0;
          return this;
       }
    }
    public VideoContext I1(k$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.c.P = p0;
       return this;
    }
    public k$a J(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "117");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       return this.a.c.P;
    }
    public VideoContext J0(k$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.d.I = p0;
       return this;
    }
    public VideoContext J1(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       b.l(this.a, p0);
       return this;
    }
    public Music K(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(this.a.c.o);
    }
    public VideoContext K0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.d.t = p0;
       return this;
    }
    public VideoContext K1(Music p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoContext videoContext = VideoContext.class;
       Music obj = PatchProxy.applyOneRefs(p0, this, videoContext, "42");
       if (obj != patchProxyRe) {
          return obj;
       }
       VideoContext.b();
       obj = p0.mUsedStart;
       Music mUsedDuratio = p0.mUsedDuration;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyThreeRefs(p0, Long.valueOf(obj), Long.valueOf(mUsedDuratio), this, VideoContext.class, "41") != patchProxyRe) {
       }else {
          VideoContext.b();
          this.a.c.o = b.f(p0, obj, mUsedDuratio);
       }
       return this;
    }
    public int L(){
       i b = this.a.b;
       m$k0 n0 = (b != null)? b.n0: 0;
       return n0;
    }
    public VideoContext L0(k$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "113");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.d.D = p0;
       return this;
    }
    public VideoContext L1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "51");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       Log.g("VideoContext", "setRecordMusicSource "+MusicSource.values()[p0]);
       this.f0();
       this.a.b.n0 = p0;
       this.b2();
       return this;
    }
    public String M(){
       i c = this.a.c;
       if (c != null) {
          return c.f;
       }
       return "";
    }
    public VideoContext M0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "114");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.d.F = p0;
       return this;
    }
    public VideoContext M1(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       if (p0 != null && p0.size() > 0) {
          k$m[] omArray = new k$m[p0.size()];
          this.a.c.s = omArray;
          k$l[] olArray = new k$l[p0.size()];
          this.a.c.t = olArray;
          Iterator iterator = p0.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             d uod = iterator.next();
             k$m om = new k$m();
             long l = (long)0;
             om.a = l;
             om.b = (long)uod.a;
             om.c = uod.b;
             this.a.c.s[i] = om;
             k$l ol = new k$l();
             ol.a = l;
             ol.b = (long)uod.a;
             ol.c = (double)uod.c;
             ol.f = uod.h;
             d g = uod.g;
             boolean b = (g != null)? true: false;
             ol.e = b;
             ol.h = g;
             g = uod.i;
             if (g != null && g.size() > 0) {
                k$l$a[] ol$aArray = new k$l$a[0];
                ol.d = uod.i.toArray(ol$aArray);
             }
             uod = uod.j;
             if (uod != null && uod.length > 0) {
                ol.g = uod;
             }
             this.a.c.t[i] = ol;
             i = i + 1;
          }
       }
       return this;
    }
    public String N(){
       i obj = PatchProxy.apply(null, this, VideoContext.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          m$k0 t = obj.t;
          if (t != null) {
             m$c0 d = t.d;
             if (d != -1) {
                return String.valueOf(d);
             }
          }
       }
       return null;
    }
    public VideoContext N0(k$g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.d.C = p0;
       return this;
    }
    public void N1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoContext, "223")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.Z0 = p0;
       return;
    }
    public String O(){
       i b = this.a.b;
       if (b != null) {
          m$k0 t = b.t;
          if (t != null) {
             return t.b;
          }
       }
       return null;
    }
    public VideoContext O0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "112");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.d.E = p0;
       return this;
    }
    public VideoContext O1(String p0){
       m$j0 obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       obj = new m$j0();
       obj.b = "";
       obj.c = p0;
       VideoContext ta = this.a;
       if (ta.b == null) {
          ta.b = new m$k0();
       }
       ta.w = obj;
       return this;
    }
    public UpdateShareBusinessLinkModel P(){
       i b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VideoContext obj = PatchProxy.apply(objArray, this, VideoContext.class, "176");
       if (obj != patchProxyRe) {
          return obj;
       }
       VideoContext.b();
       obj = this.a;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, b.class, "15");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(obj != null){
          b = obj.b;
          if (b != null) {
             m$k0 v = b.V;
             if (v != null) {
                m$d a = v.a;
                if (a == null || (a.length && !TextUtils.x(a[0].c))) {
                   objArray = new UpdateShareBusinessLinkModel();
                   m$d a1 = v.a;
                   objArray.mServiceId = a1[0].b;
                   objArray.mSubtype = a1[0].c;
                   objArray.mEntryId = a1[0].c;
                }
             }
          }
       }
       return objArray;
    }
    public VideoContext P0(Music p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoContext videoContext = VideoContext.class;
       Music obj = PatchProxy.applyOneRefs(p0, this, videoContext, "45");
       if (obj != patchProxyRe) {
          return obj;
       }
       VideoContext.b();
       obj = p0.mUsedStart;
       Music mUsedDuratio = p0.mUsedDuration;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyThreeRefs(p0, Long.valueOf(obj), Long.valueOf(mUsedDuratio), this, VideoContext.class, "44") != patchProxyRe) {
       }else {
          VideoContext.b();
          Log.g("VideoContext", "setEditMusic name: "+p0.mName);
          this.a.d.i = b.f(p0, obj, mUsedDuratio);
       }
       return this;
    }
    public VideoContext P1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "92");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.d0();
       this.a.b.t.d = p0;
       return this;
    }
    public String Q(){
       i b = this.a.b;
       if (b != null) {
          return b.n;
       }
       return "";
    }
    public VideoContext Q0(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       Log.g("VideoContext", "setEditMusicSource "+MusicSource.values()[p0]);
       this.f0();
       this.a.b.y = p0;
       return this;
    }
    public VideoContext Q1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.d0();
       this.a.b.t.b = TextUtils.k(p0);
       return this;
    }
    public String R(){
       i b = this.a.b;
       if (b != null) {
          m$k0 u = b.u;
          if (u != null) {
             return u.b;
          }
       }
       return "";
    }
    public VideoContext R0(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.d.f = p0;
       return this;
    }
    public VideoContext R1(String p0){
       VideoContext obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       obj = this.a;
       Object obj1 = null;
       if (!PatchProxy.applyVoidTwoRefs(obj, p0, obj1, b.class, "14")) {
          Object[] objArray = new Object[0];
          p3.D().w("PhotoMetaUtils", "setServiceLinkData\(\) serviceData="+p0, objArray);
          if (!TextUtils.x(p0)) {
             m$c uoc = d.a(-1457522644).nE(p0);
             if (uoc != null) {
                obj.b.V = new m$d();
                m$c[] uocArray = new m$c[]{uoc};
                obj.b.V.a = uocArray;
             }
          }else {
             p0.V = obj1;
          }
       }
       return this;
    }
    public m$j0 S(){
       i b = this.a.b;
       if (b == null) {
          return null;
       }
       return b.w;
    }
    public void S0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setEditSessionId\(\) "+p0, objArray);
       if (p0 == null) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.a.b.i1 = p0;
       return;
    }
    public VideoContext S1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "151");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.e0();
       this.a.b.w.c = TextUtils.k(p0);
       return this;
    }
    public String T(){
       i b = this.a.b;
       if (b != null) {
          m$k0 w = b.w;
          if (w != null) {
             return w.c;
          }
       }
       return "";
    }
    public VideoContext T0(long p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, videoContext, "69");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.Z();
       this.a.b.g.d = p0;
       return this;
    }
    public void T1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoContext, "203")) {
          return;
       }
       boolean b = true;
       boolean b1 = (this.P() != null)? true: false;
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setShareJudgeAssistIfNoServiceLink openAssist="+p0+" hasSericeLink="+b1, objArray);
       i b2 = this.a.b;
       if (!p0 || b1) {
          b = false;
       }
       b2.a1 = b;
       return;
    }
    public boolean U(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "232");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       VideoContext.b();
       boolean b = (this.a.c != null && (this.w() != null && this.w().length))? true: false;
       return b;
    }
    public VideoContext U0(ExifInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       if (p0 != null) {
          this.a.b.e = p0.toPhotoMeta();
       }
       return this;
    }
    public VideoContext U1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "178");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.n = TextUtils.k(p0);
       return this;
    }
    public boolean V(){
       i d = this.a.d;
       boolean b = false;
       if (d == null) {
          return b;
       }
       e$h r = d.r;
       if (r != 1 && r != null) {
          b = true;
       }
       return b;
    }
    public VideoContext V0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.c = TextUtils.k(p0);
       if (!TextUtils.x(p0)) {
          long l = new File(p0).length();
          if (PatchProxy.isSupport(VideoContext.class) && PatchProxy.applyOneRefs(Long.valueOf(l), this, VideoContext.class, "139") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             this.a0();
             p0.d = l;
          }
       }
       return this;
    }
    public VideoContext V1(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.f0();
       this.a.b.k0 = p0.toString();
       return this;
    }
    public final void W(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "8")) {
          return;
       }
       VideoContext.b();
       this.X();
       i d = this.a.d;
       if (d.k == null) {
          d.k = new e$e();
       }
       return;
    }
    public VideoContext W0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.Y();
       this.a.d.j.a = TextUtils.k(p0);
       return this;
    }
    public VideoContext W1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "106");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.Y();
       this.a.d.j.i = p0;
       return this;
    }
    public final void X(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "6")) {
          return;
       }
       VideoContext.b();
       VideoContext ta = this.a;
       if (ta.d == null) {
          ta.d = new e$h();
       }
       this.a.d.f = 100;
       return;
    }
    public VideoContext X0(float p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, videoContext, "105");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.Y();
       this.a.d.j.b = p0;
       return this;
    }
    public VideoContext X1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       Objects.requireNonNull(p0);
       if (!p0.equals("fullScreen3")) {
          p0.a = (!p0.equals("normal1"))? 0: 2;
       }else {
          p0.a = 3;
       }
       return this;
    }
    public final void Y(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "104")) {
          return;
       }
       VideoContext.b();
       this.X();
       i d = this.a.d;
       if (d.j == null) {
          d.j = new e$i();
       }
       return;
    }
    public VideoContext Y0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "161");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.c.I = p0;
       return this;
    }
    public void Y1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoContext, "225")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.I0 = p0;
       return;
    }
    public final void Z(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "140")) {
          return;
       }
       VideoContext.b();
       this.f0();
       i b = this.a.b;
       if (b.g == null) {
          b.g = new m$k();
       }
       return;
    }
    public VideoContext Z0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "135");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.e.a = TextUtils.k(p0);
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setFromPage : fromPage = "+p0, objArray);
       return this;
    }
    public void Z1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoContext, "217")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.E0 = p0;
       return;
    }
    public VideoContext a(){
       i obj = PatchProxy.apply(null, this, VideoContext.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       obj = this.a.c;
       obj.d = obj.d + 1;
       return this;
    }
    public final void a0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "138")) {
          return;
       }
       VideoContext.b();
       this.f0();
       i b = this.a.b;
       if (b.f == null) {
          b.f = new m$w();
       }
       return;
    }
    public void a1(String p0,int p1){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, videoContext, "209")) {
          return;
       }
       VideoContext.b();
       if (!PatchProxy.applyVoid(null, this, videoContext, "215")) {
          VideoContext.b();
          videoContext = this.a;
          if (videoContext.b == null) {
             videoContext.b = new m$k0();
          }
          i b = this.a.b;
          if (b.j1 == null) {
             b.j1 = new m$i();
          }
       }
       Log.g("VideoContext", "setHotspotInfo: id = "+p0+", connectType = "+p1);
       this.F().b.j1.a = p0;
       p0.d = p1;
       return;
    }
    public VideoContext a2(){
       VideoContext obj = PatchProxy.apply(null, this, VideoContext.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a c = obj.c;
       _monitor_enter(c);
       a b = obj.b;
       if (b != null) {
          b.unregisterListener(obj);
          obj.b = null;
       }
       _monitor_exit(c);
       return this;
    }
    public void b0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "118")) {
          return;
       }
       VideoContext.b();
       this.f0();
       i b = this.a.b;
       if (b.u == null) {
          b.u = new m$a0();
       }
       return;
    }
    public VideoContext b1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "126");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.b.o = p0;
       return this;
    }
    public final void b2(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "54")) {
          return;
       }
       VideoContext.b();
       if (this.B() == null) {
          this.a.b.y = this.L();
          Log.g("VideoContext", "syncMusicSource not have editMusic ,source is record source: "+MusicSource.values()[this.L()]);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "216")) {
          return;
       }
       VideoContext.b();
       i b = this.a.b;
       if (b != null && b.j1 != null) {
          b.j1 = null;
       }
       return;
    }
    public final void c0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "213")) {
          return;
       }
       VideoContext.b();
       VideoContext ta = this.a;
       if (ta.b == null) {
          ta.b = new m$k0();
       }
       i b = this.a.b;
       if (b.x0 == null) {
          b.x0 = new m$x();
       }
       return;
    }
    public void c1(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "201")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "VideoContext";
       p3.D().w(str, "setImportParts photos "+Arrays.toString(p0), objArray);
       if (!p0.length) {
          return;
       }
       i b = this.a.b;
       if (b == null) {
          return;
       }
       m$k0 e = b.E;
       if (e != null && e.length > 0) {
          Object[] objArray1 = new Object[0];
          p3.D().w(str, "setImportParts importPart has init. ignore this call", objArray1);
          return;
       }else {
          objArray = new Object[0];
          p3.D().w(str, "setImportParts photos add import parts", objArray);
          ArrayList uArrayList = new ArrayList(p0.length);
          for (int i = 0; i < p0.length; i = i + 1) {
             m$n on = new m$n();
             on.g = p0[i];
             on.o = b.w;
             uArrayList.add(on);
          }
          m$n[] onArray = new m$n[0];
          b.E = uArrayList.toArray(onArray);
          return;
       }
    }
    public void c2(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "200")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "VideoContext";
       p3.D().w(str, "syncVideoInfoToImportParts\(\)", objArray);
       i b = this.a.b;
       if (b != null && b.w != null) {
          m$k0 e = b.E;
          if (e.length) {
             b.E = e;
             Object[] objArray1 = new Object[i];
             p3.D().w(str, "syncVideoInfoToImportParts importParts num="+e.length+" third party="+b.w, objArray1);
             int len = e.length;
             for (; i < len; i = i + 1) {
                e[i].o = b.w;
             }
          }
       }
       return;
    }
    public void d(){
       i b = this.a.b;
       if (b != null) {
          b.w0 = null;
       }
       return;
    }
    public final void d0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "90")) {
          return;
       }
       VideoContext.b();
       this.f0();
       i b = this.a.b;
       if (b.t == null) {
          b.t = new m$c0();
          this.a.b.t.d = -1;
       }
       return;
    }
    public VideoContext d1(VideoContext[] p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          try{
             obj.add(MessageNano.mergeFrom(new i(), MessageNano.toByteArray(oobject.d2(false))));
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e4){
             e4.printStackTrace();
          }
          i = i + 1;
       }
       i[] oiArray = new i[false];
       p0.g = obj.toArray(oiArray);
       return this;
    }
    public i d2(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "189");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       return this.a;
    }
    public VideoContext e(){
       Object[] objArray = null;
       VideoContext obj = PatchProxy.apply(objArray, this, VideoContext.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       Log.g("VideoContext", "clearMusic");
       obj = this.a;
       obj.d.i = objArray;
       obj.c.o = objArray;
       i b = obj.b;
       b.y = 0;
       b.n0 = 0;
       return this;
    }
    public final void e0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "24")) {
          return;
       }
       VideoContext.b();
       i b = this.a.b;
       if (b.w == null) {
          b.w = new m$j0();
       }
       return;
    }
    public void e1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoContext, "196")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.a.b.o0 = p0;
       return;
    }
    public VideoContext f(){
       VideoContext obj = PatchProxy.apply(null, this, VideoContext.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new VideoContext();
          obj.k0(MessageNano.toByteArray(this.a));
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "7")) {
          return;
       }
       VideoContext.b();
       VideoContext ta = this.a;
       if (ta.b == null) {
          ta.b = new m$k0();
       }
       return;
    }
    public VideoContext f1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "120");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.d.c = p0;
       return this;
    }
    public void g(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoContext, "226")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.L0 = p0;
       return;
    }
    public boolean g0(){
       i g = this.a.g;
       boolean b = (g != null && g.length)? true: false;
       return b;
    }
    public VideoContext g1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "159");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.c.T = p0;
       return this;
    }
    public boolean h0(){
       i b = this.a.b;
       boolean b1 = (b != null && b.I != null)? true: false;
       return b1;
    }
    public VideoContext h1(m$p p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.I = p0;
       return this;
    }
    public String i(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, VideoContext.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj == null) {
          return objArray;
       }
       return h.a.a(obj.x);
    }
    public boolean i0(){
       boolean b1;
       i b = this.a.b;
       if (b != null) {
          m$k0 a = b.A;
          if (a != null && a.d != null) {
             b1 = true;
          label_0011 :
             return b1;
          }
       }
       b1 = false;
       goto label_0011 ;
    }
    public VideoContext i1(m$p p0,String p1){
       m$n obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoContext.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.I = p0;
       obj = f.b(this, p1);
       if (obj == null) {
          PostUtils.D("VideoContext", "setKuaishanVideo", new IllegalStateException("cant find importPart for "+p1));
       }else {
          obj.q = p0;
          Log.g("VideoContext", "setKuaishanVideo: set importpart.kuaishanVideo size="+p0);
       }
       return this;
    }
    public int j(){
       VideoContext ta = this.a;
       if (ta != null) {
          i b = ta.b;
          if (b != null) {
             m$k0 t = b.T;
             if (t != null) {
                return t.a;
             }
          }
       }
       return 0;
    }
    public boolean j0(){
       i b = this.a.b;
       boolean b1 = (b != null && b.q != null)? true: false;
       return b1;
    }
    public void j1(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoContext.class, "221")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.N0 = p0;
       p0.M0 = p1;
       return;
    }
    public float k(){
       i d = this.a.d;
       if (d != null) {
          return d.d;
       }
       return 0;
    }
    public void k0(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "193")) {
          return;
       }
       VideoContext ta = this.a;
       Object obj = PatchProxy.applyTwoRefs(ta, p0, null, b.class, "26");
       i oi = (obj != PatchProxyResult.class)? obj: MessageNano.mergeFrom(ta, p0);
    }
    public void k1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "197")) {
          return;
       }
       this.f0();
       if (TextUtils.x(p0)) {
          p0.w0 = null;
          return;
       }else {
          m$q oq = new m$q();
          oq.a = p0;
          p0.w0 = oq;
          return;
       }
    }
    public String l(){
       k$j p = this.a.c.p;
       if (p == 1) {
          return "ks";
       }
       if (p != 2) {
          return "";
       }
       return "arc";
    }
    public VideoContext l0(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.v = null;
       return this;
    }
    public VideoContext l1(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, VideoContext.class, "28");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       VideoContext.b();
       i a = this.a.a;
       a.b = "";
       a.c = "";
       return this;
    }
    public byte[] m(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "190");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       return MessageNano.toByteArray(this.a);
    }
    public void m0(){
       String str = "0";
       if (PatchProxy.applyVoid(null, this, VideoContext.class, "4")) {
          return;
       }
       i oi = h.e();
       try{
          this.a = oi;
          Application uApplication = a.a().a();
          if (p0.F(uApplication)) {
             this.a.a.d = 1;
          }else if(!TextUtils.n(p0.g(uApplication), "unknown")){
             this.a.a.d = 2;
          }else {
             this.a.a.d = 0;
          }
          oi = this.a.a;
          oi.b = str;
          oi.c = str;
          oi.a = TextUtils.k(QCurrentUser.me().getId());
          this.a.a.e = (long)(int)(System.currentTimeMillis() / 1000);
       }catch(java.lang.Exception e0){
          i1.c(e0);
       }
       return;
    }
    public VideoContext m1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "127");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.b.q = p0;
       return this;
    }
    public List n(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VideoContext obj = PatchProxy.apply(objArray, this, VideoContext.class, "75");
       if (obj != patchProxyRe) {
          return obj;
       }
       VideoContext.b();
       obj = this.a;
       ArrayList uArrayList = PatchProxy.applyOneRefs(obj, objArray, b.class, "3");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          e$h o = obj.d.O;
          if (o != null && o.length) {
             int len = o.length;
             for (int i = 0; i < len; i = i + 1) {
                uArrayList.add(b.p(o[i]));
             }
          }
       }
       return uArrayList;
    }
    public VideoContext n0(double p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, videoContext, "64");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       try{
          this.W();
          this.a.d.k.t = (int)(p0 * 0x408f400000000000);
       }catch(java.lang.NumberFormatException e4){
          e4.printStackTrace();
       }
       return this;
    }
    public VideoContext n1(List p0,List p1,q$b p2,List p3,boolean p4){
       ArrayList obj1;
       int i2;
       int i6;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       VideoContext videoContext = VideoContext.class;
       int i = 0;
       if (PatchProxy.isSupport(videoContext)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Boolean.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, videoContext, "71");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p4) {
          VideoContext.b();
       }
       obj1 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       if (q.f(p1)) {
          int i1 = 0;
          while (i1 < p0.size()) {
             if (oobject.get(i1) != null) {
                String str = (oobject3 != null && i1 < p3.size())? oobject3.get(i1): null;
                k$e uoe = b.n(oobject.get(i1), 0, 0, str);
                if (oobject2.a(oobject.get(i1))) {
                   uArrayList.add(uoe);
                }else {
                   obj1.add(uoe);
                }
             }
             i1 = i1 + 1;
          }
       }else if(p0.size() == p1.size()){
          i2 = p0.size();
       }else {
          i2 = Math.min(p0.size(), p1.size());
       }
       int i3 = 0;
       int i4 = 0;
       while (i3 < i2) {
          int i5 = oobject1.get(i3).intValue();
          if (i5 > 0 && oobject.get(i3) != null) {
             String str1 = (oobject3 != null && i3 < p3.size())? oobject3.get(i3): null;
             i6 = i2;
             k$e uoe1 = b.n(oobject.get(i3), (long)i4, (long)i5, str1);
             i2 = i3;
             if (oobject2.a(oobject.get(i2))) {
                uArrayList.add(uoe1);
             }else {
                obj1.add(uoe1);
             }
             i4 = i4 + i5;
          }else {
             i6 = i2;
             i2 = i3;
          }
          i3 = i2 + 1;
          i2 = i6;
          long l = 0;
       }
       k$e[] uoeArray = new k$e[0];
       obj.a.c.u = obj1.toArray(uoeArray);
       k$e[] uoeArray1 = new k$e[0];
       obj.a.c.Q = uArrayList.toArray(uoeArray1);
       return obj;
    }
    public int o(){
       i b = this.a.b;
       m$k0 y = (b != null)? b.y: 0;
       return y;
    }
    public VideoContext o0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       Log.b("VideoContext", "setActivity activity: "+p0);
       this.a.b.x = h.a.a(p0);
       return this;
    }
    public VideoContext o1(k$e[] p0,String p1){
       m$n obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoContext.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.length) {
          return this;
       }
       int i = 30;
       if (p0.length > i) {
          p0 = Arrays.copyOfRange(p0, 0, i);
          PostUtils.D("VideoContext", "setMagicEmoji\(\) ", new RuntimeException("too many magic len="+p0.length));
       }
       VideoContext.b();
       this.a.c.u = p0;
       obj = f.b(this, p1);
       if (obj == null) {
          PostUtils.D("VideoContext", "setMagicEmoji", new IllegalStateException("cant find importPart for "+p1));
       }else {
          obj.p = p0;
          Log.g("VideoContext", "setMagicEmoji: set importpart.magicEmojis size="+p0.length);
       }
       return this;
    }
    public long p(){
       i b = this.a.b;
       if (b != null) {
          m$k0 g = b.g;
          if (g != null) {
             return g.d;
          }
       }
       return 0;
    }
    public VideoContext p0(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "160");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.c.U = p0;
       return this;
    }
    public VideoContext p1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "56");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.e.b = p0;
       return this;
    }
    public String q(){
       i c = this.a.c;
       if (c != null) {
          return c.R;
       }
       return null;
    }
    public VideoContext q0(boolean p0){
       i obj;
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "96");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       videoContext = this.a;
       videoContext.e.d = p0;
       obj = videoContext.b;
       if (obj != null) {
          m$k0 t = obj.t;
          if (t != null) {
             t.f = p0;
          }
       }
       return this;
    }
    public VideoContext q1(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       b.m(this.a, p0);
       return this;
    }
    public String r(){
       i b = this.a.b;
       if (b != null) {
          return b.c;
       }
       return "";
    }
    public VideoContext r0(int p0,Size[] p1,Size[] p2){
       if (PatchProxy.isSupport(VideoContext.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, VideoContext.class, "164");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       b.k(this.a, p0, p1, p2, null, null);
       return this;
    }
    public VideoContext r1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.b.a = TextUtils.k(p0);
       return this;
    }
    public String s(){
       i d = this.a.d;
       if (d != null) {
          e$h j = d.j;
          if (j != null) {
             return j.a;
          }
       }
       return null;
    }
    public VideoContext s0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "59");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.b.r = p0;
       return this;
    }
    public VideoContext s1(k$i[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       if (p0 != null) {
          this.a.c.r = p0;
       }
       return this;
    }
    public List t(){
       ArrayList obj = PatchProxy.apply(null, this, VideoContext.class, "134");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LinkedBlockingDeque linkedBlocki = new LinkedBlockingDeque();
       linkedBlocki.add(this);
       while (!linkedBlocki.isEmpty()) {
          VideoContext videoContext = linkedBlocki.poll();
          if (videoContext != null) {
             VideoContext a = videoContext.a;
             ArrayList uArrayList = PatchProxy.applyOneRefs(a, this, VideoContext.class, "133");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
                i g = a.g;
                if (g != null && g.length > 0) {
                   for (int i = 0; i < a.g.length; i = i + 1) {
                      VideoContext videoContext1 = new VideoContext();
                      videoContext1.k0(MessageNano.toByteArray(a.g[i]));
                      uArrayList.add(videoContext1);
                   }
                }
             }
             linkedBlocki.addAll(uArrayList);
          }
          obj.add(videoContext);
       }
       return obj;
    }
    public void t0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "202")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setBeautifySdkInfo\(\) beautySdkInfo="+p0, objArray);
       if (p0 == null) {
          p0.Q = "";
          return;
       }else {
          this.a.d.Q = p0;
          return;
       }
    }
    public VideoContext t1(double p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, videoContext, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.d.x = p0;
       return this;
    }
    public m$p u(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       return this.a.b.I;
    }
    public VideoContext u0(k$c[] p0,boolean p1){
       i obj;
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, videoContext, "102");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       obj = this.a.c;
       obj.H = p0;
       obj.G = p1;
       return this;
    }
    public VideoContext u1(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.e.c = p0;
       return this;
    }
    public String v(){
       i b = this.a.b;
       if (b != null) {
          m$k0 w0 = b.w0;
          if (w0 != null) {
             return w0.a;
          }
       }
       return null;
    }
    public VideoContext v0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "155");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       if (!TextUtils.x(p0)) {
          try{
             h.a(this.a, new JSONArray(p0));
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
       }
    }
    public VideoContext v1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.a.d.e = TextUtils.k(p0);
       return this;
    }
    public k$e[] w(){
       Object obj = PatchProxy.apply(null, this, VideoContext.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       return this.a.c.u;
    }
    public VideoContext w0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       p0.a = (p0)? 1: 2;
       return this;
    }
    public void w1(int p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoContext, "222")) {
          return;
       }
       VideoContext.b();
       this.f0();
       this.F().b.J0 = p0;
       return;
    }
    public List x(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VideoContext obj = PatchProxy.apply(objArray, this, VideoContext.class, "74");
       if (obj != patchProxyRe) {
          return obj;
       }
       VideoContext.b();
       obj = this.a;
       ArrayList uArrayList = PatchProxy.applyOneRefs(obj, objArray, b.class, "2");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          k$j u = obj.c.u;
          if (u != null && u.length) {
             int len = u.length;
             for (int i = 0; i < len; i = i + 1) {
                uArrayList.add(b.p(u[i]));
             }
          }
       }
       return uArrayList;
    }
    public VideoContext x0(boolean p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoContext, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a.c.b = p0;
       return this;
    }
    public VideoContext x1(long p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, videoContext, "146");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       this.a0();
       if (p0 - null <= 0) {
          Object[] objArray = new Object[0];
          p3.D().w("VideoContext", "setOriginDuration return duration:"+p0, objArray);
          return this;
       }else {
          this.a.b.f.c = p0;
          return this;
       }
    }
    public String y(){
       i obj = PatchProxy.apply(null, this, VideoContext.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       obj = this.a.b;
       if (obj == null) {
          return null;
       }
       return obj.a;
    }
    public void y0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoContext.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("VideoContext", "setCoCreator\(\) "+p0, objArray);
       if (TextUtils.x(p0)) {
          p0.k1 = null;
          return;
       }else {
          VideoContext.b();
          this.f0();
          String[] stringArray = new String[]{p0};
          this.a.b.k1 = stringArray;
          return;
       }
    }
    public VideoContext y1(String p0){
       i obj = PatchProxy.applyOneRefs(p0, this, VideoContext.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b;
       if (obj != null) {
          m$k0 w = obj.w;
          if (w != null && TextUtils.n(w.b, p0)) {
             Object[] objArray = new Object[0];
             p3.D().w("VideoContext", "setOtherAppID  already has value="+p0, objArray);
             return this;
          }
       }
       this.z1(p0, null);
       return this;
    }
    public k$i[] z(){
       String obj = PatchProxy.apply(null, this, VideoContext.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.b.a();
          if (!TextUtils.x(obj)) {
             return b.d(new JSONArray(obj));
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return null;
    }
    public VideoContext z0(int p0){
       i obj;
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.isSupport(videoContext)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoContext, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       VideoContext.b();
       obj = this.a.d;
       if (obj.i == null) {
          obj.i = new j$a();
       }
       this.a.d.i.m = p0;
       return this;
    }
    public VideoContext z1(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoContext.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoContext.b();
       this.e0();
       this.a.b.w.b = TextUtils.k(p0);
       p0.d = TextUtils.k(p1);
       return this;
    }
}
