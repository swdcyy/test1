package com.frog.engine.FrogActivity;
import android.app.Activity;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Button;
import android.content.Context;
import java.lang.CharSequence;
import com.frog.engine.FrogActivity$c;
import android.view.View$OnClickListener;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.frog.engine.view.vconsole.FrogVConsoleView;
import android.widget.RelativeLayout;
import com.frog.engine.FrogCanvasHandler;
import android.os.Bundle;
import android.content.Intent;
import android.view.KeyEvent;
import java.lang.Integer;
import java.lang.Boolean;
import android.text.TextUtils;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.FrogActivity$a;
import com.frog.engine.FrogActivity$b;
import com.frog.engine.FrogRunGameResultListener;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.FrogCanvas;

public class FrogActivity extends Activity	// class@0014e8
{
    public FrogCanvasHandler mFrogGameHandler;
    public FrogInitParam mInitParam;
    public FrameLayout mRootView;
    public FrogVConsoleView mVConsole;

    public void FrogActivity(){
       super();
    }
    public void addSurfaceView(FrogGLSurfaceView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity.class, "3")) {
          return;
       }
       this.mRootView.addView(p0, 0);
       Button uButton = new Button(this);
       uButton.setText("»Øµ½Ö÷Ò³");
       uButton.setOnClickListener(new FrogActivity$c(this));
       this.mRootView.addView(uButton, new FrameLayout$LayoutParams(200, 100));
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FrogActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void initFrameLayout(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "5")) {
          return;
       }
       FrameLayout uFrameLayout = new FrameLayout(this);
       this.mRootView = uFrameLayout;
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.setContentView(this.mRootView);
       FrogVConsoleView uFrogVConsol = new FrogVConsoleView(this);
       this.mVConsole = uFrogVConsol;
       uFrogVConsol.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.mRootView.addView(this.mVConsole);
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "6")) {
          return;
       }
       super.onBackPressed();
       this.mFrogGameHandler.onActivityFinishCall();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.initFrameLayout();
       this.processIntent(this.getIntent());
       this.runGame();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "11")) {
          return;
       }
       super.onDestroy();
       FrogActivity tmFrogGameHa = this.mFrogGameHandler;
       if (tmFrogGameHa != null) {
          tmFrogGameHa.onDestroy();
       }
       this.mRootView.removeAllViews();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       FrogActivity uFrogActivit = FrogActivity.class;
       if (PatchProxy.isSupport(uFrogActivit)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uFrogActivit, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uFrogActivit = this.mFrogGameHandler;
       if (uFrogActivit != null && uFrogActivit.onKeyDown(p0, p1)) {
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "9")) {
          return;
       }
       super.onPause();
       FrogActivity tmFrogGameHa = this.mFrogGameHandler;
       if (tmFrogGameHa != null) {
          tmFrogGameHa.onPause();
       }
       return;
    }
    public void onRestart(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "7")) {
          return;
       }
       super.onRestart();
       FrogActivity tmFrogGameHa = this.mFrogGameHandler;
       if (tmFrogGameHa != null) {
          tmFrogGameHa.onRestart();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "8")) {
          return;
       }
       super.onResume();
       FrogActivity tmFrogGameHa = this.mFrogGameHandler;
       if (tmFrogGameHa != null) {
          tmFrogGameHa.onResume();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "10")) {
          return;
       }
       super.onStop();
       FrogActivity tmFrogGameHa = this.mFrogGameHandler;
       if (tmFrogGameHa != null) {
          tmFrogGameHa.onStop();
       }
       return;
    }
    public final void processIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogActivity.class, "1")) {
          return;
       }
       String stringExtra = p0.getStringExtra("frogInitParam");
       FrogInitParam uFrogInitPar = (TextUtils.isEmpty(stringExtra))? new FrogInitParam(): new FrogInitParam(stringExtra);
       this.mInitParam = uFrogInitPar;
       return;
    }
    public final void runGame(){
       if (PatchProxy.applyVoid(null, this, FrogActivity.class, "2")) {
          return;
       }
       FrogCanvas.runGame(this, this.mInitParam, new FrogActivity$a(this), new FrogActivity$b(this));
       return;
    }
}
