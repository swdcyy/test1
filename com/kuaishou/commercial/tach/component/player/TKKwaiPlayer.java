package com.kuaishou.commercial.tach.component.player.TKKwaiPlayer;
import xx6.f$b;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.wayne.player.listeners.OnProgressChangeListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import java.lang.Throwable;
import zp8.a;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.video.wayne.player.main.PlayerState;
import rz.b;
import rz.b$a;
import java.lang.Enum;
import java.util.Map;
import java.util.HashMap;
import iq8.n;
import java.lang.Integer;
import com.kuaishou.commercial.tach.component.player.TKPlayerError;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import wp8.a;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Boolean;
import com.kwai.video.player.IMediaPlayer;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.kuaishou.commercial.tach.component.player.TKKwaiPlayer$b;
import java.lang.Runnable;
import iq8.x;
import java.lang.Float;
import xx6.e;
import com.kuaishou.commercial.tach.component.player.TKKwaiPlayer$a;
import java.lang.Long;
import com.kwai.video.wayne.player.main.RetryInfo;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Math;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$PlayerDataType;
import uz.a;
import com.tkruntime.v8.V8Value;
import com.kwai.video.wayne.player.main.IPlayerListener;
import px6.b;
import xx6.f;
import com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$ScaleType;
import wx6.d;
import com.tkruntime.v8.V8Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import tx4.x;
import iq8.d;
import com.yxcorp.gifshow.model.CDNUrl;

public class TKKwaiPlayer extends e implements f$b, IMediaPlayer$OnVideoSizeChangedListener, OnProgressChangeListener, IMediaPlayer$OnInfoListener, IMediaPlayer$OnPreparedListener, OnPauseListener, OnStartListener, IMediaPlayer$OnCompletionListener, OnWayneErrorListener, OnPlayerLoadingChangedListener	// class@00166e
{
    public String bizType;
    public QPhoto feed;
    public boolean mute;
    public V8Function onCompletion;
    public JsValueRef onCompletionRef;
    public V8Function onEnd;
    public JsValueRef onEndRef;
    public V8Function onError;
    public JsValueRef onErrorRef;
    public V8Function onInfoChanged;
    public JsValueRef onInfoChangedRef;
    public V8Function onLoadingStateChanged;
    public JsValueRef onLoadingStateChangedRef;
    public V8Function onPause;
    public JsValueRef onPauseRef;
    public V8Function onPrepared;
    public JsValueRef onPreparedRef;
    public V8Function onProgress;
    public JsValueRef onProgressRef;
    public V8Function onRenderFirstAudioFrame;
    public JsValueRef onRenderFirstAudioFrameRef;
    public V8Function onRenderFirstVideoFrame;
    public JsValueRef onRenderFirstVideoFrameRef;
    public V8Function onSessionReport;
    public JsValueRef onSessionReportRef;
    public V8Function onSizeChanged;
    public JsValueRef onSizeChangedRef;
    public V8Function onStart;
    public JsValueRef onStartRef;
    public String registerTag;
    public boolean repeat;
    public int scaleType;
    public d sessionKeyGenerator;
    public V8Array sourceList;
    public float speed;
    public TKPlayerController v;
    public V8Object videoStatEvent;
    public float volume;
    public int w;
    public int x;
    public List y;

