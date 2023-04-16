package com.yxcorp.gifshow.profile.util.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;

public final class c implements g	// class@0015d4
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (p0 instanceof KwaiException && p0.getErrorCode() == 232) {
          i.d(R.style.arg_RES_7f110669, p0.mErrorMessage);
       }
       return;
    }
}
