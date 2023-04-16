package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$d;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tp4.v;

public final class MoodAIVideoRepo$d implements o	// class@000ab0
{
    public static final MoodAIVideoRepo$d b;

    static {
       MoodAIVideoRepo$d.b = new MoodAIVideoRepo$d();
    }
    public void MoodAIVideoRepo$d(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, MoodAIVideoRepo$d.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "progress");
          integer = Integer.valueOf(v.b.f(p0.intValue(), 20, 100));
       }
       return integer;
    }
}
