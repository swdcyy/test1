package e31.h;
import android.content.Context;
import x61.c;
import x32.a;
import s51.c;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import f31.b;
import java.lang.Object;
import e31.j;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z61.b;
import e31.c;
import e31.b;
import z61.a$a;
import z61.a;
import lnc.a1;
import d61.c0;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import e31.e;
import java.lang.Runnable;
import e93.f;
import com.google.gson.JsonObject;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import e31.a;
import w4.j;

public class h	// class@002098
{
    public final j a;
    public final MutableLiveData b;
    public int c;
    public final c d;
    public final a e;
    public final c f;
    public final LiveAudienceTaskConfig g;
    public final b h;
    public final Context i;

    public void h(Context p0,c p1,a p2,c p3,LiveAudienceTaskConfig p4,b p5){
       super();
       j oj = new j();
       this.a = oj;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.b = mutableLiveD;
       this.c = -1;
       this.i = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       p5.e(p4);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "2")) {
       }else {
          oj.mIsVisible = Boolean.TRUE;
          oj.mFeatureId = 4007;
          oj.mClickCallback = new c(this);
          oj.mShowLogParamsSupplier = new b(this);
          oj.mClickLogParamsSupplier = new b(this);
          a$a uoa = new a$a();
          oj.a = uoa;
          uoa.c = 0x7f08113a;
          uoa.b = a1.p(0x7f10208e);
          mutableLiveD.setValue(oj);
          p1.v1(mutableLiveD);
       }
       if (!PatchProxy.applyVoid(objArray, this, h.class, "14")) {
          c0 a = c0.a;
          a.i(p0, a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_normal.json"));
          a.i(p0, a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_finish.json"));
       }
       LiveAudienceTaskConfig mTaskGuideDe = p4.mTaskGuideDelayTimeMs;
       if (mTaskGuideDe - null > 0) {
          b.c0(LiveLogTag.LIVE_TASK_CENTER, "delayStartTaskNormalGuide", "delayTime", Long.valueOf(mTaskGuideDe));
          f.k("tryStartTaskNormalGuide", new e(this), this, p4.mTaskGuideDelayTimeMs);
       }
       return;
    }
    public static JsonObject a(h p0){
       Objects.requireNonNull(p0);
       JsonObject jsonObject = PatchProxy.apply(null, p0, h.class, "3");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          p0 = p0.c;
          if (p0 != -1) {
             jsonObject.a0("audience_mission_status", Integer.valueOf(p0));
          }
       }
       return jsonObject;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "13")) {
          return;
       }
       this.c(3);
       this.c(2);
       return;
    }
    public final void c(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "12")) {
          return;
       }
       this.d.xm(4007, 1001);
       this.e.F6(p0);
       return;
    }
    public final void d(String p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, h.class, "7")) {
          return;
       }
       a.i(this.i, p0).addListener(new a(this, p1, p2));
       return;
    }
}
