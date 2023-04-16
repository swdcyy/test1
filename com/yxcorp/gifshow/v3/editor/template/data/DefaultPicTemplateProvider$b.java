package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$b;
import erd.o;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;

public final class DefaultPicTemplateProvider$b implements o	// class@00130f
{
    public static final DefaultPicTemplateProvider$b b;

    static {
       DefaultPicTemplateProvider$b.b = new DefaultPicTemplateProvider$b();
    }
    public void DefaultPicTemplateProvider$b(){
       super();
    }
    public Object apply(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, DefaultPicTemplateProvider$b.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          list = p0.a();
       }
       return list;
    }
}
