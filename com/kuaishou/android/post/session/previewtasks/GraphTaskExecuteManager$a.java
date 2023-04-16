package com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$a;
import com.kuaishou.android.post.session.previewtasks.GraphTask$a;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import com.kuaishou.android.post.session.previewtasks.a$a;

public class GraphTaskExecuteManager$a implements GraphTask$a	// class@000eb9
{
    public final GraphTask a;
    public final GraphTaskExecuteManager b;

    public void GraphTaskExecuteManager$a(GraphTaskExecuteManager p0,GraphTask p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager$a.class, "2")) {
          return;
       }
       this.b.o(this.a);
       this.a.p(null);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, GraphTaskExecuteManager$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(this.a.key());
       }
       this.b.d();
       this.a.p(null);
       return;
    }
}
