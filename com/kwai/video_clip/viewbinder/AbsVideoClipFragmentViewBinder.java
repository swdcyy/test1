package com.kwai.video_clip.viewbinder.AbsVideoClipFragmentViewBinder;
import com.kwai.video_clip.viewbinder.IVideoClipVewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video_clip.widget.VideoSelectView;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.video_clip.viewbinder.IVideoClipVewBinder$a;
import vw7.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ga9.b;
import ga9.b$a;
import ec7.a;
import java.util.List;
import java.lang.Integer;
import android.widget.ImageView;
import com.kwai.video_clip.widget.CustomHorizontalScroller;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.view.View;
import android.widget.TextView;
import com.kwai.video_clip.widget.ThumbnailDrawerView;

public abstract class AbsVideoClipFragmentViewBinder implements IVideoClipVewBinder	// class@001104
{
    public KsAlbumVideoPlayerView a;
    public VideoSelectView b;
    public CustomHorizontalScroller c;
    public ThumbnailDrawerView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public View h;
    public ThumbnailDrawerView i;
    public ImageView j;
    public TextView k;
    public final Fragment l;
    public final int m;

    public void AbsVideoClipFragmentViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.l = p0;
       this.m = p1;
    }
    public final void A(VideoSelectView p0){
       this.b = p0;
    }
    public boolean a(ViewModel p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsVideoClipFragmentViewBinder.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyTwoRefs(this, p0, null, IVideoClipVewBinder$a.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!p0 instanceof a){
          p0 = null;
       }
       b = this.h(p0);
       return b;
    }
    public void d(RecyclerView$ViewHolder p0){
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoClipFragmentViewBinder.class, str)) {
          return;
       }
       a.q(p0, "viewHolder");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, IVideoClipVewBinder$a.class, str)) {
          a.q(p0, "viewHolder");
          b$a.b(this, p0);
       }
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsVideoClipFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsVideoClipFragmentViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IVideoClipVewBinder$a uoa = IVideoClipVewBinder$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,Integer.valueOf(p1),p2,p3};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
          label_0056 :
             return;
          }
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       b$a.a(this, p0, p1, p2, p3);
       goto label_0056 ;
    }
    public final ImageView j(){
       return this.e;
    }
    public final CustomHorizontalScroller k(){
       return this.c;
    }
    public final KsAlbumVideoPlayerView l(){
       return this.a;
    }
    public final View m(){
       return this.h;
    }
    public final TextView n(){
       return this.f;
    }
    public final ThumbnailDrawerView o(){
       return this.i;
    }
    public final VideoSelectView p(){
       return this.b;
    }
    public final void q(ImageView p0){
       this.e = p0;
    }
    public final void r(CustomHorizontalScroller p0){
       this.c = p0;
    }
    public final void s(KsAlbumVideoPlayerView p0){
       this.a = p0;
    }
    public final void t(ImageView p0){
       this.j = p0;
    }
    public final void u(TextView p0){
       this.g = p0;
    }
    public final void v(View p0){
       this.h = p0;
    }
    public final void w(TextView p0){
       this.f = p0;
    }
    public final void x(ThumbnailDrawerView p0){
       this.d = p0;
    }
    public final void y(ThumbnailDrawerView p0){
       this.i = p0;
    }
    public final void z(TextView p0){
       this.k = p0;
    }
}
