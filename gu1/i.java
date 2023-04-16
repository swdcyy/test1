package gu1.i;
import zs1.b;
import du1.d;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import gu1.i$a;
import l02.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pu1.m;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ut1.k;
import ut1.l;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Iterable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import st1.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import st1.e;

public final class i	// class@002588
{
    public final HashMap a;
    public final i$a b;
    public final b c;
    public final d d;
    public final a e;

    public void i(b p0,d p1,a p2){
       a.p(p0, "coreModel");
       a.p(p1, "renderDelegate");
       a.p(p2, "logDelegate");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = new HashMap();
       i$a uoa = new i$a(this);
       this.b = uoa;
       p1.g1(uoa);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       m a = m.a;
       f value = this.c.l().getValue();
       Objects.requireNonNull(a);
       List list = PatchProxy.applyOneRefs(value, a, m.class, "22");
       if (list != PatchProxyResult.class) {
       }else if(value == null){
          list = CollectionsKt__CollectionsKt.E();
       }else {
          list = new LinkedList();
          Iterator iterator1 = value.l().entrySet().iterator();
          while (iterator1.hasNext()) {
             Iterator iterator2 = iterator1.next().getValue().f().entrySet().iterator();
             while (iterator2.hasNext()) {
                list.add(iterator2.next().getValue().c());
             }
          }
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          UserInfo mId = iterator.next().mId;
          String str = this.d.R(mId);
          if (str != null && !TextUtils.n(str, this.a.get(mId))) {
             a.o(mId, "userId");
             hashMap.put(mId, str);
             this.a.put(mId, str);
          }
       }
       if (hashMap.size() > 0) {
          e.c(LiveMultiPkLogType.SHOW, this.e.l(), this.e.i(), this.e.a(), hashMap);
       }
       return;
    }
}
