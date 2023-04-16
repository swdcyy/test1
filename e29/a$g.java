package e29.a$g;
import erd.g;
import e29.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CollectFeedInfo;

public final class a$g implements g	// class@002134
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          p0 = a.n0(this.b).getPhotoMeta();
          if (p0 != null) {
             p0 = p0.mCollectFeedInfo;
             if (p0 != null) {
                p0.mShowForWeak = false;
             }
          }
       }
       return;
    }
}
