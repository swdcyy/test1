package com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge$b;
import o63.j$a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import o63.q;
import crd.b;
import com.kwai.yoda.YodaWebView;
import androidx.fragment.app.Fragment;
import o63.i;
import o63.e;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout;
import java.lang.Boolean;
import java.lang.Number;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import java.lang.StringBuilder;
import o63.j$a$a;

public final class LiveWebCommandBridge$b implements j$a	// class@001002
{
    public final WeakReference a;

    public void LiveWebCommandBridge$b(YodaBaseWebView p0){
       a.p(p0, "webView");
       super();
       this.a = new WeakReference(p0);
    }
    public void L(){
       LiveWebCommandBridge$b uob = LiveWebCommandBridge$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.a.get();
       if (yodaBaseWebV != null) {
          a.o(yodaBaseWebV, "it");
          if (!PatchProxy.applyVoidOneRefs(yodaBaseWebV, this, uob, "3")) {
             NewYodaJavascriptBridge javascriptBr = yodaBaseWebV.getJavascriptBridge();
             if (javascriptBr != null) {
                javascriptBr.invoke("webview", "close", "{}", null);
             }
          }
       }
       return;
    }
    public q a(){
       return q.b;
    }
    public void a5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWebCommandBridge$b.class, "2")) {
          return;
       }
       a.p(p0, "disposable");
       YodaBaseWebView yodaBaseWebV = this.a.get();
       if (yodaBaseWebV != null && yodaBaseWebV instanceof YodaWebView) {
          yodaBaseWebV.compositeWith(p0);
       }
       return;
    }
    public boolean b1(Fragment p0,String p1){
       return i.c(this, p0, p1);
    }
    public e c1(){
       Object[] objArray = null;
       YodaBaseWebView obj = PatchProxy.apply(objArray, this, LiveWebCommandBridge$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get();
       Object[] tag = (obj != null)? obj.getTag(R.id.liveJsApiStrategy): objArray;
       if (tag instanceof e) {
          objArray = tag;
       }
       return objArray;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWebCommandBridge$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof LiveWebCommandBridge$b && a.g(p0.a.get(), this.a.get()))? true: false;
       return b;
    }
    public int hashCode(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, LiveWebCommandBridge$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.get();
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public void l0(boolean p0){
       LiveWebCommandBridge$b uob = LiveWebCommandBridge$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.a.get();
       DialogFragment uDialogFragm = null;
       DialogFragment tag = (yodaBaseWebV != null)? yodaBaseWebV.getTag(R.id.liveJsPageContainerDialogFragment): uDialogFragm;
       if (!tag instanceof WeakReference) {
          tag = uDialogFragm;
       }
       if (tag != null) {
          Dialog obj = tag.get();
          if (obj instanceof DialogFragment) {
             uDialogFragm = obj;
          }
          if (uDialogFragm != null) {
             obj = uDialogFragm.getDialog();
             if (obj != null) {
                obj.setCanceledOnTouchOutside(p0);
             }
          }
       }
    label_0049 :
       return;
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveWebCommandBridge$b.class, "9");
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LiveWebCommandBridge$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "H5JsPage{webView=";
       YodaBaseWebView yodaBaseWebV = this.a.get();
       if (yodaBaseWebV != null) {
          objArray = yodaBaseWebV.getCurrentUrl();
       }
       return obj+objArray+'}';
    }
    public boolean v0(Fragment p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveWebCommandBridge$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       return j$a$a.a(this, p0, p1);
    }
}
