package eta.i;
import zr6.e;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.HashMap;
import eta.i$a;
import eta.i$b;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import wq6.h;
import wq6.f;
import yq6.e;
import qn5.a;
import yq6.a;
import xq6.b;
import eta.h;
import tra.b;
import q87.c;
import brd.t;
import com.kwai.framework.init.e;
import t45.d;
import brd.z;
import eta.d;
import java.lang.Runnable;
import erd.g;
import crd.b;
import lnc.b9;
import wq6.c;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import zq6.b;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import bo5.a;
import zq6.p;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import com.yxcorp.gifshow.model.FollowTabNotify;
import yn5.a;
import wa5.e;
import com.kwai.kcube.KCubeContainerFragment;
import pr6.d;
import sn5.e;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import eta.b;
import io.reactivex.g;
import eta.g;
import erd.r;
import eta.f;
import erd.o;
import gha.j;
import eta.e;
import eta.c;
import java.util.List;
import java.util.Iterator;
import co5.n;
import co5.m;
import co5.j;
import zq6.r;
import rn5.a;
import sn5.g;
import java.lang.StringBuilder;
import java.util.Set;
import eta.a;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import xq6.a;
import gta.a;
import eta.i$c;
import zq6.i;
import zq6.s;

public class i extends e	// class@0027e4
{
    public final Map e;
    public final c f;
    public int g;
    public FollowTabNotify h;
    public b i;
    public b j;
    public final d k;
    public b l;
    public static final boolean m;

