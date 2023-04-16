package aha.c;
import java.lang.Object;
import android.util.LruCache;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import s0d.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import uc.d;
import s0d.a;
import com.yxcorp.utility.TextUtils;

public class c	// class@000080
{
    public LruCache a;
    public LruCache b;

    public void c(){
       super();
       this.a = new LruCache(20);
       this.b = new LruCache(10);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.a.evictAll();
       this.b.evictAll();
       return;
    }
    public e[] b(User p0){
       e[] obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = this.a.get(this.c(p0));
       if (obj != null) {
          return obj;
       }
       obj = f.x().r(p0.mAvatars).t(p0.mAvatar).p(new d(HeadImageSize.BIG.getSize(), HeadImageSize.BIG.getSize())).w();
       if (obj != null) {
          this.a.put(this.c(p0), obj);
       }
       return obj;
    }
    public final String c(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(p0.mAvatar);
    }
}
