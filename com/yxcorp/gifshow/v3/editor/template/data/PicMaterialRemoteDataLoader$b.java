package com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.adt.DetailResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import jb7.a;

public final class PicMaterialRemoteDataLoader$b implements g	// class@00131c
{
    public final PicMaterialRemoteDataLoader b;

    public void PicMaterialRemoteDataLoader$b(PicMaterialRemoteDataLoader p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicMaterialRemoteDataLoader$b.class, "1")) {
       }else {
          p0 = p0.getDetailList();
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                MaterialDetailInfo materialDeta = p0.next();
                if (materialDeta != null) {
                   materialDeta.setExtClass(this.b.b.a());
                }
             }
          }
       }
       return;
    }
}
