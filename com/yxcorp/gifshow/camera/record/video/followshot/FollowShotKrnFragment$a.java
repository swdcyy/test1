package com.yxcorp.gifshow.camera.record.video.followshot.FollowShotKrnFragment$a;
import ik0.b;
import com.yxcorp.gifshow.camera.record.video.followshot.FollowShotKrnFragment;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class FollowShotKrnFragment$a implements b	// class@000f81
{
    public final FollowShotKrnFragment a;

    public void FollowShotKrnFragment$a(FollowShotKrnFragment p0){
       this.a = p0;
       super();
    }
    public View a(ViewGroup p0,View p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FollowShotKrnFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (p1 instanceof KwaiLoadingView) {
          p1.setLoadingStyle(LoadingStyle.GRAY);
       }
       return p1;
    }
    public View b(ViewGroup p0,View p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, FollowShotKrnFragment$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (p1 instanceof KwaiEmptyStateView) {
          p1.q(3);
       }
       return p1;
    }
    public boolean c(){
       return true;
    }
    public boolean isErrorEnabled(){
       return true;
    }
}
