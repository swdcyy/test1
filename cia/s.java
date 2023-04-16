package cia.s;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.data.f;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import gha.c;

public final class s implements g	// class@000515
{
    public final f b;

    public void s(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "12")) {
       }else if(p0 != null){
          c.a(p0.mPhotos, p0.mLlsid);
       }
       return;
    }
}
