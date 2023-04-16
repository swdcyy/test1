package com.yxcorp.gifshow.v3.editor.PostTaskManager$i;
import erd.o;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PostTaskManager$i implements o	// class@000da1
{
    public static final PostTaskManager$i b;

    static {
       PostTaskManager$i.b = new PostTaskManager$i();
    }
    public void PostTaskManager$i(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostTaskManager$i.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = new Object();
       }
       return obj;
    }
}
