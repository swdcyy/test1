package com.yxcorp.gifshow.v3.editor.text.z;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import com.yxcorp.gifshow.v3.editor.text.k;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.text.r;
import com.yxcorp.gifshow.v3.editor.text.s;
import com.yxcorp.gifshow.v3.editor.text.t;
import com.yxcorp.gifshow.v3.editor.text.u;
import com.yxcorp.gifshow.v3.editor.text.v;
import com.yxcorp.gifshow.v3.editor.text.w;
import com.yxcorp.gifshow.v3.editor.text.x;
import com.yxcorp.gifshow.v3.editor.text.y;
import com.yxcorp.gifshow.v3.editor.text.a;
import com.yxcorp.gifshow.v3.editor.text.b;
import com.yxcorp.gifshow.v3.editor.text.c;
import com.yxcorp.gifshow.v3.editor.text.d;
import com.yxcorp.gifshow.v3.editor.text.e;
import com.yxcorp.gifshow.v3.editor.text.f;
import com.yxcorp.gifshow.v3.editor.text.g;
import com.yxcorp.gifshow.v3.editor.text.h;
import com.yxcorp.gifshow.v3.editor.text.i;
import com.yxcorp.gifshow.v3.editor.text.j;
import com.yxcorp.gifshow.v3.editor.text.l;
import com.yxcorp.gifshow.v3.editor.text.m;
import com.yxcorp.gifshow.v3.editor.text.n;
import com.yxcorp.gifshow.v3.editor.text.o;
import com.yxcorp.gifshow.v3.editor.text.p;
import com.yxcorp.gifshow.v3.editor.text.q;
import java.lang.Class;
import mm8.a;

public final class z implements b	// class@001513
{

    public void z(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER", new k(this, p1));
       p0.i("CLICK_ADD_TEXT_BUTTON", new r(this, p1));
       p0.i("COVER_OUTFILE_EVENT", new s(this, p1));
       p0.i("CURRENT_PROGRESS", new t(this, p1));
       p0.i("DECORATION_CONTAINER_VIEW", new u(this, p1));
       p0.i("DECORATION_IMPL", new v(this, p1));
       p0.i("DECORATION_PLAYER", new w(this, p1));
       p0.i("DECORATION_THUMBNAIL_UPDATE", new x(this, p1));
       p0.i("DECORATION_TIMELINE_UPDATE", new y(this, p1));
       p0.i("DECORATION_EDITING_ACTION", new a(this, p1));
       p0.i("EDITOR_HELPER_CONTRACT", new b(this, p1));
       p0.i("EDITOR_SUBTITLE_LIST_MANAGER", new c(this, p1));
       p0.i("TIMELINE_DELEGATE", new d(this, p1));
       p0.i("FONT_VIEW_MODEL", new e(this, p1));
       p0.i("FRAGMENT", new f(this, p1));
       p0.i("PAGE_TAG", new g(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new h(this, p1));
       p0.i("STOP_SCROLL_LISTENER", new i(this, p1));
       p0.i("SWITCH_TEXT_TAB_EVENT", new j(this, p1));
       p0.i("TEXT_RESTORE_FINISH_EVENT", new l(this, p1));
       p0.i("TEXT_TYPE", new m(this, p1));
       p0.i("TIMELINE_RANGE_HANDLER_LISTENER", new n(this, p1));
       p0.i("TIME_LINE_SAVE_DATA", new o(this, p1));
       p op = new p(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, op);
          p0.h(TextEditorV3Fragment$a.class, new q(this, p1));
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
