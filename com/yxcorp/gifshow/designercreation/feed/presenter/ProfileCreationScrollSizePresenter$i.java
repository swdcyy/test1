package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$i;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import brd.t;

public final class ProfileCreationScrollSizePresenter$i implements o	// class@0012ea
{
    public final ProfileCreationScrollSizePresenter b;
    public final RecyclerView c;

    public void ProfileCreationScrollSizePresenter$i(ProfileCreationScrollSizePresenter p0,RecyclerView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$i.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b.W8(this.c);
       }
       return p0;
    }
}
