package hy0.l;
import u07.u;
import hy0.p;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import hy0.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import hy0.x;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import ow0.a;
import androidx.collection.ArrayMap;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hy0.v;

public final class l implements u	// class@0027ac
{
    public final p b;
    public final String c;

    public void l(p p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       l tb = this.b;
       tb.P8(this.c, tb.w.getPrice());
       String str = String.valueOf(tb.w.getLivingTypeVal());
       int i = tb.v ^ 1;
       y oy = y.class;
       if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(i), null, oy, "5")) {
          Map map = a.j(new x().getType());
          if (map == null) {
             map = new ArrayMap();
          }
          map.put(str, Boolean.valueOf(i));
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"liveFirstSendBulletCommentTips", b.e(map));
          g.a(uEditor);
       }
       v.a(tb.p.b().a(), tb.w.getPrice(), tb.w.getLivingTypeVal(), 1, tb.v);
       return;
    }
}
