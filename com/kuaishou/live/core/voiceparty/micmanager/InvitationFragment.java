package com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment$a;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import ps2.g;
import android.view.View$OnClickListener;
import ps2.h;

public abstract class InvitationFragment extends RecyclerFragment	// class@001559
{
    public final String F;
    public View G;
    public ViewGroup H;
    public View I;
    public HashMap J;

    public void InvitationFragment(){
       super();
       this.F = "InvitationFragment";
    }
    public static final View Hh(InvitationFragment p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("emptyStateView");
       }
       return p0;
    }
    public static final ViewGroup Ih(InvitationFragment p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("errorStateContainer");
       }
       return p0;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, InvitationFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new InvitationFragment$a(this);
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, InvitationFragment.class, "6")) {
          return;
       }
       InvitationFragment tJ = this.J;
       if (tJ != null) {
          tJ.clear();
       }
       return;
    }
    public void Jh(boolean p0){
    }
    public void Kh(){
    }
    public int getLayoutResId(){
       return 0x7f0d0e3a;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InvitationFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(InvitationFragment.class, null);
       return objectsByTag;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.Gh();
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InvitationFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = p0.findViewById(R.id.live_voice_party_base_invitation_empty_state_container);
       a.o(view, "view.findViewById\(R.id.l¡­on_empty_state_container\)");
       this.G = view;
       if (!PatchProxy.applyVoid(null, this, InvitationFragment.class, "3")) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.k(R.drawable.arg_RES_7f0805b8);
          uoa.h(R.string.arg_RES_7f101f54);
          uoa.e(R.string.arg_RES_7f101f55);
          uoa.j(2);
          uoa.p(new g(this));
          InvitationFragment tG = this.G;
          if (tG == null) {
             a.S("emptyStateView");
          }
          uoa.a(tG);
       }
       view = p0.findViewById(R.id.live_voice_party_base_invitation_error_state_container);
       a.o(view, "view.findViewById\(R.id.l¡­on_error_state_container\)");
       this.H = view;
       p0 = p0.findViewById(R.id.live_voice_party_base_invitation_error_state_refresh_button);
       a.o(p0, "view.findViewById\(R.id.l¡­ror_state_refresh_button\)");
       this.I = p0;
       if (!PatchProxy.applyVoid(null, this, InvitationFragment.class, "4")) {
          InvitationFragment tI = this.I;
          if (tI == null) {
             a.S("refreshButton");
          }
          tI.setOnClickListener(new h(this));
       }
       return;
    }
    public int qh(){
       return 0x7f0a2738;
    }
}
