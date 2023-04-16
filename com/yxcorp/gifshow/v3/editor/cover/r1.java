package com.yxcorp.gifshow.v3.editor.cover.r1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class r1 implements g	// class@000ec9
{
    public static final r1 b;

    static {
       r1.b = new r1();
    }
    public void r1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("VideoCoverEditorPresenter", "mVideoCoverImportedPublisher", p0);
    }
}
