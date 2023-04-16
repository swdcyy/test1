package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.StringBuilder;

public class LiveResourceFileUtil$d	// class@000eba
{
    public final String a;
    public final String b;

    public void LiveResourceFileUtil$d(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveResourceFileUtil$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.a)) {
          return "";
       }
       return LiveResourceFileUtil.k(this.a);
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, LiveResourceFileUtil$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a()+'/'+this.b;
    }
}
