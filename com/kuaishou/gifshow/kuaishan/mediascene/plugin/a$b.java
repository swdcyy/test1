package com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$b;
import erd.g;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.a;
import java.lang.Object;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;

public final class a$b implements g	// class@001a8e
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          a.o(uActivity, "ActivityContext.getInstance\(\).currentActivity");
          a.o(p0, "it");
          this.b.JQ(uActivity, p0);
       }
       return;
    }
}
