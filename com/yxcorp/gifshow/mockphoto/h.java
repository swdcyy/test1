package com.yxcorp.gifshow.mockphoto.h;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.mockphoto.j;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.mockphoto.EncodeResultResponse;
import java.lang.Integer;
import brd.t;
import java.util.concurrent.TimeUnit;

public final class h implements o	// class@001de6
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       EncodeResultResponse mNextRequest;
       if (p0 instanceof KwaiException) {
          KwaiException mResponse = p0.mResponse;
          if (mResponse != null && mResponse.a() instanceof EncodeResultResponse) {
             mNextRequest = p0.mResponse.a().mNextRequestMillis;
             if (mNextRequest - null > 0) {
             label_0029 :
                return t.just(Integer.valueOf(1)).delay(mNextRequest, TimeUnit.MILLISECONDS);
             }
          }
       }
       mNextRequest = 3000;
       goto label_0029 ;
    }
}
