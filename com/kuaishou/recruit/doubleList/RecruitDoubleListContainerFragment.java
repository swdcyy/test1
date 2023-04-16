package com.kuaishou.recruit.doubleList.RecruitDoubleListContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kuaishou.recruit.doubleList.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.recruit.doubleList.RecruitDoubleListFragment$RecruitDoubleListParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kuaishou.recruit.doubleList.b;
import lnc.a1;
import java.lang.CharSequence;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.kuaishou.recruit.doubleList.RecruitDoubleListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class RecruitDoubleListContainerFragment extends BaseFragment	// class@000e9c
{
    public RecruitDoubleListFragment$RecruitDoubleListParams j;
    public KwaiActionBar k;
    public static final int l;

    public void RecruitDoubleListContainerFragment(){
       super();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitDoubleListContainerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.j = k0.a(this.getArguments(), c.a).or(new RecruitDoubleListFragment$RecruitDoubleListParams(false));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecruitDoubleListContainerFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d12e9, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecruitDoubleListContainerFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, RecruitDoubleListContainerFragment.class, "5")) {
          this.k = m1.f(p0, 0x7f0a3f6a);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, RecruitDoubleListContainerFragment.class, "6")) {
          this.k.r(k0.a(this.j, b.a).or(a1.p(R.string.arg_RES_7f104209)));
          this.k.j(j.n(this.getContext(), R.drawable.arg_RES_7f080623, 0x7f060148));
          this.k.m(0);
       }
       if (!PatchProxy.applyVoid(objArray, this, RecruitDoubleListContainerFragment.class, "7")) {
          RecruitDoubleListFragment recruitDoubl = RecruitDoubleListFragment.Gh(this.j);
          if (this.getChildFragmentManager().findFragmentById(0x7f0a0c06) == null) {
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.f(R.id.double_list_container, recruitDoubl);
             uoe.m();
          }
       }
       return;
    }
}
