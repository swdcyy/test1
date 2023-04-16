package nx0.j;
import erd.g;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a;
import nx0.i;
import java.lang.Object;
import nx0.y;
import kx0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.a$d;
import java.lang.Integer;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import bp6.a;
import crd.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import nx0.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.BitSet;

public final class j implements g	// class@0033ef
{
    public final a b;
    public final i c;

    public void j(a p0,i p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       a obj2;
       boolean b;
       String str1;
       LiveStreamFeedWrapper liveStreamFe;
       String userId;
       Object obj = this;
       j obj1 = p0;
       a uoa = a.class;
       a uoa1 = a.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, j.class, "1")) {
       }else {
          String str = "LiveAudienceOverRoomV2Model";
          b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag(str), "check animation resource", "afterPartAnimationUriString", obj1.a());
          if (!TextUtils.x(obj1.a()) && a.g(obj.b.m.getValue(), Boolean.FALSE)) {
             obj1 = obj.b;
             j c = obj.c;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoidOneRefs(c, obj1, uoa1, "20")) {
                Iterator iterator = obj1.b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(c);
                }
             }
             obj1 = obj.b;
             c = obj.c;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoidOneRefs(c, obj1, uoa1, "4")) {
                obj2 = obj1.k;
                Integer integer1 = (c != null)? Integer.valueOf(c.d()): null;
                str1 = (c != null)? c.f(): null;
                Objects.requireNonNull(obj2);
                if (!PatchProxy.applyVoidTwoRefs(integer1, str1, obj2, uoa, "2") && (obj2.a(integer1) && str1 != null)) {
                   obj2.b.add(str1);
                }
             }
          label_00b0 :
             obj1 = obj.b;
             c = obj.c;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoidOneRefs(c, obj1, uoa1, "5")) {
                obj2 = obj1.k;
                Integer integer = (c != null)? Integer.valueOf(c.d()): null;
                Objects.requireNonNull(obj2);
                if (!PatchProxy.applyVoidOneRefs(integer, obj2, uoa, "3") && obj2.a(integer)) {
                   obj2.c = obj2.c + 1;
                }
             }
          label_00e5 :
             obj1 = obj.b;
             j c1 = obj.c;
             Objects.requireNonNull(obj1);
             obj2 = PatchProxy.applyOneRefs(c1, obj1, uoa1, "21");
             if (obj2 != PatchProxyResult.class) {
                b = obj2.booleanValue();
             }else if(c1 != null && c1.d() == 6){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                obj.b.g(obj.c, 1);
             }
             obj1 = obj.b;
             c1 = obj.c;
             Objects.requireNonNull(obj1);
             str1 = "overRoomMessage";
             if (!PatchProxy.applyVoidOneRefs(c1, obj1, uoa1, "7")) {
                b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag(str), "reportMessageRealShow", str1, c1);
                if (c1 != null && c1.b()) {
                   obj1.j = e.a().m(c1.c(), c1.f(), c1.d(), c1.b(), null).map(new e()).subscribe(new a(), new a());
                }
             }
             obj1 = obj.c;
             liveStreamFe = obj.b.r.r5();
             a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
             userId = liveStreamFe.getUserId();
             a.o(userId, "feedService.liveStreamFeedWrapper.userId");
             if (!PatchProxy.applyVoidTwoRefs(obj1, userId, null, h.class, "1")) {
                a.p(obj1, str1);
                a.p(userId, "currentAnchorId");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 852;
                uElementPack.params = h.a(obj1, null, null);
                u1.B0(new ShowMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(h.b(obj1, userId)));
             }
          }else if(TextUtils.x(obj1.a())){
             liveStreamFe = obj.b.r.r5();
             a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
             userId = liveStreamFe.getUserId();
             a.o(userId, "feedService.liveStreamFeedWrapper.userId");
             h.d(obj.c, userId, "DOWNLOAD_FAIL");
          }else if(obj.b.l.get(1)){
             liveStreamFe = obj.b.r.r5();
             a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
             userId = liveStreamFe.getUserId();
             a.o(userId, "feedService.liveStreamFeedWrapper.userId");
             h.d(obj.c, userId, "BACKGROUND");
          }else if(obj.b.l.get(2)){
             liveStreamFe = obj.b.r.r5();
             a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
             userId = liveStreamFe.getUserId();
             a.o(userId, "feedService.liveStreamFeedWrapper.userId");
             h.d(obj.c, userId, "FULL_SCREEN");
          }else if(obj.b.l.get(5)){
             liveStreamFe = obj.b.r.r5();
             a.o(liveStreamFe, "feedService.liveStreamFeedWrapper");
             userId = liveStreamFe.getUserId();
             a.o(userId, "feedService.liveStreamFeedWrapper.userId");
             h.d(obj.c, userId, "GZONE_PURE_MODE");
          }
          obj1 = obj.b;
          obj1.e = null;
          obj1.h();
       }
       return;
    }
}
