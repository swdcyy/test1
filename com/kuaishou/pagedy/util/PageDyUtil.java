package com.kuaishou.pagedy.util.PageDyUtil;
import com.kuaishou.pagedy.util.PageDyUtil$1;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import yz7.e;
import android.app.Activity;

public class PageDyUtil	// class@000a9e
{
    public static final List a;

    static {
       PageDyUtil.a = new PageDyUtil$1();
    }
    public void PageDyUtil(){
       super();
    }
    public static String a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageDyUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return p0.getClass().getName()+"@"+Integer.toHexString(p0.hashCode());
    }
    public static Map b(Map p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, PageDyUtil.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 == null) {
          return obj;
       }
       PageDyUtil.d(p0);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String str = (uEntry.getValue() instanceof String)? uEntry.getValue().toString(): e.f(uEntry.getValue());
          obj.put(uEntry.getKey(), str);
       }
       return obj;
    }
    public static String c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageDyUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return p0.getClass().getName()+"@"+Integer.toHexString(p0.hashCode());
    }
    public static void d(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PageDyUtil.class, "1")) {
          return;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          if (p0.get(iterator.next()) == null) {
             iterator.remove();
          }
       }
       return;
    }
}
