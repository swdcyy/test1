package com.yxcorp.gifshow.reminder.friend.like.c;
import erd.g;
import com.yxcorp.gifshow.reminder.friend.like.e;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.friend.data.FriendLikeUserResponse;
import qvb.n0;
import java.util.Collection;
import ekd.q;
import pdc.r;
import ekd.q$b;

public final class c implements g	// class@001abe
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (tb.q != null && (!tb.K() && !q.f(p0.mItems))) {
          q.c(p0.mItems, new r(tb));
       }
    label_0022 :
       return;
    }
}
