package com.yxcorp.gifshow.v3.editor.segment.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.k;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class b extends Accessor	// class@0011c9
{
    public final SegmentEditorFragment$a c;
    public final k d;

    public void b(k p0,SegmentEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
