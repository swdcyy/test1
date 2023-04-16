package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$h;
import erd.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import kotlin.TypeCastException;

public final class BaseLoaderImpl$h implements g	// class@001a6f
{
    public final BaseLoaderImpl b;

    public void BaseLoaderImpl$h(BaseLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl$h.class, "1")) {
       }else if(p0 != null){
          p0 = p0.iterator();
          while (p0.hasNext()) {
             BaseLoaderImpl$h tb = this.b;
             tb.y(tb.r(), p0.next());
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>");
       }
       return;
    }
}
