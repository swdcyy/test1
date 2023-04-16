package com.yxcorp.gifshow.album.viewbinder.AbsAlbumListItemViewBinder;
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
import android.widget.TextView;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;

public abstract class AbsAlbumListItemViewBinder implements IAlbumViewBinder	// class@001ad1
{
    public TextView a;
    public TextView b;
    public CompatImageView c;
    public RecyclerView$ViewHolder d;
    public final Fragment e;
    public final int f;

    public void AbsAlbumListItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.e = p0;
       this.f = p1;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAlbumListItemViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IAlbumViewBinder$a.b(this, p0);
    }
    public void c(View p0,int p1){
       AbsAlbumListItemViewBinder uAbsAlbumLis = AbsAlbumListItemViewBinder.class;
       if (PatchProxy.isSupport(uAbsAlbumLis) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAbsAlbumLis, "3")) {
          return;
       }
       a.q(p0, "itemView");
       IAlbumViewBinder$a.c(this, p0, p1);
       return;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsAlbumListItemViewBinder.class, "1")) {
          return;
       }
       a.q(p0, "viewHolder");
       this.d = p0;
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsAlbumListItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsAlbumListItemViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IAlbumViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final TextView j(){
       return this.b;
    }
    public final void k(CompatImageView p0){
       this.c = p0;
    }
    public final void l(TextView p0){
       this.a = p0;
    }
    public final void m(TextView p0){
       this.b = p0;
    }
}
