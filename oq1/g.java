package oq1.g;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogType;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.LinkedList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.Objects;
import oq1.f;
import java.lang.Enum;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class g	// class@003559
{

    public static final void a(LiveMultiLineLogType p0,a$a p1,e0 p2,ClientContent$LiveStreamPackage p3,Map p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       g og = g.class;
       int i = 0;
       Object obj = null;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, og, "1")) {
             return;
          }
       }
       a.p(p0, "logType");
       String str = "logInfo";
       a.p(p1, str);
       a.p(p2, "logPage");
       a.p(oobject3, "liveStreamPackage");
       a.p(oobject4, "userTagMap");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_MIC_TAG_BUTTON";
       String str1 = PatchProxy.applyTwoRefs(p1, obj, obj, og, "3");
       if (str1 != PatchProxyResult.class) {
       }else {
          a.p(p1, str);
          i3 oi3 = i3.f();
          oi3.d("biz_session_id", oobject1.a);
          oi3.d("biz_type", oobject1.b);
          oi3.d("chat_id", oobject1.c);
          oi3.d("session_id", oobject1.d);
          str1 = oi3.e();
          a.o(str1, "builder.build\(\)");
       }
       uElementPack.params = str1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject3;
       ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
       LinkedList linkedList = new LinkedList();
       Iterator iterator = p4.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = uEntry.getKey();
          userPackage.params = uEntry.getValue();
          linkedList.add(userPackage);
       }
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[i];
       Object[] objArray1 = linkedList.toArray(userPackageA);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       uBatchUserPa.userPackage = objArray1;
       uContentPack.batchUserPackage = uBatchUserPa;
       if (!PatchProxy.applyVoidFourRefs(p0, p2, uContentPack, uElementPack, null, g.class, "2")) {
          int i1 = f.a[p0.ordinal()];
          if (i1 != 1) {
             if (i1 == 2) {
                u1.B(new ClickMetaData().setLogPage(p2).setContentPackage(uContentPack).setElementPackage(uElementPack));
             }
          }else {
             u1.B0(new ShowMetaData().setLogPage(p2).setContentPackage(uContentPack).setElementPackage(uElementPack));
          }
       }
       return;
    }
}
