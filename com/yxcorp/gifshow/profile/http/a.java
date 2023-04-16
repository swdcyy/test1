package com.yxcorp.gifshow.profile.http.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import o3c.b;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.profile.util.o;

public final class a implements g	// class@00134d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       if (p0 != null) {
          o.t(p0.getItems(), 5, p0.getLlsid());
       }
       return;
    }
}
