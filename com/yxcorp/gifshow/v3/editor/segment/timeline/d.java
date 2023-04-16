package com.yxcorp.gifshow.v3.editor.segment.timeline.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.timeline.h;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.segment.b0$c;

public class d extends Accessor	// class@0011e8
{
    public final SegmentTimelineFragment$a c;
    public final h d;

    public void d(h p0,SegmentTimelineFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
