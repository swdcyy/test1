package com.kuaishou.live.common.core.component.bottombubble.notices.wish.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.f;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class f$a implements d$a	// class@001022
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(LiveWishNoticeInfo p0,long p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.p0(p0, p1);
       return;
    }
}
