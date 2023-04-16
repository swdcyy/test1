package h99.b;
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
import h99.c;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import zf6.k;
import android.graphics.drawable.Drawable;
import zf6.j;
import h99.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class b extends c implements e, g	// class@00256d
{
    public QPhoto c;

    public void b(){
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
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(b.class, new c());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public View q(ViewGroup p0){
       DetailToolBarButtonView uDetailToolB = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (uDetailToolB != PatchProxyResult.class) {
       }else {
          uDetailToolB = p0.findViewById(R.id.back_btn);
          uDetailToolB.k(R.drawable.arg_RES_7f0809fb, 0x7f0809b1);
          Drawable uDrawable = (!k.d() || k.e())? j.j(R.drawable.arg_RES_7f0809b2, 1): j.j(R.drawable.arg_RES_7f0809b2, 2);
          uDetailToolB.setImageDrawable(uDrawable);
          uDetailToolB.setBottomDrawable(uDrawable);
          uDetailToolB.setOnClickListener(new a(p0));
       }
       return uDetailToolB;
    }
}
