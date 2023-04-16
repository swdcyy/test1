package com.kuaishou.ax2c.PreLoader$3;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.util.concurrent.ConcurrentHashMap;

public class PreLoader$3 implements LifecycleObserver	// class@000fba
{
    public final PreLoader this$0;
    public final Context val$context;

    public void PreLoader$3(PreLoader p0,Context p1){
       this.this$0 = p0;
       this.val$context = p1;
       super();
    }
    public void onContextDestroy(){
       List list = this.this$0.indexMap.get(this.val$context);
       if (list == null) {
          return;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          this.this$0.map.remove(Integer.valueOf(iterator.next().intValue()));
       }
       this.this$0.indexMap.remove(this.val$context);
       return;
    }
}
