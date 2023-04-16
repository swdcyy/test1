package com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lw8.a;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.t;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment$a;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import br8.b;
import androidx.recyclerview.widget.RecyclerView;
import br8.c;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import qvb.i;
import tkd.b;
import tkd.d;
import nx5.c;
import mrd.c;

public final class PublishAtFriendSearchFragment extends RecyclerFragment	// class@001375
{
    public final a F;
    public i G;
    public String H;
    public boolean I;
    public boolean J;
    public final a K;

    public void PublishAtFriendSearchFragment(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<String>\(\)");
       this.F = uoa;
       this.H = "";
       this.J = true;
       uoa = new a(2);
       String str = a1.p(R.string.arg_RES_7f104579);
       a.o(str, "CommonUtil.string\(R.string.search_results\)");
       Object obj = PatchProxy.applyOneRefs(str, uoa, a.class, "7");
       if (obj != PatchProxyResult.class) {
          uoa = obj;
       }else {
          a.p(str, "text");
          uoa.y = str;
       }
       this.K = uoa.u1(this.H);
       return;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, PublishAtFriendSearchFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PublishAtFriendSearchFragment$a(this, this);
    }
    public boolean S1(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PublishAtFriendSearchFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PublishAtFriendSearchFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PublishAtFriendSearchFragment.class, "1")) {
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
       this.h0().addOnScrollListener(new PublishAtFriendSearchFragment$b(this, p0));
       return;
    }
    public g vh(){
       return this.K;
    }
    public i yh(){
       i oi;
       PublishAtFriendSearchFragment obj = PatchProxy.apply(null, this, PublishAtFriendSearchFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          oi = d.a(0x37332120).h6(2001, this.F);
          a.m(oi);
          this.G = oi;
       }
       return oi;
    }
}
