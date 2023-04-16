package com.yxcorp.gifshow.designercreation.feed.presenter.a;
import erd.r;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$p;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import androidx.fragment.app.Fragment;

public final class a implements r	// class@0012f5
{
    public final ProfileCreationScrollSizePresenter$p b;

    public void a(ProfileCreationScrollSizePresenter$p p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b.b.V8();
          a.m(p0);
          b = p0.getUserVisibleHint();
       }
       return b;
    }
}
