package a2b.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a2b.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import tw5.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import a2b.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import a2b.d;
import io.reactivex.internal.functions.Functions;
import irb.b;
import a2b.e;
import y1b.a;
import a2b.a;
import a2b.c;
import a2b.b;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.yxcorp.gifshow.local.sub.entrance.function.model.FunctionCardResponse;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import java.util.Collection;
import ekd.q;
import v1b.a;
import bsb.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uh5.e;
import o56.c;
import o56.a;
import xf6.i;
import cjd.e;
import erd.o;
import a2b.g;
import mrd.a;
import com.yxcorp.gifshow.local.sub.entrance.function.panel.manager.NearbyFunctionPanelProvider;
import qvb.n0;
import com.kwai.feature.api.social.nearby.LocalDelegateType;

public class h extends PresenterV2	// class@000029
{
    public n0 p;
    public BaseFragment q;
    public d r;
    public NearbyFunctionPanelProvider s;
    public CityInfo t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public LocalDelegateType z;

    public void h(){
       super();
       this.U7(new k());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       CityInfo uCityInfo = this.r.d();
       this.t = uCityInfo;
       if (this.w == null) {
          this.v = true;
          this.P8(uCityInfo);
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new f(this)));
       this.y = this.q.Vg().c();
       this.X7(this.q.Vg().j().subscribe(new d(this), Functions.d()));
       this.X7(f.g(b.class, mAIN).subscribe(new e(this)));
       this.X7(f.g(a.class, mAIN).subscribe(new a(this)));
       this.X7(this.q.Vg().l().subscribe(new c(this), Functions.d()));
       this.X7(this.r.a().distinctUntilChanged().subscribe(new b(this), Functions.e));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, h.class, "4");
    }
    public final void P8(CityInfo p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "6")) {
          return;
       }
       Object[] objArray = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, oh, "7")) {
          FunctionCardResponse uFunctionCar = b.a(0x5f2ddeb4).g("nearby_topcard_cache", FunctionCardResponse.class);
          if (uFunctionCar != null) {
             FunctionCardResponse mNearbyTopCa = uFunctionCar.mNearbyTopCards;
             if (mNearbyTopCa != null) {
                Iterator iterator = mNearbyTopCa.iterator();
                while (iterator.hasNext()) {
                   HeaderFunctionCard headerFuncti = iterator.next();
                   headerFuncti.mIsFromCache = b;
                   if (!q.f(headerFuncti.mCards)) {
                      Iterator iterator1 = headerFuncti.mCards.iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().mIsFromCache = b;
                      }
                   }
                }
             }
             this.R8(uFunctionCar);
          }
       }
       a uoa = b.a(0x70f21769);
       String str = a.d(p0);
       Object obj = PatchProxy.apply(objArray, this, oh, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          e.f();
          if (a.a().c()) {
             int i = i.g("KEY_NEARBY_TAB_MODE");
             if (i == 2 || i == 3) {
             label_009c :
                this.X7(uoa.a(str, b, 3).map(new e()).subscribe(new g(this), Functions.e));
                return;
             }
          }
          b = false;
          goto label_009c ;
       }
    }
    public final void R8(FunctionCardResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       if (q.f(p0.mNearbyTopCards)) {
          this.s.getDataObservable().onNext(new FunctionCardResponse());
       }else {
          this.s.getDataObservable().onNext(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("local_current_city");
       this.p = this.t8("PAGE_LIST");
       this.s = this.r8("nearby_header_NEARBY_FUNCTION_PANEL_MANAGER");
       this.z = this.s8(LocalDelegateType.class);
       return;
    }
}
