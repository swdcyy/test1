package com.kuaishou.post.story.entrance.repo.MoodTemplateRepo$d;
import erd.g;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import di0.b;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Collection;
import com.kuaishou.post.story.entrance.e;

public final class MoodTemplateRepo$d implements g	// class@000b49
{
    public final MoodTemplateRepo b;
    public final g c;

    public void MoodTemplateRepo$d(MoodTemplateRepo p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       MoodTemplateRepo$d tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateRepo$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.m().s(p0, Integer.valueOf(4));
          if (this.b.t.size() <= 0 && this.b.m().v() > 0) {
             tb = this.b;
             MoodTemplateRepo t = tb.t;
             ListHolder value = tb.m().getValue();
             List list = (value != null)? value.c(): null;
             a.m(list);
             t.addAll(list);
             tb = this.b;
             t = tb.v;
             if (t != null) {
                t.o = tb.t;
             }
          }
       label_005c :
          tb = this.c;
          if (tb != null) {
             tb.accept(p0);
          }
       }
       return;
    }
}
