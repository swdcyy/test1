package com.yxcorp.gifshow.camera.record.album.RecordAlbumHomeFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.DefaultAlbumHomeFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import ag6.a;

public final class RecordAlbumHomeFragmentViewBinder extends DefaultAlbumHomeFragmentViewBinder	// class@001cac
{

    public void RecordAlbumHomeFragmentViewBinder(Fragment p0){
       a.p(p0, "fragment");
       super(p0);
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordAlbumHomeFragmentViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View orWait = PreLoader.getInstance().getOrWait(p0.getContext(), R.layout.record_album_home_fragment, p1, false);
       if (orWait != null) {
          return orWait;
       }
       View view = a.c(p0, R.layout.record_album_home_fragment, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
}
