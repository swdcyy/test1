package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$b$a;
import zbc.c;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import g7c.i;
import zbc.b;

public class ExploreFriendContactFragment$b$a implements c	// class@0017fd
{
    public final ExploreFriendContactFragment$b a;

    public void ExploreFriendContactFragment$b$a(ExploreFriendContactFragment$b p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment$b$a.class, "1")) {
          return;
       }
       this.a.x.Lh(p0);
       return;
    }
    public void c(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment$b$a.class, "3")) {
          return;
       }
       i.a(p0, 85, "follow");
       return;
    }
    public void d(User p0){
       b.a(this, p0);
    }
    public void f(User p0){
       b.c(this, p0);
    }
    public void g(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment$b$a.class, "2")) {
          return;
       }
       this.a.x.Lh(p0);
       return;
    }
}
