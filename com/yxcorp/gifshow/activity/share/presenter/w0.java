package com.yxcorp.gifshow.activity.share.presenter.w0;
import oj0.a;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.helper.PostLocationHelper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.Location;
import tw8.a;
import tw8.a$a;
import zw8.a2;
import java.lang.Runnable;
import ekd.k1;

public final class w0 implements a	// class@001440
{
    public final c1 b;

    public void w0(c1 p0){
       this.b = p0;
    }
    public final void W(Map p0){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.get("result");
       if (p0 != null) {
          PostLocationHelper postLocation = new PostLocationHelper();
          String str = p0.toString();
          Location location = PatchProxy.applyOneRefs(str, postLocation, PostLocationHelper.class, "5");
          if (location != PatchProxyResult.class) {
          }else {
             location = a$a.a(postLocation, str);
          }
          k1.o(new a2(tb, location));
       }
       return;
    }
}
