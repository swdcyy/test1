package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$b;
import erd.o;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import rp4.a;
import jb7.b;
import q87.c;
import java.util.ArrayList;
import lq4.a;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

public final class MoodTemplateRepo$b implements o	// class@000b47
{
    public final MoodTemplateRepo b;

    public void MoodTemplateRepo$b(MoodTemplateRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, MoodTemplateRepo$b.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w(this.b.f(), "fetchAllData subscribe", objArray);
          uArrayList = new ArrayList();
          this.b.o(p0, uArrayList);
          if (uArrayList.isEmpty()) {
             uArrayList.addAll(a.d.f());
          }
       }
       return uArrayList;
    }
}
