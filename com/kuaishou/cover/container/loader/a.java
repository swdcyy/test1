package com.kuaishou.cover.container.loader.a;
import com.kuaishou.cover.container.loader.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c30.e;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import iu4.c;
import hu4.h;
import hu4.j;
import com.kuaishou.render.engine.tk.b;
import com.kuaishou.cover.container.loader.a$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import android.view.ViewGroup;
import d30.c;
import android.view.View;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.util.Set;
import java.util.Iterator;
import ekd.x0;

public class a extends b	// class@0016d9
{

    public void a(){
       super();
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.s();
       h oh = j.b(this.a, this.e, this.f, new e(this));
       this.m = oh;
       if (oh == null || !oh instanceof b) {
          c.a("UnitLoader: RenderEngineCreator.parse failed");
          return;
       }else {
          oh.s(new a$a(this));
          ViewGroup viewGroup = this.m.d();
          this.l = viewGroup;
          if (viewGroup == null) {
             c.d("UnitLoader: tkRenderEngine.getRootView\(\) is null");
             return;
          }else {
             Map[] mapArray = new Map[]{this.f};
             oh.n(viewGroup, mapArray);
             this.p();
             this.l.setBackgroundColor(0);
             this.l();
             this.b();
             return;
          }
       }
    }
    public String h(){
       return "TK";
    }
    public void o(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       c.d("load by tk");
       if (!PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          b tf = this.f;
          if (tf != null) {
             tf.put("materialId", String.valueOf(this.d));
             tf = this.f;
             boolean b = (this.h == 2)? true: false;
             tf.put("isWidget", Boolean.valueOf(b));
             if (!PatchProxy.applyVoid(objArray, this, uoa, "3") && !TextUtils.isEmpty(this.e)) {
                Uri uri = Uri.parse(this.e);
                Iterator iterator = uri.getQueryParameterNames().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
                      this.f.put(str, x0.a(uri, str));
                   }
                }
             }
          }
       }
       return;
    }
}
