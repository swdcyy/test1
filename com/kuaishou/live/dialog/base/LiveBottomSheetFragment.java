package com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import gy2.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import androidx.fragment.app.c;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gy2.g;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment$b;
import gy2.b$a;
import gy2.c;
import gy2.g$a;
import gy2.e;
import com.kwai.robust.PatchProxyResult;
import gy2.n;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import android.content.DialogInterface;
import kotlin.jvm.internal.a;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment$a;

public class LiveBottomSheetFragment extends BottomSheetFragment implements a	// class@001af1
{
    public e A;
    public c z;

    public void LiveBottomSheetFragment(){
       super();
    }
    public static final void Ih(LiveBottomSheetFragment p0,c p1,String p2){
       super.show(p1, p2);
    }
    public static final void Jh(LiveBottomSheetFragment p0,c p1,String p2){
       super.Cb(p1, p2);
    }
    public void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBottomSheetFragment.class, "5")) {
          return;
       }
       this.z = g.a.d(this, p0, new LiveBottomSheetFragment$b(this, p0, p1));
       return;
    }
    public e D6(){
       LiveBottomSheetFragment obj = PatchProxy.apply(null, this, LiveBottomSheetFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          e uoe = this.Kh();
       }
       return obj;
    }
    public e Kh(){
       return n.d;
    }
    public void jc(){
       if (PatchProxy.applyVoid(null, this, LiveBottomSheetFragment.class, "7")) {
          return;
       }
       g.a.c(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomSheetFragment.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       LiveBottomSheetFragment tz = this.z;
       if (tz != null) {
          tz.a(this);
       }
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBottomSheetFragment.class, "4")) {
          return;
       }
       a.p(p0, "manager");
       this.z = g.a.d(this, p0, new LiveBottomSheetFragment$a(this, p0, p1));
       return;
    }
    public void xc(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBottomSheetFragment.class, "2")) {
          return;
       }
       a.p(p0, "value");
       this.A = p0;
       return;
    }
    public void zc(){
       if (PatchProxy.applyVoid(null, this, LiveBottomSheetFragment.class, "6")) {
          return;
       }
       g.a.e(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
}
