package com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel$mMoodTemplateList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class MoodTemplateViewModel$mMoodTemplateList$1 extends Lambda implements p	// class@000b76
{
    public static final MoodTemplateViewModel$mMoodTemplateList$1 INSTANCE;

    static {
       MoodTemplateViewModel$mMoodTemplateList$1.INSTANCE = new MoodTemplateViewModel$mMoodTemplateList$1();
    }
    public void MoodTemplateViewModel$mMoodTemplateList$1(){
       super(2);
    }
    public final MoodTemplateUiData invoke(MoodTemplateData p0,MoodTemplateUiData p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, MoodTemplateViewModel$mMoodTemplateList$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "x");
       return new MoodTemplateUiData(p0);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
