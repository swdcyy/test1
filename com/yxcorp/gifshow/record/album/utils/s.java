package com.yxcorp.gifshow.record.album.utils.s;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class s implements g	// class@001776
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftRecoverUtil", "discardEdit", p0);
    }
}
