package com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
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
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import com.yxcorp.gifshow.base.fragment.IAlbumViewBinder$a;
import android.view.View;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ga9.b;
import ec7.a;
import java.util.List;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;

public abstract class AbsAlbumFragmentViewBinder implements IAlbumViewBinder	// class@001acc
{
    public ImageView a;
    public TextView b;
    public ViewPager c;
    public View d;
    public ViewGroup e;
    public View f;
    public View g;
    public View h;
    public View i;
    public AbsSelectedContainerViewBinder j;
    public final Fragment k;

    public void AbsAlbumFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.k = p0;
    }
    public boolean a(ViewModel p0){
       AbsAlbumFragmentViewBinder obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumFragmentViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj != null) {
          obj.a(p0);
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumFragmentViewBinder uAbsAlbumFra = AbsAlbumFragmentViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumFra) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumFra, "5")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumFragmentViewBinder.class, "6")) {
          return;
       }
       a.q(p0, "viewHolder");
       IAlbumViewBinder$a.d(this, p0);
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumFragmentViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       AbsAlbumFragmentViewBinder tj = this.j;
       if (tj != null) {
          tj.e(p0);
       }
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumFragmentViewBinder.class, "7")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.k;
    }
    public final View k(){
       return this.f;
    }
    public final View l(){
       return this.d;
    }
    public final ImageView m(){
       return this.a;
    }
    public final ViewGroup n(){
       return this.e;
    }
    public final TextView o(){
       return this.b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AbsAlbumFragmentViewBinder.class, "3")) {
          return;
       }
       AbsAlbumFragmentViewBinder tj = this.j;
       if (tj != null) {
          tj.onDestroy();
       }
       return;
    }
    public final ViewPager p(){
       return this.c;
    }
    public final AbsSelectedContainerViewBinder q(){
       return this.j;
    }
    public final void r(View p0){
       this.g = p0;
    }
    public final void s(View p0){
       this.f = p0;
    }
    public final void t(View p0){
       this.d = p0;
    }
    public final void u(ImageView p0){
       this.a = p0;
    }
    public final void v(ViewGroup p0){
       this.e = p0;
    }
    public final void w(TextView p0){
       this.b = p0;
    }
    public final void x(ViewPager p0){
       this.c = p0;
    }
    public final void y(View p0){
       this.i = p0;
    }
    public final void z(View p0){
       this.h = p0;
    }
}
