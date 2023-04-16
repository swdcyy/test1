package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$b;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.g;

public final class ProfileCreationScrollSizePresenter$b$a implements Runnable	// class@0012e2
{
    public final ProfileCreationScrollSizePresenter$b b;
    public final v c;

    public void ProfileCreationScrollSizePresenter$b$a(ProfileCreationScrollSizePresenter$b p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationScrollSizePresenter$b$a.class, "1")) {
          return;
       }
       ProfileCreationScrollSizePresenter$b$a tb = this.b;
       RecyclerFragment recyclerFrag = this.b.b.V8();
       a.m(recyclerFrag);
       recyclerFrag.getClass();
       this.c.onNext(Integer.valueOf(tb.b.P8(tb.c)));
       this.c.onComplete();
       return;
    }
}
