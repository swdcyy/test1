package je9.b$b;
import erd.g;
import je9.b;
import java.lang.Object;
import j4b.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import i5b.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.a;
import java.lang.CharSequence;
import java.io.File;
import java.util.HashMap;
import com.yxcorp.gifshow.model.CustomMagicInfo;

public final class b$b implements g	// class@002a6a
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.p(p0, "event");
          b$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
             String str = tb.f2();
             Map map = (str == null || !str.length())? 1: null;
             if (!map) {
                map = p0.b();
                b uob = (map == null || map.isEmpty())? 1: null;
                if (!uob) {
                   tb.p.put(str, p0.b());
                   uob = tb.s;
                   String str1 = null;
                   if (uob != null) {
                      List list = uob.a();
                      if (list != null) {
                         Iterator iterator = list.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               str2 = iterator.next();
                               Object obj = str2;
                               Map map1 = ((obj.a()).length() > 0)? 1: null;
                               if (map1) {
                                  CharSequence uCharSequenc = p0.b().get(obj.a());
                                  File uFile = (uCharSequenc == null || !uCharSequenc.length())? 1: null;
                                  if (!uFile) {
                                     obj = p0.b().get(obj.a());
                                     a.m(obj);
                                     if (new File(obj).exists()) {
                                        obj = 1;
                                     label_00b9 :
                                        if (!obj) {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                            label_00b8 :
                               obj = null;
                               goto label_00b9 ;
                            }else {
                               str2 = str1;
                            }
                            if (str2 != null) {
                               str1 = str2.a();
                            }
                         }
                      }
                   }
                   if (str1 != null) {
                      tb.q.put(str, str1);
                   }
                }
             }
          label_00cc :
             tb.g2(p0.a());
             p0 = tb.r.get(p0.a());
             if (p0 != null) {
                p0.setDefault(false);
             }
          }
       }
       return;
    }
}
