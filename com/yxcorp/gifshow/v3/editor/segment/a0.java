package com.yxcorp.gifshow.v3.editor.segment.a0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a0 implements g	// class@0011c3
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SegmentListPresenter", "mItemClickSubject", p0);
    }
}
