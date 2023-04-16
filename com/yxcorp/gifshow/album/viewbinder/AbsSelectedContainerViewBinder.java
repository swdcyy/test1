package com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
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
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ec7.a;
import java.util.List;
import android.widget.ImageView;
import android.widget.Button;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import android.widget.TextView;
import android.widget.FrameLayout;

public abstract class AbsSelectedContainerViewBinder implements IAlbumViewBinder	// class@001ad6
{
    public ImageView a;
    public View b;
    public View c;
    public AlbumSelectRecyclerView d;
    public TextView e;
    public TextView f;
    public Button g;
    public FrameLayout h;
    public View i;
    public View j;
    public View k;
    public View l;
    public TextView m;
    public TextView n;
    public View o;
    public View p;
    public View q;
    public TextView r;
    public View s;
    public View t;
    public final Fragment u;

    public void AbsSelectedContainerViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.u = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsSelectedContainerViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsSelectedContainerViewBinder uAbsSelected = AbsSelectedContainerViewBinder.class;
       if (PatchProxy.isSupport(uAbsSelected) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsSelected, "6")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsSelectedContainerViewBinder.class, "7")) {
          return;
       }
       a.q(p0, "viewHolder");
       IAlbumViewBinder$a.d(this, p0);
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsSelectedContainerViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsSelectedContainerViewBinder.class, "8")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.u;
    }
    public final ImageView k(){
       return this.a;
    }
    public final Button l(){
       return this.g;
    }
    public final AlbumSelectRecyclerView m(){
       AbsSelectedContainerViewBinder obj = PatchProxy.apply(null, this, AbsSelectedContainerViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mPickRecyclerView");
       }
       return obj;
    }
    public final View n(){
       return this.j;
    }
    public final TextView o(){
       return this.f;
    }
    public final TextView p(){
       return this.e;
    }
    public final View q(){
       return this.p;
    }
    public final void r(ImageView p0){
       this.a = p0;
    }
    public final void s(FrameLayout p0){
       this.h = p0;
    }
    public final void t(Button p0){
       this.g = p0;
    }
    public final void u(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsSelectedContainerViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void v(AlbumSelectRecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsSelectedContainerViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void w(View p0){
       this.j = p0;
    }
    public final void x(TextView p0){
       this.f = p0;
    }
    public final void y(TextView p0){
       this.e = p0;
    }
    public final void z(View p0){
       this.i = p0;
    }
}
