package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$p;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import qvb.n0;
import qvb.a;

public final class UserProfileLastSeenPresenter$p implements Runnable	// class@00146f
{
    public final UserProfileLastSeenPresenter b;
    public final int c;
    public final int d;
    public final boolean e;

    public void UserProfileLastSeenPresenter$p(UserProfileLastSeenPresenter p0,int p1,int p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       RecyclerView recyclerView;
       int i1;
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenter$p.class, "1")) {
          return;
       }
       int i = 2;
       this.b.x9().startNestedScroll(i, 1);
       View childAt = this.b.x9().getChildAt(0);
       if (childAt != null) {
          if (this.c < this.d) {
             recyclerView = this.b.x9();
             i1 = (this.e != null)? (- childAt.getHeight()) / i: - childAt.getHeight();
             recyclerView.smoothScrollBy(0, i1);
          }else {
             recyclerView = this.b.x9();
             i1 = (this.e != null)? childAt.getHeight() / i: childAt.getHeight();
             recyclerView.smoothScrollBy(0, i1);
          }
       }
       if (this.c >= (this.b.s9().getCount() - 9)) {
          this.b.Q9(1);
          this.b.s9().load();
       }
       return;
    }
}
