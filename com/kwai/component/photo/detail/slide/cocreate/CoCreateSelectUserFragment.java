package com.kwai.component.photo.detail.slide.cocreate.CoCreateSelectUserFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import com.kwai.component.photo.detail.slide.cocreate.CoCreateSelectUserFragment$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import ekd.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import ne5.b;
import android.view.View$OnClickListener;
import ne5.c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserInfo;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import ne5.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import android.widget.TextView;
import ne5.d;

public class CoCreateSelectUserFragment extends BaseFragment	// class@000a48
{
    public a j;
    public RecyclerView k;
    public List l;
    public int m;
    public BaseFragment n;

    public void CoCreateSelectUserFragment(String p0,int p1){
       super();
       if (!TextUtils.x(p0)) {
          this.l = new Gson().i(p0, new CoCreateSelectUserFragment$a(this).getType());
       }
       this.m = p1;
       this.n = this;
       return;
    }
    public int M(){
       return 1;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, CoCreateSelectUserFragment.class, "8")) {
          return;
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public String o(){
       return "CO_CREATION_AUTHOR_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoCreateSelectUserFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getActivity() != null) {
          i.h(this.getActivity(), 0, true);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CoCreateSelectUserFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d04a8, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoCreateSelectUserFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, CoCreateSelectUserFragment.class, "4")) {
          KwaiActionBar kwaiActionBa = p0.findViewById(R.id.title_root);
          ViewGroup$MarginLayoutParams layoutParams1 = kwaiActionBa.getLayoutParams();
          layoutParams1.topMargin = n.A(a.b());
          kwaiActionBa.setLayoutParams(layoutParams1);
          View view1 = kwaiActionBa.findViewById(R.id.left_btn);
          View view2 = kwaiActionBa.findViewById(R.id.right_btn);
          kwaiActionBa.r(a1.p(R.string.arg_RES_7f10067c));
          kwaiActionBa.i(R.drawable.common_base_close_24);
          view1.setOnClickListener(new b(this));
          view2.setOnClickListener(new c(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CoCreateSelectUserFragment.class, "6")) {
          RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
          this.k = recyclerView;
          ViewGroup$MarginLayoutParams layoutParams = recyclerView.getLayoutParams();
          layoutParams.topMargin = n.A(a.b()) + a1.d(0x7f070fdf);
          this.k.setLayoutParams(layoutParams);
          ArrayList uArrayList = new ArrayList();
          boolean b = false;
          if (!q.f(this.l)) {
             uArrayList.addAll(this.l);
          }else {
             User user = new User(QCurrentUser.me().getId(), QCurrentUser.me().getName(), QCurrentUser.me().getSex(), QCurrentUser.me().getAvatar(), QCurrentUser.me().getAvatars());
             uArrayList.add(new CoCreateSelectUserInfo(v8, b));
          }
          this.j = new a(uArrayList, this, this.k, this.m);
          this.k.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, b));
          a uoa = new a(1, b, b);
          uoa.m(a1.d(R.dimen.arg_RES_7f07033e));
          this.k.addItemDecoration(uoa);
          this.k.setAdapter(this.j);
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d01ba);
          CoCreateSelectUserFragment tj = this.j;
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoidOneRefs(view, tj, a.class, "1")) {
             tj.w = view;
             tj.n0((tj.getItemCount() - 1));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CoCreateSelectUserFragment.class, "7")) {
          p0.findViewById(R.id.co_create_guide).setOnClickListener(new d(this));
       }
       return;
    }
}
