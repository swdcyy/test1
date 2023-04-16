package h99.f;
import b3a.e;
import im8.g;
import vl8.c;
import android.view.View;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import b3a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.nonslide.toolbar.a;
import h99.g;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import zf6.k;
import android.widget.ImageView;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import h99.e;
import android.view.View$OnClickListener;

public class f extends c implements e, g	// class@002572
{
    public PhotoDetailParam c;
    public f d;
    public HotChannel e;
    public BaseFragment f;

    public void f(){
       super();
    }
    public void C(View p0){
    }
    public h I(View p0){
       return this.N(p0);
    }
    public void M(View p0){
    }
    public h N(DetailToolBarButtonView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(f.class, new g());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public View q(ViewGroup p0){
       DetailToolBarButtonView uDetailToolB = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (uDetailToolB != PatchProxyResult.class) {
       }else {
          uDetailToolB = p0.findViewById(R.id.more_button);
          int i = 0x7f0809b8;
          uDetailToolB.k(i, R.drawable.arg_RES_7f0809b9);
          if (k.d() && !k.e()) {
             i = 0x7f0809b9;
          }
          uDetailToolB.k(i, i);
          uDetailToolB.setVisibility(0);
          uDetailToolB.setOnClickListener(new e(this, a.a(p0)));
       }
       return uDetailToolB;
    }
}
