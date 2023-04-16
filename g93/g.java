package g93.g;
import n93.a;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardInfo;
import vq5.d;
import f93.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import g93.g$a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardAdapter;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g93.d;
import androidx.recyclerview.widget.RecyclerView$q;
import g93.e;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.widget.TextView;
import java.lang.CharSequence;
import g93.f;
import android.widget.ImageView;
import g93.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class g extends a	// class@002adb
{
    public final LiveBenefitCardInfo j;
    public final d k;
    public final b l;

    public void g(LiveBenefitCardInfo p0,d p1,b p2){
       a.p(p0, "cardInfo");
       a.p(p1, "routerManager");
       a.p(p2, "delegate");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       int i1;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0973);
       View view = this.P2();
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.height = this.V2();
       view.setLayoutParams(layoutParams);
       this.P2().setOnClickListener(new g$a(this));
       g og1 = 1;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          RecyclerView recyclerView = this.A2(R.id.lite_benefit_card_recycler_view);
          LiveLiteBenefitCardAdapter liveLiteBene = new LiveLiteBenefitCardAdapter(this, this.B2());
          LiveBenefitCardInfo mItemList = this.j.mItemList;
          if (mItemList != null) {
             liveLiteBene.O0(mItemList);
          }
          recyclerView.setAdapter(liveLiteBene);
          recyclerView.setLayoutManager(new LinearLayoutManager(this.D2(), og1, i));
          recyclerView.addOnItemTouchListener(new d(this));
          recyclerView.addItemDecoration(new e(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          KwaiImageView kwaiImageVie = this.A2(R.id.lite_benefit_card_left_icon);
          LiveBenefitCardInfo mLeftIcon = this.j.mLeftIcon;
          if (mLeftIcon != null) {
             kwaiImageVie.U(mLeftIcon);
             if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, this, og, "9")) {
                g tj = this.j;
                if (tj.mCardType != og1) {
                   og1 = null;
                }
                mLeftIcon = tj.mIconIsRound;
                if (og1 != null) {
                   i1 = (mLeftIcon != null)? a1.e(40.00f): a1.e(48.00f);
                }else if(mLeftIcon != null){
                   i1 = a1.e(56.00f);
                }else {
                   i1 = a1.e(64.00f);
                }
                int i2 = (mLeftIcon != null)? a1.e(12.00f): a1.e(8.00f);
                a hierarchy = kwaiImageVie.getHierarchy();
                a.o(hierarchy, "iconView.hierarchy");
                RoundingParams roundingPara = new RoundingParams();
                roundingPara.q(mLeftIcon);
                roundingPara.n((float)a1.e(8.00f));
                hierarchy.L(roundingPara);
                ViewGroup$LayoutParams layoutParams1 = kwaiImageVie.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                layoutParams1.width = i1;
                layoutParams1.height = i1;
                layoutParams1.leftMargin = i2;
                kwaiImageVie.setLayoutParams(layoutParams1);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          TextView textView = this.A2(R.id.lite_benefit_card_button);
          textView.setText(this.j.mButtonText);
          textView.setOnClickListener(new f(textView, this));
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "3")) {
          ImageView imageView = this.A2(R.id.lite_benefit_card_close_icon);
          if (this.j.mNeedCloseButton == null) {
             i = 8;
          }
          imageView.setVisibility(i);
          imageView.setOnClickListener(new c(this));
       }
       return;
    }
    public int V2(){
       Object obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.j.mCardType == 1)? a1.e(64.00f): a1.e(80.00f);
       return i;
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       LiveBenefitCardInfo mPanelRouter = this.j.mPanelRouter;
       g og = (mPanelRouter == null || !mPanelRouter.length())? 1: null;
       if (!og && this.k.P0(this.j.mPanelRouter)) {
          this.k.r4(this.j.mPanelRouter, this.D2());
          this.l.a(2);
          this.l.dismiss();
       }
       return;
    }
}
