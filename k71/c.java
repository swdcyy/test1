package k71.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import k71.c$a;
import nsd.u;
import java.lang.Class;
import k71.c$c;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import java.lang.StringBuilder;
import o63.m$a;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import k71.c$b;
import java.lang.CharSequence;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import wkd.b;
import j80.c;
import java.io.File;
import java.util.Map;

public final class c extends AbstractLiveJsCommand	// class@002ca7
{
    public static final c$a e;

    static {
       c.e = new c$a(null);
    }
    public void c(){
       super();
    }
    public Class a(){
       return c$c.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof c$c) {
          return m.g.c(c.class.getName()+" params invalid");
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       p0 = p0.resInfoList.iterator();
       String str = 2;
       File uFile = null;
       while (p0.hasNext()) {
          c$b uob = p0.next();
          String str1 = (uob.a().length() > 0)? 1: null;
          String str2 = "";
          if (str1) {
             if (6 == uob.d()) {
                str = PatchProxy.applyOneRefs(uob, this, c.class, "2");
                if (str != PatchProxyResult.class) {
                }else if((uob.a()).length() > 0){
                   uFile = 1;
                }
                if (uFile != null) {
                   str = LiveMaterialResourceManager.h.b(uob.c(), uob.a());
                   if (str == null) {
                   label_0092 :
                      str = str2;
                   }
                }else {
                   goto label_0092 ;
                }
             }else {
                Object obj = PatchProxy.applyOneRefs(uob, this, c.class, "3");
                if (obj != PatchProxyResult.class) {
                   str = obj;
                }else {
                   int i = uob.d();
                   str1 = -1504323719;
                   if (i) {
                      if (i != 1) {
                         if (i != str) {
                            if (i != 3) {
                               if (i != 4) {
                                  if (i != 5) {
                                     goto label_0092 ;
                                  }else {
                                     str = b.a(str1).g(uob.c()).getAbsolutePath()+File.separator+uob.a();
                                  }
                               }else {
                                  str = b.a(str1).f(uob.c()).getAbsolutePath()+File.separator+uob.a();
                               }
                            }else {
                               str = b.a(str1).j(uob.c()).getAbsolutePath()+File.separator+uob.a();
                            }
                         }else {
                            str = b.a(str1).c(uob.c()).getAbsolutePath()+File.separator+uob.a();
                         }
                      }else {
                         str = b.a(str1).d(uob.c()).getAbsolutePath()+File.separator+uob.a();
                      }
                   }else {
                      str = b.a(str1).h(uob.c()).getAbsolutePath()+File.separator+uob.a();
                   }
                }
             }
             String str3 = uob.b();
             if (new File(str).exists()) {
                str2 = str;
             }
             linkedHashMa.put(str3, str2);
          }else {
             linkedHashMa.put(uob.b(), str2);
          }
       }
       return m$a.g(m.g, linkedHashMa, uFile, str, null);
    }
}
