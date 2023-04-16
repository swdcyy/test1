package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$c;
import erd.o;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import lq4.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import rp4.a;
import jb7.b;
import java.lang.StringBuilder;
import q87.c;
import brd.t;
import com.kuaishou.post.story.entrance.repo.a;

public final class MoodTemplateRepo$c implements o	// class@000b48
{
    public final MoodTemplateRepo b;

    public void MoodTemplateRepo$c(MoodTemplateRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj;
       t ot = PatchProxy.applyOneRefs(p0, this, MoodTemplateRepo$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "moodList");
          int i = 1;
          int i1 = 0;
          if (p0.isEmpty() ^ i) {
             Iterator iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj = iterator.next();
                   if (!a.g(obj.o(), a.d.d().o())) {
                      continue ;
                   }
                }else {
                   obj = null;
                }
                if (obj == null && p0.get(i1).w() == i) {
                   Object[] objArray = new Object[i1];
                   a.D().w(this.b.f(), "fetchAllData download first template mood:"+p0.get(i1), objArray);
                   p0 = this.b.j(p0.get(i1)).map(new a(p0));
                label_00a6 :
                   ot = p0;
                   break ;
                }
             }
          }
       label_0091 :
          Object[] objArray1 = new Object[i1];
          a.D().w(this.b.f(), "fetchAllData should not download", objArray1);
          p0 = t.just(p0);
          goto label_00a6 ;
       }
       return ot;
    }
}
