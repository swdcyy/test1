package ced.s1;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.f0;
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

public final class s1 implements g	// class@00057c
{
    public final f0 b;

    public void s1(f0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f0.class, "4")) {
       }else if(p0.c != true || !TextUtils.n(p0.b.mId, tb.x.mMagicFace.mId)){
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
