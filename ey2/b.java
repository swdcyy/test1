package ey2.b;
import erd.g;
import ey2.d;
import java.lang.Object;
import ey2.d$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l72.a;
import l72.a$a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.voiceparty.LiveVoicePartyEnterRoomData;
import kotlin.jvm.internal.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import java.util.ArrayList;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import jr5.a;
import jr5.a$a;
import lnc.a1;
import java.util.List;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBorderData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData;
import zq5.b;

public final class b implements g	// class@002811
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d$a d;
       int[] ointArray;
       int[] ointArray1;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "3")) {
       }else if(tb.o != null){
          a$a y = a.y;
          Objects.requireNonNull(y);
          LiveVoicePartyEnterRoomData liveVoicePar = PatchProxy.applyOneRefs(p0, y, a$a.class, "1");
          if (liveVoicePar != PatchProxyResult.class) {
          }else {
             a.p(p0, "enterUserInfo");
             liveVoicePar = new LiveVoicePartyEnterRoomData();
             liveVoicePar.setUserInfo(UserInfo.convertFromProto(p0.b));
             int i = 2;
             liveVoicePar.setBizType(i);
             int i1 = 1;
             liveVoicePar.setRunwayType(i1);
             liveVoicePar.setEnterRoomInfo(p0);
             liveVoicePar.setPriority(10);
             ArrayList uArrayList = new ArrayList();
             LiveFloatingScreenTextItem liveFloating = new LiveFloatingScreenTextItem();
             UserInfos$UserInfo userName = p0.b.userName;
             a.o(userName, "enterUserInfo.mAudienceUserInfo.userName");
             String str = a1.r(R.string.arg_RES_7f10213e, a.b.c(userName, 5));
             a.o(str, "CommonUtil.string\(\n     ¡­ER_NAME_MAX_SIZE\)\n      \)");
             liveFloating.setText(str);
             liveFloating.setTextSize(14);
             liveFloating.setTextColor(a1.a(R.color.arg_RES_7f061ff3));
             uArrayList.add(liveFloating);
             liveVoicePar.setContentItems(uArrayList);
             LiveFloatingScreenBackgroundData liveFloating1 = new LiveFloatingScreenBackgroundData();
             liveFloating1.setBackgroundType(i);
             d = p0.d;
             if (d != null) {
                if (d != 4) {
                   if (d != 5) {
                      if (d == 6) {
                         ointArray1 = new int[]{a.n,a.o,a.p,a.q,a.s};
                         liveFloating1.setBackgroundGradientIntColor(ointArray1);
                         liveFloating1.setBackgroundGradientPoints(a.r);
                      }
                   }else {
                      ointArray1 = new int[i];
                      ointArray1[0] = a.j;
                      ointArray1[i1] = a.k;
                      liveFloating1.setBackgroundGradientIntColor(ointArray1);
                   }
                }else {
                   ointArray1 = new int[i];
                   ointArray1[0] = a.f;
                   ointArray1[i1] = a.g;
                   liveFloating1.setBackgroundGradientIntColor(ointArray1);
                }
             }else {
                ointArray1 = new int[i];
                ointArray1[0] = a.b;
                ointArray1[i1] = a.c;
                liveFloating1.setBackgroundGradientIntColor(ointArray1);
             }
             liveVoicePar.setBackgroundData(liveFloating1);
             LiveFloatingScreenBorderData liveFloating2 = new LiveFloatingScreenBorderData();
             d = p0.d;
             if (d != null) {
                if (d != 4) {
                   if (d != 5) {
                      if (d == 6) {
                         ointArray = new int[i];
                         ointArray[0] = a.t;
                         ointArray[i1] = a.u;
                         liveFloating2.setBorderGradientIntColors(ointArray);
                      }
                   }else {
                      ointArray = new int[i];
                      ointArray[0] = a.l;
                      ointArray[i1] = a.m;
                      liveFloating2.setBorderGradientIntColors(ointArray);
                   }
                }else {
                   ointArray = new int[i];
                   ointArray[0] = a.h;
                   ointArray[i1] = a.i;
                   liveFloating2.setBorderGradientIntColors(ointArray);
                }
             }else {
                ointArray = new int[i];
                ointArray[0] = a.d;
                ointArray[i1] = a.e;
                liveFloating2.setBorderGradientIntColors(ointArray);
             }
             liveFloating2.setBorderWidth((float)a.a);
             liveVoicePar.setBorderData(liveFloating2);
             if (p0.d == 6) {
                LiveFloatingScreenEffectData liveFloating3 = new LiveFloatingScreenEffectData();
                liveFloating3.setEffectTypeBits(i1);
                liveFloating3.setShimmerLocation(i1);
                liveFloating3.setShimmerResType(i1);
                liveFloating3.setShimmerDrawableId(R.drawable.arg_RES_7f081497);
                liveFloating3.setEffectDelayTimeMs(600);
                liveVoicePar.setEffectData(liveFloating3);
             }
             d$a d1 = p0.d;
             if (d1 == 5 || d1 == 6) {
                LiveFloatingScreenSurfaceData liveFloating4 = new LiveFloatingScreenSurfaceData();
                liveFloating4.setSurfaceDecorTailWidth(a.v);
                liveFloating4.setSurfaceDecorTailHeight(a.w);
                liveFloating4.setSurfaceDecorTailMarginStart(a.x);
                int i2 = (p0.d == 5)? 0x7f0810b2: 0x7f0810b5;
                liveFloating4.setSurfaceDecorTailResId(i2);
                liveVoicePar.setSurfaceData(liveFloating4);
             }
          }
          tb.o.Gi(liveVoicePar);
       }
       return;
    }
}
