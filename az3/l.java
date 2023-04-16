package az3.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import az3.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.LinearLayout;
import com.kuaishou.merchant.home2.feed.model.LiveFeed$TagInfo;
import ekd.j;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import ekd.m1;
import android.content.res.Resources;
import java.lang.Integer;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import com.kwai.framework.plugin.PluginManager;

public class l extends PresenterV2	// class@0002e4
{
    public b p;
    public TextView q;
    public TextView r;
    public MerchantKwaiImageView s;
    public MerchantKwaiImageView t;
    public LinearLayout u;
    public LiveFeed$TagInfo v;
    public final b w;

    public void l(){
       super();
       this.w = new l$a(this);
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       b c = this.p.c;
       if (c == null) {
          return;
       }
       this.q.setText(c.mNick);
       if (!q.f(c.mAvatarUrls)) {
          this.s.P(c.mAvatarUrls);
       }
       this.v = c.mTagInfo;
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          l tu = this.u;
          if (tu == null || (this.r != null && this.t != null)) {
             l tv = this.v;
             if (tv == null) {
                tu.setVisibility(8);
             }else if(tv.mTagType == 2){
                if (!PatchProxy.applyVoid(objArray, this, ol, "5")) {
                   ol = this.v;
                   if (ol != null) {
                      if (j.h(ol.mTagIconCdnList)) {
                         this.P8();
                      }else {
                         this.u.setVisibility(0);
                         this.r.setVisibility(8);
                         this.t.setVisibility(0);
                         this.t.setScaleType(ImageView$ScaleType.FIT_XY);
                         this.t.a0(this.v.mTagIconCdnList, this.w);
                      }
                   }
                }
             }else {
                this.P8();
             }
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.u.setVisibility(0);
       this.t.setVisibility(8);
       this.r.setVisibility(0);
       b uob = new b();
       uob.v(TextUtils.J(this.v.backgroundColor, a1.a(R.color.arg_RES_7f062057)));
       uob.g(KwaiRadiusStyles.R4);
       Drawable uDrawable = uob.a();
       this.r.setBackground(uDrawable);
       this.r.setTextColor(TextUtils.J(this.v.mTitleColor, a1.a(R.color.arg_RES_7f062057)));
       this.r.setText(this.v.mTitle);
       this.r.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2dcd);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.avatar);
       this.s = merchantKwai;
       Resources resources = merchantKwai.getResources();
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(resources, Integer.valueOf(0x7f081760), this, ol, "7")) {
          resources.getDrawable(R.drawable.arg_RES_7f081760);
       }
       this.s.setPlaceHolderImage(R.drawable.arg_RES_7f081760);
       this.r = m1.f(p0, 0x7f0a0310);
       this.t = m1.f(p0, 0x7f0a14f0);
       this.u = m1.f(p0, 0x7f0a28e2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       return;
    }
}
