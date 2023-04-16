package nj0.j;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import fk0.a;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.model.LaunchModel;
import fk0.b;
import lk0.d;
import com.kuaishou.krn.c;
import kj0.j;
import java.lang.String;
import ev6.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Math;
import java.lang.Integer;
import com.kuaishou.krn.utils.KrnUnSupportAppVersionException;

public final class j implements g	// class@003337
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       p0 = d.a(tb.d, p0);
       tb.j = p0;
       if (p0 != null) {
          String appVersion = c.b().c().getAppVersion();
          p0 = tb.j.b();
          Object obj = PatchProxy.applyTwoRefs(appVersion, p0, null, g.class, "1");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(appVersion == null && p0 != null){
             if (appVersion == null || p0 != null) {
                if (appVersion != null || p0 != null) {
                   a.m(appVersion);
                   String[] stringArray = new String[]{"."};
                   List list = StringsKt__StringsKt.H4(appVersion, stringArray, false, 0, 6, null);
                   a.m(p0);
                   String[] stringArray1 = new String[]{"."};
                   p0 = StringsKt__StringsKt.H4(p0, stringArray1, 0, 0, 6, 0);
                   int i1 = Math.min(list.size(), p0.size());
                   int i2 = 0;
                   while (true) {
                      if (i2 < i1) {
                         int i3 = Integer.parseInt(list.get(i2));
                         int i4 = Integer.parseInt(p0.get(i2));
                         if (i3 >= i4) {
                            if (i3 <= i4) {
                               i2 = i2 + 1;
                            }
                         }
                      }else if(list.size() > i1){
                         if (Integer.parseInt(list.get(i1))) {
                         }
                      }else if(p0.size() <= i1 || !Integer.parseInt(p0.get(i1))){
                      label_00c1 :
                         i = -1;
                      }
                   }
                }
             }
          }
       label_00c2 :
          if (i < 0) {
             throw new KrnUnSupportAppVersionException();
          }
       }
       return;
    }
}
