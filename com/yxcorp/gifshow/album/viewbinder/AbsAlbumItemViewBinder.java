package com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
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

public abstract class AbsAlbumItemViewBinder implements IAlbumViewBinder	// class@001acf
{
    public View a;
    public RecyclerView$ViewHolder b;
    public final Fragment c;
    public final int d;

    public void AbsAlbumItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.c = p0;
       this.d = p1;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumItemViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumItemViewBinder uAbsAlbumIte = AbsAlbumItemViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumIte) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumIte, "3")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "viewHolder");
       this.b = p0;
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumItemViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final Fragment j(){
       return this.c;
    }
    public final View k(){
       return this.a;
    }
    public final RecyclerView$ViewHolder l(){
       return this.b;
    }
    public final void m(View p0){
       this.a = p0;
    }
}
