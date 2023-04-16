package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$c;
import erd.g;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.NullPointerException;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class EditStickerRepo$c implements g	// class@001288
{
    public final CachePolicy b;
    public final EditStickerRepo$a c;

    public void EditStickerRepo$c(CachePolicy p0,EditStickerRepo$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerRepo$c.class, "1")) {
       }else {
          String str = "EditStickerRepo";
          if (this.b == CachePolicy.CACHE_ONLY && p0 instanceof NullPointerException) {
             Object[] objArray = new Object[0];
             a.D().t(str, "fetchConfigForEditFont error: "+p0.getMessage(), objArray);
          }else {
             PostUtils.D(str, "fetchStickerInfo", p0);
          }
          this.c.a(3, new ArrayList(), null);
       }
       return;
    }
}
