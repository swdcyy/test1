package com.kuaishou.aegon.okhttp.CronetInterceptorConfig$ListType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CronetInterceptorConfig$ListType extends Enum	// class@0005e9
{
    public String type;
    public static final CronetInterceptorConfig$ListType[] $VALUES;
    public static final CronetInterceptorConfig$ListType BLACK_LIST;
    public static final CronetInterceptorConfig$ListType WHITE_LIST;

    static {
       CronetInterceptorConfig$ListType listType = new CronetInterceptorConfig$ListType("WHITE_LIST", 0, "whitelist");
       CronetInterceptorConfig$ListType.WHITE_LIST = listType;
       CronetInterceptorConfig$ListType listType1 = new CronetInterceptorConfig$ListType("BLACK_LIST", 1, "blacklist");
       CronetInterceptorConfig$ListType.BLACK_LIST = listType1;
       CronetInterceptorConfig$ListType[] listTypeArra = new CronetInterceptorConfig$ListType[]{listType,listType1};
       CronetInterceptorConfig$ListType.$VALUES = listTypeArra;
    }
    public void CronetInterceptorConfig$ListType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static CronetInterceptorConfig$ListType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CronetInterceptorConfig$ListType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CronetInterceptorConfig$ListType.class, p0);
    }
    public static CronetInterceptorConfig$ListType[] values(){
       Object obj = PatchProxy.apply(null, null, CronetInterceptorConfig$ListType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CronetInterceptorConfig$ListType.$VALUES.clone();
    }
    public String getType(){
       return this.type;
    }
}
