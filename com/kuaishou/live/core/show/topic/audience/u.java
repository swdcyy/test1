package com.kuaishou.live.core.show.topic.audience.u;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.u$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ql2.o0;
import ql2.y;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class u extends c	// class@00121d
{
    public TextView p;
    public View q;
    public NpaGridLayoutManager r;
    public LiveAudienceTopicDetailFragment s;
    public final RecyclerView$r t;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailTitlePresenter";

    public void u(){
       super();
       this.t = new u$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       o0.p0(this.s).d.observe(this.s.requireParentFragment(), new y(this));
       this.r = this.s.h0().getLayoutManager();
       this.s.h0().addOnScrollListener(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "4")) {
          return;
       }
       this.s.h0().removeOnScrollListener(this.t);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1a39);
       this.q = m1.f(p0, 0x7f0a1a27);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       return;
    }
}
