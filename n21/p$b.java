package n21.p$b;
import com.yxcorp.gifshow.widget.m;
import n21.p;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n21.j;
import java.lang.reflect.Type;
import java.util.Map;
import ow0.a;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class p$b extends m	// class@003299
{
    public final View$OnClickListener c;
    public final p d;

    public void p$b(p p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       p$b tc = this.c;
       if (tc != null) {
          tc.onClick(this.d.a);
          if (!this.d.e.getVisibility()) {
             this.d.e.setVisibility(8);
             String str = String.valueOf(this.d.f);
             if (!PatchProxy.applyVoidOneRefs(str, null, j.class, "3")) {
                Map map = a.n(j.a);
                if (map == null) {
                   map = new HashMap();
                }
                map.put(str, j.a());
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putString(b.d("user")+"liveRightTopPendantRedDotHideTime", b.e(map));
                g.a(uEditor);
             }
          }
       }
       return;
    }
}
