package com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$c;
import y8c.g;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.contributorlist.g;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListDialogFragment$d;
import ml8.c;

public class LiveContributorListDialogFragment$c extends g	// class@000ad2
{
    public final LiveContributorListDialogFragment w;

    public void LiveContributorListDialogFragment$c(LiveContributorListDialogFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveContributorListDialogFragment$c uoc = LiveContributorListDialogFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.j(p0, 0x7f0d0acf, 1), new g(this.w.E));
    }
}
