package ao2.k$a;
import tk2.e;
import ao2.k;
import f55.g;
import java.lang.Object;
import tk2.d;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import vk2.b;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.kwai.library.widget.button.SlipSwitchButton;

public class k$a implements e	// class@0002a2
{
    public final g a;
    public final k b;

    public void k$a(k p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       d.a(this);
    }
    public void b(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       d.m(this, p0);
    }
    public void c(){
       d.l(this);
    }
    public void d(){
       d.b(this);
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       b.e(a1.p(R.string.arg_RES_7f102cdb));
       this.a.onSuccess(new JsSuccessResult());
       return;
    }
    public void f(String p0,boolean p1){
       d.d(this, p0, p1);
    }
    public void g(int p0){
       d.h(this, p0);
    }
    public void h(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       d.k(this, p0);
    }
    public void i(boolean p0,SlipSwitchButton p1){
       d.i(this, p0, p1);
    }
    public void j(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       d.j(this, p0);
    }
    public void k(){
       d.g(this);
    }
    public void l(){
       d.c(this);
    }
    public void m(String p0){
       d.f(this, p0);
    }
}
