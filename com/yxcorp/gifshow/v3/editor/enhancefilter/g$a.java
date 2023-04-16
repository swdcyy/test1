package com.yxcorp.gifshow.v3.editor.enhancefilter.g$a;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import java.lang.Object;
import com.kwai.video.editorsdk2.kve.EditorKveAnalyzeTask$EnhanceResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class g$a implements o	// class@000f8b
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$a uoa = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa = this.b;
          uoa.a = p0;
       }
       return uoa;
    }
}
