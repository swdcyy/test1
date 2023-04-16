package com.yxcorp.gifshow.album.viewbinder.AbsPreviewSelectViewBinder;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
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

public abstract class AbsPreviewSelectViewBinder implements IPreviewViewBinder	// class@001ad5
{
    public ViewGroup a;
    public ViewGroup b;
    public ViewGroup c;
    public View d;
    public AlbumSelectRecyclerView e;
    public final Fragment f;

    public void AbsPreviewSelectViewBinder(Fragment p0){
       a.q(p0, "fragment");
       super();
       this.f = p0;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsPreviewSelectViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IPreviewViewBinder$a.b(this, p0);
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPreviewSelectViewBinder.class, "4")) {
          return;
       }
       a.q(p0, "viewHolder");
       IPreviewViewBinder$a.c(this, p0);
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsPreviewSelectViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsPreviewSelectViewBinder.class, "5")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IPreviewViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
}
