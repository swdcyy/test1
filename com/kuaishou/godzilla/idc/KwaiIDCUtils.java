package com.kuaishou.godzilla.idc.KwaiIDCUtils;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.lang.Boolean;

public class KwaiIDCUtils	// class@00089c
{

    public void KwaiIDCUtils(){
       super();
    }
    public static Object getMapItem(Map p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KwaiIDCUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (KwaiIDCUtils.isMapEmpty(p0)) {
          return null;
       }
       return p0.get(p1);
    }
    public static boolean isCollectionEmpty(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiIDCUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static boolean isMapEmpty(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiIDCUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
}
