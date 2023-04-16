package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import q64.a0;
import erd.g;
import crd.b;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.EditText;
import android.text.TextWatcher;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import q64.v;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.p;
import q64.w;
import com.yxcorp.utility.TextUtils;
import android.text.Editable;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$d;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$a;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import fg6.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.google.gson.Gson;
import y04.d;
import y04.c;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.StringBuilder;
import cjd.e;
import erd.o;
import q64.b0;
import q64.z;
import java.io.File;
import okhttp3.MultipartBody$Part;
import ojd.e;
import q64.x;
import q64.y;
import android.view.View;
import ekd.m1;
import n64.d0;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$c;
import n64.i;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.Long;

public class q extends PresenterV2	// class@001a8a
{
    public EditText A;
    public EditText B;
    public EditText C;
    public TextView D;
    public long E;
    public TextView F;
    public ProgressFragment G;
    public TextWatcher H;
    public LiveMerchantBaseContext p;
    public i q;
    public LiveAnchorStartSandeagoFragment r;
    public SandeagoPublish s;
    public PublishSubject t;
    public PublishSubject u;
    public SandeagoPublish v;
    public PublishSubject w;
    public n$b x;
    public PublishSubject y;
    public TextView z;

    public void q(){
       super();
       this.H = new q$a(this);
    }
    public void E8(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "3")) {
          return;
       }
       this.X7(this.u.hide().subscribe(new a0(this)));
       if (!PatchProxy.applyVoid(objArray, this, oq, "4")) {
          oq = this.v;
          if (oq != null) {
             this.D.setText(oq.mTitle);
             this.A.setText(this.v.mPriceText);
             this.B.setText(this.v.mStockText);
             this.C.setText(this.v.mSkuCode);
          }
       }
       this.D.addTextChangedListener(this.H);
       this.A.addTextChangedListener(this.H);
       this.B.addTextChangedListener(this.H);
       this.X7(this.s.observable().subscribe(new v(this), p.b));
       this.X7(this.w.subscribe(new w(this)));
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       q tz = this.z;
       boolean b = (this.s.isSelectCategory() && (!TextUtils.x((this.D.getText().toString()).trim()) && (!TextUtils.x((this.A.getText().toString()).trim()) && (!TextUtils.x((this.B.getText().toString()).trim()) && (!this.s.isMultiSkuEmpty() && this.s.isPropertyFilledOrNoProperty())))))? true: false;
       tz.setSelected(b);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, q.class, "10")) {
          return;
       }
       this.x.a(new q$d(this));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, q.class, "12")) {
          return;
       }
       q tG = this.G;
       if (tG != null) {
          tG.dismiss();
       }
       return;
    }
    public void V8(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, q.class, "11")) {
          return;
       }
       q s = obj.s;
       boolean b = (s.mPointerUser != null)? true: false;
       String str = (s.mFilledProperties != null)? a.a.q(new ArrayList(obj.s.mFilledProperties.values())): "";
       String str1 = str;
       d uod = c.a();
       String liveStreamId = obj.p.getLiveStreamId();
       s = obj.s;
       SandeagoPublish mImageId = s.mImageId;
       SandeagoPublish mImageUrl = s.mImageUrl;
       SandeagoPublish mTitle = (TextUtils.x(s.mTitlePrefix))? obj.s.mTitle: obj.s.mTitlePrefix+obj.s.mTitle;
       s = obj.s;
       int pointerMode = s.getPointerMode();
       s = obj.s;
       q oq = this;
       oq.X7(uod.l(liveStreamId, mImageId, mImageUrl, mTitle, s.mPriceCent, s.mStock, s.mSkuCode, pointerMode, obj.s.getPointerUserId(), obj.s.getCategoryId(), obj.s.getMultiSkuList(), s.mAuditId, str1, a.a.q(s.mServiceMap)).map(new e()).subscribe(new b0(oq, b), new z(oq)));
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, q.class, "9")) {
          return;
       }
       this.X7(c.a().a(this.p.getLiveStreamId(), e.d("image", this.s.mImageFile)).map(new e()).subscribe(new x(this), new y(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a4285);
       this.B = m1.f(p0, 0x7f0a0d9a);
       this.A = m1.f(p0, 0x7f0a0d98);
       this.C = m1.f(p0, 0x7f0a0d96);
       this.D = m1.f(p0, 0x7f0a0d97);
       this.F = m1.f(p0, 0x7f0a3440);
       d0.a(m1.f(p0, R.id.tv_start_sandeago_category_title));
       d0.a(m1.f(p0, R.id.tv_start_sandeago_name));
       d0.a(m1.f(p0, R.id.tv_start_sandeago_price_title));
       d0.a(m1.f(p0, R.id.tv_start_sandeago_stock_title));
       m1.b(p0, new q$b(this), R.id.tv_start_sandeabiz_sell);
       m1.b(p0, new q$c(this), R.id.tv_start_sandeabiz_cancel);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASE_CONTEXT");
       this.q = this.r8("SANDEABIZ_START_DELEGATE");
       this.r = this.r8("SANDEABIZ_START_FRAGMENT");
       this.s = this.r8("SANDEABIZ_PUBLISH");
       this.t = this.r8("SANDEAGO_CATEGORY_SUGGEST_SUBJECT");
       this.v = this.t8("SANDEABIZ_STORE_PUBLISH");
       this.w = this.r8("SANDEAGO_SKU_EDIT_TEXT_CHANGED_SUBJECT");
       this.x = this.r8("SANDEAGO_PRE_AUDIT_SERVICE");
       this.y = this.r8("SANDEAGO_AUDIT_FAIL_SUBJECT");
       this.u = this.r8("SANDEAGO_TITLE_SUBJECT");
       this.E = this.r8("SANDEAGO_ENTER_TIME").longValue();
       return;
    }
}
