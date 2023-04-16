package com.yxcorp.gifshow.album.viewbinder.TestAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import o79.i;

public final class TestAlbumAssetItemViewBinder extends DefaultAlbumAssetItemViewBinder	// class@001aff
{
    public TextView j;

    public void TestAlbumAssetItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TestAlbumAssetItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "rootView");
       super.e(p0);
       this.j = p0.findViewById(0x7f0a3dda);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TestAlbumAssetItemViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.q(p0, "inflater");
       View view = i.h(p0.getContext(), R.layout.arg_RES_7f0d070b, p1, false);
       if (view == null) {
          view = i.o(p0, R.layout.arg_RES_7f0d070b, p1, false);
       }
       if (view == null) {
          a.L();
       }
       return view;
    }
}
