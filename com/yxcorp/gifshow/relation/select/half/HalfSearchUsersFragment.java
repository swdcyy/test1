package com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import tbc.d;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import java.lang.Boolean;
import android.view.ViewParent;
import wbc.m;
import qvb.a;
import g9c.d;

public class HalfSearchUsersFragment extends SearchUsersFragment	// class@00199b
{
    public View K;

    public void HalfSearchUsersFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, HalfSearchUsersFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HalfSearchUsersFragment$b(this, this);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfSearchUsersFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(HalfSearchUsersFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfSearchUsersFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().addOnScrollListener(new HalfSearchUsersFragment$a(this, p0));
       this.h0().setTag(R.id.bs_bottom_sheet, "search");
       this.K = (d.c(this.I))? a.b(this.getContext(), 0x7f0d1468, 1): a.a(this.getContext(), 0x7f0d1468);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(HalfSearchUsersFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HalfSearchUsersFragment.class, "2")) {
          return;
       }
       super.v2(p0, p1);
       if (this.K.getParent() == null && this.Jh().getCount()) {
          this.ia().P0(this.K);
       }
       return;
    }
}
