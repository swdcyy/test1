package com.yxcorp.gifshow.v3.editor.magicfinger.n;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class n implements g	// class@00103c
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ScrawlEditorPresenter", "restoreScrawl", p0);
    }
}