    static {
       i.m = a.t().d("useOldHomeFragmentNullCase", false);
    }
    public void i(){
       super();
       this.e = new HashMap();
       this.f = new i$a(this);
       this.g = 0;
       this.k = new i$b(this);
    }
    public static boolean o(Bitmap p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && !p0.isRecycled()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void f(Fragment p0){
    }
    public void g(Fragment p0){
    }
    public void h(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.l = p0.c0().a(a.b, this.k);
          Object[] objArray = new Object[0];
          b.C().w("HomeTabLifecycleAwareness", "enableTabViewWatchDelay, watch after launch finish", objArray);
          this.j = e.b().observeOn(d.a).subscribe(new d(new h(this, p0)));
       }
       return;
    }
    public void i(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
       }else {
          b9.a(this.j);
          b9.a(this.i);
          p0.w(this.f);
          this.l.release();
       }
       return;
    }
    public final Map p(int p0,String p1){
       String str;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             str = (p0 != 3)? "": "FOLLOW";
          }else {
             str = "LOCAL";
          }
       }else {
          str = "OTHER";
       }
       return ImmutableMap.of("home_source", str, "red_point_info", TextUtils.I(p1));
    }
    public void q(){
       int i;
       boolean b;
       int b2;
       TabIdentifier tabIdentifie;
       n on;
       m om;
       j oj;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       b uob = this.n().y();
       h oh = this.n().G(b.c);
       i = 1;
       b = false;
       if (oh != null && uob.e(oh, a.r) == TopTabViewType.NORMAL_WITH_AVATAR) {
          FollowTabNotify uFollowTabNo = uob.e(oh, a.L);
          if (uFollowTabNo != null && uFollowTabNo != a.a) {
             if (!PatchProxy.applyVoidOneRefs(uFollowTabNo, this, oi, "6") && uFollowTabNo != this.h) {
                this.h = uFollowTabNo;
                boolean b1 = e.b();
                b2 = (uFollowTabNo.isSingleAvatarDynamic() || uFollowTabNo.isMultiAvatarDynamic())? true: false;
                Map map = this.p(3, uFollowTabNo.toString());
                KCubeContainerFragment kCubeContain = this.e();
                if (kCubeContain == null || !kCubeContain.Zg().K0()) {
                   this.g = 3;
                   this.s(e.d());
                   if (!b1) {
                      this.s(e.b(map));
                   }else {
                      FollowTabNotify obj = PatchProxy.applyOneRefs(uFollowTabNo, this, oi, "7");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         obj = uFollowTabNo.mUserInfo;
                         if (obj != null && !TextUtils.x(obj.mHeadUrl)) {
                            b = true;
                         }
                      }
                      if (b) {
                         this.s(e.a(objArray, b2, map));
                         this.i = t.create(new b(this, uFollowTabNo)).observeOn(d.c).filter(g.b).map(f.b).filter(g.b).map(j.b).filter(g.b).map(e.b).observeOn(d.a).subscribe(new c(this, b2, map));
                      }else {
                         FollowTabNotify obj1 = PatchProxy.applyOneRefs(uFollowTabNo, this, oi, "8");
                         boolean b3 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): uFollowTabNo.isValidMultiUser();
                         if (b3) {
                            obj1 = uFollowTabNo.mMultiIconStyle;
                            if (obj1 == 2) {
                               this.s(e.g(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }else if(obj1 == null || obj1 == i){
                               this.s(e.j(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }else if(obj1 == 3){
                               this.s(e.h(uFollowTabNo.getMultiUserAvatarUrls(), map));
                            }
                         }else {
                            this.s(e.b(map));
                         }
                      }
                   }
                }
             }
          label_014b :
             return;
          }
       }
       Iterator iterator = this.n().getChildren().iterator();
       Object[] objArray1 = objArray;
       Object[] objArray2 = objArray1;
       Object[] objArray3 = objArray2;
       b2 = 0;
       while (iterator.hasNext()) {
          h oh1 = iterator.next();
          if (b.c.equals(oh1.M2())) {
             tabIdentifie = 3;
          }else if(b.d.equals(oh1.M2())){
             continue ;
          }else {
             tabIdentifie = 1;
          }
          if (tabIdentifie <= b2) {
             continue ;
          }else {
             on = uob.e(oh1, a.y);
             om = uob.e(oh1, a.z);
             oj = uob.e(oh1, a.A);
             if (on == null || (on.a == null && (om == null || (om.a == null && (oj == null || oj.a == null))))) {
                continue ;
             }
          }
          objArray3 = oj;
          TabIdentifier tabIdentifie1 = tabIdentifie;
          objArray1 = on;
          objArray2 = om;
       }
       if (objArray1 != null && !TextUtils.x(objArray1.b)) {
          objArray = objArray1.b;
       }else if(objArray2 != null && !TextUtils.x(objArray2.d)){
          objArray = objArray2.d;
       }else if(objArray3 != null && !TextUtils.x(objArray3.c)){
          objArray = objArray3.c;
       }
       r or = this.n().e0();
       KCubeContainerFragment kCubeContain1 = this.e();
       if (i.m) {
          if (kCubeContain1 != null && (b2 == null || kCubeContain1.Zg().K0())) {
          label_0202 :
             i = 0;
          }
       }else if(b2 != null && (kCubeContain1 == null || !kCubeContain1.Zg().K0())){
       }
       if (i) {
          this.g = b2;
          or.a(a.i, e.b(this.p(b2, objArray)));
          objArray = new Object[b];
          b.C().w("HomeTabLifecycleAwareness", "BottomTabBadge.dot: ", objArray);
       }else {
          or.a(a.i, e.d());
          or.a(a.k, g.a());
       }
       return;
    }
    public void r(){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "3")) {
          return;
       }
       f uof = this.n();
       Object[] objArray = new Object[0];
       b.C().w("HomeTabLifecycleAwareness", "initTabViewControll of tabList:"+uof.getChildren(), objArray);
       ArrayList uArrayList = Lists.c(y.h(this.e.keySet(), new a(uof)));
       Object[] objArray1 = new Object[0];
       b.C().w("HomeTabLifecycleAwareness", "initTabViewControll release watcher of unuseTabs:"+uArrayList, objArray1);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          a uoa = this.e.remove(iterator.next());
          if (!PatchProxy.applyVoidOneRefs(uoa, this, oi, "13") && (uoa != null && !uoa.b())) {
             uoa.c();
          }
       }
       b uob = uof.y();
       i = 0;
       while (i < uof.h()) {
          h oh = uof.U(i);
          if (!b.d.equals(oh.M2())) {
             a uoa1 = this.e.get(oh);
             if (uoa1 != null && !uoa1.b()) {
                objArray1 = new Object[0];
                b.C().w("HomeTabLifecycleAwareness", "initTabViewControll reuse watcher of tab:"+oh, objArray1);
             }else {
                uoa1 = new a();
                this.e.put(oh, uoa1);
                Object[] objArray2 = new Object[0];
                b.C().w("HomeTabLifecycleAwareness", "initTabViewControll create watcher of tab:"+oh, objArray2);
                ArrayList uArrayList1 = new ArrayList();
                uArrayList1.add(a.y);
                uArrayList1.add(a.z);
                uArrayList1.add(a.A);
                if (a.a(this.n(), oh) == TopTabViewType.NORMAL_WITH_AVATAR) {
                   uArrayList1.add(a.G);
                   uArrayList1.add(a.I);
                   uArrayList1.add(a.J);
                   uArrayList1.add(a.K);
                   uArrayList1.add(a.L);
                }
                uoa1.a(uob.c(oh, uArrayList1, new i$c(this)));
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void s(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       this.n().e0().a(a.i, p0);
       return;
    }
}
