package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub;
import s79.a;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mLeftBtn$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mTabStrip$2;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2;
import mrd.a;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$a;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$b;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$c;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$d;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;

public final class AlbumTitleBarAnimationViewStub extends a	// class@001a11
{
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final a i;
    public final a j;
    public b k;
    public b l;
    public b m;
    public HashMap n;

    public void AlbumTitleBarAnimationViewStub(AlbumFragment p0){
       a.q(p0, "host");
       super(p0);
       this.e = s.c(new AlbumTitleBarAnimationViewStub$mLeftBtn$2(p0));
       this.f = s.c(new AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2(p0));
       this.g = s.c(new AlbumTitleBarAnimationViewStub$mTabStrip$2(p0));
       this.h = s.c(new AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2(p0));
       a uoa = a.g();
       a.h(uoa, "BehaviorSubject.create<Float>\(\)");
       this.i = uoa;
       uoa = a.g();
       a.h(uoa, "BehaviorSubject.create<Float>\(\)");
       this.j = uoa;
    }
    public void b(ViewModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTitleBarAnimationViewStub.class, "6")) {
          return;
       }
       super.b(p0);
       this.k = this.i.subscribe(new AlbumTitleBarAnimationViewStub$a(this), AlbumTitleBarAnimationViewStub$b.b);
       this.l = this.j.subscribe(new AlbumTitleBarAnimationViewStub$c(this), AlbumTitleBarAnimationViewStub$d.b);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AlbumTitleBarAnimationViewStub.class, "7")) {
          return;
       }
       AlbumTitleBarAnimationViewStub tk = this.k;
       if (tk != null) {
          tk.dispose();
       }
       tk = this.l;
       if (tk != null) {
          tk.dispose();
       }
       tk = this.m;
       if (tk != null) {
          tk.dispose();
       }
       return;
    }
    public final ViewGroup h(){
       Object obj = PatchProxy.apply(null, this, AlbumTitleBarAnimationViewStub.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, AlbumTitleBarAnimationViewStub.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().dh();
    }
}
