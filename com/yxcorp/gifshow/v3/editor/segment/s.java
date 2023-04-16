package com.yxcorp.gifshow.v3.editor.segment.s;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import faa.a;
import w46.b;

public final class s implements g	// class@0011e0
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("SegmentDeletePresenter", "mVideoSegmentsModel", p0);
       a.D().e("Edit", "error", p0);
    }
}
