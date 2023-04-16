package com.yxcorp.gifshow.relation.shake.f;
import erd.o;
import java.lang.Object;
import com.kwai.social.startup.relation.model.SocialShakeConfig;
import xbc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xbc.a;
import xbc.b;
import xbc.a$a;
import com.yxcorp.gifshow.relation.shake.ShakeConfData;

public final class f implements o	// class@0019da
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else if(c.a == null){
          c.a = new a(new b(p0));
          a.a();
       }
       uoa = c.a;
       return uoa;
    }
}
