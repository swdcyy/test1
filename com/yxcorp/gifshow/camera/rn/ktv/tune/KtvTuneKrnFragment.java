package com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment;
import oj0.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$a;
import nsd.u;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$c;
import java.lang.Runnable;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import js6.a;
import com.kwai.robust.PatchProxyResult;
import ks6.a;
import xs6.a;
import android.os.Bundle;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$b;
import ik0.b;
import com.kuaishou.krn.event.a;
import kotlin.jvm.internal.a;

public final class KtvTuneKrnFragment extends KwaiRnFragment implements a	// class@000ff9
{
    public boolean C;
    public boolean D;
    public static final KtvTuneKrnFragment$a E;

    static {
       KtvTuneKrnFragment.E = new KtvTuneKrnFragment$a(null);
    }
    public void KtvTuneKrnFragment(){
       super();
       this.C = true;
    }
    public void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvTuneKrnFragment.class, "5")) {
          return;
       }
       this.D = false;
       View view = this.getView();
       if (view != null) {
          view.post(new KtvTuneKrnFragment$c(this, p0));
       }
       return;
    }
    public final void ch(boolean p0){
       if (PatchProxy.isSupport(KtvTuneKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvTuneKrnFragment.class, "9")) {
          return;
       }
       int i = 0;
       p0 = (p0 && this.C != null)? true: false;
       Object[] objArray = new Object[i];
       a.D().w("KtvTuneKrnFragment", "setUserVisibleHint:"+this.C+" visible£º"+p0, objArray);
       a b = a.b;
       String str = (p0)? "show": "hide";
       b.X8(this, "KtvTuneKrnDidChange", str);
       return;
    }
    public boolean onBackPressed(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KtvTuneKrnFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D == null && a.a.b() != null) {
          if (!PatchProxy.applyVoid(objArray, this, KtvTuneKrnFragment.class, "10")) {
             this.D = true;
             a.b.X8(this, "KtvTuneKrnClose", "");
          }
          return true;
       }else {
          super.onBackPressed();
          return false;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvTuneKrnFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.D().w("KtvTuneKrnFragment", "onCreate", objArray);
       this.Zg(new KtvTuneKrnFragment$b());
       a.b().a("KtvTuneKrnCloseCallback", this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KtvTuneKrnFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       a.b().c("KtvTuneKrnCloseCallback", this);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvTuneKrnFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("KtvTuneKrnFragment", "onDestroyView", objArray);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvTuneKrnFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("KtvTuneKrnFragment", "onViewCreated", objArray);
       return;
    }
    public void setUserVisibleHint(boolean p0){
       Fragment parentFragme;
       if (PatchProxy.isSupport(KtvTuneKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvTuneKrnFragment.class, "7")) {
          return;
       }
       super.setUserVisibleHint(p0);
       this.C = p0;
       if (this.getParentFragment() != null) {
          parentFragme = this.getParentFragment();
          a.m(parentFragme);
          a.o(parentFragme, "parentFragment!!");
          if (!parentFragme.isVisible()) {
             parentFragme = false;
          label_0038 :
             this.ch(parentFragme);
             return;
          }
       }
       parentFragme = true;
       goto label_0038 ;
    }
}
