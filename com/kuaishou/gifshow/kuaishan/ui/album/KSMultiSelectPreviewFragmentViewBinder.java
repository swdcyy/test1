package com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder;
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
import ag6.a;
import j79.l0;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.lang.Integer;
import java.lang.Boolean;
import w69.d;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder;
import com.kuaishou.gifshow.kuaishan.ui.album.KSMultiSelectAlbumAssetItemViewBinder$a;

public final class KSMultiSelectPreviewFragmentViewBinder extends MultiSelectPreviewFragmentViewBinder	// class@001aae
{

    public void KSMultiSelectPreviewFragmentViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSMultiSelectPreviewFragmentViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0718, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­agment, container, false\)");
       return view;
    }
    public boolean w(l0 p0,MediaPreviewInfo p1,int p2){
       Bundle obj;
       if (PatchProxy.isSupport(KSMultiSelectPreviewFragmentViewBinder.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, KSMultiSelectPreviewFragmentViewBinder.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "viewModel");
       a.p(p1, "item");
       obj = p0.p0().b();
       Boolean uBoolean = (obj != null)? Boolean.valueOf(obj.getBoolean(KSMultiSelectAlbumAssetItemViewBinder.w.a())): null;
       if (a.g(uBoolean, Boolean.FALSE)) {
          return true;
       }else {
          return super.w(p0, p1, p2);
       }
    }
}
