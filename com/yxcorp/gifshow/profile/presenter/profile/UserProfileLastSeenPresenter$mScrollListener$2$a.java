package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mScrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mScrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;

public final class UserProfileLastSeenPresenter$mScrollListener$2$a extends RecyclerView$r	// class@00146b
{
    public final UserProfileLastSeenPresenter$mScrollListener$2 a;

    public void UserProfileLastSeenPresenter$mScrollListener$2$a(UserProfileLastSeenPresenter$mScrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(UserProfileLastSeenPresenter$mScrollListener$2$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, UserProfileLastSeenPresenter$mScrollListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p2 > 0) {
          this.a.this$0.X8();
       }
       this.a.this$0.W8();
       return;
    }
}
