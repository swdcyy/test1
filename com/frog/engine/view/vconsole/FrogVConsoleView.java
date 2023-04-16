package com.frog.engine.view.vconsole.FrogVConsoleView;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.atomic.AtomicInteger;
import com.frog.engine.view.vconsole.FrogVConsoleView$a;
import android.os.Looper;
import android.os.Build$VERSION;
import java.lang.String;
import android.app.Application;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import java.lang.IllegalStateException;
import org.json.JSONArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.frog.engine.view.vconsole.VConsoleUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Message;
import android.os.Handler;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.StringBuilder;
import com.frog.engine.utils.ViewUtils;
import java.lang.Math;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.webkit.ValueCallback;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import com.frog.engine.FrogCanvas;
import android.widget.AbsoluteLayout;
import com.frog.engine.view.vconsole.FrogVConsoleView$b;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebSettings;
import com.frog.engine.view.vconsole.FrogVConsoleView$VConsoleLoadListener;

public class FrogVConsoleView extends RelativeLayout implements View$OnClickListener	// class@0015a8
{
    public final AtomicInteger mCounter;
    public final Handler mHandler;
    public int mOrientation;
    public FrogVConsoleView$VConsoleLoadListener vConsoleLoadListener;
    public View vTopBlank;
    public WebView wvContent;

