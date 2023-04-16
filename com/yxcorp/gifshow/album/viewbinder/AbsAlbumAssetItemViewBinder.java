package com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
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
import android.widget.ImageView;
import o79.q;
import android.graphics.Typeface;
import android.widget.TextView;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;

public abstract class AbsAlbumAssetItemViewBinder extends AbsAlbumItemViewBinder	// class@001ac9
{
    public CompatImageView e;
    public TextView f;
    public SizeAdjustableTextView g;
    public View h;
    public View i;

    public void AbsAlbumAssetItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public void c(View p0,int p1){
       ViewGroup$LayoutParams layoutParams;
       AbsAlbumAssetItemViewBinder uAbsAlbumAss = AbsAlbumAssetItemViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumAss) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumAss, "7")) {
          return;
       }
       a.q(p0, "itemView");
       if (p0.getLayoutParams() == null) {
          p0.setLayoutParams(new ViewGroup$LayoutParams(-1, p1));
       }else {
          p0.getLayoutParams().width = -1;
          p0.height = p1;
       }
       AbsAlbumAssetItemViewBinder te = this.e;
       if (te != null) {
          layoutParams = te.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = -1;
          }
       }
       te = this.e;
       if (te != null) {
          layoutParams = te.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = p1;
          }
       }
       te = this.g;
       if (te != null) {
          te.setTypeface(q.a.h());
       }
       te = this.g;
       if (te != null) {
          te.setTextSizeAdjustable(true);
       }
       return;
    }
    public final SizeAdjustableTextView n(){
       return this.g;
    }
    public final View o(){
       return this.i;
    }
    public final CompatImageView p(){
       return this.e;
    }
    public final View q(){
       return this.h;
    }
    public final void r(TextView p0){
       this.f = p0;
    }
    public final void s(SizeAdjustableTextView p0){
       this.g = p0;
    }
    public final void t(View p0){
       this.i = p0;
    }
    public final void u(CompatImageView p0){
       this.e = p0;
    }
    public final void v(View p0){
       this.h = p0;
    }
}
