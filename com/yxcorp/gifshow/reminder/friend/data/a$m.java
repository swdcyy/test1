package com.yxcorp.gifshow.reminder.friend.data.a$m;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0$a;
import kotlin.jvm.internal.a;

public final class a$m implements o	// class@001a8e
{
    public static final a$m b;

    static {
       a$m.b = new a$m();
    }
    public void a$m(){
       super();
    }
    public Object apply(Object p0){
       n0$a uoa = PatchProxy.applyOneRefs(p0, this, a$m.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa = new n0$a(p0, false, true);
       }
       return uoa;
    }
}
