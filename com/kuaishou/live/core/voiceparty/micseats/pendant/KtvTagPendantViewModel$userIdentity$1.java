package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel$userIdentity$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;

public final class KtvTagPendantViewModel$userIdentity$1 extends Lambda implements p	// class@00161d
{
    public final String $anchorId;

    public void KtvTagPendantViewModel$userIdentity$1(String p0){
       this.$anchorId = p0;
       super(2);
    }
    public final int invoke(UserInfo p0,Set p1){
       int i;
       UserInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, KtvTagPendantViewModel$userIdentity$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p1, "singerCandidatesInfo");
       obj = null;
       UserInfo mId = (p0 != null)? p0.mId: obj;
       if (a.g(mId, this.$anchorId)) {
          i = 0;
       }else if(p0 != null){
          obj = p0.mId;
       }
       if (CollectionsKt___CollectionsKt.H1(p1, obj)) {
          i = 1;
       }else {
          i = 2;
       }
       return i;
    }
    public Object invoke(Object p0,Object p1){
       return Integer.valueOf(this.invoke(p0, p1));
    }
}
