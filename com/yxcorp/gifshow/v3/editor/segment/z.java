package com.yxcorp.gifshow.v3.editor.segment.z;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class z implements g	// class@0011fa
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SegmentListPresenter", "mSegmentDeletedPublisher", p0);
    }
}
