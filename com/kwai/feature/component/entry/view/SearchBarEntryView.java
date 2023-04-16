package com.kwai.feature.component.entry.view.SearchBarEntryView;
import qy5.c;
import android.widget.LinearLayout;
import android.content.Context;
import com.kwai.feature.component.entry.view.SearchBarEntryView$a;
import com.kwai.feature.component.entry.view.SearchBarEntryView$b;
import android.util.AttributeSet;
import qy5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.kwai.feature.component.entry.a;
import oy5.e;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import uy5.b;
import com.kwai.feature.component.entry.SearchEntryParams;
import oy5.b;
import oy5.i;
import vy5.b;
import com.kwai.feature.component.model.SearchHotWordItemExt;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import sy5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import vy5.a;
import com.google.gson.JsonObject;
import oy5.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import oy5.e$a;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import wkd.b;
import com.kwai.feature.component.entry.SearchEntryActionRecorder;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import oy5.d;

public class SearchBarEntryView extends LinearLayout implements c	// class@001214
{
    public LinearLayout b;
    public ImageView c;
    public TextView d;
    public KwaiImageView e;
    public SelectShapeTextView f;
    public e g;
    public b h;
    public d i;
    public a j;
    public final m k;
    public final m l;

    public void SearchBarEntryView(Context p0){
       super(p0);
       this.k = new SearchBarEntryView$a(this);
       this.l = new SearchBarEntryView$b(this);
       this.g(p0);
    }
    public void SearchBarEntryView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = new SearchBarEntryView$a(this);
       this.l = new SearchBarEntryView$b(this);
       this.g(p0);
    }
    public void SearchBarEntryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = new SearchBarEntryView$a(this);
       this.l = new SearchBarEntryView$b(this);
       this.g(p0);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView.class, "11")) {
          return;
       }
       a.a(p0, this.b, this.c, this.d, this.e, this.f);
       return;
    }
    public e d(int p0,int p1){
       SearchBarEntryView obj;
       SearchEntryParams mEntrySource;
       boolean b;
       i a;
       FeedLogCtx feedLogCtx;
       if (PatchProxy.isSupport(SearchBarEntryView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchBarEntryView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.h;
       e uoe = null;
       String str = " action:";
       String str1 = "SearchBarEntryView";
       if (obj == null) {
          b.c(str1, "buildEntryContext, mISearchActionCallback is null, location:"+p0+str+p1);
          return uoe;
       }else {
          SearchEntryParams searchEntryP = obj.a(p0);
          i oi = this.h.b(p0, p1);
          String str2 = "location:";
          if (searchEntryP == null) {
             b.c(str1, str2+p0+str+p1+"entryParams is null");
          }
          if (oi == null) {
             b.c(str1, str2+p0+str+p1+"logParams is null");
          }
          if (!PatchProxy.isSupport(SearchBarEntryView.class) || !PatchProxy.applyVoidThreeRefs(searchEntryP, oi, Integer.valueOf(p0), this, SearchBarEntryView.class, "13")) {
             if (searchEntryP != null) {
                mEntrySource = searchEntryP.mEntrySource;
                int i = 2;
                b = true;
                boolean b1 = (p0 == i)? true: false;
                searchEntryP.linkUrl(this.f(b1, mEntrySource));
                if (p0 == i && this.f(b, mEntrySource) == null) {
                   SearchBarEntryView tj = this.j;
                   if (tj != null) {
                      b mItemExt = tj.mItemExt;
                      if (mItemExt != null && !TextUtils.n(mItemExt.mDefaultKeyword, this.getContentText())) {
                         searchEntryP.query(this.getContentText());
                      }
                   }
                }
             }else {
                mEntrySource = "UNKNOWN";
             }
          label_00e0 :
             if (oi != null) {
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                a uoa1 = a.k();
                a = oi.a;
                if (a != null) {
                   uoe = a.b(a);
                   uContentPack.photoPackage = w1.f(a.mEntity);
                   feedLogCtx = a.getFeedLogCtx();
                }else {
                   feedLogCtx = uoe;
                }
                if (!mEntrySource.contains("search_entrance_detail_placeholderBarV1") && (mEntrySource.contains("search_entrance_detail_barV1") || mEntrySource.contains("search_entrance_detail_placeholderKeywordV1"))) {
                   SearchBarEntryView tj1 = this.j;
                   if (tj1 != null) {
                      b mItemExt1 = tj1.mItemExt;
                      if (mItemExt1 != null && !TextUtils.n(mItemExt1.mDefaultKeyword, this.getContentText())) {
                         tj1 = this.j;
                         uoa1.h(f.a(a, tj1.mHotWord, tj1.mId, tj1.mUssid));
                      label_0146 :
                         SearchBarEntryView tj2 = this.j;
                         if (tj2 != null && !TextUtils.x(tj2.mKsOrderId)) {
                            ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
                            ksOrderInfoP.ksOrderId = this.j.mKsOrderId;
                            uContentPack.ksOrderInfoPackage = ksOrderInfoP;
                         }
                      }
                   }
                   uoa1.h(f.b(a));
                   goto label_0146 ;
                }
             label_015f :
                uoa1.h(oi.c);
                uoa1.e("entry_source", mEntrySource);
                oi.c = uoa1.j();
                if (oi.d == null) {
                   oi.d = uoe;
                }
                if (oi.f == null) {
                   oi.f = feedLogCtx;
                }
                if (oi.e == null) {
                   oi.e = uContentPack;
                }
             }
          }
       label_0181 :
          e$a uoa = new e$a();
          uoa.b(searchEntryP);
          uoa.c(oi);
          return uoa.a();
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SearchBarEntryView.class, "3")) {
          return;
       }
       SearchBarEntryView tf = this.f;
       if (tf != null) {
          tf.setOnClickListener(this.l);
       }
       return;
    }
    public final String f(boolean p0,String p1){
       SearchBarEntryView obj;
       SearchHotWordItemExt mBtnJumpUrl;
       if (PatchProxy.isSupport(SearchBarEntryView.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, SearchBarEntryView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.j;
       if (obj == null) {
          return null;
       }else if(p0){
          if (obj.mItemExt == null) {
             return null;
          }else if(TextUtils.x(p1)){
             mBtnJumpUrl = this.j.mItemExt.mBtnJumpUrl;
          }else {
             mBtnJumpUrl = a.m(this.j.mItemExt.mBtnJumpUrl, "source", p1);
          }
       }else if(TextUtils.x(p1)){
          mBtnJumpUrl = this.j.mJumpUrl;
       }else {
          mBtnJumpUrl = a.m(this.j.mJumpUrl, "source", p1);
       }
       if (!TextUtils.x(mBtnJumpUrl)) {
          return mBtnJumpUrl;
       }else {
          return null;
       }
    }
    public final void g(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d08a1, this);
       this.b = this.findViewById(0x7f0a3763);
       this.c = this.findViewById(0x7f0a1722);
       this.d = this.findViewById(0x7f0a3776);
       this.e = this.findViewById(0x7f0a0be8);
       this.f = this.findViewById(0x7f0a3653);
       this.setOnClickListener(this.k);
       return;
    }
    public String getContentText(){
       SearchBarEntryView obj = PatchProxy.apply(null, this, SearchBarEntryView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null || TextUtils.x(obj.getText())) {
          return null;
       }
       return this.d.getText().toString();
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, SearchBarEntryView.class, "9")) {
          return;
       }
       e uoe = this.d(1, 2);
       this.g = uoe;
       f.f("SEARCH_BAR_DETAIL", uoe);
       if (!TextUtils.x(this.g.d())) {
          b.a(0x7fb69d0c).e(this.g.d(), SearchEntryActionRecorder$SignalType.USER_VV_COUNT);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, SearchBarEntryView.class, "10")) {
          return;
       }
       SearchBarEntryView tj = this.j;
       if (tj != null) {
          b mItemExt = tj.mItemExt;
          if (mItemExt != null && !TextUtils.n(tj.mHotWord, mItemExt.mDefaultKeyword)) {
             e uoe = this.d(1, 3);
             this.g = uoe;
             f.f("SEARCH_KEYWORD_DETAIL", uoe);
             if (!TextUtils.x(this.g.d())) {
                b.a(0x7fb69d0c).e(this.g.d(), SearchEntryActionRecorder$SignalType.USER_SHOW_COUNT);
             }
          }
       }
       return;
    }
    public void j(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView.class, "6")) {
          return;
       }
       this.j = p0;
       this.setContentText(p0.mHotWord);
       return;
    }
    public void setContentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarEntryView.class, "7")) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setSearchActionCallback(b p0){
       this.h = p0;
    }
    public void setSearchInterceptCallback(d p0){
       this.i = p0;
    }
}
