package me9.q$k;
import erd.o;
import java.lang.Object;
import ry6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;

public final class q$k implements o	// class@003016
{
    public static final q$k b;

    static {
       q$k.b = new q$k();
    }
    public void q$k(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, q$k.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "uploadTask");
          if (!p0.b() || !TextUtils.x(p0.b)) {
             integer = Integer.valueOf(p0.a());
          }else {
             throw new KSException(-7, "no file key");
          }
       }
       return integer;
    }
}
