package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$c;
import erd.o;
import java.lang.Object;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import tp4.v;

public final class MoodAIVideoRepo$c implements o	// class@000aaf
{
    public static final MoodAIVideoRepo$c b;

    static {
       MoodAIVideoRepo$c.b = new MoodAIVideoRepo$c();
    }
    public void MoodAIVideoRepo$c(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, MoodAIVideoRepo$c.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          integer = Integer.valueOf(v.b.f(100, 0, 20));
       }
       return integer;
    }
}
