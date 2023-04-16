package com.kuaishou.android.post.funnel.PostFunnelManager$d;
import lq.l;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import java.lang.Object;
import lq.l$a;
import lq.j;
import lq.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import java.util.Collection;
import kotlin.jvm.internal.a;
import com.kuaishou.bizmonitor.framework.funnel.a;
import java.io.File;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.android.post.funnel.PostFunnelManager$d$a;
import com.kuaishou.android.post.funnel.PostFunnelManager$d$b;
import erd.g;
import crd.b;

public final class PostFunnelManager$d implements l	// class@000eb1
{
    public final PostFunnelManager a;

    public void PostFunnelManager$d(PostFunnelManager p0){
       this.a = p0;
       super();
    }
    public void a(l$a p0){
       j.a(this, p0);
    }
    public void b(i p0,boolean p1){
       PostFunnelManager$d uod = PostFunnelManager$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "2")) {
          return;
       }
       j.c(this, p0, p1);
       PostFunnelManager.j.b("");
       this.a.d().h();
       return;
    }
    public void c(){
       j.b(this);
    }
    public void d(i p0){
       j.d(this, p0);
    }
    public void e(i p0,Collection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostFunnelManager$d.class, "1")) {
          return;
       }
       a.p(p1, "drafts");
       File uFile = a.f().g("", b.class, "");
       if (!p1.isEmpty() && uFile.exists()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (p1.size() > 1 && uoc.a1() == Workspace$Type.ATLAS) {
                continue ;
             }
             DraftFileManager.E().m0(uoc).observeOn(d.a).subscribe(new PostFunnelManager$d$a(this), new PostFunnelManager$d$b(this));
          }
       }
       return;
    }
}
