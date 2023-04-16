package com.yxcorp.gifshow.v3.editor.segment.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import com.yxcorp.gifshow.v3.editor.segment.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.c;
import com.yxcorp.gifshow.v3.editor.segment.d;
import com.yxcorp.gifshow.v3.editor.segment.e;
import com.yxcorp.gifshow.v3.editor.segment.f;
import com.yxcorp.gifshow.v3.editor.segment.g;
import com.yxcorp.gifshow.v3.editor.segment.h;
import com.yxcorp.gifshow.v3.editor.segment.i;
import com.yxcorp.gifshow.v3.editor.segment.j;
import com.yxcorp.gifshow.v3.editor.segment.a;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@0011d4
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_HELPER_CONTRACT", new b(this, p1));
       p0.i("FRAGMENT", new c(this, p1));
       p0.i("VIDEO_EDIT_OPERATION_PACKAGE", new d(this, p1));
       p0.i("segment_from_edit_page", new e(this, p1));
       p0.i("SEGMENT_IS_CHANGED", new f(this, p1));
       p0.i("SEGMENT_ROTATE_CHANGED", new g(this, p1));
       p0.i("segment_selected_model", new h(this, p1));
       p0.i("segment_timeline_animation_end", new i(this, p1));
       j oj = new j(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, oj);
          p0.h(SegmentEditorFragment$a.class, new a(this, p1));
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
