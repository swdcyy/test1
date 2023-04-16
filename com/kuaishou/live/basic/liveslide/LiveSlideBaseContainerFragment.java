package com.kuaishou.live.basic.liveslide.LiveSlideBaseContainerFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.basic.liveslide.LiveSlideBaseContainerFragment$a;
import jw6.a;
import c51.e;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import wg3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bw6.a;
import ew6.a;
import com.kuaishou.live.basic.liveslide.a;
import b51.d;
import g51.b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import androidx.fragment.app.c;
import com.kwai.robust.PatchProxyResult;
import c51.h;
import c51.d;
import c51.i;
import c51.b;
import java.util.Objects;
import tw6.a;

public abstract class LiveSlideBaseContainerFragment extends RxFragment	// class@000ccd
{
    public d c;
    public b d;
    public final b e;
    public static final boolean f;

    static {
    }
    public void LiveSlideBaseContainerFragment(){
       super();
       this.e = new LiveSlideBaseContainerFragment$a(this);
    }
    public abstract a Vg();
    public abstract e Wg();
    public abstract LiveSlideViewPager Xg();
    public b Yg(){
       return null;
    }
    public abstract void Zg();
    public void ah(){
       if (PatchProxy.applyVoid(null, this, LiveSlideBaseContainerFragment.class, "2")) {
          return;
       }
       this.c.e(this.Yg());
       this.d.e = this.c.o();
       return;
    }
    public abstract void bh();
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideBaseContainerFragment.class, "1")) {
          return;
       }
       super.onActivityCreated(p0);
       this.d = new b(this.Xg());
       if (this.getActivity().isFinishing()) {
          return;
       }
       c fragmentMana = this.getFragmentManager();
       h oh = PatchProxy.apply(null, this, LiveSlideBaseContainerFragment.class, "3");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(this.Wg());
       }
       this.c = new d(fragmentMana, oh, this.Xg(), this.Vg());
       if (this.Yg() != null) {
          this.ah();
       }else {
          this.c.p().y(this.e);
       }
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSlideBaseContainerFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       LiveSlideBaseContainerFragment tc = this.c;
       if (tc != null) {
          tc.m();
       }
       tc = this.d;
       if (tc != null) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, b.class, "16")) {
             tc.c.n0(tc);
          }
       }
       return;
    }
}
