package com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import q79.d;

public final class PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1 implements DefaultLifecycleObserver	// class@001cc3
{
    public final PotentialAlbumAssetFragmentViewBinder b;

    public void PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1(PotentialAlbumAssetFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.d(this, p0);
       Boolean tRUE = Boolean.TRUE;
       if (a.g(this.b.j, tRUE)) {
          return;
       }
       PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1 tb = this.b;
       PotentialAlbumAssetFragmentViewBinder o = tb.o;
       Boolean uBoolean = (o != null)? Boolean.valueOf(o.K0(tb.j().getActivity())): null;
       if (a.g(uBoolean, tRUE)) {
          PotentialAlbumAssetFragmentViewBinder$observeLifeCycle$1 tb1 = this.b;
          tb1.j = uBoolean;
          tb1.y();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
