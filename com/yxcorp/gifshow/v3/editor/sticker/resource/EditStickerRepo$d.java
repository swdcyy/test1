package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$d;
import erd.c;
import java.util.Map;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EditStickerRepo$d implements c	// class@001289
{
    public final Map[] a;

    public void EditStickerRepo$d(Map[] p0){
       this.a = p0;
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditStickerRepo$d.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "groupInfoResult");
          a.p(p1, "scoreMap");
          this.a[0] = p1;
       }
       return p0;
    }
}
