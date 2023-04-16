package com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment;
import gy2.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gy2.g;
import com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment$b;
import gy2.b$a;
import gy2.c;
import gy2.g$a;
import gy2.e;
import com.kwai.robust.PatchProxyResult;
import gy2.n;
import java.util.Map;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import android.content.DialogInterface;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment$a;

public abstract class LiveRecyclerDialogFragment extends RecyclerDialogFragment implements a	// class@001af4
{
    public e A;
    public c z;

    public void LiveRecyclerDialogFragment(){
       super();
    }
    public static final void Bh(LiveRecyclerDialogFragment p0,c p1,String p2){
       super.show(p1, p2);
    }
    public static final void Ch(LiveRecyclerDialogFragment p0,c p1,String p2){
       super.Cb(p1, p2);
    }
    public void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRecyclerDialogFragment.class, "5")) {
          return;
       }
       this.z = g.a.d(this, p0, new LiveRecyclerDialogFragment$b(this, p0, p1));
       return;
    }
    public e D6(){
       LiveRecyclerDialogFragment obj = PatchProxy.apply(null, this, LiveRecyclerDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          e uoe = this.Dh();
       }
       return obj;
    }
    public e Dh(){
       return n.d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRecyclerDialogFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveRecyclerDialogFragment.class, null);
       return objectsByTag;
    }
    public void jc(){
       if (PatchProxy.applyVoid(null, this, LiveRecyclerDialogFragment.class, "7")) {
          return;
       }
       g.a.c(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRecyclerDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       LiveRecyclerDialogFragment tz = this.z;
       if (tz != null) {
          tz.a(this);
       }
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRecyclerDialogFragment.class, "4")) {
          return;
       }
       a.p(p0, "manager");
       this.z = g.a.d(this, p0, new LiveRecyclerDialogFragment$a(this, p0, p1));
       return;
    }
    public void xc(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRecyclerDialogFragment.class, "2")) {
          return;
       }
       a.p(p0, "value");
       this.A = p0;
       return;
    }
    public void zc(){
       if (PatchProxy.applyVoid(null, this, LiveRecyclerDialogFragment.class, "6")) {
          return;
       }
       g.a.e(this.getActivity(), this.D6().a(), this.getDialog());
       return;
    }
}
