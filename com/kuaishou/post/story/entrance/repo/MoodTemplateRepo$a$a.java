package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$a$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$a;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.g;
import voc.e0;
import java.lang.Boolean;
import com.kuaishou.post.story.entrance.repo.MoodDownloadException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class MoodTemplateRepo$a$a implements PostTaskManager$b	// class@000b45
{
    public final MoodTemplateRepo$a a;
    public final v b;

    public void MoodTemplateRepo$a$a(MoodTemplateRepo$a p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(PostTaskManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$a$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.a.c.d())) {
          this.b.onNext(this.a.d);
          this.b.onComplete();
       }
       return;
    }
    public void b(PostTaskManager$a p0){
       e0.a(this, p0);
    }
    public void c(PostTaskManager$a p0){
       e0.e(this, p0);
    }
    public void d(PostTaskManager$a p0,int p1){
       e0.d(this, p0, p1);
    }
    public void e(PostTaskManager$a p0,boolean p1){
       MoodTemplateRepo$a$a uoa$a = MoodTemplateRepo$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa$a, "2")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.a.c.d())) {
          this.b.onError(new MoodDownloadException("downloadTemplate error moodTemplateData:"+this.a.d));
       }
       return;
    }
}
