package com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.toolbox.serach.TemplateSearchFeedListFragment$f$a;
import java.lang.Runnable;
import ekd.k1;

public final class TemplateSearchFeedListFragment$f extends RecyclerView$r	// class@000f6a
{
    public final TemplateSearchFeedListFragment a;

    public void TemplateSearchFeedListFragment$f(TemplateSearchFeedListFragment p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(TemplateSearchFeedListFragment$f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TemplateSearchFeedListFragment$f.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       k1.m(new TemplateSearchFeedListFragment$f$a(this));
       k1.r(this.a.N, 10);
       return;
    }
}
