package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class c implements g	// class@0012d2
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("VoteViewHelper", "mProgressEventObservable", p0);
    }
}
