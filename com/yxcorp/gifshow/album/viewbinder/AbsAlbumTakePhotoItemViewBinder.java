package com.yxcorp.gifshow.album.viewbinder.AbsAlbumTakePhotoItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public abstract class AbsAlbumTakePhotoItemViewBinder extends AbsAlbumItemViewBinder	// class@001ad2
{
    public View e;

    public void AbsAlbumTakePhotoItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void c(View p0,int p1){
       AbsAlbumTakePhotoItemViewBinder uAbsAlbumTak = AbsAlbumTakePhotoItemViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumTak) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumTak, "1")) {
          return;
       }
       a.q(p0, "itemView");
       if (p0.getLayoutParams() == null) {
          p0.setLayoutParams(new ViewGroup$LayoutParams(-1, p1));
       }else {
          p0.getLayoutParams().width = -1;
          p0.height = p1;
       }
       return;
    }
    public final View n(){
       return this.e;
    }
    public final void o(View p0){
       this.e = p0;
    }
}
