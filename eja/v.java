package eja.v;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.String;
import xf6.l;
import tkd.b;
import tkd.d;
import lv5.c;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lv5.b;
import tm5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import ekd.m1;
import eja.y;
import java.util.Map;
import java.util.HashMap;

public class v extends a implements g	// class@002701
{
    public View r;
    public ViewStubInflater2 s;

    public void v(CardStyle p0){
       super();
       if (l.e("ENABLE_FOLLOW_LIVE_DYNAMIC_TAG", 0) != 2) {
          this.U7(d.a(-242212848).av(p0));
       }else {
          this.U7(d.a(0x2bcad739).tT(p0));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       v tr = this.r;
       if (tr instanceof ViewStub) {
          tr.setLayoutResource(R.layout.arg_RES_7f0d0946);
          this.r.inflate();
       }
       this.P8(true);
       return;
    }
    public void doBindView(View p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "1")) {
          return;
       }
       ViewStubInflater2 viewStubInfl = PatchProxy.apply(null, this, ov, "3");
       if (viewStubInfl != PatchProxyResult.class) {
       }else {
          viewStubInfl = new ViewStubInflater2(0x7f0a02d8);
       }
       this.s = viewStubInfl;
       if (viewStubInfl != null) {
          viewStubInfl.d(this.m8());
       }
       this.r = m1.f(p0, 0x7f0a215e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(v.class, new y());
       }else {
          obj.put(v.class, null);
       }
       return obj;
    }
}
