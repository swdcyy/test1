package com.kuaishou.commercial.tach.component.live.TKKwaiLivePlayer;
import t99.y;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import t99.x;
import android.content.Context;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.kuaishou.commercial.tach.component.player.TKPlayerError;
import zp8.a;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import java.lang.Integer;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.live.TKKwaiLivePlayer$a;
import java.lang.Runnable;
import iq8.x;
import iq8.n;
import java.lang.Float;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import com.yxcorp.gifshow.entity.QPhoto;
import rz.b;
import qz.c;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.util.Map;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import android.text.TextUtils;
import t99.z;
import org.json.JSONObject;
import com.yxcorp.gifshow.autoplay.live.e$a;
import com.yxcorp.gifshow.autoplay.live.e;
import com.tkruntime.v8.V8Value;

public class TKKwaiLivePlayer extends e implements y	// class@00166b
{
    public boolean A;
    public boolean B;
    public boolean mute;
    public V8Function onEnd;
    public JsValueRef onEndRef;
    public V8Function onError;
    public JsValueRef onErrorRef;
    public V8Function onPause;
    public JsValueRef onPauseRef;
    public V8Function onRenderFirstFrame;
    public JsValueRef onRenderFirstFrameRef;
    public V8Function onSizeChanged;
    public JsValueRef onSizeChangedRef;
    public V8Function onStart;
    public JsValueRef onStartRef;
    public LiveAutoPlayModule v;
    public String w;
    public boolean x;
    public int y;
    public int z;

