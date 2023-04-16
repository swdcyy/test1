package com.yxcorp.gifshow.camera.record.video.followshot.FollowShotKrnFragment;
import mm6.c;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import mm6.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3b.o;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import js6.a;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import mm6.a;
import android.os.Bundle;
import com.yxcorp.gifshow.camera.record.video.followshot.FollowShotKrnFragment$a;
import ik0.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.os.Build$VERSION;
import android.view.View;

public class FollowShotKrnFragment extends KwaiRnFragment implements c	// class@000f82
{
    public boolean C;
    public static final int D;

    public void FollowShotKrnFragment(){
       super();
       this.C = true;
    }
    public int Ff(){
       return b.c(this);
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, FollowShotKrnFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.i(282);
    }
    public boolean a4(){
       return b.b(this);
    }
    public final void ch(boolean p0){
       if (PatchProxy.isSupport(FollowShotKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowShotKrnFragment.class, "7")) {
          return;
       }
       int i = 0;
       p0 = (p0 && this.C != null)? true: false;
       Object[] objArray = new Object[i];
       a.D().w("FollowShotKrnFragment", "setUserVisibleHint:"+this.C+" visible£º"+p0, objArray);
       a b = a.b;
       String str = (p0)? "show": "hide";
       b.X8(this, "followShootKrnDidChange", str);
       return;
    }
    public void dg(Activity p0){
    }
    public boolean f9(){
       return b.f(this);
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public boolean onBackPressed(){
       FragmentActivity obj = PatchProxy.apply(null, this, FollowShotKrnFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       if (obj == null) {
          return false;
       }
       if (obj instanceof a) {
          obj.A0();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowShotKrnFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.D().w("FollowShotKrnFragment", "onCreate", objArray);
       this.Zg(new FollowShotKrnFragment$a(this));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FollowShotKrnFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("FollowShotKrnFragment", "onDestroyView", objArray);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FollowShotKrnFragment.class, "3")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       a.D().w("FollowShotKrnFragment", "onResume", objArray);
       if (this.C != null) {
          if (25 > Build$VERSION.SDK_INT) {
             this.ch(0);
          }
          this.ch(true);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowShotKrnFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("FollowShotKrnFragment", "onViewCreated", objArray);
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(FollowShotKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowShotKrnFragment.class, "6")) {
          return;
       }
       super.setUserVisibleHint(p0);
       this.C = p0;
       p0 = (this.getParentFragment() == null || this.getParentFragment().isVisible())? true: false;
       this.ch(p0);
       return;
    }
    public boolean x2(){
       return true;
    }
}
