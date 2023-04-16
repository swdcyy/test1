package b99.q0;
import erd.g;
import b99.t0;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.PlcEntryStyleInfoResponse;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import ry4.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import f4a.b0;
import java.lang.System;
import f4a.v;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import n4a.a;
import o4a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewGroup;

public final class q0 implements g	// class@0003b5
{
    public final t0 b;

    public void q0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t0 r;
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       PlcEntryStyleInfoResponse mPlcEntrySty = p0.mPlcEntryStyleInfo;
       if (mPlcEntrySty != null) {
          if (c.e(1, tb.w, mPlcEntrySty)) {
             PhotoMeta mPlcEntrySty1 = tb.r.mPlcEntryStyleInfo;
             PlcEntryStyleInfoResponse mPlcEntrySty2 = p0.mPlcEntryStyleInfo;
             PlcEntryStyleInfo mEventTrackD = mPlcEntrySty2.mEventTrackData;
             if (mEventTrackD != null) {
                PlcEntryStyleInfo mEventTrackD1 = mPlcEntrySty1.mEventTrackData;
                if (mEventTrackD1 != null) {
                   PlcEntryStyleInfo$EventTrackData mAdEventTrac = mEventTrackD.mAdEventTrackData;
                   if (mAdEventTrac != null) {
                      PlcEntryStyleInfo$EventTrackData mAdEventTrac1 = mEventTrackD1.mAdEventTrackData;
                      if (mAdEventTrac1 != null) {
                         mAdEventTrac.mTrafficSource = mAdEventTrac1.mTrafficSource;
                      }
                   }
                }
             }
             tb.A.y(mPlcEntrySty2);
             mPlcEntrySty2 = p0.mPlcEntryStyleInfo;
             tb.r.mPlcEntryStyleInfo = mPlcEntrySty2;
             tb.w.setPlcEntryStyleInfo(mPlcEntrySty2);
             p0.mPlcEntryStyleInfo.mCachedTime = System.currentTimeMillis();
             v.b().g(tb.w.getPhotoId(), p0.mPlcEntryStyleInfo);
          label_005d :
             p0 = p0.mPlcEntryStyleInfo;
             t0 ot0 = t0.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, ot0, "7")) {
                TunaPlcLogger.d(TunaPlcLogger$Event.PLC_REFRESH_INIT, tb.w);
                if (!PatchProxy.applyVoid(null, tb, ot0, "8")) {
                   r = tb.U;
                   if (r != null) {
                      a uoa = new a();
                      tb.V = uoa;
                      uoa.a = r.S6();
                      tb.V.b = tb.U.Z6();
                   }
                }
                if (!PatchProxy.applyVoid(null, tb, ot0, "13")) {
                   r = tb.R;
                   if (r != null) {
                      r.destroy();
                      tb.R = null;
                   }
                }
                if (!PatchProxy.applyVoid(null, tb, ot0, "11")) {
                   ot0 = tb.S;
                   if (ot0 != null) {
                      tb.Q.removeView(ot0);
                      tb.S = null;
                   }
                }
                tb.S8(p0);
             }
          }
       }else {
          tb.A.J();
          goto label_005d ;
       }
       return;
    }
}
