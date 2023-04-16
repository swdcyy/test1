package gj1.b;
import gj1.b$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import d61.l0;
import gj1.b$b;
import gj1.b$c;
import g91.a;
import android.content.SharedPreferences;
import java.lang.Object;
import km8.b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import androidx.collection.ArraySet;
import java.util.Collection;
import java.util.Set;
import java.util.Collections;
import java.lang.Iterable;
import qk.m;
import gj1.a;
import ok.h;
import com.google.common.collect.ImmutableList;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig$AttachGiftConfig;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;

public class b	// class@002505
{
    public static final l0 a;
    public static final l0 b;

    static {
       b uob = b.class;
       l0 ol0 = l0.g("alreadyConfirmSendGuideGiftIdList", new b$a().getType());
       b.a = ol0;
       l0 ol01 = l0.g("alreadyConfirmSendGuideGiftKey", new b$b().getType());
       b.b = ol01;
       Type type = new b$c().getType();
       String str = a.a.getString("lastExplicitGiftIds", "null");
       String str1 = "";
       List list = (str == null || str == str1)? null: b.a(str, type);
       if (!PatchProxy.applyVoidOneRefs(list, null, uob, "6") && list != null) {
          HashSet hashSet1 = new HashSet(ol0.b(new ArraySet()));
          hashSet1.addAll(list);
          ol0.i(hashSet1);
       }
       if (!PatchProxy.applyVoid(null, null, uob, "3")) {
          HashSet hashSet = new HashSet(ol01.b(new ArraySet()));
          hashSet.addAll(m.s(ol0.b(Collections.emptySet())).F(a.b).B());
          ol01.i(hashSet);
       }
       List list1 = LiveLogTag.GIFT_GUIDE.appendTag("PUBLIC_ID_CACHE");
       if (list != null) {
          str1 = list;
       }
       b.S(list1, "append guide gift ids to public local cache", "giftId", str1);
    }
    public void b(){
       super();
    }
    public static void a(int p0){
       l0 b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uob, "5")) {
          return;
       }
       b = b.b;
       HashSet hashSet = new HashSet(b.b(new ArraySet()));
       hashSet.add(String.valueOf(p0));
       b.i(hashSet);
       return;
    }
    public static LiveGiftGuideConfig$AttachGiftConfig b(LiveGiftGuideConfig p0,int p1){
       LiveGiftGuideConfig obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          obj = p0.mAttachGiftConfigs;
          if (obj != null && obj.size() > 0) {
             Iterator iterator = p0.mAttachGiftConfigs.iterator();
             while (iterator.hasNext()) {
                LiveGiftGuideConfig$AttachGiftConfig uAttachGiftC = iterator.next();
                if (uAttachGiftC.mGiftId == p1) {
                   return uAttachGiftC;
                }
             }
          }
       }
       return null;
    }
}
