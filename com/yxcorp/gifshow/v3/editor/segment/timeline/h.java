package com.yxcorp.gifshow.v3.editor.segment.timeline.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import com.yxcorp.gifshow.v3.editor.segment.timeline.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.timeline.b;
import com.yxcorp.gifshow.v3.editor.segment.timeline.c;
import com.yxcorp.gifshow.v3.editor.segment.timeline.d;
import com.yxcorp.gifshow.v3.editor.segment.timeline.e;
import com.yxcorp.gifshow.v3.editor.segment.timeline.f;
import com.yxcorp.gifshow.v3.editor.segment.timeline.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@0011ec
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("EDITOR_HELPER_CONTRACT", new a(this, p1));
       p0.i("FRAGMENT", new b(this, p1));
       p0.i("segment_timeline_animation_end", new c(this, p1));
       p0.i("SINGLE_SEGMENT_LISTENER", new d(this, p1));
       p0.i("single_segment_info", new e(this, p1));
       f uof = new f(this, p1);
       String str = "TITLE";
       try{
          p0.i(str, uof);
          p0.h(SegmentTimelineFragment$a.class, new g(this, p1));
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
