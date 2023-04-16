package x3a.c;
import i4a.e;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import j4a.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import x3a.b;
import erd.g;

public class c extends e	// class@00443d
{

    public void c(QPhoto p0){
       super(p0);
    }
    public void q(int p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "1")) {
          return;
       }
       this.u(false, p1);
       return;
    }
    public void r(int p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "2")) {
          return;
       }
       this.u(true, p1);
       return;
    }
    public final void u(boolean p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       PlcEntryStyleInfo plcEntryStyl = this.a.getPlcEntryStyleInfo();
       if (plcEntryStyl == null) {
          return;
       }
       PlcEntryStyleInfo mEventTrackD = plcEntryStyl.mEventTrackData;
       if (mEventTrackD != null) {
          PlcEntryStyleInfo$EventTrackData mAdEventTrac = mEventTrackD.mAdEventTrackData;
          if (mAdEventTrac != null && mAdEventTrac.mPoiId > 0) {
             this.t(p0, p1, new b(plcEntryStyl, p0));
          }
       }
       return;
    }
}
