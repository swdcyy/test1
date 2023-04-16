package com.yxcorp.gifshow.profile.collect.fragment.p;
import erd.o;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionTabFragment;
import java.lang.Object;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import android.widget.FrameLayout;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.collect.fragment.n;
import io.reactivex.g;

public final class p implements o	// class@0012c1
{
    public final ProfileCollectionTabFragment b;

    public void p(ProfileCollectionTabFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyOneRefs(p0, tb, ProfileCollectionTabFragment.class, "6");
       if (ot != PatchProxyResult.class) {
       }else if(p0.getHeight()){
          ot = t.just(Integer.valueOf(tb.Sh(p0)));
       }else {
          ot = t.create(new n(tb, p0));
       }
       return ot;
    }
}
