package com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ds2.c;

public final class AbstractVoicePartyInviteButtonDataBinding$b implements Observer	// class@001512
{
    public final AbstractVoicePartyInviteButtonDataBinding b;

    public void AbstractVoicePartyInviteButtonDataBinding$b(AbstractVoicePartyInviteButtonDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractVoicePartyInviteButtonDataBinding$b.class, "1")) {
       }else {
          this.b.c.U();
       }
       return;
    }
}
