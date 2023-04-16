package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$f;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rp4.a;
import jb7.b;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import kq4.n;
import qkd.b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import voc.e0;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$f$a;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;

public final class MoodTemplateRepo$f implements PostTaskManager$b	// class@000b4c
{
    public final MoodTemplateRepo a;
    public final PostTaskManager$a b;
    public final MoodTemplateData c;
    public final int d;
    public final PostTaskManager$b e;

    public void MoodTemplateRepo$f(MoodTemplateRepo p0,PostTaskManager$a p1,MoodTemplateData p2,int p3,PostTaskManager$b p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(PostTaskManager$a p0){
       String str1;
       MoodTemplateRepo$f tc1;
       PostTaskManager$PostTaskState sUCCESS;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$f.class, "1")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.b.d())) {
          Object[] objArray = new Object[0];
          a.D().w(this.a.f(), "downloadMoodRemotePictureTemplate onTaskFinished moodTemplateData:"+this.c, objArray);
          n on = p0.b();
          String str = "";
          if (on != null) {
             str1 = on.a();
             if (str1 != null) {
             label_0057 :
                File uFile = new File(str1);
                boolean b = b.S(uFile);
                MoodTemplateRepo$f tc = this.c;
                if (b) {
                   String absolutePath = uFile.getAbsolutePath();
                   a.o(absolutePath, "resourceFile.absolutePath");
                   tc.E(absolutePath);
                   tc1 = this.c;
                   n on1 = p0.b();
                   if (on1 != null) {
                      on1 = on1.b;
                      if (on1 != null) {
                         str = on1;
                      }
                   }
                   tc1.D(str);
                   this.c.B(100);
                   sUCCESS = PostTaskManager$PostTaskState.SUCCESS;
                }else {
                   tc.B(0);
                   sUCCESS = PostTaskManager$PostTaskState.FAILED;
                }
                tc.C(sUCCESS);
                this.a.i(this.c, this.d);
                tc1 = this.e;
                if (tc1 != null) {
                   tc1.a(p0);
                }
                Object[] objArray1 = new Object[0];
                a.D().w(this.a.f(), "downloadMoodRemotePictureTemplate onTaskFinished "+"resourceFileValid:"+b, objArray1);
             }
          }
          str1 = str;
          goto label_0057 ;
       }
       return;
    }
    public void b(PostTaskManager$a p0){
       e0.a(this, p0);
    }
    public void c(PostTaskManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$f.class, "4")) {
          return;
       }
       a.p(p0, "task");
       e0.e(this, p0);
       if (a.g(p0.d(), this.b.d())) {
          k1.p(new MoodTemplateRepo$f$a(this), Integer.valueOf(0));
          MoodTemplateRepo$f te = this.e;
          if (te != null) {
             te.c(p0);
          }
       }
       return;
    }
    public void d(PostTaskManager$a p0,int p1){
       MoodTemplateRepo$f uof = MoodTemplateRepo$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "2")) {
          return;
       }
       a.p(p0, "task");
       e0.d(this, p0, p1);
       if (a.g(p0.d(), this.b.d())) {
          this.c.C(PostTaskManager$PostTaskState.LOADING);
          this.c.B(p1);
          this.a.i(this.c, this.d);
          uof = this.e;
          if (uof != null) {
             uof.d(p0, p1);
          }
       }
       return;
    }
    public void e(PostTaskManager$a p0,boolean p1){
       MoodTemplateRepo$f uof = MoodTemplateRepo$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "3")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.b.d())) {
          this.c.C(PostTaskManager$PostTaskState.FAILED);
          this.c.y(p1);
          this.c.B(0);
          this.a.i(this.c, this.d);
          uof = this.e;
          if (uof != null) {
             uof.e(p0, p1);
          }
       }
       return;
    }
}
