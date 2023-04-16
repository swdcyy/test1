package com.yxcorp.gifshow.album.viewbinder.AbsAlbumListFragmentViewBinder;
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
import androidx.recyclerview.widget.RecyclerView;

public abstract class AbsAlbumListFragmentViewBinder implements IAlbumViewBinder	// class@001ad0
{
    public RecyclerView a;
    public RecyclerView$LayoutManager b;
    public final Fragment c;

    public void AbsAlbumListFragmentViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.c = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumListFragmentViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumListFragmentViewBinder uAbsAlbumLis = AbsAlbumListFragmentViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumLis) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumLis, "2")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumListFragmentViewBinder.class, "3")) {
          return;
       }
       a.q(p0, "viewHolder");
       IAlbumViewBinder$a.d(this, p0);
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumListFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumListFragmentViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final RecyclerView j(){
       return this.a;
    }
    public final void k(RecyclerView p0){
       this.a = p0;
    }
}
