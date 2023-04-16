package h83.c$a;
import androidx.lifecycle.Observer;
import h83.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import msd.l;

public final class c$a implements Observer	// class@002cf5
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else if(p0 != null){
          c$a tb = this.b;
          LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1 oonCreate$1$ = new LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$1(this.b);
          LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2 oonCreate$1$1 = new LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$2(this.b);
          LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3 oonCreate$1$2 = new LiveLiteMultiLineWidgetContainerViewController$onCreate$1$1$3(this.b);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidFourRefs(p0, oonCreate$1$, oonCreate$1$1, oonCreate$1$2, tb, c.class, "2")) {
             ArrayList uArrayList = new ArrayList(tb.j.keySet());
             ArrayList uArrayList1 = new ArrayList();
             p0 = p0.iterator();
             while (p0.hasNext()) {
                a uoa = p0.next();
                if (tb.j.containsKey(String.valueOf(uoa.h.userId))) {
                   oonCreate$1$1.invoke(uoa);
                   uArrayList.remove(String.valueOf(uoa.h.userId));
                }else {
                   uArrayList1.add(uoa);
                }
             }
             p0 = uArrayList.iterator();
             while (p0.hasNext()) {
                oonCreate$1$2.invoke(p0.next());
             }
             p0 = uArrayList1.iterator();
             while (p0.hasNext()) {
                oonCreate$1$.invoke(p0.next());
             }
          }
       }
       return;
    }
}
