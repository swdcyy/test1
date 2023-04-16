package com.yxcorp.gifshow.log.EditFunnel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.log.EditFunnel$funnelTaskId$1;
import msd.l;

public final class EditFunnel	// class@001aea
{
    public static final EditFunnel a;

    static {
       EditFunnel.a = new EditFunnel();
    }
    public void EditFunnel(){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFunnel.class, "1")) {
          return;
       }
       a.p(p0, "taskId");
       PostFunnelManager.j.a().d().l(new EditFunnel$funnelTaskId$1(p0));
       return;
    }
}
