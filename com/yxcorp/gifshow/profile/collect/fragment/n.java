package com.yxcorp.gifshow.profile.collect.fragment.n;
import io.reactivex.g;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionTabFragment;
import androidx.core.widget.NestedScrollView;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import i2c.o0;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class n implements g	// class@0012bf
{
    public final ProfileCollectionTabFragment b;
    public final NestedScrollView c;

    public void n(ProfileCollectionTabFragment p0,NestedScrollView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       tc.post(new o0(tb, tc, p0));
    }
}
