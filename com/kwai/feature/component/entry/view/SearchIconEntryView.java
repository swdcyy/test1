package com.kwai.feature.component.entry.view.SearchIconEntryView;
import qy5.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import java.util.HashMap;
import com.kwai.feature.component.entry.view.SearchIconEntryView$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.facebook.drawee.view.DraweeView;
import oy5.e;
import com.kwai.robust.PatchProxyResult;
import uy5.b;
import com.kwai.feature.component.entry.SearchEntryParams;
import oy5.b;
import oy5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import sy5.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.google.gson.JsonObject;
import oy5.f;
import k2b.e0;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import zk.g;
import oy5.e$a;
import java.lang.Float;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Math;
import android.view.View;

public class SearchIconEntryView extends KwaiImageView implements c	// class@001216
{
    public final m A;
    public e x;
    public b y;
    public final Map z;

    public void SearchIconEntryView(Context p0){
       super(p0);
       this.z = new HashMap();
       this.A = new SearchIconEntryView$a(this);
       this.r0();
    }
    public void SearchIconEntryView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.z = new HashMap();
       this.A = new SearchIconEntryView$a(this);
       this.r0();
    }
    public void SearchIconEntryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = new HashMap();
       this.A = new SearchIconEntryView$a(this);
       this.r0();
    }
    private void r0(){
       if (PatchProxy.applyVoid(null, this, SearchIconEntryView.class, "1")) {
          return;
       }
       this.setContentDescription(a1.p(R.string.arg_RES_7f104466));
       this.setOnClickListener(this.A);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SearchIconEntryView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, SearchIconEntryView.class, "9")) {
          return;
       }
       this.r0();
       return;
    }
    public e q0(){
       i a;
       FeedLogCtx feedLogCtx;
       CommonParams uCommonParam;
       i b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SearchIconEntryView obj = PatchProxy.apply(objArray, this, SearchIconEntryView.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.y;
       String str = "SearchIconEntryView";
       if (obj == null) {
          b.c(str, "buildEntryContext, mISearchActionCallback is null");
          return objArray;
       }else {
          SearchEntryParams searchEntryP = obj.a(0);
          i oi = this.y.b(0, 0);
          if (searchEntryP == null) {
             b.c(str, "entryParams is null");
          }
          String str1 = "logParams is null";
          if (oi == null) {
             b.c(str, str1);
          }
          if (!PatchProxy.applyVoidTwoRefs(searchEntryP, oi, this, SearchIconEntryView.class, "8")) {
             if (oi == null) {
                b.c(str, str1);
             }else {
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                a uoa1 = a.k();
                a = oi.a;
                SearchEntryParams mEntrySource = (searchEntryP != null)? searchEntryP.mEntrySource: "UNKNOWN";
                if (a != null) {
                   feedLogCtx = a.getFeedLogCtx();
                   Objects.requireNonNull(mEntrySource);
                   if (!mEntrySource.equals("search_entrance_search_detail")) {
                      if (!mEntrySource.equals("search_entrance_bottom_featured")) {
                         uCommonParam = a.b(a);
                         uContentPack.photoPackage = w1.f(a.mEntity);
                      }else {
                         uCommonParam = a.a(a.getEntity(), (a.getPosition() + 1));
                         uContentPack.photoPackage = w1.g(a.getEntity(), (a.getPosition() + 1));
                      }
                   }else {
                      uContentPack.photoPackage = w1.f(a.mEntity);
                      uCommonParam = objArray;
                   }
                }else {
                   feedLogCtx = objArray;
                   uCommonParam = feedLogCtx;
                }
                if (mEntrySource.contains("search_entrance_atlasDetail_button")) {
                   JsonObject jsonObject = uoa1.j();
                   b = oi.b;
                   String obj1 = PatchProxy.applyTwoRefs(jsonObject, b, objArray, f.class, "10");
                   if (obj1 != patchProxyRe) {
                      uCommonParam = obj1;
                   }else {
                      a uoa2 = a.k();
                      if (jsonObject != null) {
                         uoa2.d("element_params", jsonObject);
                      }
                      obj1 = (b == null)? "": b.o();
                      uCommonParam = new CommonParams();
                      uCommonParam.mEntryTag = ImmutableMap.builder().c("element_action", new g("SEARCH_BUTTON")).c("page_name", new g(obj1)).c("params", uoa2.j()).a();
                   }
                   if (a != null) {
                      uContentPack.photoPackage = w1.f(a.mEntity);
                   }
                }
                uoa1.h(oi.c);
                uoa1.e("entry_source", mEntrySource);
                oi.c = uoa1.j();
                if (oi.d == null) {
                   oi.d = uCommonParam;
                }
                if (oi.f == null) {
                   oi.f = feedLogCtx;
                }
                if (oi.e == null) {
                   oi.e = uContentPack;
                }
             }
          }
          e$a uoa = new e$a();
          uoa.b(searchEntryP);
          uoa.c(oi);
          return uoa.a();
       }
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, SearchIconEntryView.class, "5")) {
          return;
       }
       e uoe = this.q0();
       this.x = uoe;
       f.f("SEARCH_BUTTON", uoe);
       return;
    }
    public void setAlpha(float p0){
       if (PatchProxy.isSupport(SearchIconEntryView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchIconEntryView.class, "2")) {
          return;
       }
       this.t0("default", p0);
       return;
    }
    public void setResource(int p0){
       if (PatchProxy.isSupport(SearchIconEntryView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchIconEntryView.class, "4")) {
          return;
       }
       if (p0 > 0) {
          this.setImageResource(p0);
          this.setVisibility(0);
       }else {
          this.setVisibility(4);
       }
       return;
    }
    public void setSearchActionCallback(b p0){
       this.y = p0;
    }
    public void t0(String p0,float p1){
       if (PatchProxy.isSupport(SearchIconEntryView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, SearchIconEntryView.class, "3")) {
          return;
       }
       Log.b("SearchIconEntryView", p0+"setAlpha: "+p1);
       this.z.put(p0, Float.valueOf(p1));
       float f = 0x3f800000;
       Iterator iterator = this.z.values().iterator();
       while (iterator.hasNext()) {
          f = Math.min(f, iterator.next().floatValue());
       }
       super.setAlpha(f);
       return;
    }
}
