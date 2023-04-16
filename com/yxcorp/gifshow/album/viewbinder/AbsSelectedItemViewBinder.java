package com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import com.yxcorp.gifshow.base.fragment.IAlbumViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.base.fragment.IAlbumViewBinder$a;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ec7.a;
import java.util.List;
import android.widget.TextView;
import com.kwai.moved.impls.widget.KsAlbumScaleLayout;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;

public abstract class AbsSelectedItemViewBinder implements IAlbumViewBinder	// class@001ad7
{
    public CompatImageView a;
    public TextView b;
    public KsAlbumScaleLayout c;
    public View d;
    public View e;
    public RecyclerView$ViewHolder f;
    public final Fragment g;
    public final int h;

    public void AbsSelectedItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.g = p0;
       this.h = p1;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsSelectedItemViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       ViewGroup$LayoutParams layoutParams;
       AbsSelectedItemViewBinder uAbsSelected = AbsSelectedItemViewBinder.class;
       if (PatchProxy.isSupport(uAbsSelected) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsSelected, "2")) {
          return;
       }
       a.q(p0, "itemView");
       p0.getLayoutParams().width = p1;
       p0.height = -1;
       AbsSelectedItemViewBinder tc = this.c;
       if (tc != null) {
          layoutParams = tc.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = p1;
          }
       }
       tc = this.c;
       if (tc != null) {
          layoutParams = tc.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = p1;
          }
       }
       tc = this.a;
       if (tc != null) {
          layoutParams = tc.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = -1;
          }
       }
       tc = this.a;
       if (tc != null) {
          layoutParams = tc.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = p1;
          }
       }
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsSelectedItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "viewHolder");
       this.f = p0;
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsSelectedItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsSelectedItemViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.g;
    }
    public final View k(){
       return this.d;
    }
    public final TextView l(){
       return this.b;
    }
    public final KsAlbumScaleLayout m(){
       return this.c;
    }
    public final CompatImageView n(){
       return this.a;
    }
    public final View o(){
       return this.e;
    }
    public final RecyclerView$ViewHolder p(){
       return this.f;
    }
    public final void q(View p0){
       this.d = p0;
    }
    public final void r(TextView p0){
       this.b = p0;
    }
    public final void s(KsAlbumScaleLayout p0){
       this.c = p0;
    }
    public final void t(CompatImageView p0){
       this.a = p0;
    }
    public final void u(View p0){
       this.e = p0;
    }
}
