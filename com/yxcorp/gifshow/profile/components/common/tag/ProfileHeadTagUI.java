package com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI;
import ge7.b;
import com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI$a;
import nsd.u;
import com.yxcorp.gifshow.profile.ProfileStyle;
import z5c.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ge7.c;
import android.view.View;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI$doBindView$1$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import a3c.e;
import z8c.f;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup;
import com.kwai.page.component.ui.UIException;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.content.Context;
import ie7.a;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import g9c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import c3c.b;
import java.lang.Integer;
import v1c.n;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.util.Set;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import z5c.d3;
import wh5.c;
import qrd.l1;

public final class ProfileHeadTagUI extends b	// class@0012e8
{
    public RecyclerView h;
    public n i;
    public int j;
    public static final ProfileHeadTagUI$a k;

    static {
       ProfileHeadTagUI.k = new ProfileHeadTagUI$a(null);
    }
    public void ProfileHeadTagUI(boolean p0){
       super(p0);
       this.j = k0.p().getProfileStyle();
    }
    public int a(){
       return 0x7f0d1214;
    }
    public void b(){
       View view;
       ProfileHeadTagUI profileHeadT = ProfileHeadTagUI.class;
       if (PatchProxy.applyVoid(null, this, profileHeadT, "1")) {
          return;
       }
       int i = 0x7f0a3278;
       b tc = this.c;
       int i1 = 0;
       if (tc != null) {
          view = tc.a.findViewById(i);
          if (view == null) {
             c b = tc.b;
             int len = b.length;
             int i2 = 0;
             while (i2 < len) {
                view = b[i2].findViewById(i);
                if (view == null) {
                   i2 = i2 + 1;
                }
             }
          }
       }else {
          view = this.a.findViewById(i);
       }
       if (view != null) {
          a.o(view, "bindView\(R.id.profile_fans_tags\)");
          this.h = view;
          view.setLayoutManager(new ProfileHeadTagUI$doBindView$1$1());
          float f = 10.00f;
          float f1 = (e.a(this.j))? 10.00f: 8.00f;
          if (!e.a(this.j)) {
             f = 8.00f;
          }
          view.addItemDecoration(new f(a1.e(f1), i1));
          view.addItemDecoration(new f(a1.e(f), 1));
          view.setVisibility(8);
          return;
       }else {
          throw new UIException(profileHeadT.getName()+": "+a.a(i, this.b.getResources())+" ²»ÄÜÎª¿Õ");
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, ProfileHeadTagUI.class, "2")) {
          return;
       }
       ProfileHeadTagUI th = this.h;
       if (th == null) {
          a.S("mTagsView");
       }
       th.setVisibility(8);
       return;
    }
    public final void e(TagLabel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeadTagUI.class, "5")) {
          return;
       }
       a.p(p0, "label");
       ProfileHeadTagUI ti = this.i;
       if (ti != null) {
          ti.K0(p0);
       }
       return;
    }
    public final boolean f(){
       Object[] objArray = null;
       ProfileHeadTagUI obj = PatchProxy.apply(objArray, this, ProfileHeadTagUI.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       if (obj == null) {
          return false;
       }
       TagLabel tagLabel = obj.N0((obj.getItemCount() - 1));
       if (tagLabel != null) {
          objArray = tagLabel.mLabelType;
       }
       return a.g(objArray, "add_intimate");
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, ProfileHeadTagUI.class, "4")) {
          return;
       }
       ProfileHeadTagUI ti = this.i;
       int itemCount = (ti != null)? ti.getItemCount(): 0;
       if (!itemCount) {
          return;
       }else {
          ti = this.i;
          if (ti != null && this.f()) {
             ti.S0((ti.getItemCount() - 1));
          }
          return;
       }
    }
    public final void h(List p0,int p1,b p2){
       b this;
       ProfileHeadTagUI profileHeadT = this;
       List list = p0;
       Object obj = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ProfileHeadTagUI.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ProfileHeadTagUI.class, "3")) {
          return;
       }
       a.p(obj, "profileHeadTagContext");
       ProfileHeadTagUI i = profileHeadT.i;
       if (i != null) {
          i.M0();
       }
       String str = "7";
       Object[] objArray = null;
       if (profileHeadT.i == null) {
          Objects.requireNonNull(p2);
          this = PatchProxy.apply(objArray, obj, b.class, str);
          if (this != patchProxyRe) {
          }else {
             this = obj.g;
             if (this == null) {
                a.S("mProfileFragment");
             }
          }
          Object obj1 = this;
          User user = p2.d();
          this = PatchProxy.apply(objArray, obj, b.class, "9");
          if (this != patchProxyRe) {
          }else {
             this = obj.h;
             if (this == null) {
                a.S("mProfileRoleTagInterceptors");
             }
          }
          Object obj2 = this;
          ProfileParam profileParam = p2.c();
          this = PatchProxy.apply(objArray, obj, b.class, "11");
          if (this != patchProxyRe) {
          }else {
             this = obj.i;
             if (this == null) {
                a.S("mBubbleTaskList");
             }
          }
          Object obj3 = this;
          n on = new n(obj1, user, obj2, profileParam, obj3, obj.j);
          profileHeadT.i = i;
       }
       i = profileHeadT.i;
       if (i != null) {
          i.D = p1;
       }
       i = 1;
       int i1 = 0;
       ProfileHeadTagUI profileHeadT1 = (!list || p0.isEmpty())? 1: null;
       String str1 = "mTagsView";
       if (profileHeadT1) {
          i = profileHeadT.h;
          if (i == null) {
             a.S(str1);
          }
          i.setVisibility(8);
       }else {
          profileHeadT1 = profileHeadT.h;
          if (profileHeadT1 == null) {
             a.S(str1);
          }
          profileHeadT1.setAdapter(profileHeadT.i);
          profileHeadT1 = profileHeadT.i;
          if (profileHeadT1 != null) {
             profileHeadT1.W0(list);
          }
          profileHeadT1 = profileHeadT.i;
          if (profileHeadT1 != null) {
             profileHeadT1.k0();
          }
          profileHeadT1 = profileHeadT.h;
          if (profileHeadT1 == null) {
             a.S(str1);
          }
          profileHeadT1.setVisibility(i1);
          User user1 = p2.d();
          if (!PatchProxy.applyVoidOneRefs(user1, profileHeadT, ProfileHeadTagUI.class, str)) {
             ProfileHeadTagUI h = profileHeadT.h;
             if (h == null) {
                a.S(str1);
             }
             ProfileHeadTagUI h1 = profileHeadT.h;
             if (h1 == null) {
                a.S(str1);
             }
             ViewGroup$LayoutParams layoutParams = h1.getLayoutParams();
             if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = objArray;
             }
             if (layoutParams != null) {
                if (!e.a(profileHeadT.j) && profileHeadT.j != 2) {
                   i1 = a1.e(2.00f);
                }else {
                   String text = user1.getText();
                   if (text != null && text.length()) {
                      i = null;
                   }
                   if (i != null && !d3.a(user1)) {
                      i1 = - a1.e(4.00f);
                   }else if(c.j()){
                      i1 = a1.e(5.00f);
                   }
                }
                layoutParams.topMargin = i1;
                objArray = layoutParams;
             }
             h.setLayoutParams(objArray);
          }
       }
       return;
    }
}
