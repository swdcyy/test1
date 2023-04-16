package fw8.a$a;
import zr6.b;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rn5.a;
import tkd.b;
import tkd.d;
import hn5.d;
import zr6.j;
import wq6.h;
import sn5.a;
import zq6.p;
import wn5.b;
import bo5.a;
import gsa.e0;
import ro5.b;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import un5.b;
import java.lang.Boolean;
import fw8.d;
import java.lang.Float;
import pn5.a;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import isa.a;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import hsa.f;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import zr6.e;
import com.yxcorp.gifshow.activity.f;
import wq6.d;
import zr6.g;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import isa.b;
import com.kwai.framework.model.kcube.TabViewInfo;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import ro5.a;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import android.content.Context;
import zq6.r;

public class a$a extends b	// class@002356
{

    public void a$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "4")) {
          return;
       }
       p1.b(a.b, d.a(-683509148).P4(p2, this.b));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.s, uob);
       p1.b(a.n, uob);
       p1.b(a.e, b.a(this.b, p2));
       p1.b(a.r, TopTabViewType.OPRATION);
       p1.b(b.a, Boolean.FALSE);
       if (d.a(this.b.q("KEY_OPERATE_BOTTOM_ALPHA").booleanValue())) {
          p1.b(a.c, Float.valueOf(0));
       }
       p1.b(a.a, this.b.q("KEY_X_BLOCK_TAB_BACKGROUND"));
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       String str = "1";
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, str);
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a uoa = this.b.q("KEY_OPERATE_TAB_CONFIG");
       OperateLazyLoadFragmentContainerNew operateLazyL = new OperateLazyLoadFragmentContainerNew();
       if (!PatchProxy.applyVoidOneRefs(uoa, operateLazyL, OperateLazyLoadFragmentContainerNew.class, str)) {
          operateLazyL.u = uoa;
          Object[] objArray = new Object[0];
          b.C().w("OperateLazyLoadFragmentContainer", "setActivityConfig "+uoa.m(), objArray);
       }
       return operateLazyL;
    }
    public e d(h p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new f();
    }
    public void e(d p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "3")) {
          return;
       }
       super.e(p0, p1);
       p1 = p1.f();
       if (p1 instanceof DynamicTabConfig) {
          this.b.r("KEY_DYNAMIC_TAB_CONFIG", p1);
          f uof = new f(p1);
          this.b.r("KEY_OPERATE_TAB_CONFIG", uof);
          b uob = uof.e();
          ActionBarSkinConfig uActionBarSk = null;
          TabViewInfo tabViewInfo = (uob != null)? uob.c(): uActionBarSk;
          if (uob != null) {
             uActionBarSk = uob.d();
          }
          if (uActionBarSk == null) {
             uActionBarSk = new ActionBarSkinConfig();
          }
          j tb = this.b;
          TabViewInfo tabViewInfo1 = (tabViewInfo != null)? tabViewInfo: new TabViewInfo();
          tb.r("KEY_TAB_VIEW_INFO", tabViewInfo1);
          this.b.r("KEY_TAB_ACTION_SKIN", uActionBarSk);
          if (tabViewInfo != null && tabViewInfo.mTabIcon != null) {
             a.s(p0, tabViewInfo);
          }else {
             a.j(p0);
          }
          if (tabViewInfo != null) {
             TabViewInfo mTabLottie = tabViewInfo.mTabLottie;
             if (mTabLottie != null) {
                a.r(p0, mTabLottie);
             label_0076 :
                Context uContext = this.a("HOME_CONTEXT");
                p0.e0().a(a.d, uActionBarSk);
                b uob1 = new b(p1.mTabName);
                p0.e0().a(a.s, uob1);
                p0.e0().a(a.n, uob1);
                p0.e0().a(a.a, Integer.valueOf(uof.j()));
                if (uContext instanceof FragmentActivity) {
                   p0.e0().a(a.e, b.a(this.b, uContext));
                }
                if (d.b()) {
                   r or = p0.e0();
                   p c = a.c;
                   float f = (uof.k())? 0: 0x3f800000;
                   or.a(c, Float.valueOf(f));
                }
             }
          }
          a.i(p0);
          goto label_0076 ;
       }
       return;
    }
}
