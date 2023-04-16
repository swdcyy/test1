package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;

public final class ShareCopyWritingListFragment$b extends RecyclerView$r	// class@001380
{
    public final ShareCopyWritingListFragment a;

    public void ShareCopyWritingListFragment$b(ShareCopyWritingListFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       ShareCopyWritingListFragment$b uob = ShareCopyWritingListFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1 == 1 && this.a.getActivity() != null) {
          n.C(this.a.getActivity());
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(ShareCopyWritingListFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ShareCopyWritingListFragment$b.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.a.Lh();
       return;
    }
}
