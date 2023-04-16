package com.yxcorp.gifshow.relation.friend.manage.delegate.a$b;
import sfc.a;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import tac.c;

public final class a$b extends a	// class@0018bb
{
    public final a c;
    public final boolean d;
    public final BaseFeed e;
    public final boolean f;

    public void a$b(a p0,boolean p1,BaseFeed p2,boolean p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "e");
       if (this.d != null) {
          super.b(p0);
       }
       a$b te = this.e;
       a$b tf = this.f;
       a = this.c.a;
       String str = (a != null && a.F() == true)? "removed": null;
       c.a(te, tf, str);
       return;
    }
}
