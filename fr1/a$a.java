package fr1.a$a;
import com.yxcorp.gifshow.widget.m;
import fr1.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fr1.b$a$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import er1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import androidx.lifecycle.LiveData;
import dr1.f;
import dr1.d;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Long;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map$Entry;
import java.util.AbstractMap$SimpleEntry;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Collections;
import oq1.b;
import oq1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a$a extends m	// class@002386
{
    public final b c;

    public void a$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tc = this.c;
       b$a$a a = b$a$a.a;
       Objects.requireNonNull(tc);
       b uob = b.class;
       if (!PatchProxy.applyVoidOneRefs(a, tc, uob, "2")) {
          a.p(a, "intent");
          if (a instanceof b$a$a) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, tc, uob, "5") && tc.v0()) {
                tc.n.a();
                ClientContent$LiveStreamPackage liveStreamPa = tc.q.a();
                b r = tc.r;
                d value = tc.m.d().getValue();
                if (value != null) {
                   a uoa = value.a();
                   if (uoa != null) {
                      uoa = uoa.h;
                      if (uoa != null) {
                         objArray = Long.valueOf(uoa.userId);
                      }
                   }
                }
                String str = String.valueOf(objArray);
                if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, r, str, null, LiveMultiLineLogger.class, "12")) {
                   ClickMetaData uClickMetaDa = new ClickMetaData();
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "ARENA_STAGE_NEXT_BUTTON";
                   Map$Entry[] uEntryArray = new Map$Entry[]{new AbstractMap$SimpleEntry("user_id", str)};
                   int i = 0;
                   HashMap hashMap = new HashMap(1);
                   while (true) {
                      if (i < 1) {
                         object oobject = uEntryArray[i];
                         Object key = oobject.getKey();
                         Objects.requireNonNull(key);
                         Object value1 = oobject.getValue();
                         Objects.requireNonNull(value1);
                         if (hashMap.put(key, value1) == null) {
                            i++;
                         }else {
                            throw new IllegalArgumentException("duplicate key: "+key);
                         }
                      }else {
                         uElementPack.params = c.a(r, Collections.unmodifiableMap(hashMap));
                         uClickMetaDa.setElementPackage(uElementPack);
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.liveStreamPackage = liveStreamPa;
                         uClickMetaDa.setContentPackage(uContentPack);
                         u1.B(uClickMetaDa);
                         break ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
