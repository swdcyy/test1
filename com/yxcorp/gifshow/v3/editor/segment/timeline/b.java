package com.yxcorp.gifshow.v3.editor.segment.timeline.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.timeline.h;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment;

public class b extends Accessor	// class@0011e6
{
    public final SegmentTimelineFragment$a c;
    public final h d;

    public void b(h p0,SegmentTimelineFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
