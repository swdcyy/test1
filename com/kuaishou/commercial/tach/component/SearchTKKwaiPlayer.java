package com.kuaishou.commercial.tach.component.SearchTKKwaiPlayer;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.h;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.component.SearchTKKwaiPlayer$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Long;
import java.lang.Integer;
import com.tkruntime.v8.V8Function;
import java.lang.Float;
import com.tachikoma.core.component.TKBaseNativeModule;

public class SearchTKKwaiPlayer extends e	// class@001652
{
    public Object feed;
    public boolean mute;
    public V8Function onEnd;
    public V8Function onError;
    public V8Function onPlayerABLoopEnded;
    public V8Function onPlayerDidRenderFirstVideoFrame;
    public V8Function onPlayerInfoDidChange;
    public V8Function onPlayerStatusDidChange;
    public V8Function onProgress;
    public boolean repeat;
    public float volume;

    public void SearchTKKwaiPlayer(f p0){
       super(p0);
       this.getView();
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchTKKwaiPlayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1317293397).b(p0);
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, searchTKKwai, "26")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          d.a(-1317293397).i(this.getView());
       }else {
          x.f(new SearchTKKwaiPlayer$a(this));
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "15")) {
          return;
       }
       d.a(-1317293397).u1(this.getView());
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "14")) {
          return;
       }
       d.a(-1317293397).Q(this.getView());
       return;
    }
    public void prepareForSharePlayer(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "20")) {
          return;
       }
       d.a(-1317293397).fJ(this.getView());
       return;
    }
    public void releasePlayer(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "18")) {
          return;
       }
       d.a(-1317293397).O0(this.getView());
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "19")) {
          return;
       }
       d.a(-1317293397).Ln(this.getView());
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "16")) {
          return;
       }
       d.a(-1317293397).oD(this.getView());
       return;
    }
    public void seekTo(long p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, searchTKKwai, "13")) {
          return;
       }
       d.a(-1317293397).S3(this.getView(), p0);
       return;
    }
    public void setBorderRadius(int p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKKwai, "22")) {
          return;
       }
       super.setBorderRadius(p0);
       if (this.getParent() != null && this.getParent().getView() != null) {
          d.a(-1317293397).BL(this.getView(), p0, this.getParent().getView());
       }
       return;
    }
    public void setBottomLeftRadius(int p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKKwai, "23")) {
          return;
       }
       super.setBottomLeftRadius(p0);
       if (this.getParent() != null && this.getParent().getView() != null) {
          d.a(-1317293397).pq(this.getView(), p0, this.getParent().getView());
       }
       return;
    }
    public void setFeed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "2")) {
          return;
       }
       d.a(-1317293397).q2(this.getView(), p0);
       return;
    }
    public void setMute(boolean p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchTKKwai, "5")) {
          return;
       }
       d.a(-1317293397).L2(this.getView(), p0);
       return;
    }
    public void setOnEndCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "7")) {
          return;
       }
       d.a(-1317293397).E7(this.getView(), p0);
       return;
    }
    public void setOnErrorCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "9")) {
          return;
       }
       d.a(-1317293397).my(this.getView(), p0);
       return;
    }
    public void setOnPlayerABLoopEndedCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "12")) {
          return;
       }
       d.a(-1317293397).Vq(this.getView(), p0);
       return;
    }
    public void setOnPlayerDidRenderFirstVideoFrameCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "10")) {
          return;
       }
       d.a(-1317293397).OU(this.getView(), p0);
       return;
    }
    public void setOnPlayerInfoDidChangeCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "11")) {
          return;
       }
       d.a(-1317293397).pn(this.getView(), p0);
       return;
    }
    public void setOnPlayerStatusDidChangeCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "8")) {
          return;
       }
       d.a(-1317293397).Fo(this.getView(), p0);
       return;
    }
    public void setOnProgressCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKKwaiPlayer.class, "6")) {
          return;
       }
       d.a(-1317293397).Gc(this.getView(), p0);
       return;
    }
    public void setRepeat(boolean p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, searchTKKwai, "3")) {
          return;
       }
       d.a(-1317293397).VT(this.getView(), p0);
       return;
    }
    public void setTopLeftRadius(int p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, searchTKKwai, "24")) {
          return;
       }
       super.setTopLeftRadius(p0);
       if (this.getParent() != null && this.getParent().getView() != null) {
          d.a(-1317293397).Dq(this.getView(), p0, this.getParent().getView());
       }
       return;
    }
    public void setVolume(float p0){
       SearchTKKwaiPlayer searchTKKwai = SearchTKKwaiPlayer.class;
       if (PatchProxy.isSupport(searchTKKwai) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, searchTKKwai, "4")) {
          return;
       }
       d.a(-1317293397).sZ(this.getView(), p0);
       return;
    }
    public void startABLoop(long p0,long p1,int p2,boolean p3){
       if (PatchProxy.isSupport(SearchTKKwaiPlayer.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, SearchTKKwaiPlayer.class, "21")) {
          return;
       }
       d.a(-1317293397).m60(this.getView(), p0, p1, p2);
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "17")) {
          return;
       }
       d.a(-1317293397).e4(this.getView());
       return;
    }
    public void unRetainJsObj(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer.class, "25")) {
          return;
       }
       super.unRetainJsObj();
       d.a(-1317293397).R7(this.getView());
       return;
    }
}
