package j02.o$b;
import lf3.g;
import j02.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.u;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import k02.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
import java.util.ArrayList;
import j02.v;
import z1.k;
import java.lang.Boolean;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Set;
import com.kuaishou.live.common.core.component.watchtimer.b;
import java.lang.Runnable;
import e93.f;
import k02.c;
import lf3.f;

public final class o$b implements g	// class@002a27
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       o$b b;
       o f;
       SCLiveEncourageTreasureBoxWidget timerTaskSta;
       v ov;
       LiveWatchTimerStartConfig obj2;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, o$b.class, str)) {
       }else {
          List a = u.a;
          b.P(a, "encourageTreasureBoxChangeListener, "+obj1);
          if (obj1 != null) {
             b = obj.b;
             b.r0(b.z0()).setValue(new b(obj1.widgetStatus, obj1.text, obj1.kuaishouLinkUrl, obj1.showGuideToast));
             o$b b1 = obj.b;
             Objects.requireNonNull(b1);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             o oo = o.class;
             if (!PatchProxy.applyVoidOneRefs(obj1, b1, oo, "2")) {
                boolean b2 = true;
                String str1 = "ENCOURAGE_TREASURE_BOX_SOURCE";
                String str2 = "ENCOURAGE_TREASURE_BOX_BIZ";
                if (b1.D0(obj1)) {
                   if (!PatchProxy.applyVoidOneRefs(obj1, b1, oo, "5") && obj1.timerTaskStageStatus != 3) {
                      oo = b1.g;
                      oo.mBiz = str2;
                      oo.mToken = obj1.timerTaskStageId;
                      oo.mLiveTypes = new ArrayList(b2);
                      oo = b1.g;
                      oo.mSource = str1;
                      oo.mIsSupportBackground = false;
                      ov = v.a();
                      o g = b1.g;
                      str1 = b1.v.get();
                      Objects.requireNonNull(ov);
                      List obj3 = PatchProxy.applyTwoRefs(g, str1, ov, v.class, str);
                      if (obj3 != patchProxyRe) {
                         obj3.booleanValue();
                      }else {
                         obj3 = v.b;
                         LiveWatchTimerStartConfig mBiz = g.mBiz;
                         obj2 = g.mToken;
                         LiveWatchTimerStartConfig mSource = g.mSource;
                         if (mSource == null) {
                            mSource = "null";
                         }
                         b.X(obj3, "start", ImmutableMap.of("biz", mBiz, "token", obj2, "source", mSource, "pageId", str1));
                         ov.b(ov.c(g.mBiz, g.mToken)).add(str1);
                         b.e().j(g);
                      }
                      f.j("LiveAudienceTreasureBoxViewModel updateTaskInfoRunnable", b1.l, 50);
                   }
                   f = b1.f;
                   timerTaskSta = obj1.timerTaskStageId;
                   SCLiveEncourageTreasureBoxWidget timerTaskSta1 = (f != null)? f.timerTaskStageId: null;
                   if (!timerTaskSta.equals(timerTaskSta1) && f != null) {
                      SCLiveEncourageTreasureBoxWidget timerTaskSta2 = f.timerTaskStageId;
                      if (timerTaskSta2 != null) {
                         ov = v.a();
                         String str3 = "ENCOURAGE_TREASURE_BOX_BIZ";
                         Objects.requireNonNull(ov);
                         obj2 = PatchProxy.applyThreeRefs(str3, timerTaskSta2, "ENCOURAGE_TREASURE_BOX_SOURCE", ov, v.class, "3");
                         if (obj2 != patchProxyRe) {
                            obj2.booleanValue();
                         }else {
                            ov.b(ov.c(str3, timerTaskSta2)).clear();
                            b.P(v.b, "stop");
                            b.e().k(str3, timerTaskSta2, "ENCOURAGE_TREASURE_BOX_SOURCE");
                         }
                         b.S(a, "LiveAudienceTreasureBoxViewModel updateTimerInfo LiveWatchTimerTaskManager stop", "taskStageId", timerTaskSta2);
                      }
                   }
                }else {
                   f.f(b1.l);
                   v.a().d(str2, obj1.timerTaskStageId, str1, b1.v.get());
                   b.S(a, "LiveAudienceTreasureBoxViewModel updateTimerInfo LiveWatchTimerTaskManager pause", "taskStageId", obj1);
                }
             label_015b :
                MutableLiveData mutableLiveD = b1.r0(b1.d);
                boolean b3 = b1.D0(obj1);
                timerTaskSta = obj1.timerTaskStageId;
                int i = b1.y0(obj1);
                if (obj1.timerTaskStageStatus == 3) {
                   b2 = false;
                }
                mutableLiveD.setValue(new c(b3, timerTaskSta, i, b2));
             }
          }
          obj.b.f = obj1;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
