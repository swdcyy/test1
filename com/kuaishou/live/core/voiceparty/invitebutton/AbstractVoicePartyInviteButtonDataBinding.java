package com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import androidx.lifecycle.LifecycleOwner;
import ds2.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import ds2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;

public abstract class AbstractVoicePartyInviteButtonDataBinding	// class@001514
{
    public final MutableLiveData a;
    public final LifecycleOwner b;
    public final c c;

    public void AbstractVoicePartyInviteButtonDataBinding(LifecycleOwner p0,c p1){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "delegate");
       super();
       this.b = p0;
       this.c = p1;
       this.a = new MutableLiveData();
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractVoicePartyInviteButtonDataBinding.class, "1")) {
          return;
       }
       a.p(p0, "viewModel");
       this.d(p0);
       p0.u0().observe(this.b, new AbstractVoicePartyInviteButtonDataBinding$a(this));
       p0.b.observe(this.b, new AbstractVoicePartyInviteButtonDataBinding$b(this));
       this.b.getLifecycle().addObserver(new AbstractVoicePartyInviteButtonDataBinding$bindViewModel$3(this));
       return;
    }
    public abstract LiveNormalBottomBarItem b();
    public final MutableLiveData c(){
       return this.a;
    }
    public abstract void d(d p0);
    public abstract void e();
}
