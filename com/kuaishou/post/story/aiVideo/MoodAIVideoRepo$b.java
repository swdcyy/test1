package com.kuaishou.post.story.aiVideo.MoodAIVideoRepo$b;
import erd.o;
import com.kuaishou.post.story.aiVideo.MoodAIVideoRepo;
import java.lang.Object;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import tp4.v;
import rp4.a;
import q87.c;
import java.lang.Integer;
import brd.t;
import java.util.Objects;
import com.kuaishou.post.story.aiVideo.MoodAIVideoDownloadHelper;
import qrd.p;
import java.lang.Boolean;
import java.lang.StringBuilder;
import kotlin.jvm.internal.Ref$LongRef;
import tp4.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import tp4.b;
import erd.g;
import tp4.c;
import erd.a;
import tp4.d;

public final class MoodAIVideoRepo$b implements o	// class@000aae
{
    public final MoodAIVideoRepo b;
    public final boolean c;

    public void MoodAIVideoRepo$b(MoodAIVideoRepo p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       t ot = PatchProxy.applyOneRefs(p0, this, MoodAIVideoRepo$b.class, str);
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          int i = 0;
          if (v.b.g(p0)) {
             Object[] objArray = new Object[i];
             a.D().w("MoodAIVideoRepo", "downloadAIVideo: has download", objArray);
             p0 = t.just(Integer.valueOf(100));
          }else {
             MoodAIVideoRepo$b tb = this.b;
             Objects.requireNonNull(tb);
             z obj = PatchProxy.apply(null, tb, MoodAIVideoRepo.class, str);
             if (obj != patchProxyRe) {
             }else {
                obj = tb.c.getValue();
             }
             tb = this.c;
             Objects.requireNonNull(obj);
             MoodAIVideoDownloadHelper moodAIVideoD = MoodAIVideoDownloadHelper.class;
             if (PatchProxy.isSupport(moodAIVideoD)) {
                Object obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(tb), obj, moodAIVideoD, "3");
                if (obj1 != patchProxyRe) {
                   ot = obj1;
                }
             }
             a.p(p0, "videoBackgroundData");
             Object[] objArray1 = new Object[i];
             a.D().w("MoodAIVideoDownloadHelper", "download videoBackgroundData:"+p0, objArray1);
             Ref$LongRef longRef = new Ref$LongRef();
             longRef.element = 0;
             Ref$LongRef longRef1 = new Ref$LongRef();
             longRef1.element = 0;
             obj = d.c;
             p0 = t.create(new a(obj, p0)).subscribeOn(obj).observeOn(obj);
             p0 = p0.doOnSubscribe(new b(longRef)).doOnComplete(new c(longRef1, longRef, tb)).doOnError(new d(longRef1, longRef, tb));
             a.o(p0, "Observable.create { emit¡­rror:$throwable\"\)\n      }");
          }
          ot = p0;
       }
       return ot;
    }
}
