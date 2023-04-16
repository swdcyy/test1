package com.yxcorp.gifshow.prettify.makeup.j;
import com.yxcorp.gifshow.prettify.makeup.j$c;
import nsd.u;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import f1c.d0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.makeup.j$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.makeup.j$b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;

public final class j	// class@001189
{
    public final RecyclerView$r a;
    public final PrettifyConfigView b;
    public final b0 c;
    public final ScrollToCenterRecyclerView d;
    public final d0 e;
    public final BaseFragment f;
    public static final j$c g;

    static {
       j.g = new j$c(null);
    }
    public void j(PrettifyConfigView p0,b0 p1,ScrollToCenterRecyclerView p2,d0 p3,BaseFragment p4){
       a.p(p0, "makeupList");
       a.p(p1, "makeupAdapter");
       a.p(p2, "groupsInfoList");
       a.p(p3, "groupsInfoAdapter");
       a.p(p4, "fragment");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       j$a uoa = new j$a(this);
       this.a = uoa;
       p0.c(uoa);
       p3.g = new j$b(this);
    }
    public final void a(MakeupSuite p0,boolean p1){
       RecoSuiteGroup recoSuiteGro;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "4")) {
          return;
       }
       a.p(p0, "suite");
       if (p0.isEmpty()) {
          if (!p1 || (!PatchProxy.applyVoid(null, this, oj, "2") && (this.e.j.isEmpty() ^ 0x01))) {
             MakeupGroup$a b = this.e.X0(0).b;
             a.o(b, "groupsInfoAdapter.getItem\(0\).mGroupName");
             this.b(this.e.X0(0).a, b);
          }
       label_0051 :
          return;
       }else if(p0.isReco()){
          recoSuiteGro = this.c.k1();
       }
       if (recoSuiteGro != null) {
          if (this.e.Z0() >= 0 && (this.e.Y0().a == recoSuiteGro.getGroupId() && TextUtils.equals(this.e.Y0().b, recoSuiteGro.getGroupName()))) {
             return;
          }else {
             String groupName = recoSuiteGro.getGroupName();
             a.o(groupName, "makeupSuite.groupName");
             this.b(recoSuiteGro.getGroupId(), groupName);
          }
       }
       return;
    }
    public final void b(int p0,String p1){
       boolean b1;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "3")) {
          return;
       }
       oj = this.e;
       Objects.requireNonNull(oj);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       boolean b = false;
       if (PatchProxy.isSupport(uod0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, oj, uod0, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
          label_0039 :
             a.p(p1, "groupName");
             int i = oj.j.size();
             int i1 = 0;
             while (true) {
                if (i1 < i) {
                   MakeupGroup$a uoa = oj.j.get(i1);
                   Objects.requireNonNull(uoa);
                   MakeupGroup$a uoa1 = MakeupGroup$a.class;
                   if (PatchProxy.isSupport(uoa1)) {
                      Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, uoa, uoa1, "1");
                      if (obj1 != patchProxyRe) {
                         b1 = obj1.booleanValue();
                      }else if(uoa.a == p0 && TextUtils.n(uoa.b, p1)){
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                   }else {
                      goto label_006d ;
                   }
                   if (b1) {
                      b = oj.a1(i1, b);
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   Object[] objArray = new Object[b];
                   a.D().s("MakeupGroupNamesAdapter", "This should never happen: No group match "+p0+", "+p1, objArray);
                }
             }
          }
       }else {
          goto label_0039 ;
       }
       if (b) {
          this.d.x(this.e.Z0());
       }
       return;
    }
}
