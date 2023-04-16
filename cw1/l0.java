package cw1.l0;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.util.SparseArray;
import pq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;

public class l0	// class@001e6e
{
    public static final List a;
    public static final SparseArray b;

    static {
       LivePendantContainerScene vOICE_PARTY_;
       LivePendantContainerScene vOICE_PARTY_1;
       LivePendantContainerScene vOICE_PARTY_2;
       LivePendantContainerScene vOICE_PARTY_3;
       LivePendantContainerScene vOICE_PARTY_4;
       LivePendantContainerScene vOICE_PARTY_5;
       LivePendantContainerScene[] livePendantC = new LivePendantContainerScene[]{vOICE_PARTY_,vOICE_PARTY_1,vOICE_PARTY_2,vOICE_PARTY_3,vOICE_PARTY_4,vOICE_PARTY_5};
       vOICE_PARTY_ = LivePendantContainerScene.VOICE_PARTY_CROSS_ROOM_TEAM_PK;
       vOICE_PARTY_1 = LivePendantContainerScene.VOICE_PARTY_TEAM_PK;
       vOICE_PARTY_2 = LivePendantContainerScene.VOICE_PARTY_THEATER;
       vOICE_PARTY_3 = LivePendantContainerScene.VOICE_PARTY_KTV;
       vOICE_PARTY_4 = LivePendantContainerScene.VOICE_PARTY_SEATS;
       vOICE_PARTY_5 = LivePendantContainerScene.VOICE_PARTY_VIDEO;
       l0.a = Arrays.asList(livePendantC);
       SparseArray sparseArray = new SparseArray();
       l0.b = sparseArray;
       sparseArray.put(1, vOICE_PARTY_3);
       sparseArray.put(4, vOICE_PARTY_2);
       sparseArray.put(2, vOICE_PARTY_5);
       sparseArray.put(3, vOICE_PARTY_4);
       sparseArray.put(5, vOICE_PARTY_1);
       sparseArray.put(6, vOICE_PARTY_);
    }
    public void l0(){
       super();
    }
    public static void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l0.class, "1")) {
          return;
       }
       Iterator iterator = l0.a.iterator();
       while (iterator.hasNext()) {
          LivePendantContainerScene[] livePendantC = new LivePendantContainerScene[]{iterator.next()};
          p0.pm(livePendantC);
       }
       return;
    }
    public static void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l0.class, "2")) {
          return;
       }
       Iterator iterator = l0.a.iterator();
       while (iterator.hasNext()) {
          LivePendantContainerScene[] livePendantC = new LivePendantContainerScene[]{iterator.next()};
          p0.Be(livePendantC);
       }
       return;
    }
}
