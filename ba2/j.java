package ba2.j;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import ba2.v;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import y43.a;
import x67.j;
import ba2.h;
import my1.b;
import iy1.l;
import xp5.g;
import my1.e;
import androidx.lifecycle.MutableLiveData;
import iy1.g;
import lp3.c;
import lp3.e;
import lf3.f;

public final class j implements g	// class@000398
{
    public final c b;

    public void j(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       b uob;
       j tb = this.b;
       Objects.requireNonNull(tb);
       SCActionSignal topDistrictR = p0.topDistrictRank;
       if (topDistrictR != null && topDistrictR.length > 0) {
          int i = 0;
          object oobject = topDistrictR[i];
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(oobject, tb, uoc, "1")) {
             TopDistrictRank obj = PatchProxy.applyOneRefs(oobject, tb, uoc, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(oobject.noticeType == 3 && !v.g()){
                b.Z(LiveLogTag.HOURLY_RANK, "disable show national result notice");
             }else {
                uoc = tb.v;
                if (uoc != null) {
                   a c1 = uoc.D.c1;
                   if (c1 == null || !c1.R4()) {
                   }
                }else if(oobject.noticeType == 6 && (!tb.B.b() || (oobject.noticeType == 5 && !tb.B.d()))){
                   b = true;
                }
             }
          label_006e :
             b = false;
             if (b) {
                if (tb.B.c()) {
                   obj = oobject.noticeType;
                   if (obj != true && (obj == 3 || obj == 6)) {
                      i = 1;
                   }
                   if (i) {
                      oobject.useStrikingStyle = true;
                   }
                }
                if (oobject.useStrikingStyle != null) {
                   uob = new b(l.b, oobject);
                }else if(oobject.noticeType == 4 && !tb.A.e()){
                   uob = new b(l.c, oobject);
                   uob.b.setValue(oobject.descriptionV2);
                }
                tb.y.a(g.class).d2(uob);
             }
          }
       }
    label_00be :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
