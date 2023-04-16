package hh1.i$a$a;
import erd.o;
import hh1.i$a;
import java.lang.Object;
import njd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import kotlin.jvm.internal.a;
import fh1.e;
import java.util.Objects;
import hh1.i;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import wkd.b;
import m81.a;

public final class i$a$a implements o	// class@0026bf
{
    public final i$a b;

    public void i$a$a(i$a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = PatchProxy.applyOneRefs(p0, this, i$a$a.class, "1");
       if (uoe != patchProxyRe) {
       }else {
          a.p(p0, "it");
          uoe = p0.a().mLiveVipGradeInfo;
          if (uoe != null) {
             i$a b = this.b.b;
             LiveVipGradeInfo mVipGradeBad = uoe.mVipGradeBadgeBase64Segment;
             Objects.requireNonNull(b);
             UserStateRichTextSegment userStateRic = PatchProxy.applyOneRefs(mVipGradeBad, b, i.class, "2");
             if (userStateRic != patchProxyRe) {
             }else {
                userStateRic = b.a(-1620599789).s1(mVipGradeBad);
             }
             uoe.a = userStateRic;
          }
          uoe = p0.a().mLiveVipGradeInfo;
       }
       return uoe;
    }
}
