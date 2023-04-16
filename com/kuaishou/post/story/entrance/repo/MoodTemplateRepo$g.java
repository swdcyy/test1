package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$g;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;

public final class MoodTemplateRepo$g implements r	// class@000b4d
{
    public static final MoodTemplateRepo$g b;

    static {
       MoodTemplateRepo$g.b = new MoodTemplateRepo$g();
    }
    public void MoodTemplateRepo$g(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, MoodTemplateRepo$g.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.c().w())? true: false;
       }
       return b;
    }
}
