package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class b implements g	// class@0012d1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("VoteViewHelper", "photo detail request vote info error", p0);
    }
}
