package com.kwai.feature.post.api.postcard.PostCardView$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.feature.post.api.postcard.PostCardView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.List;
import k46.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k46.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class PostCardView$c extends RecyclerView$r	// class@001421
{
    public final PostCardView a;

    public void PostCardView$c(PostCardView p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(PostCardView$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PostCardView$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       RecyclerView$LayoutManager layoutManage = this.a.getMRecyclerView().getLayoutManager();
       if (!this.a.getMRecyclerView().getVisibility() && layoutManage instanceof LinearLayoutManager) {
          p1 = layoutManage.i0();
          int i = layoutManage.c();
          p2 = -1;
          if (p1 != p2 && i != p2) {
             p2 = 1;
             if (i > p2) {
                View childAt = this.a.getMRecyclerView().getChildAt(i);
                if (childAt != null && (double)(((float)n.z(a.b()) - childAt.getX()) / (float)childAt.getWidth()) - 0x3fc999999999999a < 0) {
                   i--;
                }
             }
             i = i + p2;
             while (p1 < i) {
                if (p1 < this.a.c.size()) {
                   PostCardView$c ta = this.a;
                   if (!ta.f.contains(ta.c.get(p1))) {
                      ta = (this.a.c.get(p1).d() == 4)? 3: this.a.c.get(p1).c();
                      GifshowActivity activity = this.a.getActivity();
                      f uof = f.class;
                      if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(ta), null, uof, "2")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "MATERIAL_CARD";
                         uElementPack.params = f.a(ta).e();
                         u1.C0("", activity, 3, uElementPack, null);
                      }
                      ta = this.a;
                      ta.f.add(ta.c.get(p1));
                   }
                }
                p1++;
             }
          }
       }
       return;
    }
}
