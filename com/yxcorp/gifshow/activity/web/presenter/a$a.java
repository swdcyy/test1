package com.yxcorp.gifshow.activity.web.presenter.a$a;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gifshow.activity.web.presenter.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import java.util.Objects;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import tra.b;
import q87.c;

public class a$a implements View$OnAttachStateChangeListener	// class@0014c4
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a q = this.b.q;
       if (q != null && q.isSelected()) {
          a$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, a.class, "7") && (tb.u != null && (tb.s != null && tb.p.Ch() != null))) {
             tb.u = false;
             tb.p.Ch().onResume();
             Object[] objArray = new Object[false];
             b.C().w("ActivityTabTrimMemoryPresenter", "call web view onResume", objArray);
          }
       }
    label_0051 :
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
