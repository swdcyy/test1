package cb5.o;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import jsa.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import tkd.b;
import tkd.d;
import hn5.i;

public final class o implements g	// class@000452
{
    public final e b;

    public void o(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "17")) {
       }else {
          Log.g("HomeItemPresenter", "HomeLoadDataEvent:"+p0.a()+" tab:"+p0.b());
          int i = p0.a();
          boolean b = true;
          if (i != b) {
             if (i != 2) {
                if (i == 3) {
                   tb.v.f(RefreshType.FOREGROUND);
                }
             }else {
                Log.b("feed_request_tag", tb.q.getClass().getSimpleName()+" 收到实时tab结束通知");
                int i1 = p0.b();
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), tb, uoe, "18")) {
                   Object obj = PatchProxy.apply(null, tb, uoe, "19");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else if(tb.q.Vg().c() && tb.q.q().isEmpty()){
                      b = false;
                   }
                   if (!b) {
                      Log.b("feed_request_tag", tb.q.getClass().getSimpleName()+"not need refresh。 不刷新tab");
                   }else {
                      int i2 = 0x3b210bc9;
                      if (!i1 || i1 == tb.w) {
                         Log.b("feed_request_tag", tb.q.getClass().getSimpleName()+"实时tab无效，或者为当前页面，刷新tab");
                         if (tb.w == 3) {
                            d.a(i2).Iw(tb.q, "processFeedTab_A");
                         }
                         tb.v.f(RefreshType.INIT);
                      }else if(tb.q.Vg().c() && tb.q.q().isEmpty()){
                         if (tb.w == 3) {
                            d.a(i2).Iw(tb.q, "processFeedTab_B");
                         }
                         tb.v.f(RefreshType.INIT);
                         Log.b("feed_request_tag", tb.q.getClass().getSimpleName()+"页面被选中，并且没有加载成功数据，刷新tab");
                      }else {
                         Log.b("feed_request_tag", tb.q.getClass().getSimpleName()+"不做刷新处理");
                      }
                   }
                }
             }
          }else {
             tb.v.f(RefreshType.PM_PUSH);
          }
       }
       return;
    }
}
