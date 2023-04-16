package o4a.k;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import rd5.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f4a.i;
import f4a.v;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.b0;
import f4a.f;
import java.lang.Runnable;
import ekd.k1;

public final class k implements g	// class@00328b
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int this;
       boolean b2;
       k b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uob, "4")) {
       }else {
          PlcEntryStyleInfo mStyleInfo = b.s.mStyleInfo;
          PlcEntryStyleInfo$StyleInfo mShowWeakVid = mStyleInfo.mShowWeakVideoMillis;
          PlcEntryStyleInfo$StyleInfo mShowWeakVid1 = mStyleInfo.mShowWeakVideoCountdownMillis;
          PlcEntryStyleInfo$StyleInfo mShowWeakVid2 = mStyleInfo.mShowWeakVideoPercent;
          PlcEntryStyleInfo$StyleInfo mWeakToStron = mStyleInfo.mWeakToStrongVideoMillis;
          PlcEntryStyleInfo$StyleInfo styleInfo = mStyleInfo.weakToStrongVideoCountdownMillis;
          PlcEntryStyleInfo$StyleInfo styleInfo1 = mStyleInfo.mWeakToStrongVideoPercent;
          PlcEntryStyleInfo$StyleInfo styleInfo2 = mStyleInfo.mStrongVideoHideMillis;
          PlcEntryStyleInfo$StyleInfo mStrongVideo = mStyleInfo.mStrongVideoHidePercent;
          int i = 0;
          if (b.Q == null && (b.P == null && b.M != null)) {
             this = true;
             boolean b1 = (b.S8(mShowWeakVid, mShowWeakVid1, mShowWeakVid2, obj) != null)? true: false;
             b.Q = b1;
             if (b1) {
                i = 1;
             }
          }else {
             this = true;
          }
          if (b.P == null && (b.R == null && b.L != null)) {
             PlcStyleChangeType obj1 = PatchProxy.apply(null, b, uob, "11");
             if (obj1 != PatchProxyResult.class) {
                b2 = obj1.booleanValue();
             }else if(b.K.getActionType() == 2){
                b2 = b.y.b(b.K.getDownloadUrl(), b.K.getPackageName(), b.getActivity());
             }else {
                b2 = true;
             }
             if (b2 && !v.b().e(b.p.getPhotoId())) {
                obj1 = b.S8(mWeakToStron, styleInfo, styleInfo1, obj);
                if (obj1 != null) {
                   b.P = this;
                   b.D.i(obj1);
                   this = 3;
                label_00c0 :
                   if (b.W.a == null || (this == 3 && b.S8(styleInfo2, 0, mStrongVideo, obj) != null)) {
                      this = 9;
                   }
                   if (this) {
                      b.R8(this);
                      if (b.V == null && b.T == null) {
                         k1.m(b.Z);
                         k1.r(b.Z, 250);
                      }
                   }
                }else {
                label_00be :
                   this = i;
                   goto label_00c0 ;
                }
             }
          }
       label_00bd :
          uob = 3;
          goto label_00be ;
       }
    label_00f0 :
       return;
    }
}
