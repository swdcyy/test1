package com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.widget.TextView;
import android.widget.SeekBar;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ec7.a;
import java.util.List;
import java.lang.Integer;
import com.yxcorp.gifshow.album.widget.preview.KSAPassThroughEventView;
import android.view.View;

public abstract class AbsPreviewItemViewBinder implements IPreviewViewBinder	// class@001ad4
{
    public RecyclerView$ViewHolder a;
    public SubsamplingScaleImageView b;
    public KSAPassThroughEventView c;
    public CompatZoomImageView d;
    public CompatImageView e;
    public View f;
    public SeekBar g;
    public TextView h;
    public TextView i;
    public KsAlbumVideoPlayerView j;
    public View k;
    public ViewGroup l;
    public ViewGroup m;
    public View n;
    public final Fragment o;
    public final int p;

    public void AbsPreviewItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.o = p0;
       this.p = p1;
    }
    public final void A(CompatImageView p0){
       this.e = p0;
    }
    public final void B(TextView p0){
       this.h = p0;
    }
    public final void C(SeekBar p0){
       this.g = p0;
    }
    public final void D(ViewGroup p0){
       this.l = p0;
    }
    public final void E(ViewGroup p0){
       this.m = p0;
    }
    public final void F(KsAlbumVideoPlayerView p0){
       this.j = p0;
    }
    public final void G(SubsamplingScaleImageView p0){
       this.b = p0;
    }
    public final void H(TextView p0){
       this.i = p0;
    }
    public final void I(CompatZoomImageView p0){
       this.d = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsPreviewItemViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IPreviewViewBinder$a.b(this, p0);
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPreviewItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "viewHolder");
       this.a = p0;
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsPreviewItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsPreviewItemViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IPreviewViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.o;
    }
    public final KSAPassThroughEventView k(){
       return this.c;
    }
    public final View l(){
       return this.n;
    }
    public final CompatImageView m(){
       return this.e;
    }
    public final TextView n(){
       return this.h;
    }
    public final SeekBar o(){
       return this.g;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AbsPreviewItemViewBinder.class, "2")) {
          return;
       }
       AbsPreviewItemViewBinder tb = this.b;
       if (tb != null) {
          tb.recycle();
       }
       return;
    }
    public final View p(){
       return this.f;
    }
    public final ViewGroup q(){
       return this.l;
    }
    public final ViewGroup r(){
       return this.m;
    }
    public final KsAlbumVideoPlayerView s(){
       return this.j;
    }
    public final View t(){
       return this.k;
    }
    public final SubsamplingScaleImageView u(){
       return this.b;
    }
    public final TextView v(){
       return this.i;
    }
    public final CompatZoomImageView w(){
       return this.d;
    }
    public final int x(){
       return this.p;
    }
    public final void y(KSAPassThroughEventView p0){
       this.c = p0;
    }
    public final void z(View p0){
       this.n = p0;
    }
}
