package com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import ui5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import qrd.l1;
import android.view.View;
import com.kwai.player.debuginfo.OnPluginReportListener;

public final class HostKwaiPlayerDebugInfoView extends FrameLayout	// class@000d02
{
    public b b;
    public boolean c;

    public void HostKwaiPlayerDebugInfoView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void HostKwaiPlayerDebugInfoView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void HostKwaiPlayerDebugInfoView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new b();
       this.d();
    }
    public final void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(HostKwaiPlayerDebugInfoView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, HostKwaiPlayerDebugInfoView.class, "4")) {
          return;
       }
       HostKwaiPlayerDebugInfoView tb = this.b;
       if (tb != null) {
          tb.replaceExtraInfo(p0, p1, p2);
       }
       return;
    }
    public final void b(KwaiPlayerDebugInfoProvider p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HostKwaiPlayerDebugInfoView.class, "2")) {
          return;
       }
       this.d();
       HostKwaiPlayerDebugInfoView tb = this.b;
       if (tb != null) {
          tb.startMonitor(p0);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, HostKwaiPlayerDebugInfoView.class, "3")) {
          return;
       }
       HostKwaiPlayerDebugInfoView tb = this.b;
       if (tb != null) {
          tb.stopMonitor();
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HostKwaiPlayerDebugInfoView.class, "1")) {
          return;
       }
       HostKwaiPlayerDebugInfoView tb = this.b;
       if (tb != null) {
          tb.a();
       }
       if (this.c == null) {
          tb = this.b;
          if (tb != null && tb.b == true) {
             this.c = true;
             if (tb != null) {
                objArray = tb.getPlayerView();
             }
             if (objArray != null) {
                this.addView(objArray);
             }
          }
       }
       return;
    }
    public final void setReportListener(OnPluginReportListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HostKwaiPlayerDebugInfoView.class, "5")) {
          return;
       }
       HostKwaiPlayerDebugInfoView tb = this.b;
       if (tb != null) {
          tb.setReportListener(p0);
       }
       return;
    }
}
