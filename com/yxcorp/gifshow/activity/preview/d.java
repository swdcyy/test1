package com.yxcorp.gifshow.activity.preview.d;
import erd.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.activity.preview.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import jw8.g;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import jw8.f;

public final class d implements o	// class@001362
{
    public final VideoContext b;
    public final EncodeRequest$a c;

    public void d(VideoContext p0,EncodeRequest$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       t ot = PatchProxy.applyThreeRefs(p0, tb, tc, null, f.class, "11");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.fromCallable(new g(tb)).subscribeOn(d.a).observeOn(d.c).map(new f(tc, p0));
       }
       return ot;
    }
}
