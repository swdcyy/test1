package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$a;
import java.util.concurrent.Callable;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.IllegalArgumentException;

public final class MoodAIVideoRepo$a implements Callable	// class@000aad
{
    public final MoodAIVideoRepo b;
    public final int c;
    public final boolean d;

    public void MoodAIVideoRepo$a(MoodAIVideoRepo p0,int p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       Object[] objArray1;
       AIVideoBackgroundRecoData uAIVideoBack = PatchProxy.apply(null, this, MoodAIVideoRepo$a.class, "1");
       if (uAIVideoBack != PatchProxyResult.class) {
       }else {
          char c = ' ';
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("MoodAIVideoRepo", "downloadAIVideo attemptSelectIndex:"+this.c+" isMoodEdit:"+this.d+c, objArray);
          if (this.b.c() != null) {
             AIVideoBackgroundData uAIVideoBack1 = this.b.c();
             a.m(uAIVideoBack1);
             if (!q.f(uAIVideoBack1.g())) {
                uAIVideoBack1 = this.b.c();
                a.m(uAIVideoBack1);
                if (uAIVideoBack1.g().size() > this.c) {
                   uAIVideoBack1 = this.b.c();
                   a.m(uAIVideoBack1);
                   uAIVideoBack = uAIVideoBack1.g().get(this.c);
                }
             }
             objArray1 = new Object[i];
             a.D().w("MoodAIVideoRepo", "downloadFirstAIVideo: recoData invalid ", objArray1);
             AIVideoBackgroundData uAIVideoBack2 = this.b.c();
             a.m(uAIVideoBack2);
             throw new IllegalArgumentException("downloadFirstAIVideo: recoData"+uAIVideoBack2.g()+"  attemptSelectIndex"+this.c+c);
          }else {
             objArray1 = new Object[i];
             a.D().w("MoodAIVideoRepo", "downloadFirstAIVideo: currentBackgroundData is null", objArray1);
             throw new IllegalArgumentException("downloadFirstAIVideo backgroundData is null");
          }
       }
       return uAIVideoBack;
    }
}
