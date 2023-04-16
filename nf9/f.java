package nf9.f;
import erd.g;
import nf9.g;
import java.lang.Object;
import je9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import i5b.p;
import kotlin.jvm.internal.a;
import i5b.c;
import com.kwai.video.westeros.models.EffectDescription;
import i5b.c$a;
import java.util.List;
import k4b.a;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.ChildMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomConfig;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.regex.Pattern;
import qkd.b;
import java.util.regex.Matcher;
import j4b.p$a;

public final class f implements g	// class@00317b
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "3")) {
       }else if(!TextUtils.x(p0.a().mChildId)){
          g q = tb.q;
          p0 = p0.a();
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoidOneRefs(p0, q, p.class, "6")) {
             a.p(p0, "magicFace");
             p j = q.j;
             if (j != null) {
                a.m(j);
                c uoc = c.k.a(j);
                if (uoc.f() && q.f(q.q.m())) {
                   ArrayList uArrayList = new ArrayList();
                   p0 = p0.mChildMagicFace;
                   if (p0 != null) {
                      p0 = p0.mConfig;
                      if (p0 != null) {
                         p0 = p0.getPickMoreMedia();
                      label_006b :
                         int i = 0;
                         Object[] objArray = new Object[i];
                         b.D().s(q.b, "onChildMagicFaceApply:"+String.valueOf(p0), objArray);
                         if (p0 == null || p0.isEmpty()) {
                            i = 1;
                         }
                         if (i) {
                            uArrayList.addAll(q.e(uoc));
                         }else {
                            p0 = p0.entrySet().iterator();
                            while (p0.hasNext()) {
                               Map$Entry uEntry = p0.next();
                               String key = uEntry.getKey();
                               uArrayList.add(new p$a(key, uEntry.getValue(), b.F().matcher(uEntry.getValue()).find()));
                            }
                         }
                         q.k(uArrayList);
                      }
                   }
                   p0 = null;
                   goto label_006b ;
                }
             }
          }
       }
       return;
    }
}
