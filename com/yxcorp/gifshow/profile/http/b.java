package com.yxcorp.gifshow.profile.http.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.profile.http.c;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.profile.util.o;

public final class b implements g	// class@00134e
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       if (p0 != null) {
          o.t(p0.getItems(), 8, p0.getLlsid());
       }
       return;
    }
}
