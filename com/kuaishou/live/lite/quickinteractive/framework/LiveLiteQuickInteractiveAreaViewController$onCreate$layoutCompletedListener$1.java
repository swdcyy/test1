package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import vc3.c;
import vc3.a;
import java.util.Collection;
import vc3.f;

public final class LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1 extends Lambda implements a	// class@000ac7
{
    public final RecyclerView $recyclerView;
    public final LiveLiteQuickInteractiveAreaViewController this$0;

    public void LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1(LiveLiteQuickInteractiveAreaViewController p0,RecyclerView p1){
       this.this$0 = p0;
       this.$recyclerView = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1.class, "1")) {
          return;
       }
       LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1 t$recyclerVi = this.$recyclerView;
       a.o(t$recyclerVi, "recyclerView");
       List list = this.this$0.k.subList(0, t$recyclerVi.getChildCount());
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a());
       }
       this.this$0.l.a(uArrayList);
       return;
    }
}
