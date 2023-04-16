package cw1.d0;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.e;
import java.util.Comparator;
import java.util.Collections;
import cw1.c0;

public class d0	// class@001e5e
{
    public c0 a;
    public final List b;
    public List c;
    public List d;
    public LivePendantContainerScene e;
    public LivePendantContainerScene f;

    public void d0(){
       List list = this;
       d0 uod0 = d0.class;
       super();
       list.b = new ArrayList();
       list.c = new ArrayList();
       list.d = new ArrayList();
       LivePendantContainerScene pLAY_CONFIG_ = LivePendantContainerScene.PLAY_CONFIG_PORTRAIT;
       list.e = pLAY_CONFIG_;
       list.f = pLAY_CONFIG_;
       LivePendantContainerScene[] livePendantC = new LivePendantContainerScene[20];
       LivePendantContainerScene mULTI_CHAT_C = LivePendantContainerScene.MULTI_CHAT_CENTER_VIEW;
       livePendantC[0] = mULTI_CHAT_C;
       LivePendantContainerScene pLAY_CONFIG_1 = LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE;
       livePendantC[1] = pLAY_CONFIG_1;
       LivePendantContainerScene rECRUIT_EXPL = LivePendantContainerScene.RECRUIT_EXPLAIN;
       livePendantC[2] = rECRUIT_EXPL;
       livePendantC[3] = pLAY_CONFIG_;
       LivePendantContainerScene sCREEN_LANDS = LivePendantContainerScene.SCREEN_LANDSCAPE;
       livePendantC[4] = sCREEN_LANDS;
       livePendantC[5] = LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE;
       livePendantC[6] = LivePendantContainerScene.GZONE_BANNER;
       LivePendantContainerScene mULTI_TAB_ST = LivePendantContainerScene.MULTI_TAB_STYLE;
       livePendantC[7] = mULTI_TAB_ST;
       LivePendantContainerScene pK = LivePendantContainerScene.PK;
       livePendantC[8] = pK;
       livePendantC[9] = LivePendantContainerScene.PK_SMALL_WINDOW;
       LivePendantContainerScene lIVE_LINE = LivePendantContainerScene.LIVE_LINE;
       livePendantC[10] = lIVE_LINE;
       LivePendantContainerScene lIVE_MULTI_L = LivePendantContainerScene.LIVE_MULTI_LINE;
       livePendantC[11] = lIVE_MULTI_L;
       LivePendantContainerScene vOICE_PARTY_ = LivePendantContainerScene.VOICE_PARTY_VIDEO;
       livePendantC[12] = vOICE_PARTY_;
       LivePendantContainerScene vOICE_PARTY_1 = LivePendantContainerScene.VOICE_PARTY_SEATS;
       livePendantC[13] = vOICE_PARTY_1;
       LivePendantContainerScene vOICE_PARTY_2 = LivePendantContainerScene.VOICE_PARTY_KTV;
       livePendantC[14] = vOICE_PARTY_2;
       LivePendantContainerScene vOICE_PARTY_3 = LivePendantContainerScene.VOICE_PARTY_THEATER;
       livePendantC[15] = vOICE_PARTY_3;
       LivePendantContainerScene vOICE_PARTY_4 = LivePendantContainerScene.VOICE_PARTY_TEAM_PK;
       livePendantC[16] = vOICE_PARTY_4;
       LivePendantContainerScene vOICE_PARTY_5 = LivePendantContainerScene.VOICE_PARTY_CROSS_ROOM_TEAM_PK;
       livePendantC[17] = vOICE_PARTY_5;
       livePendantC[18] = LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_TOP;
       livePendantC[19] = LivePendantContainerScene.GUEST_ACTIVITY_TOP_LIST_PORTRAIT;
       if (PatchProxy.applyVoidOneRefs(livePendantC, list, uod0, "1")) {
       }else {
          list.c = q.a(livePendantC);
       }
       LivePendantContainerScene[] livePendantC1 = new LivePendantContainerScene[21];
       livePendantC1[0] = mULTI_CHAT_C;
       livePendantC1[1] = LivePendantContainerScene.ANCHOR_CHAT;
       livePendantC1[2] = LivePendantContainerScene.AUDIENCE_CHAT;
       livePendantC1[3] = LivePendantContainerScene.AUDIENCE_VIDEO_CHAT;
       livePendantC1[4] = LivePendantContainerScene.AUDIENCE_CHAT_APPLY_BUTTON;
       livePendantC1[5] = LivePendantContainerScene.MERCHANT_AUCTION_BUBBLE;
       livePendantC1[6] = pLAY_CONFIG_;
       livePendantC1[7] = pK;
       livePendantC1[8] = lIVE_LINE;
       livePendantC1[9] = lIVE_MULTI_L;
       livePendantC1[10] = vOICE_PARTY_;
       livePendantC1[11] = vOICE_PARTY_1;
       livePendantC1[12] = vOICE_PARTY_2;
       livePendantC1[13] = vOICE_PARTY_3;
       livePendantC1[14] = vOICE_PARTY_4;
       livePendantC1[15] = vOICE_PARTY_5;
       livePendantC1[16] = pLAY_CONFIG_1;
       livePendantC1[17] = rECRUIT_EXPL;
       livePendantC1[18] = sCREEN_LANDS;
       livePendantC1[19] = mULTI_TAB_ST;
       livePendantC1[20] = LivePendantContainerScene.REBROADCAST_PENDANT_RIGHT_BOTTOM;
       if (!PatchProxy.applyVoidOneRefs(livePendantC1, list, uod0, "2")) {
          list.d = q.a(livePendantC1);
       }
       list.e(pLAY_CONFIG_, 1);
       return;
    }
    public LivePendantContainerScene a(){
       return this.f;
    }
    public LivePendantContainerScene b(){
       return this.e;
    }
    public final boolean c(LivePendantContainerScene p0,boolean p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uod0, "11");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       this.e(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uod0, "15")) {
          Collections.sort(this.b, e.b);
       }
       LivePendantContainerScene livePendantC = PatchProxy.apply(objArray, this, uod0, "12");
       boolean b = false;
       if (livePendantC != patchProxyRe) {
       }else {
          int i1 = 0;
          while (true) {
             if (i1 < this.b.size()) {
                LivePendantContainerScene livePendantC1 = this.b.get(i1);
                if (this.c.contains(livePendantC1)) {
                   livePendantC = livePendantC1;
                }else {
                   i1++;
                }
             }else {
                livePendantC = objArray;
             }
          }
       }
       String str = (livePendantC != null && livePendantC != this.e)? 1: null;
       if (str) {
          this.e = livePendantC;
          livePendantC = 1;
       }else {
          livePendantC = 0;
       }
       LivePendantContainerScene obj1 = PatchProxy.apply(objArray, this, uod0, "13");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          int i = 0;
          while (i < this.b.size()) {
             obj1 = this.b.get(i);
             if (this.d.contains(obj1)) {
                objArray = obj1;
             }
             i = i + 1;
          }
       }
       patchProxyRe = (objArray != null && objArray != this.f)? 1: 0;
       if (patchProxyRe) {
          this.f = objArray;
          objArray = 1;
       }else {
          objArray = 0;
       }
       if (livePendantC || objArray) {
          b = true;
       }
       return b;
    }
    public void d(LivePendantContainerScene p0,boolean p1){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod0, "8")) {
          return;
       }
       if (this.c(p0, p1)) {
          this.a.b();
       }
       return;
    }
    public final void e(LivePendantContainerScene p0,boolean p1){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod0, "14")) {
          return;
       }
       if (p1) {
          if (!this.b.contains(p0)) {
             this.b.add(p0);
          }
       }else {
          this.b.remove(p0);
       }
       return;
    }
}
