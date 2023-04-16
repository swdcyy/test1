package com.yxcorp.gifshow.v3.editor.segment.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.k;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class g extends Accessor	// class@0011d0
{
    public final SegmentEditorFragment$a c;
    public final k d;

    public void g(k p0,SegmentEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.h);
    }
    public void set(Object p0){
       this.c.h = p0.booleanValue();
    }
}
