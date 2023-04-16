package com.yxcorp.gifshow.v3.editor.PostTaskManager$h;
import erd.r;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class PostTaskManager$h implements r	// class@000da0
{
    public static final PostTaskManager$h b;

    static {
       PostTaskManager$h.b = new PostTaskManager$h();
    }
    public void PostTaskManager$h(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, PostTaskManager$h.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.isEmpty();
       }
       return b;
    }
}
