package com.kuaishou.android.post.funnel.PostFunnelManager$d$a;
import erd.g;
import com.kuaishou.android.post.funnel.PostFunnelManager$d;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import laa.m0;
import com.kuaishou.android.post.funnel.PostFunnelManager;

public final class PostFunnelManager$d$a implements g	// class@000eaf
{
    public final PostFunnelManager$d b;

    public void PostFunnelManager$d$a(PostFunnelManager$d p0){
       this.b = p0;
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager$d$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       File uFile = p0.f0();
       a.o(uFile, "it.rootDirectory");
       String absolutePath = uFile.getAbsolutePath();
       a.o(absolutePath, "it.rootDirectory.absolutePath");
       this.b.a.c(absolutePath);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
