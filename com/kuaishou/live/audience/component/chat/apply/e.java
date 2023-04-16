package com.kuaishou.live.audience.component.chat.apply.e;
import com.kuaishou.live.audience.component.chat.apply.h$a;
import com.kuaishou.live.audience.component.chat.apply.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import rd1.c0;
import java.util.Objects;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import lnc.a1;
import android.os.Bundle;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig$a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import xp5.g;
import px0.e;
import com.kuaishou.live.audience.component.chat.apply.LiveAudienceApplyChatEditReasonFragment;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import px0.a;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.c;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;

public class e implements h$a	// class@000a6a
{
    public final d a;

    public void e(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       c0.A(this.a.f.a(), "FILL");
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, d.class, "17")) {
          Bundle uBundle = new BaseEditorFragment$Arguments().setMonitorTextChange(true).setEnableSingleLine(false).setEnableAtFriends(false).setCancelWhileKeyboardHidden(true).setImeOptions(4).setHintText(a1.p(R.string.arg_RES_7f102094)).setEnableAsr(false).setEnableInputAt(false).setEnableLocation(false).setSendBtnPermanent(true).setEnableEmoji(false).build();
          EmotionFloatEditConfig$a uoa = new EmotionFloatEditConfig$a();
          uoa.p(3);
          EmotionFloatEditConfig uEmotionFloa = uoa.a();
          String liveStreamId = ta.e.getLiveStreamId();
          e uoe = new e(ta);
          LiveAudienceApplyChatEditReasonFragment liveAudience = PatchProxy.applyFourRefs(liveStreamId, uoe, uBundle, uEmotionFloa, null, LiveAudienceApplyChatEditReasonFragment.class, "2");
          if (liveAudience != PatchProxyResult.class) {
          }else {
             liveAudience = new LiveAudienceApplyChatEditReasonFragment();
             liveAudience.i2 = liveStreamId;
             liveAudience.h2 = uoe;
             SerializableHook.putSerializable(uBundle, "sKeyEmotionConfig", uEmotionFloa);
             liveAudience.setArguments(uBundle);
          }
          liveAudience.ph(new a(ta, liveAudience));
          liveAudience.show(ta.j.R().getChildFragmentManager(), "LiveAudienceApplyChatEditReasonFragment");
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       c0.A(this.a.f.a(), "CANCEL");
       this.a.l.Jb(true);
       return;
    }
}
