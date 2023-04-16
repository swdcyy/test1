package jdb.b;
import q0d.d;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import jdb.c;
import java.util.Objects;
import com.kwai.imsdk.m;
import bp6.j2;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import java.util.Iterator;
import java.lang.Iterable;
import zb5.a;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import com.kwai.imsdk.internal.util.f;

public final class b implements d	// class@001b52
{

    public void b(){
       super();
    }
    public boolean a(String p0){
       boolean b;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "host");
       obj = c.a;
       Objects.requireNonNull(obj);
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "2");
       b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          m om = m.F();
          a.o(om, "KwaiIMManager.getInstance\(\)");
          j2 oj2 = om.L();
          if (oj2 != null) {
             _monitor_enter(oj2);
             obj1 = new ArrayList(oj2.i.keySet());
             _monitor_exit(oj2);
             om = m.F();
             a.o(om, "KwaiIMManager.getInstance\(\)");
             oj2 = om.L();
             if (oj2 == null || oj2.u(p0) != true) {
                Iterator iterator = IMConfigUtil.v().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj2 = iterator.next();
                      m om1 = m.G(obj2);
                      a.o(om1, "KwaiIMManager.getInstance\(it\)");
                      j2 oj21 = om1.L();
                      Object obj3 = (oj21 != null && oj21.u(p0) == true)? 1: null;
                      if (!obj3) {
                         continue ;
                      }
                   }else {
                      obj2 = null;
                   }
                   if (obj2 == null) {
                      break ;
                   }
                }
                return b;
             }
             b = true;
             goto label_009a ;
          }else {
             goto label_009a ;
          }
       }
    }
    public List b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "host");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       List list = f.a(p0, a.a(), mE.getId(), a.a);
       a.o(list, "FileResourceHelper.addCo¡­ppEnv.DEVICE_ID\n        \)");
       return list;
    }
}
