package com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$c;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailResponse;
import kotlin.jvm.internal.a;

public final class PicMaterialRemoteDataLoader$c implements o	// class@00131d
{
    public static final PicMaterialRemoteDataLoader$c b;

    static {
       PicMaterialRemoteDataLoader$c.b = new PicMaterialRemoteDataLoader$c();
    }
    public void PicMaterialRemoteDataLoader$c(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicMaterialRemoteDataLoader$c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}
