package lk0.h;
import a1.b$e;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.kuaishou.krn.utils.c;
import java.lang.Integer;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h implements b$e	// class@002f8a
{
    public final int a;

    public void h(int p0){
       this.a = p0;
    }
    public final void onInflateFinished(View p0,int p1,ViewGroup p2){
       h ta = this.a;
       Log.h("LayoutCacheManager", "pre create Success for: "+p1, null);
       Map c = c.c;
       List list = c.get(Integer.valueOf(ta));
       if (list == null) {
          list = new CopyOnWriteArrayList();
          c.put(Integer.valueOf(ta), list);
       }
       list.add(p0);
       return;
    }
}
