package com.kwai.yoda.hybrid.AppConfigHandler$preloadFileContentMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rx7.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.jvm.internal.a;

public final class AppConfigHandler$preloadFileContentMap$2 extends Lambda implements a	// class@001278
{
    public static final AppConfigHandler$preloadFileContentMap$2 INSTANCE;

    static {
       AppConfigHandler$preloadFileContentMap$2.INSTANCE = new AppConfigHandler$preloadFileContentMap$2();
    }
    public void AppConfigHandler$preloadFileContentMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       HashMap obj = PatchProxy.apply(null, this, AppConfigHandler$preloadFileContentMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(4);
       Iterator iterator = b.a.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a.h(str, "it");
          obj.put(str, "");
       }
       return obj;
    }
}
