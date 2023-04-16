package com.yxcorp.gifshow.record.album.utils.q;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class q implements g	// class@001774
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftRecoverUtil", "recoverFromDraftByBubble", p0);
    }
}
