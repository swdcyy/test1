package com.kuaishou.post.story.entrance.repo.a;
import erd.o;
import java.util.List;
import java.lang.Object;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a implements o	// class@000b51
{
    public final List b;

    public void a(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoa = this.b;
       }
       return uoa;
    }
}
