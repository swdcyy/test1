package com.yxcorp.gifshow.v3.previewer.ktv.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.previewer.ktv.f;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$c;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class d extends Accessor	// class@0015bb
{
    public final KtvBaseEditPreviewFragment$c c;
    public final f d;

    public void d(f p0,KtvBaseEditPreviewFragment$c p1){
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
