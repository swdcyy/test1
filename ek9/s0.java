package ek9.s0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ek9.f;
import jk9.a;
import ek9.q;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.b0;
import java.lang.String;
import com.yxcorp.gifshow.comment.CommentConfig;
import ek9.l0;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import ek9.m0;
import ek9.n0;
import ek9.o0;
import com.yxcorp.gifshow.comment.log.a;
import ek9.p0;
import ek9.q0;
import ek9.r0;
import ek9.g;
import ek9.h;
import yk9.d;
import ek9.i;
import ek9.j;
import ek9.k;
import com.yxcorp.gifshow.comment.CommentParams;
import ek9.l;
import ek9.m;
import ek9.n;
import ek9.o;
import ek9.p;
import ek9.r;
import ek9.s;
import ek9.t;
import ek9.u;
import ek9.v;
import ek9.w;
import ek9.x;
import ek9.y;
import ek9.z;
import ek9.a0;
import ek9.c0;
import ek9.d0;
import ek9.e0;
import ek9.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.g0;
import ek9.h0;
import ek9.i0;
import ek9.j0;
import ek9.k0;
import mm8.a;

public final class s0 implements b	// class@0021a0
{

    public void s0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new q(this, p1));
       p0.i("COMMENT_ADD_OBSERVABLE", new b0(this, p1));
       p0.h(CommentConfig.class, new l0(this, p1));
       if (p1.d != null) {
          Accessors.d().b(p1.d).a(p0, p1.d);
       }
       p0.i("COMMENT_DIFFER_NOTIFY_FINISH_OBSERVABLE", new m0(this, p1));
       p0.i("COMMENT_EDITOR_LISTENERS", new n0(this, p1));
       p0.i("COMMENT_PANEL_EDITOR_LISTENER", new o0(this, p1));
       p0.h(a.class, new p0(this, p1));
       p0.i("COMMENT_GLOBAL_ACTION", new q0(this, p1));
       p0.i("COMMENT_HELPER", new r0(this, p1));
       p0.i("COMMENT_HIDE_PANEL_ANIM_END_OBSERVABLE", new g(this, p1));
       p0.i("COMMENT_HIDE_PANEL_OBSERVABLE", new h(this, p1));
       p0.h(d.class, new i(this, p1));
       p0.i("COMMENT_PAGES_ATTACH_OBSERVABLE", new j(this, p1));
       p0.i("COMMENT_PAGES_ATTACH_OBSERVER", new k(this, p1));
       p0.h(CommentParams.class, new l(this, p1));
       if (p1.c != null) {
          Accessors.d().b(p1.c).a(p0, p1.c);
       }
       p0.i("COMMENT_REPLY_OBSERVABLE", new m(this, p1));
       p0.i("COMMENT_REPLY_OBSERVER", new n(this, p1));
       p0.i("COMMENT_SCROLL_TO_TOP_OBSERVER", new o(this, p1));
       p0.i("COMMENT_SCROLL_TO_TOP_OBSERVABLE", new p(this, p1));
       p0.i("COMMENT_ITEM_ANIM_OBSERVABLE", new r(this, p1));
       p0.i("COMMENT_SHOW_PANEL_ANIM_END_OBSERVABLE", new s(this, p1));
       p0.i("COMMENT_SHOW_PANEL_ANIM_END_OBSERVER", new t(this, p1));
       p0.i("COMMENT_SHOW_PANEL_OBSERVABLE", new u(this, p1));
       p0.i("COMMENT_STAT_PARAM", new v(this, p1));
       p0.i("COMMENT_FRAGMENT", new w(this, p1));
       p0.i("COMMENT_CURRENT_PROGRESS", new x(this, p1));
       p0.i("COMMENT_CURRENT_TRANS_CODE_TYPE", new y(this, p1));
       p0.i("COMMENT_EDITOR_FACTORY", new z(this, p1));
       p0.i("COMMENT_ENABLE_EMOTION", new a0(this, p1));
       p0.i("COMMENT_FLOAT_EDIT_THEME", new c0(this, p1));
       p0.i("COMMENT_ON_REPLY_LISTENERS", new d0(this, p1));
       p0.i("COMMENT_FRAME_TOP_CHANGE_LISTENERS", new e0(this, p1));
       p0.i("COMMENT_SCROLL_LISTENERS", new f0(this, p1));
       p0.h(QPhoto.class, new g0(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       p0.i("DETAIL_SCROLL_DISTANCE", new h0(this, p1));
       p0.i("COMMENT_RECYCLE_VIEW_SCROLL_FAST_STATE", new i0(this, p1));
       j0 oj0 = new j0(this, p1);
       String str = "COMMENT_SHOW_SUB_COMMENT_PANEL";
       try{
          p0.i(str, oj0);
          p0.h(f.class, new k0(this, p1));
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
