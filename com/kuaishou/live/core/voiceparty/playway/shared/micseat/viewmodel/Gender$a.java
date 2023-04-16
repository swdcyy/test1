package com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class Gender$a	// class@001872
{

    public void Gender$a(){
       super();
    }
    public void Gender$a(u p0){
       super();
    }
    public static Gender b(Gender$a p0,String p1,Gender p2,int p3,Object p4){
       p2 = (p3 & 0x02)? Gender.FEMALE: null;
       return p0.a(p1, p2);
    }
    public final Gender a(String p0,Gender p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Gender$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "defaultGender");
       if (p0 != null) {
          p1 = (p0.hashCode() == 77 && p0.equals("M"))? Gender.MALE: Gender.FEMALE;
       }
    label_002d :
       return p1;
    }
}
