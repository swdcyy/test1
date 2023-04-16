package f12.e;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$b;
import f12.f;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import pw6.a;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.liveslide.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import b51.d;
import com.kuaishou.live.core.basic.liveslide.b;
import c51.d;
import c51.i;
import java.util.Collection;
import java.util.List;
import c51.h;

public final class e implements LiveAudiencePrivatePasswordFragment$b	// class@002833
{
    public final f a;
    public final LiveAudienceParam b;

    public void e(f p0,LiveAudienceParam p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(String p0){
       e ta = this.a;
       e tb = this.b;
       Objects.requireNonNull(ta);
       tb.mLivePrivateAuthToken = p0;
       tb.mShouldAttachFragmentForLivePrivate = true;
       ArrayList uArrayList = new ArrayList(true);
       uArrayList.add(tb.mPhoto);
       a$a uoa = a.k(ta.a()).j();
       Objects.requireNonNull(uoa);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(uArrayList, uoa, b$a.class, "9");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          i oi = uoa.a.e().p();
          Objects.requireNonNull(oi);
          obj = PatchProxy.applyOneRefs(uArrayList, oi, i.class, "8");
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             oi.b.p(new ArrayList(uArrayList));
          }
       }
       return;
    }
}
