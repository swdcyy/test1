package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$d;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class LiveGzoneKShellRankListFragment$d extends f	// class@001c4e
{
    public View l;
    public final LiveGzoneKShellRankListFragment m;

    public void LiveGzoneKShellRankListFragment$d(LiveGzoneKShellRankListFragment p0,RecyclerFragment p1){
       this.m = p0;
       super(p1);
    }
    public View J0(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LiveGzoneKShellRankListFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = super.J0();
          obj = KwaiEmptyStateView.e();
          obj.b();
          obj.a(this.l);
       }
       return this.l;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneKShellRankListFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.b();
       return uoa;
    }
}
