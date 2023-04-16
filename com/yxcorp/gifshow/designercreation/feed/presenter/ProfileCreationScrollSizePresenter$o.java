package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$o;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import brd.t;

public final class ProfileCreationScrollSizePresenter$o implements o	// class@0012f2
{
    public final ProfileCreationScrollSizePresenter b;
    public final RecyclerView c;

    public void ProfileCreationScrollSizePresenter$o(ProfileCreationScrollSizePresenter p0,RecyclerView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$o.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b.W8(this.c);
       }
       return p0;
    }
}