    public void TKKwaiLivePlayer(f p0){
       super(p0);
       this.y = -1;
       this.z = -1;
       this.getView();
    }
    public void a(int p0,int p1,int p2){
       x.d(this, p0, p1, p2);
    }
    public void c(int p0,int p1,int p2){
       x.j(this, p0, p1, p2);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public LivePlayTextureView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKKwaiLivePlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LivePlayTextureView(p0);
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "24")) {
          return;
       }
       this.release();
       TKKwaiLivePlayer tv = this.v;
       if (tv != null) {
          tv.e0(this);
       }
       return;
    }
    public final void m(TKPlayerError p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "16")) {
          return;
       }
       if (p0 == null) {
          a.j("TKKwaiLivePlayer", "onError: error is null");
          return;
       }else {
          TKKwaiLivePlayer tonErrorRef = this.onErrorRef;
          if (tonErrorRef != null && y.a(tonErrorRef.get())) {
             Object[] objArray = new Object[]{Integer.valueOf(p0.getCode()),p0.getMessage()};
             this.onErrorRef.get().call(null, objArray);
          }
       label_0050 :
          return;
       }
    }
    public void onAnchorEndLive(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "17")) {
          return;
       }
       TKKwaiLivePlayer tonEndRef = this.onEndRef;
       if (tonEndRef != null && y.a(tonEndRef.get())) {
          Object[] objArray = new Object[0];
          this.onEndRef.get().call(null, objArray);
       }
    label_0033 :
       return;
    }
    public void onAudioStart(){
    }
    public void onCachedPlayerResumePlay(){
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKKwaiLivePlayer tKKwaiLivePl = TKKwaiLivePlayer.class;
       if (PatchProxy.isSupport(tKKwaiLivePl) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKKwaiLivePl, "23")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKKwaiLivePlayer$a(this));
       }
       return;
    }
    public void onPlayTimeFinished(){
    }
    public void onPlayerCached(){
    }
    public void onPlayerRetrieved(){
    }
    public void onRenderStop(){
    }
    public void onSeiInfo(byte[] p0,int p1,int p2){
       x.i(this, p0, p1, p2);
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(TKKwaiLivePlayer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, TKKwaiLivePlayer.class, "18")) {
          return;
       }
       TKKwaiLivePlayer tonSizeChang = this.onSizeChangedRef;
       if (tonSizeChang != null && y.a(tonSizeChang.get())) {
          if (this.y == p0 && this.z == p1) {
             a.f("TKKwaiLivePlayer", "onVideoSizeChangedWithType: size changed, but is same to last size");
             return;
          }else {
             this.y = p0;
             this.z = p1;
             Object[] objArray = new Object[]{Float.valueOf(n.g((float)p0)),Float.valueOf(n.g((float)p1))};
             this.onSizeChangedRef.get().call(null, objArray);
          }
       }
       return;
    }
    public void onVideoStart(){
       TKKwaiLivePlayer tonRenderFir;
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "19")) {
          return;
       }
       boolean b = false;
       this.B = b;
       if (this.x == null) {
          this.x = true;
          tonRenderFir = this.onRenderFirstFrameRef;
          if (tonRenderFir != null && y.a(tonRenderFir.get())) {
             Object[] objArray = new Object[b];
             this.onRenderFirstFrameRef.get().call(null, objArray);
          }
       }
       tonRenderFir = this.onStartRef;
       if (tonRenderFir != null && y.a(tonRenderFir.get())) {
          Object[] objArray1 = new Object[b];
          this.onStartRef.get().call(null, objArray1);
       }
    label_0062 :
       return;
    }
    public void onVideoStateChange(LiveAutoPlayerState p0){
       TKKwaiLivePlayer tKKwaiLivePl = TKKwaiLivePlayer.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKKwaiLivePl, "20")) {
          return;
       }
       if (p0 == LiveAutoPlayerState.STOP && this.B != null) {
          boolean b = false;
          this.B = b;
          if (!PatchProxy.applyVoid(null, this, tKKwaiLivePl, "21")) {
             tKKwaiLivePl = this.onPauseRef;
             if (tKKwaiLivePl != null && y.a(tKKwaiLivePl.get())) {
                Object[] objArray = new Object[b];
                this.onPauseRef.get().call(null, objArray);
             }
          }
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "5")) {
          return;
       }
       TKKwaiLivePlayer tv = this.v;
       if (tv != null && tv.t()) {
          boolean b = true;
          try{
             this.B = b;
             this.v.pause("");
          }catch(java.lang.Exception e0){
             a.g("TKKwaiLivePlayer", e0);
          }
       }
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "4")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       TKKwaiLivePlayer tv = this.v;
       if (tv != null && !tv.t()) {
          boolean b = false;
          try{
             this.B = b;
             this.v.startPlay();
             this.setMute(this.mute);
          }catch(java.lang.Exception e0){
             a.g("TKKwaiLivePlayer", e0);
          }
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "7")) {
          return;
       }
       this.B = false;
       this.A = true;
       this.releasePlayer();
       this.getView().f();
       return;
    }
    public final void releasePlayer(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "15")) {
          return;
       }
       TKKwaiLivePlayer tv = this.v;
       if (tv != null) {
          this.w = null;
          try{
             tv.release();
          }catch(java.lang.Exception e0){
             a.g("TKKwaiLivePlayer", e0);
          }
          this.v = null;
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "6")) {
          return;
       }
       this.B = false;
       this.releasePlayer();
       return;
    }
    public void setFeedForAndroid(QPhoto p0,Object p1){
       e uoe;
       Object obj2;
       TKKwaiLivePlayer tKKwaiLivePl = TKKwaiLivePlayer.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, tKKwaiLivePl, "2")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       if (p0 == null) {
          a.h("TKKwaiLivePlayer", "setFeed: use test feed data");
          this.m(TKPlayerError.FEED_INVALID);
          return;
       }else {
          Object obj = null;
          String str = "3";
          z obj1 = PatchProxy.applyOneRefs(p1, obj, b.class, str);
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(p1 == null){
             p1 = V8ObjectUtilsQuick.getValue(p1);
             if (p1 != null && !p1.isEmpty()) {
                obj = new c();
                String str1 = "page2";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof String) {
                      obj.a = obj2;
                   }
                }
                str1 = "category";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof Number) {
                      obj.b = obj2.intValue();
                   }
                }
                str1 = "page";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof Number) {
                      obj.c = obj2.intValue();
                   }
                }
                str1 = "subPages";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof String) {
                      obj.d = obj2;
                   }
                }
                str1 = "currentUrl";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof String) {
                      obj.e = obj2;
                   }
                }
                str1 = "playerReuseToken";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof String) {
                      obj.f = obj2;
                   }
                }
                str1 = "liveSourceType";
                if (p1.containsKey(str1)) {
                   obj2 = p1.get(str1);
                   if (obj2 instanceof Number) {
                      obj.g = obj2.intValue();
                   }
                }
                str1 = "autoPlayBizType";
                if (p1.containsKey(str1)) {
                   p1 = p1.get(str1);
                   if (p1 instanceof Number) {
                      obj.h = p1.intValue();
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, tKKwaiLivePl, str)) {
             if (p0.getEntity() == null) {
                a.h("TKKwaiLivePlayer", "setFeed: qPhoto is null");
                this.m(TKPlayerError.FEED_INVALID);
             }else if(r1.p2(p0.getEntity())){
                a.h("TKKwaiLivePlayer", "setFeed: live is ended");
                this.m(TKPlayerError.LIVE_ENDED);
             }else if(TextUtils.equals(p0.getPhotoId(), this.w)){
                a.i("TKKwaiLivePlayer", "setFeed: qPhoto is same to last qPhoto");
             }else if(!p0.isLiveStream()){
                a.h("TKKwaiLivePlayer", "setFeed: qPhoto is not live steam");
                this.m(TKPlayerError.FEED_INVALID);
             }else {
                this.w = p0.getPhotoId();
                p1 = ":ks-components:kwai-tach";
                if (obj) {
                   obj1 = new z();
                   obj1.c = obj.c;
                   obj1.a = obj.a;
                   obj1.d = obj.d;
                   obj1.b = obj.b;
                   str = this.getTKJSContext().e();
                   try{
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("sub_solution", "TK");
                      if (TextUtils.isEmpty(str)) {
                         str = "unknown";
                      }
                      jSONObject.put("bundle_id", str);
                      e$a uoa = new e$a(p0.mEntity, obj1, e0, p1);
                      uoa.c(obj.e);
                      uoa.k(obj.f);
                      uoa.h(obj.g);
                      uoa.a(obj.h);
                      uoa.D = jSONObject.toString();
                      uoe = uoa.b();
                   }catch(java.lang.Exception e0){
                   }
                }else {
                   uoe = new e$a(p0.mEntity, new z(), 30, p1).b();
                }
             }
          }
          return;
       }
    }
    public void setFeedForIOS(V8Object p0,Object p1){
    }
    public void setMute(boolean p0){
       TKKwaiLivePlayer tKKwaiLivePl = TKKwaiLivePlayer.class;
       if (PatchProxy.isSupport(tKKwaiLivePl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKKwaiLivePl, "8")) {
          return;
       }
       tKKwaiLivePl = this.v;
       if (tKKwaiLivePl == null) {
          a.h("TKKwaiLivePlayer", "setMute: mLiveAutoPlayModule is null");
          return;
       }else {
          this.mute = p0;
          if (p0) {
             tKKwaiLivePl.mute();
          }else {
             tKKwaiLivePl.unMute();
          }
          return;
       }
    }
    public void setOnEndCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "12")) {
          return;
       }
       y.c(this.onEndRef);
       this.onEndRef = y.b(p0, this);
       this.onEnd = p0;
       return;
    }
    public void setOnErrorCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "13")) {
          return;
       }
       y.c(this.onErrorRef);
       this.onErrorRef = y.b(p0, this);
       this.onError = p0;
       return;
    }
    public void setOnPause(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "11")) {
          return;
       }
       y.c(this.onPauseRef);
       this.onPauseRef = y.b(p0, this);
       this.onPause = p0;
       return;
    }
    public void setOnRenderFirstFrame(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "9")) {
          return;
       }
       y.c(this.onRenderFirstFrameRef);
       this.onRenderFirstFrameRef = y.b(p0, this);
       this.onRenderFirstFrame = p0;
       return;
    }
    public void setOnSizeChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "14")) {
          return;
       }
       y.c(this.onSizeChangedRef);
       this.onSizeChangedRef = y.b(p0, this);
       this.onSizeChanged = p0;
       return;
    }
    public void setOnStart(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKKwaiLivePlayer.class, "10")) {
          return;
       }
       y.c(this.onStartRef);
       this.onStartRef = y.b(p0, this);
       this.onStart = p0;
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer.class, "22")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onEndRef);
       y.c(this.onPauseRef);
       y.c(this.onStartRef);
       y.c(this.onRenderFirstFrameRef);
       y.c(this.onSizeChangedRef);
       y.c(this.onErrorRef);
       return;
    }
}
