package com.yxcorp.gifshow.v3.editor.cover.s1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class s1 implements g	// class@000ed9
{
    public static final s1 b;

    static {
       s1.b = new s1();
    }
    public void s1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("VideoCoverEditorPresenter", "mVideoImportCoverClickPublisher", p0);
    }
}
