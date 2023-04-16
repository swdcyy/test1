package com.frog.engine.internal.FrogGameHandlerImpl;
import com.frog.engine.FrogCanvasHandler;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.view.FrogRender;
import java.lang.Boolean;
import java.lang.Integer;
import com.frog.engine.internal.FrogEngineInternal;
import java.util.Map;
import android.view.KeyEvent;
import com.frog.engine.FrogCanvasDelegate;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCallGameListener;
import org.json.JSONObject;

public class FrogGameHandlerImpl implements FrogCanvasHandler	// class@001539
{
    public FrogGLSurfaceView mFrogGLSurfaceView;

    public void FrogGameHandlerImpl(FrogGLSurfaceView p0){
       super();
       this.mFrogGLSurfaceView = p0;
    }
    public String absolutePath(String p0){
       FrogGameHandlerImpl obj = PatchProxy.applyOneRefs(p0, this, FrogGameHandlerImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFrogGLSurfaceView;
       if (obj != null && obj.getFrogRender() != null) {
          return this.mFrogGLSurfaceView.getFrogRender().findAbsPath(p0);
       }
       return null;
    }
    public byte[] fileDataWithPath(String p0){
       FrogGameHandlerImpl obj = PatchProxy.applyOneRefs(p0, this, FrogGameHandlerImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFrogGLSurfaceView;
       if (obj != null && obj.getFrogRender() != null) {
          return this.mFrogGLSurfaceView.getFrogRender().fileDataWithPath(p0);
       }
       return null;
    }
    public FrogGLSurfaceView getSurfaceView(){
       return this.mFrogGLSurfaceView;
    }
    public String getTempAbsPath(){
       Object obj = PatchProxy.apply(null, this, FrogGameHandlerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.absolutePath(this.ksPath(3));
    }
    public void handleAudioMute(boolean p0){
       FrogGameHandlerImpl uFrogGameHan = FrogGameHandlerImpl.class;
       if (PatchProxy.isSupport(uFrogGameHan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFrogGameHan, "17")) {
          return;
       }
       uFrogGameHan = this.mFrogGLSurfaceView;
       if (uFrogGameHan != null && uFrogGameHan.getFrogRender() != null) {
          this.mFrogGLSurfaceView.handleAudioMute(p0);
       }
       return;
    }
    public String ksPath(int p0){
       FrogGameHandlerImpl uFrogGameHan = FrogGameHandlerImpl.class;
       if (PatchProxy.isSupport(uFrogGameHan)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFrogGameHan, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uFrogGameHan = this.mFrogGLSurfaceView;
       if (uFrogGameHan != null && uFrogGameHan.getFrogRender() != null) {
          return this.mFrogGLSurfaceView.getFrogRender().ksPath(p0);
       }else {
          return null;
       }
    }
    public void onActivityFinishCall(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "5")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null) {
          tmFrogGLSurf.onActivityFinishCall();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "6")) {
          return;
       }
       if (this.mFrogGLSurfaceView != null) {
          _monitor_enter(FrogEngineInternal.class);
          if (FrogEngineInternal.getListenerMap().get(this.mFrogGLSurfaceView.getUniqueId()) != null) {
             FrogEngineInternal.getListenerMap().get(this.mFrogGLSurfaceView.getUniqueId()).clear();
          }
          _monitor_exit(FrogEngineInternal.class);
          this.mFrogGLSurfaceView = null;
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return false;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "3")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null) {
          tmFrogGLSurf.onPause();
       }
       return;
    }
    public void onRestart(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "1")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null && tmFrogGLSurf.getFrogRender() != null) {
          this.mFrogGLSurfaceView.onRestart();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "2")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null) {
          tmFrogGLSurf.onResume();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FrogGameHandlerImpl.class, "4")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null) {
          tmFrogGLSurf.onStop();
       }
       return;
    }
    public void registerDelegate(FrogCanvasDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGameHandlerImpl.class, "11")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null) {
          tmFrogGLSurf.setDelegate(p0);
       }
       return;
    }
    public void registerGameCommand(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGameHandlerImpl.class, "8")) {
          return;
       }
       if (this.mFrogGLSurfaceView != null) {
          _monitor_enter(FrogEngineInternal.class);
          FrogEngineInternal.getListenerMap().put(this.mFrogGLSurfaceView.getUniqueId(), p0);
          _monitor_exit(FrogEngineInternal.class);
       }
       return;
    }
    public void runJavaScriptFile(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGameHandlerImpl.class, "16")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null && tmFrogGLSurf.getFrogRender() != null) {
          this.mFrogGLSurfaceView.getFrogRender().runJavaScript(p0);
       }
       return;
    }
    public void sendCommandToGame(String p0,FrogJSObject p1,FrogCallGameListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogGameHandlerImpl.class, "9")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null && tmFrogGLSurf.getFrogRender() != null) {
          this.mFrogGLSurfaceView.getFrogRender().sendCommandToNativeGame(p0, p1, p2);
       }
       return;
    }
    public void setConvertPointAfterSizeChangeSwitch(boolean p0){
       FrogGameHandlerImpl uFrogGameHan = FrogGameHandlerImpl.class;
       if (PatchProxy.isSupport(uFrogGameHan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFrogGameHan, "7")) {
          return;
       }
       uFrogGameHan = this.mFrogGLSurfaceView;
       if (uFrogGameHan != null) {
          uFrogGameHan.setConvertPointAfterSizeChangeSwitch(p0);
       }
       return;
    }
    public void updateLaunchOption(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGameHandlerImpl.class, "10")) {
          return;
       }
       FrogGameHandlerImpl tmFrogGLSurf = this.mFrogGLSurfaceView;
       if (tmFrogGLSurf != null && tmFrogGLSurf.getFrogRender() != null) {
          this.mFrogGLSurfaceView.getFrogRender().updateLaunchOption(p0);
       }
       return;
    }
}
