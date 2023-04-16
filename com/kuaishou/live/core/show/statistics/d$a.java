package com.kuaishou.live.core.show.statistics.d$a;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.statistics.d;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yt5.e;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;

public class d$a extends c$b	// class@001098
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
          return;
       }
       d$a ta = this.a;
       ta.s.d(ta.getActivity());
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       d$a ta = this.a;
       d$a ta1 = this.a;
       ta.s.g(ta.getActivity(), p1, ta1.p.c.mEntity, ta1.r);
       return;
    }
}
