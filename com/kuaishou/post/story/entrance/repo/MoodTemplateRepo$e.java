package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$e;
import erd.g;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.azeroth.network.AzerothApiException;
import com.kuaishou.post.story.entrance.repo.MoodDownloadException;
import jb7.b;
import com.yxcorp.gifshow.util.PostUtils;
import rp4.a;
import q87.c;
import di0.b;
import lq4.a;
import com.google.common.collect.ImmutableList;
import java.lang.Integer;
import java.util.List;

public final class MoodTemplateRepo$e implements g	// class@000b4a
{
    public final MoodTemplateRepo b;
    public final g c;

    public void MoodTemplateRepo$e(MoodTemplateRepo p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$e.class, "1")) {
       }else {
          String str = "fetchAllData mResourceManager fetch: ";
          if (!p0 instanceof AzerothApiException && !p0 instanceof MoodDownloadException) {
             PostUtils.D(this.b.f(), str, p0);
          }
          a.D().z(this.b.f(), str, p0);
          a d = a.d;
          this.b.m().s(d.f(), Integer.valueOf(4));
          p0 = this.c;
          if (p0 != null) {
             p0.accept(d.f());
          }
       }
       return;
    }
}
