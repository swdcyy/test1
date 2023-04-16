package com.kwai.debugtools.plugin.wrapper.HostHodorDebugInfoView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import ui5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class HostHodorDebugInfoView extends FrameLayout	// class@000d01
{
    public a b;
    public boolean c;

    public void HostHodorDebugInfoView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void HostHodorDebugInfoView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void HostHodorDebugInfoView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new a();
       this.a();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HostHodorDebugInfoView.class, "1")) {
          return;
       }
       HostHodorDebugInfoView tb = this.b;
       if (tb != null) {
          tb.a();
       }
       if (this.c == null) {
          tb = this.b;
          if (tb != null && tb.b == true) {
             this.c = true;
             if (tb != null) {
                objArray = tb.getHodorView();
             }
             if (objArray != null) {
                this.addView(objArray);
             }
          }
       }
       return;
    }
}
