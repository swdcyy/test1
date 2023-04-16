package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$b;
import io.reactivex.g;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$b$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class ProfileCreationScrollSizePresenter$b implements g	// class@0012e3
{
    public final ProfileCreationScrollSizePresenter b;
    public final RecyclerView c;

    public void ProfileCreationScrollSizePresenter$b(ProfileCreationScrollSizePresenter p0,RecyclerView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCreationScrollSizePresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.c.post(new ProfileCreationScrollSizePresenter$b$a(this, p0));
       return;
    }
}
