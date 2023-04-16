package com.yxcorp.gifshow.reminder.friend.data.a$i;
import erd.o;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.response.CursorResponse;
import jx5.a;

public final class a$i implements o	// class@001a8a
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$i.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.s.a(p0);
       }
       return ot;
    }
}
