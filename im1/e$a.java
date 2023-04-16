package im1.e$a;
import lf3.g;
import im1.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import p91.m;
import s81.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampage100StageInfo;
import ab1.g;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.view.View;
import android.view.ViewGroup;
import e3.l;
import androidx.transition.Transition;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import im1.a;
import android.animation.ValueAnimator;
import java.lang.Math;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import im1.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import im1.g;
import android.animation.Animator$AnimatorListener;
import lf3.f;

public class e$a implements g	// class@00294a
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       e$a b;
       boolean b1;
       LiveRampageTimeMessage$LiveRampageTimeInfo countDownInf;
       long l1;
       SharedPreferences a;
       Object obj = this;
       LiveRampageTimeMessage$LiveRampageTimeInfo obj1 = p0;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$a.class, "1")) {
       }else {
          int i = 4;
          if (obj1 != null && obj.b.w.Da(i)) {
             b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveGiftRampagePendantPresenter ServerSignalBlocked", "data", obj1.toString());
          }else {
             b = obj.b;
             Objects.requireNonNull(b);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, b, uoe, "31")) {
                long l2 = b.r.s();
                a = a.a;
                String str = "liveRampageShowTimestamp";
                if (!DateUtils.I(l2, a.getLong(str, 0))) {
                   SharedPreferences$Editor uEditor = a.edit();
                   uEditor.putLong(str, l2);
                   g.a(uEditor);
                   a.N(0);
                }
             }
             b = obj.b;
             Objects.requireNonNull(b);
             LiveRampageTimeMessage$LiveRampageTimeInfo obj2 = PatchProxy.applyOneRefs(obj1, b, uoe, "30");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(obj1 != null && b.V8() < obj1.effectRateLimit){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                b = obj.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(obj1, b, uoe, "13") && obj1 != null) {
                   if (b.Q == 2 && obj1.stage == 1) {
                      b.Z(LiveLogTag.GIFT, "LiveGiftRampage stage error current"+b.Q+"coming stage:"+obj1.stage);
                   }else {
                      long l = b.r.s();
                      obj2 = obj1.stage;
                      if (obj2 == 2) {
                         countDownInf = obj1.countDownInfo;
                         if (countDownInf == null || countDownInf.rampageEndTime - l < 0) {
                            b.Z(LiveLogTag.GIFT, "LiveGiftRampage timeout rampageEndTime"+obj1.countDownInfo.rampageEndTime+" currentTime:"+l);
                         }
                      }
                      b.U = obj1;
                      b.R = b.Q;
                      b.Q = obj2;
                      if (b.P == null) {
                         countDownInf = obj1.countDownInfo;
                         if (countDownInf != null && obj2 == 2) {
                            b.v.d(countDownInf.rampageEndTime);
                         }else {
                            b.v.d((0x7530 + l));
                         }
                         if (!PatchProxy.applyVoid(objArray, b, uoe, "4") && b.P == null) {
                            if (!PatchProxy.applyVoid(objArray, b, uoe, "28")) {
                               if (b.r.e()) {
                                  b.s.Pj(AnchorBizRelation.LIVE_GIFT_RAMPAGE);
                               }else {
                                  b.s.Pj(AudienceBizRelation.LIVE_GIFT_RAMPAGE);
                               }
                            }
                            if (b.x == null) {
                               b.W8();
                            }
                            b.v.e(b.x, 1);
                            b.d9(1);
                            b.Z8();
                            b.X8(b.P8(), objArray);
                            b.e9();
                         }
                         if (b.Q == 2) {
                            LiveRampageTimeMessage$LiveRampageTimeInfo liveRampageT = ((obj1.countDownInfo.rampageEndTime - l) - 8100 > 0)? 1: null;
                            if (!liveRampageT) {
                               b.d9(i);
                               b.a9();
                            }else {
                            label_0188 :
                               l1 = 100;
                               if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), b, uoe, "20")) {
                                  k1.s(b.U0, b, l1);
                               }
                               l1 = 5000;
                               if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), b, uoe, "22")) {
                                  k1.s(b.Y, b, l1);
                               }
                            }
                         }else {
                            goto label_0188 ;
                         }
                         a.b(b.r.a(), obj1.giftId, b.Q);
                      }else {
                         b.e9();
                         if (b.R == 1 && b.Q == 2) {
                            a.b(b.r.a(), obj1.giftId, b.Q);
                         }
                      }
                      if (b.Q == 2 && obj1.countDownInfo != null) {
                         k1.m(b.Z);
                         obj1 = obj1.countDownInfo;
                         LiveRampageTimeMessage$LiveRampage100StageInfo rampageEndTi = obj1.rampageEndTime;
                         b.T = rampageEndTi - obj1.rampageStartTime;
                         l1 = rampageEndTi - l;
                         if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(l1), b, uoe, "25") && l1 > 0)) {
                            e f = b.F;
                            if (f != null) {
                               f.removeAllUpdateListeners();
                               b.F.removeAllListeners();
                            }
                            int[] ointArray = new int[]{(int)Math.min(l1, 0x7fffffff),0};
                            ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
                            b.F = valueAnimato;
                            valueAnimato.setInterpolator(new LinearInterpolator());
                            b.F.addUpdateListener(new f(b));
                            b.F.addListener(new g(b));
                            b.F.setDuration(l1);
                            b.F.start();
                         }
                      }
                   }
                }
             }
          }
       }
    label_0258 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
