package com.yxcorp.gifshow.activity.web.presenter.a$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.activity.web.presenter.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.Float;

public class a$b implements SlidingPaneLayout$d	// class@0014c5
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       a q = this.a.q;
       if (q != null && q.isSelected()) {
          return;
       }
       if (!this.a.p.isResumed()) {
          return;
       }
       JsNativeEventCommunication jsNativeEven = this.a.p.zh();
       if (jsNativeEven == null) {
          return;
       }
       jsNativeEven.o();
       return;
    }
    public void b(View p0,float p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       a q = this.a.q;
       if (q != null && !q.isSelected()) {
          return;
       }
       JsNativeEventCommunication jsNativeEven = this.a.p.zh();
       if (jsNativeEven == null) {
          return;
       }
       if ((double)p1 - 0x3fe0000000000000 > 0) {
          jsNativeEven.n();
       }else if(!this.a.p.isResumed()){
          return;
       }else {
          jsNativeEven.o();
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a q = this.a.q;
       if (q != null && q.isSelected()) {
          return;
       }
       JsNativeEventCommunication jsNativeEven = this.a.p.zh();
       if (jsNativeEven == null) {
          return;
       }
       jsNativeEven.n();
       return;
    }
}
