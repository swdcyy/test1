package gf4.a;
import id4.a;
import com.kuaishou.merchant.transaction.detail.detailv2.base.cardstyle.b;
import hd4.d;
import com.kuaishou.bowl.core.component.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import nh4.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import androidx.fragment.app.Fragment;
import gd4.c;
import id4.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import com.kuaishou.merchant.transaction.detail.self.dynamic.model.DetailCommonData;
import com.kwai.robust.PatchProxyResult;
import mf4.a;
import ei4.k;
import xf4.a;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.c;
import java.util.Iterator;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import lf4.h;
import yg4.i;

public abstract class a extends a	// class@002a0b
{
    public final String f;

    public void a(){
       super(new b());
       this.f = "BaseDetailComponent";
    }
    public void a(d p0){
       super(p0);
       this.f = "BaseDetailComponent";
    }
    public final void o(a p0,View p1,int p2){
       l1 this;
       String str;
       Object[] objArray1;
       l1 a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "2")) {
          return;
       }
       a curActivity = p0.curActivity;
       if (curActivity != null) {
          FragmentActivity uFragmentAct = curActivity.get();
          if (uFragmentAct != null) {
             a tag = this.b(p1).getTag(R.id.item_view_bind_data);
             this = null;
             if (!tag instanceof a) {
                tag = this;
             }
             l1 ol1 = (this.z())? tag: this;
             if (ol1 == null) {
                ol1 = this.w(p0, p0.getModelObj(), tag);
             }
             if (ol1 == null) {
                ol1 = this.v(p0, p0.getModelObj());
             }
             boolean b = false;
             if (this.y() && ol1 == null) {
                MerchantTransactionLogBiz dETAIL_V2 = MerchantTransactionLogBiz.DETAIL_V2;
                str = "componentName=["+p0.getComponentName()+"] data=null? [";
                if (p0.getModelObj() == null) {
                   b = true;
                }
                a.A(dETAIL_V2, "onBindViewInternal", str+b+"]");
                return;
             }else {
                Fragment uFragment = this.l(uFragmentAct);
                if (uFragment != null) {
                   this.t(p0, uFragment);
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),uFragment,ol1};
                      if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
                      label_00bd :
                         View view = this.b(p1);
                         view.setTag(R.id.item_view_position, Integer.valueOf(p2));
                         c uoc = b.a(p1);
                         if (uoc == null) {
                            a.A(MerchantTransactionLogBiz.DETAIL_V2, this.f, "holder null on bindingView");
                         }
                         if (ol1 != null) {
                            ol1.b = b;
                            view.setTag(R.id.item_view_bind_data, ol1);
                            if (uoc != null) {
                               PresenterV2 presenterV2 = uoc.a();
                               if (presenterV2 != null) {
                                  objArray1 = new Object[]{ol1};
                                  presenterV2.i(objArray1);
                                  this = l1.a;
                               }
                            }
                            if (this == null) {
                            label_00f5 :
                               str = p0.getModelObj();
                               if (str == null) {
                                  str = "";
                               }
                               if (uoc != null) {
                                  PresenterV2 presenterV21 = uoc.a();
                                  if (presenterV21 != null) {
                                     objArray1 = new Object[]{str};
                                     presenterV21.i(objArray1);
                                     a = l1.a;
                                  }
                               }
                            }
                         }else {
                            goto label_00f5 ;
                         }
                      }
                   }else {
                      goto label_00bd ;
                   }
                   this.s(p0, uFragment);
                }
             }
          }
       }
       return;
    }
    public void r(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       this.x(p0);
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
    public void s(a p0,Fragment p1){
    }
    public void t(a p0,Fragment p1){
    }
    public final DetailCommonData u(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0);
    }
    public a v(a p0,Object p1){
       return null;
    }
    public a w(a p0,Object p1,a p2){
       return null;
    }
    public final void x(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "5")) {
          return;
       }
       if (p0 instanceof k) {
          p0.w = true;
       }else if(p0 instanceof a){
          p0.s = true;
       }
       if (!p0.p8()) {
          PatchProxy.onMethodExit(a.class, "5");
          return;
       }else {
          Iterator iterator = c.a(p0).iterator();
          while (iterator.hasNext()) {
             this.x(c.b(iterator.next()));
          }
          PatchProxy.onMethodExit(a.class, "5");
          return;
       }
    }
    public boolean y(){
       return this instanceof h;
    }
    public boolean z(){
       return this instanceof i;
    }
}
