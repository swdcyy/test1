package com.yxcorp.gifshow.v3.editor.segment.timeline.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.timeline.h;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class a extends Accessor	// class@0011e5
{
    public final SegmentTimelineFragment$a c;
    public final h d;

    public void a(h p0,SegmentTimelineFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
