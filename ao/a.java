package ao.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ao.a$a;
import erd.g;
import crd.b;
import vxc.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import byc.c;
import android.view.View;

public final class a extends PresenterV2	// class@0001fd
{
    public KwaiYodaWebView p;
    public b q;

    public void a(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       a.m(activity);
       this.q = activity.m().subscribe(new a$a(this));
       a tp = this.p;
       if (tp != null) {
          if (tp != null) {
             e jsInjectKwai = tp.getJsInjectKwai();
             if (jsInjectKwai != null) {
                JsNativeEventCommunication jsNativeEven = jsInjectKwai.i();
                if (jsNativeEven != null) {
                   objArray = jsNativeEven.e();
                }
             }
          }
          tp.setLifeEventCallback(objArray);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null && !tq.isDisposed()) {
          tq = this.q;
          if (tq != null) {
             tq.dispose();
          }
       }
       try{
          tq = this.p;
          if (tq != null) {
             tq.setLifeEventCallback(null);
          }
          tq = this.p;
          if (tq != null) {
             tq.destroy();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       KwaiYodaWebView kwaiYodaWebV = (p0 != null)? p0.findViewById(R.id.kem_kwai_bubble_web_view): null;
       this.p = kwaiYodaWebV;
       return;
    }
}
