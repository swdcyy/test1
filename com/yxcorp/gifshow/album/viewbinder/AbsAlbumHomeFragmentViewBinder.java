package com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
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
import com.yxcorp.gifshow.album.widget.ScrollableLayout;
import androidx.viewpager.widget.ViewPager;

public abstract class AbsAlbumHomeFragmentViewBinder implements IAlbumViewBinder	// class@001ace
{
    public ScrollableLayout a;
    public ViewPager b;
    public View c;
    public final Fragment d;

    public void AbsAlbumHomeFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.d = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumHomeFragmentViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumHomeFragmentViewBinder uAbsAlbumHom = AbsAlbumHomeFragmentViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumHom) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumHom, "3")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumHomeFragmentViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "viewHolder");
       IAlbumViewBinder$a.d(this, p0);
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumHomeFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumHomeFragmentViewBinder.class, "5")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final ScrollableLayout j(){
       return this.a;
    }
    public final ViewPager k(){
       return this.b;
    }
    public final View l(){
       return this.c;
    }
    public final void m(ScrollableLayout p0){
       this.a = p0;
    }
    public final void n(ViewPager p0){
       this.b = p0;
    }
    public final void o(View p0){
       this.c = p0;
    }
}
