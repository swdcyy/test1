package com.kwai.debugtools.plugin.wrapper.HostRecoDebugInfoView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import ui5.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import com.kwai.player.debuginfo.OnPluginReportListener;

public final class HostRecoDebugInfoView extends FrameLayout	// class@000d03
{
    public c b;
    public boolean c;

    public void HostRecoDebugInfoView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void HostRecoDebugInfoView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void HostRecoDebugInfoView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new c();
       this.c();
    }
    public final void a(String p0,int p1){
       if (PatchProxy.isSupport(HostRecoDebugInfoView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HostRecoDebugInfoView.class, "5")) {
          return;
       }
       HostRecoDebugInfoView tb = this.b;
       if (tb != null) {
          tb.renderErrorMsg(p0, p1);
       }
       return;
    }
    public final void b(String p0,int p1){
       if (PatchProxy.isSupport(HostRecoDebugInfoView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, HostRecoDebugInfoView.class, "6")) {
          return;
       }
       HostRecoDebugInfoView tb = this.b;
       if (tb != null) {
          tb.renderExtraInfo(p0, p1);
       }
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HostRecoDebugInfoView.class, "1")) {
          return;
       }
       HostRecoDebugInfoView tb = this.b;
       if (tb != null) {
          tb.a();
       }
       tb = this.b;
       c b = (tb != null)? tb.b: null;
       if (this.c == null && b != null) {
          this.c = true;
          if (tb != null) {
             objArray = tb.getRecoView();
          }
          if (objArray != null) {
             this.addView(objArray);
          }
       }
    label_002f :
       return;
    }
    public final void setPluginRecoViewAdded(boolean p0){
       this.c = p0;
    }
    public final void setReportListener(OnPluginReportListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HostRecoDebugInfoView.class, "7")) {
          return;
       }
       HostRecoDebugInfoView tb = this.b;
       if (tb != null) {
          tb.setReportListener(p0);
       }
       return;
    }
}
