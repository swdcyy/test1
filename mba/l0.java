package mba.l0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import mba.n;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mba.y;
import mba.e0;
import mba.f0;
import mba.g0;
import mba.h0;
import mba.i0;
import mba.j0;
import mba.k0;
import mba.d;
import mba.e;
import mba.f;
import mba.g;
import mba.h;
import mba.i;
import mba.j;
import mba.k;
import mba.l;
import mba.m;
import mba.o;
import mba.p;
import mba.q;
import mba.r;
import mba.s;
import mba.t;
import mba.u;
import mba.v;
import mba.w;
import mba.x;
import mba.z;
import mba.a0;
import mba.b0;
import mba.c0;
import mba.d0;
import java.lang.Class;
import mm8.a;

public final class l0 implements b	// class@002fb9
{

    public void l0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AE_MAGIC_EFFECT", new n(this, p1));
       p0.i("AI_CUT_STYLE", new y(this, p1));
       p0.i("ASSET", new e0(this, p1));
       p0.i("CLIP", new f0(this, p1));
       p0.i("COLOR_FILTER", new g0(this, p1));
       p0.i("COVER", new h0(this, p1));
       p0.i("EDIT_BEAUTY", new i0(this, p1));
       p0.i("EDIT_BODY", new j0(this, p1));
       p0.i("EDIT_MAKEUP", new k0(this, p1));
       p0.i("ENHANCE_COLOR_FILTER", new d(this, p1));
       p0.i("NEW_ENHANCE_COLOR_FILTER_RESULT", new e(this, p1));
       p0.i("ENHANCE_FILTER", new f(this, p1));
       p0.i("FACE_MAGIC_EFFECT", new g(this, p1));
       p0.i("HIGHLIGHT_TIME_EFFECT", new h(this, p1));
       p0.i("KARAOKE", new i(this, p1));
       p0.i("KUAISHAN", new j(this, p1));
       p0.i("LEGACY_MVPARAM", new k(this, p1));
       p0.i("LYRIC", new l(this, p1));
       p0.i("MUSIC", new m(this, p1));
       p0.i("PHOTO_META", new o(this, p1));
       p0.i("PIC_TEMPLATE", new p(this, p1));
       p0.i("PREVIEW", new q(this, p1));
       p0.i("PUBLISH", new r(this, p1));
       p0.i("SCRAWL", new s(this, p1));
       p0.i("SHOOT", new t(this, p1));
       p0.i("STICKER", new u(this, p1));
       p0.i("TEXT", new v(this, p1));
       p0.i("THEME", new w(this, p1));
       p0.i("TIME_EFFECT", new x(this, p1));
       p0.i("TTS", new z(this, p1));
       p0.i("UNDO", new a0(this, p1));
       p0.i("VISUAL_EFFECT", new b0(this, p1));
       c0 uoc0 = new c0(this, p1);
       String str = "VOICE";
       try{
          p0.i(str, uoc0);
          p0.h(c.class, new d0(this, p1));
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
