package com.yxcorp.gifshow.reminder.friend.data.a$j;
import erd.g;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lec.t;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import j9c.b;
import java.util.List;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;
import eec.a;

public final class a$j implements g	// class@001a8b
{
    public final a b;

    public void a$j(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$j.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, t.class, "8")){
          p0 = b.c(-7, FriendTabNotify$Common.class);
          if (p0 != null) {
             p0.e.clear();
          }
       }
       b.a(-129117978).d(this.b.q, null);
       this.b.l2().b();
       return;
    }
}
