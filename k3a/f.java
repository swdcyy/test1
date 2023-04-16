package k3a.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k3a.g;
import java.util.List;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import java.util.HashMap;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.view.View;
import android.graphics.Rect;
import k3a.a;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;
import qrd.l1;

public final class f implements ViewTreeObserver$OnGlobalLayoutListener	// class@002bc8
{
    public final g b;
    public final List c;
    public final l d;

    public void f(g p0,List p1,l p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       HashMap hashMap = new HashMap();
       Iterator iterator = ViewGroupKt.b(this.b.a).iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (obj.getGlobalVisibleRect(new Rect())) {
             this.c.get(i).o(true);
             hashMap.put(this.b.a(this.c.get(i).i()), "SHOW");
          }else {
             this.c.get(i).o(false);
             hashMap.put(this.b.a(this.c.get(i).i()), "HIDE");
          }
          i = i1;
       }
       f td = this.d;
       if (td != null) {
          td.invoke(hashMap);
       }
       return;
    }
}
