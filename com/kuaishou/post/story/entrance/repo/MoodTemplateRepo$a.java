package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$a;
import io.reactivex.g;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import kq4.f;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$a$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;

public final class MoodTemplateRepo$a implements g	// class@000b46
{
    public final MoodTemplateRepo b;
    public final f c;
    public final MoodTemplateData d;

    public void MoodTemplateRepo$a(MoodTemplateRepo p0,f p1,MoodTemplateData p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$a.class, "1")) {
          return;
       }
       a.p(p0, "emit");
       MoodTemplateRepo$a$a uoa$a = new MoodTemplateRepo$a$a(this, p0);
       this.b.o.a(uoa$a);
       PostTaskManager$PostTaskState postTaskStat = this.b.o.b(this.c);
       if (postTaskStat == PostTaskManager$PostTaskState.SUCCESS) {
          this.b.o.f(uoa$a);
          uoa$a.a(this.c);
       }else if(postTaskStat == PostTaskManager$PostTaskState.FAILED){
          uoa$a.e(this.c, false);
       }
       return;
    }
}
