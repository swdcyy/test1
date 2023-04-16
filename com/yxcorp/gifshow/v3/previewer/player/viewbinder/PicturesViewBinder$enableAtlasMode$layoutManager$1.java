package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$enableAtlasMode$layoutManager$1;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class PicturesViewBinder$enableAtlasMode$layoutManager$1 extends NpaLinearLayoutManager	// class@0015f1
{
    public final PicturesViewBinder r;
    public final boolean s;

    public void PicturesViewBinder$enableAtlasMode$layoutManager$1(PicturesViewBinder p0,boolean p1,Context p2,int p3,boolean p4){
       this.r = p0;
       this.s = p1;
       super(p2, p3, p4);
    }
    public boolean canScrollHorizontally(){
       Object obj = PatchProxy.apply(null, this, PicturesViewBinder$enableAtlasMode$layoutManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r.J.t0().getValue() == Workspace$Type.SINGLE_PICTURE) {
          return false;
       }
       return super.canScrollHorizontally();
    }
    public boolean canScrollVertically(){
       Object obj = PatchProxy.apply(null, this, PicturesViewBinder$enableAtlasMode$layoutManager$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r.J.t0().getValue() == Workspace$Type.SINGLE_PICTURE) {
          return false;
       }
       return super.canScrollVertically();
    }
}
