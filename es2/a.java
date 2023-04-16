package es2.a;
import androidx.lifecycle.Observer;
import es2.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.b;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.core.voiceparty.invitebutton.AbstractVoicePartyInviteButtonDataBinding;

public final class a implements Observer	// class@0027ca
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.b().mIsVisible = p0;
          this.b.c().setValue(this.b.b());
       }
       return;
    }
}
