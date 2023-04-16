package com.kuaishou.live.core.basic.widget.tabhost.a;
import com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment$b;
import android.database.Observable;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.ArrayList;

public class a extends Observable implements LiveTabHostFragment$b	// class@00091d
{

    public void a(){
       super();
    }
    public void a(PagerSlidingTabStrip$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Iterator iterator = this.mObservers.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
