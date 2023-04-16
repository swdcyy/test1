package com.yxcorp.gifshow.profile.http.d;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.profile.http.e;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.profile.util.o;

public final class d implements g	// class@001350
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       if (p0 != null) {
          o.t(p0.getItems(), 102, p0.getLlsid());
       }
       return;
    }
}
