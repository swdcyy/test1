package jz8.t4;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import jz8.f4;
import jz8.k4;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.l4;
import jz8.m4;
import jz8.n4;
import jz8.o4;
import jz8.p4;
import jz8.q4;
import jz8.r4;
import jz8.s4;
import jz8.g4;
import jz8.h4;
import sy8.l;
import jz8.i4;
import java.lang.Class;
import jz8.j4;
import mm8.a;

public final class t4 implements b	// class@002a53
{

    public void t4(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AVATAR_LIVE_STATUS", new k4(this, p1));
       p0.i("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK", new l4(this, p1));
       p0.i("DETAIL_TOP_RIGHT_OBSERVABLE", new m4(this, p1));
       p0.i("DETAIL_TOP_RIGHT_HIDE_OBSERVER", new n4(this, p1));
       p0.i("SIDE_TK_HALF_PAGE_PUBLISH", new o4(this, p1));
       p0.i("thanos_side_window_clean_controller", new p4(this, p1));
       p0.i("NASA_SIDEBAR_STATUS", new q4(this, p1));
       p0.i("SLIDE_PLAY_FOLLOW_ANIM_STATUS_OBSERVABLE", new r4(this, p1));
       p0.i("SLIDE_PLAY_FOLLOW_ANIM_STATUS_OBSERVER", new s4(this, p1));
       p0.i("SLIDE_PLAY_SIZE_SUPPLIER", new g4(this, p1));
       p0.i("TAG_SHOULD_AUTO_PLAY_NEXT_SERIAL", new h4(this, p1));
       l ol = l.class;
       i4 oi4 = new i4(this, p1);
       try{
          p0.h(ol, oi4);
          p0.h(f4.class, new j4(this, p1));
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
