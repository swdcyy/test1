package com.yxcorp.gifshow.v3.editor.PostTaskManager$d;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.l1;

public final class PostTaskManager$d implements Callable	// class@000d9c
{
    public final PostTaskManager$a b;

    public void PostTaskManager$d(PostTaskManager$a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, PostTaskManager$d.class, "1")) {
       }else {
          this.b.e();
       }
       return l1.a;
    }
}
