package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$l;
import mq4.f$a;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;

public final class MoodTemplateViewBinder$l implements f$a	// class@000b64
{
    public final MoodTemplateViewBinder a;

    public void MoodTemplateViewBinder$l(MoodTemplateViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(MoodTemplateUiData p0,int p1){
       MoodTemplateViewBinder$l ol = MoodTemplateViewBinder$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "1")) {
          return;
       }
       a.p(p0, "moodTemplateUiData");
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "onSelected moodTemplateUiData:"+p0+", position:"+p1, objArray);
       this.a.I(p0);
       this.a.S.D0(true);
       return;
    }
}
