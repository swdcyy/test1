package com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.k;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.n;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.o;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.p;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.q;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.r;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.s;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.t;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.u;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.a;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.b;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.c;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.d;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.e;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.f;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.g;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.h;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.i;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.j;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.l;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.m;
import java.lang.Class;
import mm8.a;

public final class v implements b	// class@000fe6
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER", new k(this, p1));
       p0.i("COVER_OUTFILE_EVENT", new n(this, p1));
       p0.i("CURRENT_PROGRESS", new o(this, p1));
       p0.i("DECORATION_CONTAINER_VIEW", new p(this, p1));
       p0.i("DECORATION_IMPL", new q(this, p1));
       p0.i("DECORATION_PLAYER", new r(this, p1));
       p0.i("DECORATION_THUMBNAIL_UPDATE", new s(this, p1));
       p0.i("DECORATION_TIMELINE_UPDATE", new t(this, p1));
       p0.i("DECORATION_EDITING_ACTION", new u(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new a(this, p1));
       p0.i("EDITOR_SUBTITLE_LIST_MANAGER", new b(this, p1));
       p0.i("FONT_VIEW_MODEL", new c(this, p1));
       p0.i("FRAGMENT", new d(this, p1));
       p0.i("PAGE_TAG", new e(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new f(this, p1));
       p0.i("TEXT_RESTORE_FINISH_EVENT", new g(this, p1));
       p0.i("TEXT_TYPE", new h(this, p1));
       p0.i("TIMELINE_RANGE_HANDLER_LISTENER", new i(this, p1));
       p0.i("TIME_LINE_SAVE_DATA", new j(this, p1));
       l ol = new l(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, ol);
          p0.h(KtvLyricEditorFragment$a.class, new m(this, p1));
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
