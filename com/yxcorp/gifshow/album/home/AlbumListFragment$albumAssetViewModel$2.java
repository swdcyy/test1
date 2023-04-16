package com.yxcorp.gifshow.album.home.AlbumListFragment$albumAssetViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import java.lang.Object;
import q79.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import q79.j;
import r79.a;
import w69.k0;
import java.util.List;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import o79.b;
import com.yxcorp.gifshow.album.AlbumPerformanceOptOption;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.f;
import w69.b;
import w69.d;
import w69.k;
import ga9.c;
import j79.a;
import nsd.u;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class AlbumListFragment$albumAssetViewModel$2 extends Lambda implements a	// class@001a01
{
    public final AlbumListFragment this$0;

    public void AlbumListFragment$albumAssetViewModel$2(AlbumListFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object obj = this;
       FragmentActivity obj1 = PatchProxy.apply(null, obj, AlbumListFragment$albumAssetViewModel$2.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = obj.this$0.getActivity();
       if (obj1 == null) {
          a.L();
       }
       a uoa = v15;
       a uoa1 = v15;
       uoa = new a(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 0xffff, null);
       return ViewModelProviders.of(obj1, new j(uoa1)).get(d.class);
    }
}
