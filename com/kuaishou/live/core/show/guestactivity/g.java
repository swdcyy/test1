package com.kuaishou.live.core.show.guestactivity.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$d;
import com.kuaishou.live.core.show.guestactivity.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import n92.z;
import n92.w;
import n92.x;
import mm8.a;

public final class g implements b	// class@000bd6
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(LiveAudienceGuestActivityTopListPresenterV2$d.class, new f(this, p1));
       z oz = z.class;
       w ow = new w(this, p1);
       try{
          p0.h(oz, ow);
          p0.h(LiveAudienceGuestActivityTopListPresenterV2.class, new x(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
