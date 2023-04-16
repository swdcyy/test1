package com.yxcorp.gifshow.album.home.BottomContainerStub;
import s79.a;
import com.yxcorp.gifshow.album.home.BottomContainerStub$a;
import nsd.u;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.album.home.BottomContainerStub$mBottomContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import w69.e0;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.View;
import com.yxcorp.gifshow.album.home.BottomContainerStub$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;

public final class BottomContainerStub extends a	// class@001a15
{
    public final p e;
    public e0 f;
    public boolean g;
    public HashMap h;
    public static final String i = "debug_tag";
    public static final BottomContainerStub$a j;

    static {
       BottomContainerStub.j = new BottomContainerStub$a(null);
       BottomContainerStub.i = "debug_tag";
    }
    public void BottomContainerStub(AlbumFragment p0){
       a.q(p0, "host");
       super(p0);
       this.e = s.c(new BottomContainerStub$mBottomContainer$2(p0));
    }
    public void b(ViewModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomContainerStub.class, "3")) {
          return;
       }
       super.b(p0);
       this.h();
       this.g = true;
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, BottomContainerStub.class, "5")) {
          return;
       }
       this.g = false;
       return;
    }
    public final void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomContainerStub.class, "4")) {
          return;
       }
       BottomContainerStub tf = this.f;
       Fragment uFragment = (tf != null)? tf.b(): objArray;
       Log.b(BottomContainerStub.i, "onBind: headerFragment:"+uFragment);
       View view = this.i();
       if (view != null) {
          view.setVisibility(0);
       }
       view = this.i();
       if (view != null) {
          view.setOnTouchListener(BottomContainerStub$b.b);
       }
       BottomContainerStub tf1 = this.f;
       IAlbumMainFragment$b uob = (tf1 != null)? tf1.t4(): objArray;
       if (uob != null) {
          AlbumFragment uAlbumFragme = this.e();
          BottomContainerStub tf2 = this.f;
          if (tf2 != null) {
             objArray = tf2.t4();
          }
          uAlbumFragme.v5(objArray);
       }
       if (uFragment != null) {
          c childFragmen = this.e().getChildFragmentManager();
          a.h(childFragmen, "mHost.childFragmentManager");
          e uoe = childFragmen.beginTransaction();
          uoe.v(R.id.bottom_container, uFragment);
          uoe.m();
       }
       return;
    }
    public final View i(){
       Object obj = PatchProxy.apply(null, this, BottomContainerStub.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final e0 j(){
       return this.f;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, BottomContainerStub.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().dh();
    }
}
