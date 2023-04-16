package com.yxcorp.gifshow.v3.EditorManager$a;
import hkd.d;
import com.yxcorp.gifshow.v3.EditorManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.EditorManager$b;

public class EditorManager$a extends d	// class@000d1e
{
    public final EditorManager b;

    public void EditorManager$a(EditorManager p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, EditorManager$a.class, "1")) {
          return;
       }
       this.b.M();
       Iterator iterator = this.b.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       EditorManager$a tb = this.b;
       tb.p = tb.o;
       tb.o = null;
       return;
    }
}
