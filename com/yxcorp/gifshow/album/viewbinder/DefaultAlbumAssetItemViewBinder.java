package com.yxcorp.gifshow.album.viewbinder.DefaultAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import o79.i;
import q79.d;

public class DefaultAlbumAssetItemViewBinder extends AbsAlbumAssetItemViewBinder	// class@001ad9
{

    public void DefaultAlbumAssetItemViewBinder(Fragment p0,int p1){
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAlbumAssetItemViewBinder.class, "1")) {
          return;
       }
       this.m(p0.findViewById(R.id.unable_select_mask));
       this.u(p0.findViewById(R.id.media_preview));
       this.r(p0.findViewById(R.id.media_duration));
       this.s(p0.findViewById(R.id.media_pick_num));
       this.v(p0.findViewById(R.id.selected_mask));
       this.t(p0.findViewById(R.id.media_pick_num_area));
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultAlbumAssetItemViewBinder.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = i.h(p0.getContext(), R.layout.ksa_list_item_album_img_video, p1, false);
       if (view == null) {
          view = i.o(p0, R.layout.ksa_list_item_album_img_video, p1, false);
       }
       return view;
    }
    public boolean g(d p0){
       return false;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DefaultAlbumAssetItemViewBinder.class, "3")) {
          return;
       }
       this.m(null);
       this.u(null);
       this.r(null);
       this.s(null);
       this.v(null);
       this.s(null);
       return;
    }
}
