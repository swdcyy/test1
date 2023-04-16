package com.kuaishou.live.audience.component.chat.multi.LiveAudienceMultiChatPresenter$innerOnTsptInfo$1;
import msd.r;
import kotlin.jvm.internal.Lambda;
import rx0.b;
import ga1.a;
import ae1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import kotlin.jvm.internal.a;
import qsd.d;
import android.view.View;
import lnc.a1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Number;

public final class LiveAudienceMultiChatPresenter$innerOnTsptInfo$1 extends Lambda implements r	// class@000a83
{
    public final a $adapterModel;
    public final b this$0;

    public void LiveAudienceMultiChatPresenter$innerOnTsptInfo$1(b p0,a p1){
       this.this$0 = p0;
       this.$adapterModel = p1;
       super(4);
    }
    public final c invoke(float p0,float p1,float p2,float p3){
       LiveAudienceMultiChatPresenter$innerOnTsptInfo$1 obj;
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveAudienceMultiChatPresenter$innerOnTsptInfo$1.class)) {
          obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, LiveAudienceMultiChatPresenter$innerOnTsptInfo$1.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       LiveAudienceMultiChatPresenter$innerOnTsptInfo$1 t$adapterMod = this.$adapterModel;
       if (t$adapterMod != null) {
          obj = this.this$0;
          Objects.requireNonNull(obj);
          BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
          if (PatchProxy.isSupport(uBaseLiveAud)) {
             Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),t$adapterMod};
             uoc = PatchProxy.apply(objArray, obj, uBaseLiveAud, "33");
             if (uoc != patchProxyRe) {
             }
          }
          a.p(t$adapterMod, "playViewAdapterModel");
          p2 = (float)(int)(p2 * 720.00f) / 720.00f;
          p3 = (float)(int)(p3 * 1280.00f) / 1280.00f;
          float f = (float)t$adapterMod.d;
          int i = d.H0((((0x3f800000 - ((float)(int)(p0 * 720.00f) / 720.00f)) - p2) * f)) + t$adapterMod.a;
          float f1 = (float)t$adapterMod.c;
          float f2 = (((0x3f800000 - ((float)(int)(p1 * 1280.00f) / 1280.00f)) - p3) * f1) + (float)t$adapterMod.b;
          BaseLiveAudienceMultiChatPresenter x = obj.x;
          if (x == null) {
             a.S("mBottomView");
          }
          c uoc1 = new c(i, d.H0((f2 - (float)x.getHeight())), (d.H0((f * p2)) + a1.d(0x7f0702ac)), d.H0((f1 * p3)));
          LiveLogTag cHAT = LiveLogTag.CHAT;
          cHAT.appendTag("LiveAudienceMultiChatComponent");
          b.T(cHAT, "getChatWindowPositionInfoV2", "adapterModel", t$adapterMod, "chatWindowPositionInfo", uoc1);
          uoc = uoc1;
       }else {
          uoc = this.this$0.S8(p0, p1, p2, p3);
       }
       return uoc;
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       return this.invoke(p0.floatValue(), p1.floatValue(), p2.floatValue(), p3.floatValue());
    }
}
