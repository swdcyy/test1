package a2b.k;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import com.yxcorp.gifshow.local.sub.entrance.function.panel.manager.NearbyFunctionPanelProvider;
import a2b.j;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.f;
import t45.d;
import brd.z;
import a2b.i;
import android.view.View;
import android.view.ViewStub;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import bsb.a;
import h2b.a;
import jrb.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import urb.a;
import w1b.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.e0;
import com.google.common.collect.ImmutableMap;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import y1b.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.feedstaggercard.model.CardStyle;

public class k extends PresenterV2 implements NearbyHeaderFunctionEntranceView$a	// class@00002c
{
    public BaseFragment p;
    public NearbyHeaderFunctionEntranceView q;
    public ViewStub r;
    public NearbyFunctionPanelProvider s;
    public d t;
    public CardStyle u;

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.X7(this.s.getDataObservable().subscribe(new j(this)));
       if (HomeCardExperimentUtil.h.a()) {
          this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new i(this)));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a2d85);
       return;
    }
    public void h5(String p0,String p1,int p2,int p3,boolean p4){
       String str1;
       a uoa;
       String str2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       k ok = k.class;
       int i = 4;
       int i1 = 3;
       int i2 = 5;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[i1] = Integer.valueOf(p3);
          objArray[i] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, obj, ok, "7")) {
             return;
          }
       }
       if (!TextUtils.x(p0)) {
          String str = "2";
          i3 obj1 = null;
          if (p3 == 1) {
             str1 = a.c(obj.t.getType());
             uoa = a.class;
             if (!PatchProxy.applyVoidTwoRefs(oobject, str1, obj1, uoa, "3")) {
                str2 = a.a(a.b(oobject, "roamingCityId", str1));
                if (!PatchProxy.applyVoidOneRefs(str2, obj1, uoa, str)) {
                   a.a(str2, obj1);
                }
             }
          }else {
             Activity activity = this.getActivity();
             str1 = (activity instanceof GifshowActivity)? activity.Q2(): obj1;
             a.a(a.b(oobject, "linkUrlParams", a.a().c), str1);
          }
          str2 = String.valueOf((p2 + 1));
          String str3 = String.valueOf(p3);
          k p = obj.p;
          uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray1 = new Object[i2];
             objArray1[0] = str2;
             objArray1[1] = oobject1;
             objArray1[2] = str3;
             objArray1[i1] = p;
             objArray1[i] = Boolean.valueOf(p4);
             if (PatchProxy.applyVoid(objArray1, obj1, uoa, str)) {
             label_010e :
                RxBus.f.b(new a());
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOP_FUNC_ENT_BTN";
          obj1 = i3.f();
          obj1.d("btn_pos", str2);
          obj1.d("btn_style", oobject1);
          obj1.d("btn_type", str3);
          obj1.a("is_up_new", Boolean.valueOf(p4));
          uElementPack.params = obj1.e();
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.type = 1;
          uClickEvent.elementPackage = uElementPack;
          CommonParams uCommonParam = new CommonParams();
          uCommonParam.mEntryTag = a.b(uElementPack, p);
          b.a(0x4b316083).Y("2857482", uClickEvent, null, false, null, uCommonParam, null);
          goto label_010e ;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.s = this.r8("nearby_header_NEARBY_FUNCTION_PANEL_MANAGER");
       this.t = this.r8("local_current_city");
       this.u = this.t8("PAGE_CARD_STYLE");
       return;
    }
    public void r6(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, k.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          String str = null;
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             str = activity.Q2();
          }
          a.a(a.b(p0, "linkUrlParams", a.a().c), str);
          p0 = String.valueOf(p2);
          k tp = this.p;
          if (!PatchProxy.applyVoidFourRefs(p1, p0, p3, tp, null, a.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TOP_FUNC_ENT_BTN_INNER_STATUS";
             i3 oi3 = i3.f();
             oi3.d("btn_style", p1);
             oi3.d("btn_type", p0);
             oi3.d("passive_user_id", p3);
             uElementPack.params = oi3.e();
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.type = 1;
             uClickEvent.elementPackage = uElementPack;
             CommonParams uCommonParam = new CommonParams();
             uCommonParam.mEntryTag = a.b(uElementPack, tp);
             b.a(0x4b316083).Y("4064629", uClickEvent, null, false, null, uCommonParam, null);
          }
          RxBus.f.b(new a());
       }
       return;
    }
}
