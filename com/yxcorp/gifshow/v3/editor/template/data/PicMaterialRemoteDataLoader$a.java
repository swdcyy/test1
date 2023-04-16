package com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialUnionResponse;
import kotlin.jvm.internal.a;

public final class PicMaterialRemoteDataLoader$a implements o	// class@00131b
{
    public static final PicMaterialRemoteDataLoader$a b;

    static {
       PicMaterialRemoteDataLoader$a.b = new PicMaterialRemoteDataLoader$a();
    }
    public void PicMaterialRemoteDataLoader$a(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicMaterialRemoteDataLoader$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}
