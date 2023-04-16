package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$c;
import erd.o;
import java.lang.String;
import java.lang.Object;
import ss2.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ss2.d;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;

public final class TransformerKt$c implements o	// class@001580
{
    public final String b;

    public void TransformerKt$c(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       l ol = PatchProxy.applyOneRefs(p0, this, TransformerKt$c.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          a.p(p0, "<name for destructuring parameter 0>");
          int i = p0.b();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.a().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             j state = obj.getState();
             UserInfo userInfo = null;
             UserInfo userInfo1 = (state instanceof j$a)? state.a(): userInfo;
             if (userInfo1 != null) {
                userInfo = userInfo1.mId;
             }
             if (!a.g(userInfo, this.b)) {
                uArrayList.add(obj);
             }
          }
          ol = new l(uArrayList, i);
       }
       return ol;
    }
}
