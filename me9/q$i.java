package me9.q$i;
import erd.o;
import me9.q$b;
import java.lang.Object;
import g4b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;

public final class q$i implements o	// class@003014
{
    public final q$b b;

    public void q$i(q$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, q$i.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "resp");
          Object[] objArray = new Object[0];
          a.D().w("MagicRequestUploadHandler", "upload preapre response :  "+p0, objArray);
          q$i tb = this.b;
          tb.c = p0;
          tb.b = p0.a();
          if (!TextUtils.x(p0.a())) {
             integer = Integer.valueOf(100);
          }else {
             throw new KSException(-7, "no file key");
          }
       }
       return integer;
    }
}
