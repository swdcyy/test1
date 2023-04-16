package com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lw8.a;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment$mPageList$2;
import msd.a;
import qrd.p;
import qrd.s;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment$a;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import br8.b;
import androidx.recyclerview.widget.RecyclerView;
import br8.c;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment$c;
import android.view.View$OnClickListener;
import qvb.i;

public final class PublishAtFriendDefaultFragment extends RecyclerFragment	// class@001371
{
    public final a F;
    public final p G;

    public void PublishAtFriendDefaultFragment(){
       super();
       this.F = new a(1);
       this.G = s.c(PublishAtFriendDefaultFragment$mPageList$2.INSTANCE);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, PublishAtFriendDefaultFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PublishAtFriendDefaultFragment$a(this, this);
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d1285;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PublishAtFriendDefaultFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PublishAtFriendDefaultFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PublishAtFriendDefaultFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       g og = this.g7();
       if (!og instanceof b) {
          og = null;
       }
       if (og != null) {
          this.h0().addItemDecoration(new c(og));
       }
       this.h0().addOnScrollListener(new PublishAtFriendDefaultFragment$b(this, p0));
       p0.findViewById(R.id.publish_at_friend_group_area).setOnClickListener(PublishAtFriendDefaultFragment$c.b);
       return;
    }
    public g vh(){
       return this.F;
    }
    public i yh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, PublishAtFriendDefaultFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, PublishAtFriendDefaultFragment.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = this.G.getValue();
       }
       return obj;
    }
}
