package com.yxcorp.gifshow.record.album.utils.o;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class o implements g	// class@001772
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftRecoverUtil", "recoverFromDraft", p0);
    }
}
