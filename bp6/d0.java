package bp6.d0;
import erd.o;
import com.kwai.imsdk.internal.q;
import com.kwai.imsdk.msg.KwaiMsg;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import op6.a;
import java.lang.Integer;
import cp6.h;
import java.lang.System;
import cp6.n;
import java.util.List;
import java.util.Collections;
import java.lang.Boolean;

public final class d0 implements o	// class@00050a
{
    public final q b;
    public final KwaiMsg c;
    public final d d;

    public void d0(q p0,KwaiMsg p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       boolean b;
       d0 tb = this.b;
       d0 tc = this.c;
       d0 td = this.d;
       Objects.requireNonNull(tb);
       int i = 2;
       if (tc != null) {
          Object[] objArray = new Object[i];
          objArray[0] = td.getTarget();
          objArray[1] = Integer.valueOf(td.getTargetType());
          b = h.e(new a(String.format("key_conversation_draft_%s_%s", objArray), GsonUtil.toJson(tc), 3006));
          p0.d0(System.currentTimeMillis());
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = td.getTarget();
          objArray1[1] = Integer.valueOf(td.getTargetType());
          b = h.b(3006, String.format("key_conversation_draft_%s_%s", objArray1));
          p0.I("");
       }
       if (b) {
          n.i(tb.f).a(Collections.singletonList(p0), 1);
       }
       return Boolean.valueOf(b);
    }
}
