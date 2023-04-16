package com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.common.core.component.chat.peers.BaseLiveAskAndChatDialogFragment$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.content.Context;
import i2b.a;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public abstract class BaseLiveAskAndChatDialogFragment extends LiveDialogContainerFragment	// class@001049
{
    public LiveAskAndChatTabConfig A;
    public LiveAskItemClickListener B;
    public m C;
    public View D;
    public BaseLiveAskAndChatDialogFragment$b E;

    public void BaseLiveAskAndChatDialogFragment(){
       super();
       this.Ch(new BaseLiveAskAndChatDialogFragment$a(this));
    }
    public static void Fh(Activity p0,BaseLiveAskAndChatDialogFragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BaseLiveAskAndChatDialogFragment.class, "1")) {
          return;
       }
       int i = (int)((float)n.j(p0) * 0x3f1e353f);
       if (i <= 0) {
          i = a1.d(R.dimen.arg_RES_7f0705f1);
       }
       p1.Bh(a1.d(R.dimen.arg_RES_7f0705f0), i);
       return;
    }
    public abstract Fragment Eh();
    public void Gh(BaseLiveAskAndChatDialogFragment$b p0){
       this.E = p0;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, BaseLiveAskAndChatDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getDialog() != null && this.getDialog().isShowing())? true: false;
       return b;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseLiveAskAndChatDialogFragment.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p2 != null) {
          this.dismissAllowingStateLoss();
          return new View(this.getContext());
       }else {
          View view = a.g(p0, R.layout.arg_RES_7f0d0a89, null, false);
          this.D = view;
          return view;
       }
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAskAndChatDialogFragment.class, "4")) {
          return;
       }
       super.onDismiss(p0);
       BaseLiveAskAndChatDialogFragment tE = this.E;
       if (tE != null) {
          tE.onDismiss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAskAndChatDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (p1 != null) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.f(R.id.live_bottom_dialog_container_root, this.Eh());
          uoe.m();
          return;
       }
    }
}
