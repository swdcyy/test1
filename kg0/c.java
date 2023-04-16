package kg0.c;
import kg0.b;
import java.lang.Object;
import java.lang.String;
import kg0.a;
import com.kuaishou.house.bridge.model.JsAnchorOrderParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mg0.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import lg0.a;
import mg0.b;
import com.kuaishou.house.model.LiveHouseUpdateBizStatusModel;
import f55.g;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import android.os.Bundle;

public class c implements b	// class@002d29
{

    public void c(){
       super();
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void j3(JsAnchorOrderParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (p0 != null) {
          int i = (p0.mConsultType > null)? 1: 0;
          RxBus.f.b(new a(i, true));
       }
       return;
    }
    public void l8(JsAnchorOrderParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (p0 != null) {
          int i = (p0.mConsultType > null)? 1: 0;
          RxBus.f.b(new a(i, false));
       }
       return;
    }
    public void o2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       int i = (p0.mConsultType > null)? 1: 0;
       RxBus.f.b(new b(i, String.valueOf(p0.mProductId)));
       return;
    }
    public void sa(LiveHouseUpdateBizStatusModel p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       if (p0 != null) {
          RxBus.f.b(p0);
          p1.onSuccess(new JsSuccessResult());
       }else {
          p1.a(-1, "biz status model is null!", null);
       }
       return;
    }
}
