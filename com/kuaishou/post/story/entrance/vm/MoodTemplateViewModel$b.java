package com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$b;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;

public final class MoodTemplateViewModel$b implements o	// class@000b72
{
    public static final MoodTemplateViewModel$b b;

    static {
       MoodTemplateViewModel$b.b = new MoodTemplateViewModel$b();
    }
    public void MoodTemplateViewModel$b(){
       super();
    }
    public Object apply(Object p0){
       QMedia qMedia = PatchProxy.applyOneRefs(p0, this, MoodTemplateViewModel$b.class, "1");
       if (qMedia != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewModel", "AlbumPlugin.load path:"+p0.path, objArray);
          qMedia = p0.path;
       }
       return qMedia;
    }
}
