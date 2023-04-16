package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import ff7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$a;
import nsd.u;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b;
import android.os.Handler;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.os.Looper;
import android.view.ViewGroup;
import msd.l;
import kotlin.jvm.internal.a;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1;
import java.lang.Runnable;
import hf7.a$a;
import gf7.a;
import android.view.View;
import qrd.l1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$calculateFillRate$2;
import msd.a;
import yf7.h;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$hasFinishTag$1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$hasInvalidTag$1;
import android.os.Message;

public final class FullyDrawTagChecker implements a	// class@0010bf
{
    public l a;
    public a b;
    public WeakReference c;
    public final FullyDrawTagChecker$b d;
    public static final String e;
    public static final FullyDrawTagChecker$a f;

    static {
       FullyDrawTagChecker$a uoa = new FullyDrawTagChecker$a(null);
       FullyDrawTagChecker.f = uoa;
       FullyDrawTagChecker.e = "PageMonitor_check_fully_draw"+uoa.hashCode();
    }
    public void FullyDrawTagChecker(){
       super();
       this.c = new WeakReference(null);
       this.d = new FullyDrawTagChecker$b(this, Monitor_ThreadKt.c().getLooper());
    }
    public void a(ViewGroup p0,l p1){
       a.p(p0, "rootView");
       this.stop();
       this.a = p1;
       this.c = new WeakReference(p0);
       a.c(a.d, new FullyDrawTagChecker$start$1(this), null, 2, null);
    }
    public final void b(ViewGroup p0){
       FullyDrawTagChecker tb1;
       a.p(p0, "rootView");
       FullyDrawTagChecker tb = this.b;
       if (tb != null && (tb == null || (tb.g() == true || (p0.getWidth() <= 0 || (p0.getHeight() > 0 && !this.d(p0)))))) {
          if (this.c(p0)) {
             tb1 = this.b;
             if (tb1 != null) {
                tb1.j();
                tb = this.a;
                if (tb != null) {
                   tb.invoke(tb1);
                }
             }
             this.stop();
             return;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (true) {
                if (i < childCount) {
                   FullyDrawTagChecker tb2 = this.b;
                   if (tb2 != null && (tb2 == null || tb2.g() != true)) {
                      View childAt = p0.getChildAt(i);
                      if (childAt == null || (childAt.getHeight() > 0 && childAt.getWidth() > 0)) {
                         if (childAt instanceof ViewGroup) {
                            this.b(childAt);
                         }else if(childAt.getVisibility() || (!this.d(childAt) && this.c(childAt))){
                            tb1 = this.b;
                            if (tb1 != null) {
                               tb1.a(new FullyDrawTagChecker$calculateFillRate$2(childAt));
                            }
                            tb1 = this.b;
                            if (tb1 != null) {
                               tb1.j();
                               tb = this.a;
                               if (tb != null) {
                                  tb.invoke(tb1);
                                  break ;
                               }
                            }
                            break ;
                         }
                      }
                      i = i + 1;
                   }
                }
             }
             this.stop();
             return;
          }
       }
    label_00ab :
       return;
    }
    public final boolean c(View p0){
       FullyDrawTagChecker tag = p0.getTag(R.id.view_status_tag);
       if (tag == null || (!tag instanceof String || !a.g(tag, "FinalFinish"))) {
          return false;
       }
       h.a("PageMonitor FullyDrawTagChecker", "check FullyDrawTag finish of "+p0+" VIEW TAG is "+tag);
       tag = this.b;
       if (tag != null) {
          tag.a(new FullyDrawTagChecker$hasFinishTag$1(p0));
       }
       return true;
    }
    public final boolean d(View p0){
       Object tag = p0.getTag(R.id.view_status_tag);
       boolean b = false;
       if (tag != null && tag instanceof String) {
          if (!a.g("invalid", tag) && (a.g("ignore", tag) || a.g("error", tag))) {
             b = true;
          }
          if (b) {
             FullyDrawTagChecker tb = this.b;
             if (tb != null) {
                tb.a(new FullyDrawTagChecker$hasInvalidTag$1(p0, tag));
             }
          }
       }
    label_0035 :
       return b;
    }
    public final void e(){
       Message message = this.d.obtainMessage();
       a.o(message, "mCalculatorHandler.obtainMessage\(\)");
       message.obj = FullyDrawTagChecker.e;
       this.d.sendMessage(message);
    }
    public void stop(){
       this.d.removeCallbacksAndMessages(null);
       this.c.clear();
       this.a = null;
       this.b = null;
    }
}
