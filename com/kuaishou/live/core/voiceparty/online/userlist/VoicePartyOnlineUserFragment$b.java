package com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment$b;
import gka.h;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import mkc.b;
import android.view.View;
import mkc.c;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment$b$a;
import android.view.View$OnClickListener;

public class VoicePartyOnlineUserFragment$b extends h	// class@001806
{
    public final VoicePartyOnlineUserFragment a;

    public void VoicePartyOnlineUserFragment$b(VoicePartyOnlineUserFragment p0){
       this.a = p0;
       super();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment$b.class, "2")) {
          return;
       }
       this.a.J.setVisibility(8);
       b[] uobArray = new b[]{b.e};
       c.d(this.a.K, uobArray);
       b[] uobArray1 = new b[]{b.g};
       c.d(this.a.K, uobArray1);
       this.a.K.setVisibility(8);
       this.a.h0().setVisibility(0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment$b.class, "1")) {
          return;
       }
       this.a.J.setVisibility(0);
       b[] uobArray = new b[]{b.e};
       c.d(this.a.K, uobArray);
       b[] uobArray1 = new b[]{b.g};
       c.d(this.a.K, uobArray1);
       this.a.K.setVisibility(8);
       this.a.h0().setVisibility(8);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment$b.class, "4")) {
          return;
       }
       this.a.J.setVisibility(8);
       b[] uobArray = new b[]{b.e};
       c.d(this.a.K, uobArray);
       b[] uobArray1 = new b[]{b.g};
       c.d(this.a.K, uobArray1);
       this.a.K.setVisibility(8);
       this.a.h0().setVisibility(0);
       return;
    }
    public void k(boolean p0,Throwable p1){
       VoicePartyOnlineUserFragment$b uob = VoicePartyOnlineUserFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       this.a.J.setVisibility(8);
       this.a.K.setVisibility(0);
       b[] uobArray = new b[]{b.e};
       c.d(this.a.K, uobArray);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.p(new VoicePartyOnlineUserFragment$b$a(this));
       uoa.a(c.h(this.a.K, b.g));
       this.a.h0().setVisibility(8);
       return;
    }
}
