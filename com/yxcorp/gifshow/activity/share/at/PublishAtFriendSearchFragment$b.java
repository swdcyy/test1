package com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.os.IBinder;
import com.yxcorp.utility.n;

public final class PublishAtFriendSearchFragment$b extends RecyclerView$r	// class@001374
{
    public final PublishAtFriendSearchFragment a;
    public final View b;

    public void PublishAtFriendSearchFragment$b(PublishAtFriendSearchFragment p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       PublishAtFriendSearchFragment$b uob = PublishAtFriendSearchFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1 == 1 || p1 == 2) {
          n.E(this.a.getContext(), this.b.getWindowToken());
       }
       return;
    }
}
