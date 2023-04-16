package com.kuaishou.live.lite.comment.manager.MockCommentManager$mockComment$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.manager.MockCommentManager;
import java.lang.Object;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import w93.a;
import java.util.List;
import java.lang.Integer;
import java.lang.Runnable;
import e93.f;
import java.util.Iterator;
import w93.a$a;

public final class MockCommentManager$mockComment$1 extends Lambda implements l	// class@000803
{
    public final MockCommentManager this$0;

    public void MockCommentManager$mockComment$1(MockCommentManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(AbstractCommentMessage p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MockCommentManager$mockComment$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       MockCommentManager b = this.this$0.b;
       Objects.requireNonNull(b);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(p0, b, uoa, str)) {
          a.p(p0, "message");
          b.i.add(p0);
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), b, uoa, "12")) {
             f.f(b.o);
             Iterator iterator = b.f.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(b.i, 1);
             }
          }
       }
       return;
    }
}
