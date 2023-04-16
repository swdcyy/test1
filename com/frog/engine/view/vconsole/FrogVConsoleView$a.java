package com.frog.engine.view.vconsole.FrogVConsoleView$a;
import android.os.Handler;
import com.frog.engine.view.vconsole.FrogVConsoleView;
import android.os.Looper;
import java.util.LinkedList;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;

public class FrogVConsoleView$a extends Handler	// class@0015a6
{
    public final Queue a;
    public final FrogVConsoleView b;

    public void FrogVConsoleView$a(FrogVConsoleView p0,Looper p1){
       this.b = p0;
       super(p1);
       this.a = new LinkedList();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogVConsoleView$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       Message what = p0.what;
       if (what != null) {
          if (what != 1) {
          }
       }else {
          p0 = p0.obj;
          if (p0 instanceof String) {
             this.a.offer(p0);
          }
       }
       if (!this.b.canAppendLog()) {
       }else {
          while (this.a.size()) {
             this.b.evaluateJavascript(this.a.poll());
          }
          return;
       }
    }
}