    public void TKKwaiPlayer(f p0){
       super(p0);
       this.w = -1;
       this.x = -1;
       this.repeat = true;
       this.volume = 0xbf800000;
       this.scaleType = 0;
       this.speed = 0x3f800000;
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public KwaiPlayerKitView createViewInstance(Context p0){
       KwaiPlayerKitView obj = PatchProxy.applyOneRefs(p0, this, TKKwaiPlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiPlayerKitView(p0);
       obj.c();
       TKPlayerController tKPlayerCont = new TKPlayerController(obj);
       this.v = tKPlayerCont;
       String str = this.getTKJSContext().e();
       Objects.requireNonNull(tKPlayerCont);
       if (!PatchProxy.applyVoidOneRefs(str, tKPlayerCont, TKPlayerController.class, "20") && !TextUtils.equals(tKPlayerCont.j, str)) {
          tKPlayerCont.m = false;
          tKPlayerCont.j = str;
       }
       return obj;
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "47")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(null, tv, TKPlayerController.class, "44")) {
             tv.n = true;
             try{
                tv.g();
                tv.b.removeOnLayoutChangeListener(tv);
             }catch(java.lang.Exception e2){
                a.g("TKPlayerController", e2);
             }
             tv.w = null;
             tv.x = null;
             tv.y = null;
             tv.z = null;
             tv.A = null;
             tv.B = null;
             tv.C = null;
             tv.D = null;
             tv.E = null;
             tv.v = null;
             tv.e = null;
             tv.d = null;
             tv.c = null;
             tv.f = null;
          }
          this.v = null;
       }
       return;
    }
    public float getCurrentPosition(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TKKwaiPlayer obj = PatchProxy.apply(objArray, this, TKKwaiPlayer.class, "32");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = this.v;
       if (obj == null) {
          return 0;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, TKPlayerController.class, "29");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          TKPlayerController f = obj.f;
          l = (f == null)? 0: f.getCurrentPosition();
       }
       return (float)l;
    }
    public int getCurrentState(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TKKwaiPlayer obj = PatchProxy.apply(objArray, this, TKKwaiPlayer.class, "30");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.v;
       int i = -1;
       if (obj == null) {
          return i;
       }
       PlayerState playerState = obj.f();
       if (playerState == null) {
          return i;
       }
       Object obj1 = PatchProxy.applyOneRefs(playerState, objArray, b.class, "1");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          switch (b$a.a[playerState.ordinal()]){
              case 1:
                i = 0;
                break;
              case 2:
                i = 1;
                break;
              case 3:
                i = 2;
                break;
              case 4:
                i = 3;
                break;
              case 5:
                i = 4;
                break;
              case 6:
                i = 5;
                break;
              case 7:
                i = 6;
                break;
              case 8:
                i = 7;
                break;
              case 9:
                i = 8;
                break;
              case 10:
                i = 9;
                break;
              case 11:
                i = 10;
                break;
              default:
          }
          i1 = i;
       }
       return i1;
    }
    public float getDuration(){
       TKKwaiPlayer obj = PatchProxy.apply(null, this, TKKwaiPlayer.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.v;
       if (obj == null) {
          return 0;
       }
       return (float)obj.d();
    }
    public Map getVideoSize(){
       int i1;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, TKKwaiPlayer.class, "33");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       TKKwaiPlayer tv = this.v;
       int i = 0;
       if (tv != null) {
          Objects.requireNonNull(tv);
          TKKwaiPlayer obj1 = PatchProxy.apply(objArray, tv, TKPlayerController.class, "30");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else {
             TKPlayerController f1 = tv.f;
             i1 = (f1 == null)? 0: f1.getVideoWidth();
          }
          i1 = n.f(i1);
          obj1 = this.v;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.apply(objArray, obj1, TKPlayerController.class, "31");
          if (obj2 != patchProxyRe) {
             i = obj2.intValue();
          }else {
             TKPlayerController f = obj1.f;
             if (f != null) {
                i = f.getVideoHeight();
             }
          }
          i2 = n.f(i);
          i = i1;
       }else {
          i2 = 0;
       }
       obj.put("width", Integer.valueOf(i));
       obj.put("height", Integer.valueOf(i2));
       return obj;
    }
    public final void m(TKPlayerError p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "44")) {
          return;
       }
       if (p0 == null) {
          a.j("TKKwaiPlayer", "onError: error is null");
          return;
       }else {
          TKKwaiPlayer tonErrorRef = this.onErrorRef;
          if (tonErrorRef != null && y.a(tonErrorRef.get())) {
             Object[] objArray = new Object[]{Integer.valueOf(p0.getCode()),p0.getMessage()};
             this.onErrorRef.get().call(null, objArray);
          }
       label_0050 :
          return;
       }
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "6")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv == null) {
          return;
       }
       tv.i(this.repeat);
       this.v.k(this.mute);
       this.v.m(this.volume);
       this.v.l(this.speed);
       return;
    }
    public void onChanged(boolean p0,LoadingType p1){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, tKKwaiPlayer, "42")) {
          return;
       }
       TKKwaiPlayer tonLoadingSt = this.onLoadingStateChangedRef;
       if (tonLoadingSt != null && y.a(tonLoadingSt.get())) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          this.onLoadingStateChangedRef.get().call(null, objArray);
       }
    label_0045 :
       return;
    }
    public void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "41")) {
          return;
       }
       TKKwaiPlayer tonCompletio = this.onCompletionRef;
       if (tonCompletio != null && y.a(tonCompletio.get())) {
          Object[] objArray = new Object[0];
          this.onCompletionRef.get().call(null, objArray);
       }
    label_0034 :
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKKwaiPlayer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKKwaiPlayer.class, "46")) {
          return;
       }
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKKwaiPlayer$b(this));
       }
       return;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       TKKwaiPlayer tonEndRef;
       Object[] objArray;
       if (PatchProxy.isSupport(TKKwaiPlayer.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKKwaiPlayer.class, "37");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          tonEndRef = this.onEndRef;
          if (tonEndRef != null && y.a(tonEndRef.get())) {
             objArray = new Object[false];
             this.onEndRef.get().call(null, objArray);
          }
       label_0052 :
          return false;
       }else if(p1 == 3){
          tonEndRef = this.onRenderFirstVideoFrameRef;
          if (tonEndRef != null && y.a(tonEndRef.get())) {
             objArray = new Object[false];
             this.onRenderFirstVideoFrameRef.get().call(null, objArray);
          }
       label_007d :
          return false;
       }else if(p1 == 0x2712){
          tonEndRef = this.onRenderFirstAudioFrameRef;
          if (tonEndRef != null && y.a(tonEndRef.get())) {
             objArray = new Object[false];
             this.onRenderFirstAudioFrameRef.get().call(null, objArray);
          }
       label_00a9 :
          return false;
       }else {
          tonEndRef = this.onInfoChangedRef;
          if (tonEndRef != null && y.a(tonEndRef.get())) {
             Object[] objArray1 = new Object[]{Integer.valueOf(p1)};
             this.onInfoChangedRef.get().call(null, objArray1);
          }
       label_00d8 :
          return false;
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "40")) {
          return;
       }
       TKKwaiPlayer tonPauseRef = this.onPauseRef;
       if (tonPauseRef != null && y.a(tonPauseRef.get())) {
          Object[] objArray = new Object[0];
          this.onPauseRef.get().call(null, objArray);
       }
    label_0034 :
       return;
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "38")) {
          return;
       }
       TKKwaiPlayer tonPreparedR = this.onPreparedRef;
       if (tonPreparedR != null && y.a(tonPreparedR.get())) {
          long l = 0;
          if (p0 != null) {
             l = (float)p0.getDuration();
          }
          Object[] objArray = new Object[]{Float.valueOf(l)};
          this.onPreparedRef.get().call(null, objArray);
       }
    label_0043 :
       return;
    }
    public void onSessionReport(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "34")) {
          return;
       }
       x.f(new TKKwaiPlayer$a(this, p0));
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "39")) {
          return;
       }
       TKKwaiPlayer tonStartRef = this.onStartRef;
       if (tonStartRef != null && y.a(tonStartRef.get())) {
          Object[] objArray = new Object[0];
          this.onStartRef.get().call(null, objArray);
       }
    label_0034 :
       return;
    }
    public void onVideoProgressChanged(Long p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKKwaiPlayer.class, "36")) {
          return;
       }
       TKKwaiPlayer tonProgressR = this.onProgressRef;
       if (tonProgressR == null || (!y.a(tonProgressR.get()) || (p0 != null && p1 != null))) {
          Object[] objArray = new Object[]{Float.valueOf(p0.floatValue()),Float.valueOf(p1.floatValue())};
          this.onProgressRef.get().call(null, objArray);
       }
    label_004e :
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(TKKwaiPlayer.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TKKwaiPlayer.class, "35")) {
             return;
          }
       }
       TKKwaiPlayer tonSizeChang = this.onSizeChangedRef;
       if (tonSizeChang != null && y.a(tonSizeChang.get())) {
          if (this.w == p1 && this.x == p2) {
             return;
          }else {
             this.w = p1;
             this.x = p2;
             Object[] objArray1 = new Object[]{Float.valueOf(n.g((float)p1)),Float.valueOf(n.g((float)p2))};
             this.onSizeChangedRef.get().call(null, objArray1);
          }
       }
       return;
    }
    public void onWayneError(RetryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "43")) {
          return;
       }
       if (p0 == null) {
          a.j("TKKwaiPlayer", "onWayneError: extra is null");
          return;
       }else {
          TKKwaiPlayer tonErrorRef = this.onErrorRef;
          if (tonErrorRef != null && y.a(tonErrorRef.get())) {
             String message = (p0.getError() != null)? p0.getError().getMessage(): null;
             if (message == null) {
                message = "";
             }
             Object[] objArray = new Object[]{Integer.valueOf(p0.getWhat()),message};
             this.onErrorRef.get().call(null, objArray);
          }
       label_0060 :
          return;
       }
    }
    public void pause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKKwaiPlayer.class, "27")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv == null) {
          return;
       }
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(objArray, tv, TKPlayerController.class, "24")) {
          tv.p = false;
          TKPlayerController f = tv.f;
          if (f != null) {
             try{
                f.pause();
             }catch(java.lang.Exception e0){
                a.g("TKPlayerController", e0);
             }
          }
       }
    }
    public void play(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKKwaiPlayer.class, "26")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv == null) {
          return;
       }
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(objArray, tv, TKPlayerController.class, "23")) {
          TKPlayerController f = tv.f;
          boolean b = false;
          if (f == null || tv.o != null) {
             tv.p = b;
          }else {
             tv.p = f.isPlaying() ^ 0x01;
             if (tv.f.isPrepared()) {
                tv.o = b;
                try{
                   tv.f.start();
                }catch(java.lang.Exception e0){
                   a.g("TKPlayerController", e0);
                }
             }else if(tv.f() == PlayerState.Error){
                try{
                   tv.f.retryPlayback("Error");
                }catch(java.lang.Exception e0){
                   a.g("TKPlayerController", e0);
                }
             }
          }
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "29")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv == null) {
          return;
       }
       tv.g();
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "28")) {
          return;
       }
       TKKwaiPlayer tv = this.v;
       if (tv == null) {
          return;
       }
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(null, tv, TKPlayerController.class, "25")) {
          tv.p = false;
          tv.o = true;
          try{
             tv.b.reset();
          }catch(java.lang.Exception e2){
             a.g("TKPlayerController", e2);
          }
          tv.h = null;
          tv.g = null;
       }
       return;
    }
    public void seekTo(long p0){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, tKKwaiPlayer, "25")) {
          return;
       }
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null && p0 - null >= 0) {
          p0 = Math.min(tKKwaiPlayer.d(), p0);
          tKKwaiPlayer = this.v;
          Objects.requireNonNull(tKKwaiPlayer);
          if (!PatchProxy.isSupport(TKPlayerController.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), tKKwaiPlayer, TKPlayerController.class, "27")) {
             TKPlayerController f = tKKwaiPlayer.f;
             if (f != null) {
                try{
                   f.seekTo(p0);
                }catch(java.lang.Exception e5){
                   a.g("TKPlayerController", e5);
                }
             }
          }
       }
    }
    public void setBizType(String p0){
       this.bizType = p0;
    }
    public void setFeed(QPhoto p0,int p1,long p2,Object p3){
       if (PatchProxy.isSupport(TKKwaiPlayer.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), p3, this, TKKwaiPlayer.class, "2")) {
          return;
       }
       String str = "TKKwaiPlayer";
       if (p0 == null) {
          a.h(str, "setFeed: use test feed data");
          this.m(TKPlayerError.FEED_INVALID);
          return;
       }else {
          this.feed = p0;
          TKKwaiPlayer tv = this.v;
          if (tv == null) {
             a.h(str, "setFeed: mPlayerController is null");
             this.m(TKPlayerError.UNKNOWN);
             return;
          }else {
             tv.c(p0, TKPlayerController$PlayerDataType.Q_PHOTO, p1, p2, b.a(p3));
             this.n();
             return;
          }
       }
    }
    public void setMute(boolean p0){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKKwaiPlayer, "9")) {
          return;
       }
       this.mute = p0;
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null) {
          tKKwaiPlayer.k(p0);
       }
       return;
    }
    public void setOnCompletion(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "15")) {
          return;
       }
       y.c(this.onCompletionRef);
       this.onCompletionRef = y.b(p0, this);
       this.onCompletion = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "14")) {
                TKPlayerController d = tv.D;
                if (d != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (d != null) {
                         f.removeOnCompletionListener(d);
                      }
                      tv.f.addOnCompletionListener(this);
                   }
                   tv.D = this;
                }
             }
          }
       }
       return;
    }
    public void setOnEndCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "13")) {
          return;
       }
       y.c(this.onEndRef);
       this.onEndRef = y.b(p0, this);
       this.onEnd = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             tv.j(this);
          }
       }
       return;
    }
    public void setOnErrorCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "16")) {
          return;
       }
       y.c(this.onErrorRef);
       this.onErrorRef = y.b(p0, this);
       this.onError = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "15")) {
                TKPlayerController e = tv.E;
                if (e != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (e != null) {
                         f.removeOnWayneErrorListener(e);
                      }
                      tv.f.addOnWayneErrorListener(this);
                   }
                   tv.E = this;
                }
             }
          }
       }
       return;
    }
    public void setOnInfoChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "20")) {
          return;
       }
       y.c(this.onInfoChangedRef);
       this.onInfoChangedRef = y.b(p0, this);
       this.onInfoChanged = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             tv.j(this);
          }
       }
       return;
    }
    public void setOnLoadingStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "23")) {
          return;
       }
       y.c(this.onLoadingStateChangedRef);
       this.onLoadingStateChangedRef = y.b(p0, this);
       this.onLoadingStateChanged = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "10")) {
                TKPlayerController z = tv.z;
                if (z != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (z != null) {
                         f.removeOnPlayerLoadingChangedListener(z);
                      }
                      tv.f.addOnPlayerLoadingChangedListener(this);
                   }
                   tv.z = this;
                }
             }
          }
       }
       return;
    }
    public void setOnPause(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "22")) {
          return;
       }
       y.c(this.onPauseRef);
       this.onPauseRef = y.b(p0, this);
       this.onPause = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "13")) {
                TKPlayerController b = tv.B;
                if (b != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (b != null) {
                         f.removeOnPauseListener(b);
                      }
                      tv.f.addOnPauseListener(this);
                   }
                   tv.B = this;
                }
             }
          }
       }
       return;
    }
    public void setOnPrepared(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "21")) {
          return;
       }
       y.c(this.onPreparedRef);
       this.onPreparedRef = y.b(p0, this);
       this.onPrepared = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "11")) {
                TKPlayerController a = tv.A;
                if (a != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (a != null) {
                         f.removeOnPreparedListener(a);
                      }
                      tv.f.addOnPreparedListener(this);
                   }
                   tv.A = this;
                }
             }
          }
       }
       return;
    }
    public void setOnProgressCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "12")) {
          return;
       }
       y.c(this.onProgressRef);
       this.onProgressRef = y.b(p0, this);
       this.onProgress = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "8") && tv.x != this) {
                tv.x = this;
                TKPlayerController f = tv.f;
                if (f != null) {
                   f.removeOnProgressChangeListener(this);
                   tv.f.addOnProgressChangeListener(this);
                }
                tv.x = this;
             }
          }
       }
       return;
    }
    public void setOnRenderFirstAudioFrame(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "19")) {
          return;
       }
       y.c(this.onRenderFirstAudioFrameRef);
       this.onRenderFirstAudioFrameRef = y.b(p0, this);
       this.onRenderFirstAudioFrame = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             tv.j(this);
          }
       }
       return;
    }
    public void setOnRenderFirstVideoFrame(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "18")) {
          return;
       }
       y.c(this.onRenderFirstVideoFrameRef);
       this.onRenderFirstVideoFrameRef = y.b(p0, this);
       this.onRenderFirstVideoFrame = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             tv.j(this);
          }
       }
       return;
    }
    public void setOnSessionReport(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "24")) {
          return;
       }
       y.c(this.onSessionReportRef);
       this.onSessionReportRef = y.b(p0, this);
       this.onSessionReport = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "6") && tv.v != this) {
                f uof = tv.e().h();
                TKPlayerController v = tv.v;
                if (v != null && uof != null) {
                   uof.m(v);
                }
                tv.v = this;
                if (uof != null) {
                   uof.l(this);
                }
             }
          }
       }
       return;
    }
    public void setOnSizeChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "17")) {
          return;
       }
       y.c(this.onSizeChangedRef);
       this.onSizeChangedRef = y.b(p0, this);
       this.onSizeChanged = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "7")) {
                TKPlayerController w = tv.w;
                if (w != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (w != null) {
                         f.removeOnVideoSizeChangedListener(w);
                      }
                      tv.f.addOnVideoSizeChangedListener(this);
                   }
                   tv.w = this;
                }
             }
          }
       }
       return;
    }
    public void setOnStart(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "14")) {
          return;
       }
       y.c(this.onStartRef);
       this.onStartRef = y.b(p0, this);
       this.onStart = p0;
       if (p0 != null) {
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(this, tv, TKPlayerController.class, "12")) {
                TKPlayerController c = tv.C;
                if (c != this) {
                   TKPlayerController f = tv.f;
                   if (f != null) {
                      if (c != null) {
                         f.removeOnStartListener(c);
                      }
                      tv.f.addOnStartListener(this);
                   }
                   tv.C = this;
                }
             }
          }
       }
       return;
    }
    public void setRegisterTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "5")) {
          return;
       }
       this.registerTag = p0;
       TKKwaiPlayer tv = this.v;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(p0, tv, TKPlayerController.class, "19")) {
             tv.b.setRegisterTag(p0);
          }
       }
       return;
    }
    public void setRepeat(boolean p0){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKKwaiPlayer, "7")) {
          return;
       }
       this.repeat = p0;
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null) {
          tKKwaiPlayer.i(p0);
       }
       return;
    }
    public void setScaleType(int p0){
       TKPlayerController$ScaleType fIX_XY;
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKKwaiPlayer, "10")) {
          return;
       }
       this.scaleType = p0;
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null) {
          if (p0 != 1) {
             fIX_XY = (p0 != 2)? TKPlayerController$ScaleType.FIX_XY: TKPlayerController$ScaleType.CENTER_CROP;
          }else {
             fIX_XY = TKPlayerController$ScaleType.CENTER_INSIDE;
          }
          Objects.requireNonNull(tKKwaiPlayer);
          if (!PatchProxy.applyVoidOneRefs(fIX_XY, tKKwaiPlayer, TKPlayerController.class, "21")) {
             TKPlayerController tKPlayerCont = (tKKwaiPlayer.u != fIX_XY)? 1: null;
             tKKwaiPlayer.u = fIX_XY;
             if (tKPlayerCont) {
                tKKwaiPlayer.b(tKKwaiPlayer.q, tKKwaiPlayer.r, 1);
             }
          }
       }
    label_0049 :
       return;
    }
    public void setSessionKeyGenerator(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiPlayer.class, "4")) {
          return;
       }
       if (p0 == null) {
          a.j("TKKwaiPlayer", "setSessionKeyGenerator: sessionKG is null");
          return;
       }else {
          this.sessionKeyGenerator = p0;
          TKKwaiPlayer tv = this.v;
          if (tv != null) {
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(p0, tv, TKPlayerController.class, "18")) {
                tv.b.setSessionKeyGenerator(p0);
             }
          }
          return;
       }
    }
    public void setSourceList(V8Array p0,int p1,long p2,Object p3){
       List list;
       String this;
       Object obj2;
       Iterator iterator;
       ArrayList obj4;
       TKKwaiPlayer tKKwaiPlayer = this;
       V8Array v8Array = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(TKKwaiPlayer.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), p3, this, TKKwaiPlayer.class, "3")) {
          return;
       }
       tKKwaiPlayer.sourceList = v8Array;
       if (v8Array == null || !p0.length()) {
          a.h("TKKwaiPlayer", "setSourceList: sourceList is null or empty");
          tKKwaiPlayer.m(TKPlayerError.SOURCE_INVALID);
          return;
       }else {
          Object obj = null;
          try{
             list = p0.getList();
          }catch(java.lang.Exception e0){
             a.g("TKKwaiPlayer", e0);
             list = obj;
          }
          tKKwaiPlayer.y = list;
          if (list == null || list.isEmpty()) {
             a.h("TKKwaiPlayer", "setSourceList: mSourceList is null or empty");
             tKKwaiPlayer.m(TKPlayerError.SOURCE_INVALID);
             return;
          }else {
             String str = tKKwaiPlayer.y.get(0);
             if (TextUtils.isEmpty(str)) {
                a.h("TKKwaiPlayer", "setSourceList: firstUri is null or empty");
                tKKwaiPlayer.m(TKPlayerError.SOURCE_INVALID);
                return;
             }else {
                TKPlayerController$PlayerDataType playerDataTy = PatchProxy.applyOneRefs(str, obj, uob, "5");
                this = "file://";
                String str1 = "bundle://";
                String str2 = "http://";
                if (playerDataTy != patchProxyRe) {
                }else if(str.startsWith("https://") || str.startsWith(str2)){
                   playerDataTy = TKPlayerController$PlayerDataType.URL;
                }else if(str.startsWith(str1) || str.startsWith(this)){
                   playerDataTy = TKPlayerController$PlayerDataType.FILE_PATH;
                }else if(str.startsWith("asset://")){
                   playerDataTy = TKPlayerController$PlayerDataType.ASSET;
                }else {
                   playerDataTy = TKPlayerController$PlayerDataType.FILE_PATH;
                }
                TKKwaiPlayer y = tKKwaiPlayer.y;
                String rootDir = this.getRootDir();
                String str3 = rootDir;
                String str4 = rootDir;
                TKKwaiPlayer obj1 = PatchProxy.applyThreeRefs(y, playerDataTy, str3, 0, b.class, "4");
                if (obj1 != patchProxyRe) {
                   obj2 = obj1;
                }else if(y == null || y.isEmpty()){
                   int i = b$a.b[playerDataTy.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                            ArrayList obj3 = PatchProxy.applyTwoRefs(y, str4, obj, uob, "7");
                            if (obj3 != patchProxyRe) {
                               obj = obj3;
                            }else {
                               obj3 = new ArrayList();
                               iterator = y.iterator();
                               while (iterator.hasNext()) {
                                  String str5 = iterator.next();
                                  if (TextUtils.isEmpty(str5)) {
                                     continue ;
                                  }else if(str5.startsWith(this)){
                                     str5 = x.a(str5, this);
                                     if (TextUtils.isEmpty(str5) || !d.a(str5)) {
                                        continue ;
                                     }
                                  }else {
                                     str5 = x.a(str5, str1);
                                     if (TextUtils.isEmpty(str5)) {
                                        continue ;
                                     }else if(!TextUtils.isEmpty(str4)){
                                        str5 = str4.concat(str5);
                                     }
                                     if (!d.a(str5)) {
                                        continue ;
                                     }else {
                                        obj3.add(str5);
                                     }
                                  }
                                  obj3.add(str5);
                               }
                               if (!obj3.isEmpty()) {
                                  obj = obj3;
                               }
                            }
                         }else {
                            obj4 = PatchProxy.applyOneRefs(y, obj, uob, "8");
                            if (obj4 != patchProxyRe) {
                               obj = obj4;
                            }else {
                               str = y.get(0);
                               if (!TextUtils.isEmpty(str)) {
                               }
                            }
                         }
                      }
                   }else {
                      obj4 = PatchProxy.applyOneRefs(y, obj, uob, "6");
                      if (obj4 != patchProxyRe) {
                         obj = obj4;
                      }else {
                         obj4 = new ArrayList();
                         iterator = y.iterator();
                         while (iterator.hasNext()) {
                            this = iterator.next();
                            if (!TextUtils.isEmpty(this) && (this.startsWith("https://") || this.startsWith(str2))) {
                               obj4.add(new CDNUrl("", this));
                            }
                         }
                         if (!obj4.isEmpty()) {
                            CDNUrl[] uCDNUrlArray = new CDNUrl[0];
                            uCDNUrlArray = obj4.toArray(uCDNUrlArray);
                            if (uCDNUrlArray != null && uCDNUrlArray.length) {
                            }
                         }
                      }
                   }
                }
             label_01c0 :
                obj2 = obj;
                if (obj2 == null) {
                   a.h("TKKwaiPlayer", "setSourceList: sourceData is null");
                   tKKwaiPlayer.m(TKPlayerError.SOURCE_INVALID);
                   return;
                }else {
                   obj1 = tKKwaiPlayer.v;
                   if (obj1 == null) {
                      a.h("TKKwaiPlayer", "setSourceList: mPlayerController is null");
                      tKKwaiPlayer.m(TKPlayerError.UNKNOWN);
                      return;
                   }else {
                      obj1.c(obj2, playerDataTy, p1, p2, b.a(p3));
                      this.n();
                      return;
                   }
                }
             }
          }
       }
    }
    public void setSpeed(float p0){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKKwaiPlayer, "11")) {
          return;
       }
       if (p0 <= 0) {
          return;
       }
       this.speed = p0;
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null) {
          tKKwaiPlayer.l(p0);
       }
       return;
    }
    public void setVolume(float p0){
       TKKwaiPlayer tKKwaiPlayer = TKKwaiPlayer.class;
       if (PatchProxy.isSupport(tKKwaiPlayer) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKKwaiPlayer, "8")) {
          return;
       }
       this.volume = p0;
       tKKwaiPlayer = this.v;
       if (tKKwaiPlayer != null) {
          tKKwaiPlayer.m(p0);
       }
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer.class, "45")) {
          return;
       }
       y.c(this.onInfoChangedRef);
       y.c(this.onStartRef);
       y.c(this.onRenderFirstVideoFrameRef);
       y.c(this.onRenderFirstAudioFrameRef);
       y.c(this.onProgressRef);
       y.c(this.onEndRef);
       y.c(this.onErrorRef);
       y.c(this.onSizeChangedRef);
       y.c(this.onSessionReportRef);
       y.c(this.onPreparedRef);
       y.c(this.onLoadingStateChangedRef);
       y.c(this.onCompletionRef);
       y.c(this.onPauseRef);
       return;
    }
}
