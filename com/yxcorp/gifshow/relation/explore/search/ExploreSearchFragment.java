package com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.explore.search.d;
import y8c.t;
import jac.f;
import java.util.Map;
import qvb.i;
import com.yxcorp.gifshow.relation.explore.search.c;
import java.util.Objects;
import qvb.n0;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchFragment$b;
import s2b.a;
import s2b.d;
import y8c.g;
import com.yxcorp.gifshow.relation.explore.search.b;

public class ExploreSearchFragment extends RecyclerFragment	// class@001870
{
    public static final int F;

    public void ExploreSearchFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ExploreSearchFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new d());
       PatchProxy.onMethodExit(ExploreSearchFragment.class, "2");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d0408;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreSearchFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ExploreSearchFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, ExploreSearchFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.q();
       if (!obj instanceof c) {
          return super.getPageParams();
       }
       String str = obj.h2();
       Objects.requireNonNull(obj);
       String str1 = PatchProxy.apply(objArray, obj, c.class, "3");
       if (str1 != patchProxyRe) {
       }else if(!obj.K()){
          objArray = obj.L0();
       }
       String str2 = (objArray == null)? "": objArray.mListId;
       str1 = str2;
       i3 oi3 = i3.f();
       oi3.d("query_id", TextUtils.I(obj.r));
       oi3.d("query_name", TextUtils.I(str));
       oi3.d("query_source_type", "USER_INPUT");
       oi3.d("query_source_list_id", TextUtils.I(str1));
       oi3.d("enrty_source", "search_entrance_friends");
       oi3.d("query_vertical_type", "FIND_FRIENDS");
       return oi3.e();
    }
    public boolean i0(){
       return false;
    }
    public String o(){
       i obj = PatchProxy.apply(null, this, ExploreSearchFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q();
       if (obj != null && !obj.isEmpty()) {
          return "SEARCH_RESULT_GENERAL";
       }
       return "EXPLORE_SEARCH_LOADING";
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ExploreSearchFragment.class, "3")) {
          return;
       }
       super.th();
       this.h0().setVerticalScrollBarEnabled(false);
       this.h0().addOnScrollListener(new ExploreSearchFragment$a(this));
       this.C.h(new ExploreSearchFragment$b(this));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, ExploreSearchFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
