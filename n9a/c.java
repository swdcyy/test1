package n9a.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import q2a.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;
import n9a.g;
import java.util.Map;
import java.util.HashMap;

public class c implements PopupInterface$f, g	// class@00310a
{
    public final QPhoto b;
    public final PhotoDetailParam c;
    public PresenterV2 d;

    public void c(QPhoto p0,PhotoDetailParam p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d02d5, p2, false);
       d uod = new d();
       this.d = uod;
       uod.f(view);
       Object[] objArray = new Object[]{this,new c("FOLLOW_GUIDE_POPUP", p0)};
       this.d.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       p0 = this.d;
       if (p0 != null) {
          p0.destroy();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new g());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
}
