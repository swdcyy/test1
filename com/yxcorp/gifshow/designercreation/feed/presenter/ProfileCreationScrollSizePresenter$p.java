package com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$p;
import ok.h;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.designercreation.feed.presenter.a;
import erd.r;
import com.yxcorp.gifshow.designercreation.feed.presenter.b;
import erd.o;
import com.yxcorp.gifshow.designercreation.feed.presenter.c;
import com.yxcorp.gifshow.designercreation.feed.presenter.d;
import com.yxcorp.gifshow.designercreation.feed.presenter.e;
import erd.g;

public final class ProfileCreationScrollSizePresenter$p implements h	// class@0012f3
{
    public final ProfileCreationScrollSizePresenter b;

    public void ProfileCreationScrollSizePresenter$p(ProfileCreationScrollSizePresenter p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfileCreationScrollSizePresenter$p.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b.V8();
          a.m(p0);
          p0 = t.just(p0.h0()).delay((long)300, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).filter(new a(this)).flatMap(new b(this)).filter(c.b).map(new d(this)).subscribe(new e(this));
       }
       return p0;
    }
}
