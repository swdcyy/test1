package cl9.k1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cl9.h0;
import cl9.s0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jk9.a;
import cl9.c1;
import java.lang.Class;
import cl9.d1;
import cl9.e1;
import com.yxcorp.gifshow.comment.CommentConfig;
import cl9.f1;
import com.yxcorp.gifshow.comment.log.a;
import cl9.g1;
import cl9.h1;
import cl9.i1;
import cl9.j1;
import cl9.i0;
import yk9.d;
import cl9.j0;
import com.yxcorp.gifshow.comment.CommentParams;
import cl9.k0;
import cl9.l0;
import cl9.m0;
import cl9.n0;
import cl9.o0;
import cl9.p0;
import cl9.q0;
import cl9.r0;
import cl9.t0;
import cl9.u0;
import com.yxcorp.gifshow.entity.QPhoto;
import cl9.v0;
import cl9.w0;
import com.yxcorp.gifshow.entity.QPreInfo;
import cl9.x0;
import cl9.y0;
import cl9.z0;
import cl9.a1;
import cl9.b1;
import mm8.a;

public final class k1 implements b	// class@00063d
{

    public void k1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("COMMENT_ACTIVITY_INFO", new s0(this, p1));
       p0.h(a.class, new c1(this, p1));
       p0.i("COMMENT_CANCEL_DISLIKED_SUBJECT", new d1(this, p1));
       p0.i("COMMENT_CANCEL_LIKED_SUBJECT", new e1(this, p1));
       p0.h(CommentConfig.class, new f1(this, p1));
       p0.h(a.class, new g1(this, p1));
       p0.i("COMMENT_GLOBAL_ACTION", new h1(this, p1));
       p0.i("COMMENT_HELPER", new i1(this, p1));
       p0.i("COMMENT_HIDE_PANEL_ANIM_END_OBSERVABLE", new j1(this, p1));
       p0.i("COMMENT_HIDE_PANEL_OBSERVABLE", new i0(this, p1));
       p0.h(d.class, new j0(this, p1));
       p0.h(CommentParams.class, new k0(this, p1));
       p0.i("COMMENT_REPLY_OBSERVER", new l0(this, p1));
       p0.i("COMMENT_ITEM_ANIM_OBSERVER", new m0(this, p1));
       p0.i("COMMENT_SHOW_PANEL_OBSERVABLE", new n0(this, p1));
       p0.i("COMMENT_STAT_PARAM", new o0(this, p1));
       p0.i("COMMENT_TOP_OBSERVER", new p0(this, p1));
       p0.i("COMMENT_DISLIKE_BUBBLE_SUBJECT", new q0(this, p1));
       p0.i("COMMENT_REQUESTING_DISLIKE_MAP", new r0(this, p1));
       p0.i("COMMENT_ENABLE_EMOTION", new t0(this, p1));
       p0.i("comment_loading_more", new u0(this, p1));
       p0.h(QPhoto.class, new v0(this, p1));
       p0.i("PHOTO_INDEX", new w0(this, p1));
       p0.h(QPreInfo.class, new x0(this, p1));
       p0.i("COMMENT_REQUESTING_LIKE_MAP", new y0(this, p1));
       p0.i("COMMENT_RECYCLE_VIEW_SCROLL_FAST_STATE", new z0(this, p1));
       a1 uoa1 = new a1(this, p1);
       String str = "COMMENT_SHOW_SUB_COMMENT_PANEL";
       try{
          p0.i(str, uoa1);
          p0.h(h0.class, new b1(this, p1));
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
