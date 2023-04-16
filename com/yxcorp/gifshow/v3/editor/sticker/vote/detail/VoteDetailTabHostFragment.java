package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailTabHostFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailTabHostFragment$a;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.view.View;
import ekd.m1;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import java.util.HashMap;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResult;
import faa.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.viewpager.widget.ViewPager;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.Long;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import wtc.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailUserListFragment;

public class VoteDetailTabHostFragment extends TabHostFragment implements d	// class@0012cd
{
    public KwaiActionBar B;
    public String C;
    public List D;
    public static final int E;

    public void VoteDetailTabHostFragment(){
       super();
       this.D = new ArrayList();
    }
    public final void Qh(){
       if (PatchProxy.applyVoid(null, this, VoteDetailTabHostFragment.class, "8")) {
          return;
       }
       Iterator iterator = this.D.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          long l = (long)i1 + iterator.next().b;
          i1 = (int)l;
       }
       Object[] objArray = new Object[]{String.valueOf(i1)};
       this.B.e(R.drawable.arg_RES_7f080623, -1, this.getString(R.string.arg_RES_7f10513b, objArray));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteDetailTabHostFragment.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d16fc;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoteDetailTabHostFragment.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, VoteDetailTabHostFragment.class, "3")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             this.C = arguments.getString("PHOTO_ID");
             Serializable serializable = SerializableHook.getSerializable(arguments, "VOTE_RESULT_RESPONSE");
             if (serializable instanceof VoteResultResponse) {
                VoteResultResponse mVoteResult = serializable.mVoteResult;
                if (mVoteResult != null) {
                   VoteResultResponse mVoteInfo = serializable.mVoteInfo;
                   if (mVoteInfo != null && (mVoteInfo.mOptions != null && mVoteResult.size() == serializable.mVoteInfo.mOptions.size())) {
                      for (int i1 = 0; i1 < serializable.mVoteResult.size(); i1 = i1 + 1) {
                         this.D.add(new VoteDetailTabHostFragment$a(this, serializable.mVoteInfo.mOptions.get(i1), serializable.mVoteResult.getResult(i1)));
                      }
                   }
                }
                Object[] objArray = new Object[]{"resultResponse:"+serializable.toString()};
                a.D().s(this.getUrl(), "onPreViewCreated", objArray);
             }
          }
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.Qh();
       int i = 0;
       while (i < this.D.size()) {
          if (this.D.get(i).b > 0) {
             this.u.setCurrentItem(i, false);
          }
          i++;
       }
       return;
    }
    public List wh(){
       PagerSlidingTabStrip$d uod;
       ArrayList obj = PatchProxy.apply(null, this, VoteDetailTabHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       for (int i = 0; i < this.D.size(); i = i + 1) {
          VoteDetailTabHostFragment$a uoa = this.D.get(i);
          VoteDetailTabHostFragment$a a = uoa.a;
          VoteDetailTabHostFragment$a b = uoa.b;
          if (PatchProxy.isSupport(VoteDetailTabHostFragment.class)) {
             uod = PatchProxy.applyTwoRefs(a, Long.valueOf(b), this, VoteDetailTabHostFragment.class, "5");
             if (uod != PatchProxyResult.class) {
             label_0081 :
                VoteDetailUserListFragment voteDetailUs = VoteDetailUserListFragment.class;
                String str = String.valueOf(i);
                Bundle uBundle = PatchProxy.applyOneRefs(str, this, VoteDetailTabHostFragment.class, "6");
                if (uBundle != PatchProxyResult.class) {
                }else {
                   uBundle = new Bundle();
                   uBundle.putString("PHOTO_ID", this.C);
                   uBundle.putString("VOTE_OPTION_INDEX", str);
                }
                obj.add(new b(uod, voteDetailUs, uBundle));
             }
          }
          LinearLayout linearLayout = a.i(new LinearLayout(this.getActivity()), R.layout.arg_RES_7f0d16fe);
          linearLayout.findViewById(R.id.option_text).setText(a);
          linearLayout.findViewById(R.id.result_count).setText(String.valueOf(b));
          PagerSlidingTabStrip$d uod1 = new PagerSlidingTabStrip$d(a, linearLayout);
          uod1.i(new a(this, a));
          uod = uod1;
          goto label_0081 ;
       }
       return obj;
    }
}
