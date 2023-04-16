package ced.o;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import java.lang.Object;
import vm6.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class o implements g	// class@000570
{
    public final h b;

    public void o(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "4")) {
       }else if(p0.c != true || !TextUtils.n(p0.b.mId, tb.D.mMagicFace.mId)){
          p0 = p0.a;
          if (p0 == 2) {
             p0.mCollected = false;
             tb.Z8();
          }else if(p0 == true){
             p0.mCollected = true;
             tb.Y8();
          }
       }
       return;
    }
}
