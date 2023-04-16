package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$a;
import aq5.b;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import kp1.a;
import xp1.b;
import up1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveAudienceMultiChatPresenterV2$a implements b	// class@000b98
{
    public final LiveAudienceMultiChatPresenterV2 b;

    public void LiveAudienceMultiChatPresenterV2$a(LiveAudienceMultiChatPresenterV2 p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       LiveAudienceMultiChatPresenterV2$a uoa = LiveAudienceMultiChatPresenterV2$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "bizRelation");
       if (p0 == AudienceBizRelation.RECRUIT_EXPLAIN_PANEL) {
          LiveAudienceMultiChatPresenterV2 d = this.b.D;
          if (d != null) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, d, LiveAudienceMultiChatController.class, "9")) {
                LiveAudienceMultiChatController j = d.j;
                if (j == null) {
                   a.S("multiChatCoreModel");
                }
                Objects.requireNonNull(j);
                if (!PatchProxy.applyVoid(objArray, j, LiveAudienceMultiChatCoreModel.class, "6") && MultiChatState.CHATTING == j.D().u()) {
                   LayoutConfig value = j.m().c().getValue();
                   if (value != null && value.c() == 1) {
                      b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel reloadChatLayoutConfig");
                      j.E();
                   }
                }
             }
          }
       }
    label_0074 :
       return;
    }
}
