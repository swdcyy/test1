package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qra.k;
import java.lang.Boolean;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import z8c.a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailTabHostFragment;
import qvb.i;
import com.kuaishou.android.post.vote.model.VoteDetailItem;
import java.util.Objects;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailTabHostFragment$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import y8c.g;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailUserListFragment$a;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.a;

public class VoteDetailUserListFragment extends RecyclerFragment	// class@0012cf
{

    public void VoteDetailUserListFragment(){
       super();
    }
    public t Bh(){
       k obj = PatchProxy.apply(null, this, VoteDetailUserListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k(this);
       obj.y(R.drawable.arg_RES_7f0805ea);
       obj.B(R.string.arg_RES_7f10513a);
       return obj;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoteDetailUserListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoteDetailUserListFragment.class, "5")) {
          return;
       }
       super.Z1(p0, p1);
       this.sh().f();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoteDetailUserListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoteDetailUserListFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoteDetailUserListFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().setVerticalScrollBarEnabled(false);
       a uoa = new a();
       uoa.o(f.c(this.getResources(), R.drawable.arg_RES_7f08206b, null));
       uoa.s(f.c(this.getResources(), R.drawable.arg_RES_7f080685, null));
       this.h0().addItemDecoration(uoa);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoteDetailUserListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoteDetailUserListFragment.class, "6")) {
          return;
       }
       super.v2(p0, p1);
       if (p0 && this.getParentFragment() instanceof VoteDetailTabHostFragment) {
          String str = this.getArguments().getString("VOTE_OPTION_INDEX");
          VoteDetailItem mCount = this.q().L0().mCount;
          VoteDetailTabHostFragment parentFragme = this.getParentFragment();
          Objects.requireNonNull(parentFragme);
          String str1 = "VoteDetailTabHostFragme";
          if (!PatchProxy.isSupport(VoteDetailTabHostFragment.class) || !PatchProxy.applyVoidTwoRefs(str, Integer.valueOf(mCount), parentFragme, VoteDetailTabHostFragment.class, "7")) {
             int i = Integer.parseInt(str);
             if (i < 0 || i >= parentFragme.D.size()) {
                str = "indexOutOf option count";
                PostUtils.D(str1, str, new ArrayIndexOutOfBoundsException(str));
             }else {
                parentFragme.D.get(i).b = (long)mCount;
                PagerSlidingTabStrip$d uod = parentFragme.vh(i);
                if (uod != null) {
                   uod.b().findViewById(R.id.result_count).setText(String.valueOf(mCount));
                   parentFragme.Qh();
                }
             }
          }
       }
       if (this.uh()) {
          this.sh().i();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoteDetailUserListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoteDetailUserListFragment$a(this);
    }
    public i yh(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, VoteDetailUserListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          objArray = this.getArguments().getString("PHOTO_ID");
          obj = this.getArguments().getString("VOTE_OPTION_INDEX");
       }else {
          Object[] objArray1 = objArray;
       }
       return new a(objArray, obj);
    }
}
