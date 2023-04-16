package com.yxcorp.gifshow.v3.editor.cover.t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class t implements g	// class@000edd
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("CoverTextPresenter", "mVideoImportCoverClickPublisher", p0);
    }
}
