package com.yxcorp.gifshow.v3.editor.cover.i0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class i0 implements g	// class@000e6b
{
    public static final i0 b;

    static {
       i0.b = new i0();
    }
    public void i0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PhotosCoverEditorPresenter", "mCoverFilterPublisher", p0);
    }
}
