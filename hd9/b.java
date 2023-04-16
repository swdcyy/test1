package hd9.b;
import r8c.g;
import nm6.d;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import java.lang.Long;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity;

public class b extends g	// class@002607
{
    public final d a;

    public void b(d p0){
       this.a = p0;
       super();
    }
    public void a(Intent p0,BaseFeed p1,File p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "1")) {
          return;
       }
       SerializableHook.putExtra(p0, "result_duration", Long.getLong(p1.a(PhotoMeta.class).mDisplayTime));
       p0.putExtras(p3);
       if (this.a.d() != null) {
          p0.putExtras(this.a.d());
       }
       if (SerializableHook.getSerializableExtra(p0, "magic_face") == null) {
          SimpleMagicFace simpleMagicF = this.c(p1);
          if (simpleMagicF != null) {
             p0.putExtra("magicFaceId", simpleMagicF.mId);
             p0.putExtra("childMagicFaceId", simpleMagicF.mChildId);
             p0.putExtra("magic_face_data_complete", false);
          }
       }
       if (this.a.g()) {
          p0.putExtra("discard_current_post_session", true);
       }
       return;
    }
    public List b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       PhotoMeta mFollowShoot = p0.a(PhotoMeta.class).mFollowShootModel;
       if (mFollowShoot == null) {
          return null;
       }
       return mFollowShoot.mLrcUrls;
    }
    public SimpleMagicFace c(BaseFeed p0){
       PhotoMeta obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SimpleMagicFace simpleMagicF = null;
       if (this.a.d() != null && SerializableHook.getSerializable(this.a.d(), "magic_face") != null) {
          return simpleMagicF;
       }
       obj = p0.a(PhotoMeta.class);
       if (obj == null) {
          return simpleMagicF;
       }
       if (!q.f(obj.mMagicFaces)) {
          return obj.mMagicFaces.get(0);
       }
       return p0.a(PhotoMeta.class).mMagicFace;
    }
    public int e(){
       return 2;
    }
    public Class f(){
       return FollowShootActivity.class;
    }
}
