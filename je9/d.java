package je9.d;
import erd.g;
import je9.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import je9.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.ChildMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.HashMap;
import java.util.List;
import i5b.c;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.a;
import com.yxcorp.gifshow.model.CustomMagicInfo;

public final class d implements g	// class@002a70
{
    public final b b;
    public final MagicEmoji$MagicFace c;

    public void d(b p0,MagicEmoji$MagicFace p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       SimpleMagicFace mId;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.u.m(new a(p0));
          p0 = this.c.mChildMagicFace.mConfig.getInputText();
          String str = "magicFace.mId";
          if (p0 != null) {
             mId = this.c.mId;
             a.o(mId, str);
             this.b.o.put(mId, new HashMap(p0));
          }
          p0 = this.c.mChildMagicFace.mConfig.getPickMoreMedia();
          if (p0 != null) {
             SimpleMagicFace mId1 = this.c.mId;
             a.o(mId1, str);
             this.b.p.put(mId1, new HashMap(p0));
             p0 = this.b.s;
             p0 = (p0 != null)? p0.a(): null;
             int i = 0;
             p0 = (p0 == null || p0.isEmpty())? 1: null;
             if (!p0) {
                p0 = this.b.s;
                if (p0 != null) {
                   p0 = p0.a();
                   if (p0 != null) {
                      p0 = CollectionsKt___CollectionsKt.F2(p0, i);
                      if (p0 != null) {
                         p0 = p0.a();
                         if (p0 != null) {
                            mId1 = this.c.mId;
                            a.o(mId1, str);
                            this.b.q.put(mId1, p0);
                         }
                      }
                   }
                }
             }
          }
       label_00a3 :
          mId = this.c.mId;
          a.o(mId, str);
          this.b.g2(mId);
          p0 = this.b.r.get(this.c.mId);
          if (p0 != null) {
             p0.setDefault(true);
          }
       }
       return;
    }
}
