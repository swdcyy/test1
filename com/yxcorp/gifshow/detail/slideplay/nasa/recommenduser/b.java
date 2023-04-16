package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.b;
import erd.o;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserResponse;
import java.util.List;
import k6a.a;
import k6a.c;
import java.lang.Iterable;
import z0.a;
import z1.a;

public final class b implements o	// class@00175a
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       if (p0 == null) {
          p0 = tb.Y1();
       }else {
          tb.o = p0.mCursor;
          tb.X1(p0.mUserList, new a(tb), new c(p0));
          p0 = tb.Y1();
       }
       return p0;
    }
}
