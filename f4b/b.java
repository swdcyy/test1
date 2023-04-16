package f4b.b;
import androidx.collection.LruCache;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import x3b.b;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Long;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.System;
import java.lang.Iterable;
import brd.t;
import f4b.a;
import erd.o;
import ekd.k1;
import java.lang.Integer;
import java.util.ArrayList;
import x3b.a;

public final class b	// class@002895
{
    public static LruCache a;

    static {
       b.a = new LruCache(1000);
    }
    public void b(){
       super();
    }
    public static void a(MagicBusinessId p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("BriefPageCacheHelper", "deleteTabIds businessId:"+p0.name()+" groupId:"+p1, objArray);
       MagicDBProvider.b().a().p(p0.mId, p1);
       return;
    }
    public static Map b(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj.put(iterator.next(), Long.valueOf(0));
          }
       }
       return b.c(obj);
    }
    public static Map c(Map p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (q.h(p0)) {
          return obj;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          MagicEmoji$MagicFace magicFace = b.a.get(uEntry.getKey());
          if (magicFace != null && (MagicEmoji$MagicFace.isInvalidCheckSum(uEntry.getValue()) || !magicFace.mChecksum - uEntry.getValue().longValue())) {
             obj.put(magicFace.mId, magicFace);
          }else {
             hashMap.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       if (!hashMap.size()) {
          return obj;
       }
       long l = System.currentTimeMillis();
       iterator = MagicDBProvider.b().a().g(hashMap);
       int i = 0;
       if (iterator != null) {
          Object[] objArray = new Object[i];
          b.D().A("BriefPageCacheHelper", "DB->queryCount:"+iterator.size(), objArray);
          obj.putAll(iterator);
          t.fromIterable(iterator.values()).map(a.b);
       }
       Object[] objArray1 = new Object[i];
       b.D().A("BriefPageCacheHelper", "DB->Gson magicfaces cost:"+k1.t(l), objArray1);
       return obj;
    }
    public static List d(MagicBusinessId p0,String p1,int p2,int p3){
       ArrayList obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, b.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       List list = MagicDBProvider.b().a().k(p0.mId, p1, p2, p3);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().b());
          }
       }
       Object[] objArray = new Object[0];
       b.D().w("BriefPageCacheHelper", "getMagicFaceIds businessId:"+p0.name()+" groupId:"+p1+" startPos:"+p2+" endPos:"+p3+"  ---- resultSize:"+obj.size(), objArray);
       return obj;
    }
    public static void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             b.a.put(magicFace.mId, magicFace);
          }
          MagicDBProvider.b().a().h(p0);
       }
       return;
    }
    public static void f(MagicBusinessId p0,String p1,int p2,List p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, b.class, "9")) {
          return;
       }
       if (!q.f(p3)) {
          Object[] objArray = new Object[0];
          b.D().w("BriefPageCacheHelper", "saveMagicFaceIds businessId:"+p0.name()+" groupId:"+p1+" startPos:"+p2+" ---- insertSize:"+p3.size(), objArray);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p3.iterator();
          while (iterator.hasNext()) {
             int i = uArrayList.size() + p2;
             uArrayList.add(new a(p0.mId, p1, iterator.next(), i));
          }
          MagicDBProvider.b().a().n(uArrayList);
       }
       return;
    }
}
