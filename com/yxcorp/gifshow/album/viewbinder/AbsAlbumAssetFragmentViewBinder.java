package com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
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
import com.yxcorp.gifshow.album.widget.LoadingView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public abstract class AbsAlbumAssetFragmentViewBinder implements IAlbumViewBinder	// class@001ac8
{
    public View a;
    public RecyclerView b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public LinearLayout f;
    public LoadingView g;
    public View h;
    public final Fragment i;

    public void AbsAlbumAssetFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.i = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumAssetFragmentViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumAssetFragmentViewBinder uAbsAlbumAss = AbsAlbumAssetFragmentViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumAss) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumAss, "2")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumAssetFragmentViewBinder.class, "3")) {
          return;
       }
       a.q(p0, "viewHolder");
       IAlbumViewBinder$a.d(this, p0);
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumAssetFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumAssetFragmentViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.i;
    }
    public final LoadingView k(){
       return this.g;
    }
    public final ImageView l(){
       return this.e;
    }
    public final LinearLayout m(){
       return this.f;
    }
    public final TextView n(){
       return this.d;
    }
    public final TextView o(){
       return this.c;
    }
    public final View p(){
       return this.h;
    }
    public final RecyclerView q(){
       return this.b;
    }
    public final void r(LoadingView p0){
       this.g = p0;
    }
    public final void s(ImageView p0){
       this.e = p0;
    }
    public final void t(LinearLayout p0){
       this.f = p0;
    }
    public final void u(TextView p0){
       this.d = p0;
    }
    public final void v(TextView p0){
       this.c = p0;
    }
    public final void w(RecyclerView p0){
       this.b = p0;
    }
    public final void x(View p0){
       this.a = p0;
    }
}
