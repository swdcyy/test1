package com.yxcorp.gifshow.reminder.friend.data.a$l;
import erd.o;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.util.List;
import java.util.Collection;
import com.kwai.framework.model.response.CursorResponse;
import brd.t;
import jx5.a;

public final class a$l implements o	// class@001a8d
{
    public final a b;

    public void a$l(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$l.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          List items = p0.getResult().getItems();
          p0 = (items != null && (items.isEmpty() ^ 1) == 1)? this.b.s.a(p0.getResult()): t.just(p0.getResult());
          ot = p0;
       }
       return ot;
    }
}