    public void FrogVConsoleView(Context p0){
       super(p0, null);
    }
    public void FrogVConsoleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FrogVConsoleView(Context p0,AttributeSet p1,int p2){
       try{
          super(p0, p1, p2);
          this.mOrientation = 0;
          this.mCounter = new AtomicInteger(0);
          this.mHandler = new FrogVConsoleView$a(this, Looper.getMainLooper());
          if (Build$VERSION.SDK_INT >= 28 && !(this.getContext().getPackageName()).equals(Application.getProcessName())) {
             WebView.setDataDirectorySuffix(Application.getProcessName());
          }
       }catch(java.lang.IllegalStateException e2){
          FrogLog.w("FrogVConsoleView", e2.getMessage());
       }catch(java.lang.Exception e2){
          FrogLog.e("FrogVConsoleView", e2.getMessage());
       }
       this.initViews();
       return;
    }
    public void appendArray(JSONArray p0,int p1){
       if (PatchProxy.isSupport(FrogVConsoleView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FrogVConsoleView.class, "12")) {
          return;
       }
       VConsoleUtils.appendArrayJSString(p0, p1);
       this.appendLog(VConsoleUtils);
       return;
    }
    public void appendError(String p0,int p1,int p2,String p3,String p4){
       if (PatchProxy.isSupport(FrogVConsoleView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, FrogVConsoleView.class, "14")) {
             return;
          }
       }
       this.appendError("", p3, p4, "", 0, p0, p1, p2);
       return;
    }
    public void appendError(String p0,String p1,String p2,String p3,int p4,String p5,int p6,int p7){
       if (PatchProxy.isSupport(FrogVConsoleView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, FrogVConsoleView.class, "13")) {
             return;
          }
       }
       VConsoleUtils.appendErrorJSString(p0, p1, p2, p3, p4, p5, p6, p7);
       this.appendLog(VConsoleUtils);
       return;
    }
    public final void appendLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogVConsoleView.class, "7")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Message message = this.mHandler.obtainMessage(0);
       message.obj = p0;
       this.mHandler.sendMessage(message);
       return;
    }
    public void appendLog(String p0,int p1){
       if (PatchProxy.isSupport(FrogVConsoleView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FrogVConsoleView.class, "16")) {
          return;
       }
       VConsoleUtils.appendLogJSString(p0, p1);
       this.appendLog(VConsoleUtils);
       return;
    }
    public void appendObject(JSONObject p0,int p1){
       if (PatchProxy.isSupport(FrogVConsoleView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FrogVConsoleView.class, "15")) {
          return;
       }
       VConsoleUtils.appendObjectJSString(p0, p1);
       this.appendLog(VConsoleUtils);
       return;
    }
    public boolean canAppendLog(){
       Object obj = PatchProxy.apply(null, this, FrogVConsoleView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mCounter.get() >= 2)? true: false;
       return b;
    }
    public void checkAppendLogQueue(boolean p0){
       if (PatchProxy.isSupport(FrogVConsoleView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FrogVConsoleView.class, "5")) {
          return;
       }
       if (p0) {
          this.mCounter.incrementAndGet();
       }else {
          this.mCounter.decrementAndGet();
       }
       if (!this.canAppendLog()) {
          return;
       }else {
          this.mHandler.sendEmptyMessage(1);
          return;
       }
    }
    public final void checkOrientation(int p0){
       Configuration orientation;
       if (PatchProxy.isSupport(FrogVConsoleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrogVConsoleView.class, "3")) {
          return;
       }
       if (this.wvContent == null) {
          return;
       }
       if (!p0 && (this.getResources() != null && this.getResources().getConfiguration() != null)) {
          orientation = this.getResources().getConfiguration().orientation;
       }
    label_0038 :
       if (orientation == null) {
          return;
       }else if(this.mOrientation == orientation){
          return;
       }else {
          this.mOrientation = orientation;
          FrogLog.d("FrogVConsoleView", "checkOrientation:"+this.mOrientation);
          int i = 2;
          if (this.mOrientation == i) {
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((Math.max(ViewUtils.getScreenWidthPx(this.getContext()), ViewUtils.getScreenHeightPx(this.getContext())) / i), -1);
             layoutParams.addRule(7);
             layoutParams.alignWithParent = true;
             this.wvContent.setLayoutParams(layoutParams);
          }else {
             RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-1, -1);
             layoutParams1.topMargin = 300;
             this.wvContent.setLayoutParams(layoutParams1);
          }
          return;
       }
    }
    public void evaluateJavascript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogVConsoleView.class, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       FrogVConsoleView twvContent = this.wvContent;
       if (twvContent != null) {
          twvContent.evaluateJavascript(p0, null);
       }
       return;
    }
    public final void initViews(){
       if (PatchProxy.applyVoid(null, this, FrogVConsoleView.class, "1")) {
          return;
       }
       LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d053b, this);
       this.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       this.setClickable(false);
       this.wvContent = this.findViewById(0x7f0a45be);
       TextView textView = this.findViewById(R.id.tv_frog_vconsole);
       this.vTopBlank = this.findViewById(0x7f0a43c1);
       this.findViewById(R.id.tv_frog_canvas_version).setText(FrogCanvas.getFrogCanvasVersion());
       this.wvContent.setVisibility(4);
       this.vTopBlank.setVisibility(4);
       textView.setOnClickListener(this);
       this.vTopBlank.setOnClickListener(this);
       this.initWebView();
       this.checkOrientation(this.mOrientation);
       return;
    }
    public final void initWebView(){
       if (PatchProxy.applyVoid(null, this, FrogVConsoleView.class, "2")) {
          return;
       }
       FrogVConsoleView twvContent = this.wvContent;
       if (twvContent == null) {
          return;
       }
       twvContent.setWebViewClient(new FrogVConsoleView$b(this));
       this.wvContent.getSettings().setJavaScriptEnabled(true);
       this.wvContent.loadUrl("https://static.yximgs.com/udata/pkg/GameSource-CDN/vConsole.html");
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, FrogVConsoleView.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       this.mCounter.incrementAndGet();
       this.checkAppendLogQueue(true);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogVConsoleView.class, "11")) {
          return;
       }
       int id = p0.getId();
       if (id == 0x7f0a4190 || id == 0x7f0a43c1) {
          FrogVConsoleView twvContent = this.wvContent;
          if (twvContent == null) {
             return;
          }else if(!twvContent.getVisibility()){
             this.wvContent.setVisibility(4);
             this.vTopBlank.setVisibility(4);
          }else {
             this.wvContent.setVisibility(0);
             this.vTopBlank.setVisibility(0);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogVConsoleView.class, "8")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.checkOrientation(p0.orientation);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FrogVConsoleView.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       this.mCounter.decrementAndGet();
       this.checkAppendLogQueue(false);
       return;
    }
    public void setVConsoleLoadListener(FrogVConsoleView$VConsoleLoadListener p0){
       this.vConsoleLoadListener = p0;
    }
}
