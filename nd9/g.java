package nd9.g;
import erd.g;
import nd9.l;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import o4b.a0;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.ArrayList;
import ekd.j;
import java.util.Collection;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import pc9.a;
import com.yxcorp.gifshow.camera.record.base.b;

public final class g implements g	// class@00313e
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().E("face_cover", "[magicface][keypath][remote] ", "/rest/n/magicFace/entrance finish , magicFace:"+p0.mMagicFaceInfo+" , collected:"+p0.mCollected, objArray);
       if (p0.mMagicFaceInfo != null && p0.mCollected != null) {
          String[] stringArray = new String[]{p0.mMagicFaceInfo.mId};
          a0.f().e(j.a(stringArray));
       }
       RxBus.f.b(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, l.class, "7")) {
          objArray = new Object[0];
          a.D().E("face_cover", "[magicface][keypath] ", "onEntranceDataCallback", objArray);
          tb.E = p0;
          tb.N = true;
          if (tb.o2()) {
             tb.l2(p0);
          }else {
             tb.d.m(new a(0, 1));
          }
       }
       return;
    }
}
