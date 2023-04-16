package com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge$Type;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import androidx.lifecycle.MutableLiveData;

public final class AbstractVoicePartyInviteButtonDataBinding$a implements Observer	// class@001511
{
    public final AbstractVoicePartyInviteButtonDataBinding b;

    public void AbstractVoicePartyInviteButtonDataBinding$a(AbstractVoicePartyInviteButtonDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       AbstractVoicePartyInviteButtonDataBinding uAbstractVoi = AbstractVoicePartyInviteButtonDataBinding.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractVoicePartyInviteButtonDataBinding$a.class, "1")) {
       }else if(p0.intValue() > 0){
          AbstractVoicePartyInviteButtonDataBinding$a tb = this.b;
          a.o(p0, "applyCount");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(uAbstractVoi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uAbstractVoi, "2")) {
             i = (i > 99)? "99+": String.valueOf(i);
             LiveBottomBarItemBadge liveBottomBa = new LiveBottomBarItemBadge();
             liveBottomBa.b = LiveBottomBarItemBadge$Type.TEXT;
             liveBottomBa.a = i;
             i.mBadge = liveBottomBa;
             tb.a.setValue(tb.b());
          }
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, uAbstractVoi, "3")) {
             p0.b().mBadge = null;
             p0.a.setValue(p0.b());
          }
       }
       return;
    }
}
