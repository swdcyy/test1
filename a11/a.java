package a11.a;
import android.app.Activity;
import t02.a0;
import com.kuaishou.live.common.core.basic.fragment.LiveBaseFragment;
import ul2.s;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import a11.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModelProvider;
import a11.b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProviders;
import a11.m;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import android.content.Context;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.ImageView;
import android.view.ViewParent;
import android.widget.TextView;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import d61.y;
import a11.l;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import a11.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import a11.f;
import a11.g;
import a11.i;
import a11.c;
import a11.d;
import a11.h;
import a11.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$b;
import a11.k;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import java.lang.StringBuilder;
import android.text.style.ForegroundColorSpan;

public class a	// class@00001a
{
    public MutableLiveData a;
    public MutableLiveData b;
    public MutableLiveData c;
    public MutableLiveData d;
    public MutableLiveData e;
    public MutableLiveData f;
    public final Activity g;
    public final a0 h;
    public final LiveBaseFragment i;
    public final s j;
    public int k;
    public boolean l;
    public final n m;
    public final ViewModelProvider n;
    public final m o;
    public final LiveAudienceGiftBoxVipGradeBarView p;
    public final l q;

    public void a(Activity p0,a0 p1,LiveBaseFragment p2,s p3,ViewGroup p4){
       l a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       super();
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       Integer integer = Integer.valueOf(0);
       this.d = new MutableLiveData(integer);
       this.e = new MutableLiveData(integer);
       this.f = new MutableLiveData(null);
       this.k = 0;
       this.l = false;
       this.m = new a$a(this);
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       ViewModelProvider viewModelPro = PatchProxy.apply(null, this, uoa, "8");
       if (viewModelPro != patchProxyRe) {
       }else {
          viewModelPro = ViewModelProviders.of(p2, new b(this));
       }
       this.n = viewModelPro;
       m om = viewModelPro.get(m.class);
       this.o = om;
       LiveAudienceGiftBoxVipGradeBarView liveAudience = PatchProxy.applyOneRefs(p4, this, uoa, "9");
       if (liveAudience != patchProxyRe) {
       }else {
          liveAudience = new LiveAudienceGiftBoxVipGradeBarView(p4.getContext());
          if (!PatchProxy.applyVoid(null, liveAudience, LiveAudienceGiftBoxVipGradeBarView.class, "6")) {
             b.Z(LiveLogTag.LIVE_VIP_GRADE, "setNewStyle");
             liveAudience.g.setVisibility(4);
             liveAudience.h.setVisibility(4);
             liveAudience.f.getParent().removeView(liveAudience.f);
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, a1.e(18.00f));
             layoutParams.leftMargin = a1.e(16.00f);
             layoutParams.topMargin = a1.e(15.00f);
             liveAudience.f.setIncludeFontPadding(0);
             liveAudience.c.addView(liveAudience.f, layoutParams);
             layoutParams = liveAudience.j.getLayoutParams();
             layoutParams.rightMargin = a1.e(32.00f);
             layoutParams.addRule(0, R.id.live_user_right_center_text_view);
             layoutParams.addRule(1, R.id.live_vip_grade_level_icon_text_view);
          }
          p4.addView(liveAudience);
          liveAudience.setIsLandscape(y.d(p0));
       }
       this.p = liveAudience;
       l ol = new l(liveAudience, p2);
       this.q = ol;
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoidOneRefs(om, ol, l.class, "1")) {
          ol.c = om;
          om.f.observe(ol.b, new e(ol));
          om.b.observe(ol.b, new f(ol));
          om.c.observe(ol.b, new g(ol));
          a = ol.a;
          Objects.requireNonNull(a);
          om.g.observe(ol.b, new i(a));
          om.h.observe(ol.b, new c(ol));
          om.i.observe(ol.b, new d(ol));
          a = ol.a;
          Objects.requireNonNull(a);
          om.j.observe(ol.b, new h(a));
          ol.a.setVipGradeOnClickListener(new j(ol, om));
          ol.a.setLiveUserRightsOnClickListener(new k(ol, om));
       }
       return;
    }
    public void a(GiftPanelItem p0,int p1){
       long l;
       String str;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "11")) {
          int i = 0;
          Gift mId = (p0 != null && p0.getGift() != null)? p0.getGift().mId: null;
          int i1 = 0;
          if (p0 != null) {
             GiftPanelItem mLiveVipGrad = p0.mLiveVipGradeScore;
             if (mLiveVipGrad - i1 > 0 && p1 > 0) {
                l = mLiveVipGrad * (long)p1;
             label_004b :
                this.e.setValue(Integer.valueOf((int)l));
                if (this.k != mId) {
                   b.c0(LiveLogTag.LIVE_VIP_GRADE, "C-updatePredictedInfo | Tip", "predictedScore", Long.valueOf(l));
                   a tf = this.f;
                   if (PatchProxy.isSupport(uoa)) {
                      str = PatchProxy.applyOneRefs(Long.valueOf(l), this, uoa, "6");
                      if (str != PatchProxyResult.class) {
                      }else if(l - i1 <= 0){
                         str = "";
                      }else {
                         str = new SpannableStringBuilder();
                         str.append(a1.m().getString(R.string.arg_RES_7f102d70));
                         str.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0613e2)), i, str.length(), 33);
                         str.append(" +"+l+a1.m().getString(R.string.arg_RES_7f102d71));
                         str.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0604ba)), str.length(), str.length(), 33);
                      }
                   }else {
                      goto label_007f ;
                   }
                   tf.setValue(str);
                }
                this.k = mId;
             }
          }
          l = i1;
          goto label_004b ;
       }
       return;
    }
}
