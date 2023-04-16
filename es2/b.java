package es2.b;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;
import androidx.lifecycle.LifecycleOwner;
import ds2.c;
import x61.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import z61.e;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import ds2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import z61.b;
import java.lang.Boolean;
import es2.b$a;
import androidx.lifecycle.MutableLiveData;

public final class b extends AbstractVoicePartyInviteButtonDataBinding	// class@0027cc
{
    public final LiveNormalBottomBarItem d;
    public final LifecycleOwner e;
    public final c f;

    public void b(LifecycleOwner p0,c p1,c p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "invitationPanelDelegate");
       a.p(p2, "liveBottomBarService");
       super(p0, p1);
       this.e = p0;
       this.f = p2;
       this.d = new e();
    }
    public LiveNormalBottomBarItem b(){
       return this.d;
    }
    public void d(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "viewModel");
       this.b().mFeatureId = 2002;
       this.b().mIsVisible = Boolean.FALSE;
       this.b().mIconRes = 0x7f08112e;
       this.b().mTextRes = 0x7f102e1c;
       this.b().mClickCallback = new b$a(p0);
       this.c().setValue(this.b());
       this.f.v1(this.c());
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.f.O0(2002);
       return;
    }
}
