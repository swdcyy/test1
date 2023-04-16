package com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import gy2.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment$a;
import nsd.u;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gy2.g;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment$c;
import gy2.b$a;
import gy2.c;
import gy2.g$a;
import gy2.e;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import android.content.DialogInterface;
import kotlin.jvm.internal.a;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment$b;
import gy2.n;

public class LiveBaseDialogFragment extends KwaiDialogFragment implements a	// class@001aee
{
    public c p;
    public e q;
    public static final LiveBaseDialogFragment$a r;

    static {
       LiveBaseDialogFragment.r = new LiveBaseDialogFragment$a(null);
    }
    public void LiveBaseDialogFragment(){
       super();
    }
    public static final void sh(LiveBaseDialogFragment p0,c p1,String p2){
       super.show(p1, p2);
    }
    public static final void th(LiveBaseDialogFragment p0,c p1,String p2){
       super.Cb(p1, p2);
    }
    public void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBaseDialogFragment.class, "5")) {
          return;
       }
       this.p = g.a.d(this, p0, new LiveBaseDialogFragment$c(this, p0, p1));
       return;
    }
    public e D6(){
       LiveBaseDialogFragment obj = PatchProxy.apply(null, this, LiveBaseDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          e uoe = this.uh();
       }
       return obj;
    }
    public void jc(){
       if (PatchProxy.applyVoid(null, this, LiveBaseDialogFragment.class, "9")) {
          return;
       }
       g.a.c(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       LiveBaseDialogFragment tp = this.p;
       if (tp != null) {
          tp.a(this);
       }
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBaseDialogFragment.class, "4")) {
          return;
       }
       a.p(p0, "manager");
       this.p = g.a.d(this, p0, new LiveBaseDialogFragment$b(this, p0, p1));
       return;
    }
    public e uh(){
       return n.d;
    }
    public void xc(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseDialogFragment.class, "2")) {
          return;
       }
       a.p(p0, "value");
       this.q = p0;
       return;
    }
    public void zc(){
       if (PatchProxy.applyVoid(null, this, LiveBaseDialogFragment.class, "8")) {
          return;
       }
       g.a.e(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
}
