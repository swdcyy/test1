package com.yxcorp.gifshow.reminder.friend.data.a$k;
import erd.g;
import com.yxcorp.gifshow.reminder.friend.data.a;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.util.List;
import java.util.Collection;

public final class a$k implements g	// class@001a8c
{
    public final a b;

    public void a$k(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          List items = p0.getResult().getItems();
          if (items != null && (items.isEmpty() ^ 1) == 1) {
             this.b.m2(p0);
          }else {
             this.b.n2(false, false);
          }
       }
       return;
    }
}
