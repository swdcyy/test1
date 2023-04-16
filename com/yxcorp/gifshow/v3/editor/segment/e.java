package com.yxcorp.gifshow.v3.editor.segment.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.segment.k;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import java.lang.Object;
import java.lang.Boolean;

public class e extends Accessor	// class@0011ce
{
    public final SegmentEditorFragment$a c;
    public final k d;

    public void e(k p0,SegmentEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
    public void set(Object p0){
       this.c.j = p0.booleanValue();
    }
}
