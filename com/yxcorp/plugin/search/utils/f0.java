package com.yxcorp.plugin.search.utils.f0;
import java.lang.Object;
import com.yxcorp.plugin.search.utils.f0$a;
import com.kuaishou.android.model.mix.QRecoTag;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gbd.d;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxRealLog;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import erd.g;
import nfd.y2;
import java.util.concurrent.Callable;
import brd.t;
import nfd.x2;
import erd.o;
import com.yxcorp.plugin.search.utils.e0;
import erd.r;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.plugin.search.utils.d0;
import crd.b;
import java.lang.Integer;
import sy5.a;
import com.search.common.entity.SearchBaseItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nfd.p1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.yxcorp.plugin.search.entity.TkItemInfo;
import ged.g;
import java.util.List;
import com.yxcorp.plugin.search.utils.f0$c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kzc.d;
import android.app.Activity;
import com.yxcorp.plugin.search.utils.z;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.search.utils.a0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.plugin.search.utils.f0$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.ExtInfo;
import nfd.w2;
import nfd.v2;

public class f0	// class@000799
{
    public SearchResultFragment a;
    public SearchItem b;
    public FeedNegativeFeedback c;
    public boolean d;
    public int e;
    public f0$c f;
    public View g;
    public View h;
    public boolean i;
    public final f0$c j;
    public static c k;
    public static c l;

    public void f0(){
       super();
       this.j = new f0$a(this);
    }
    public final JsonObject a(QRecoTag p0){
       d obj = PatchProxy.applyOneRefs(p0, this, f0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.r();
       obj.o("item");
       obj.k(p0.mId);
       String str = (this.b.isKboxType())? "KBOX_FEEDBACK": "PRESS_FEEDBACK";
       obj.w(str);
       obj.q(p0.mName);
       obj.t(p0.mPos);
       obj.s();
       return obj.f();
    }
    public final JsonObject b(){
       String str1;
       SearchItem obj = PatchProxy.apply(null, this, f0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (this.b.isKboxType()) {
          obj = this.b.mRealLog;
          str1 = (obj == null)? str: obj.mTemplateId;
       }else {
          str1 = this.b.getId();
       }
       if (this.b.isKboxType()) {
          SearchItem mRealLog = this.b.mRealLog;
          if (mRealLog != null) {
             str = mRealLog.mTemplateName;
          }
       }else {
          str = this.b.getType();
       }
       d uod = d.r();
       uod.k(str1);
       uod.w(str);
       uod.c(this.b.getAuthorId());
       uod.u(this.b.mRank);
       uod.t(this.b.mPosition);
       uod.b(this.b.mApiTrace);
       return uod.f();
    }
    public void c(SearchResultFragment p0,SearchItem p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f0.class, "4")) {
          return;
       }
       t.fromCallable(new y2(this)).map(new x2(this, p1)).filter(e0.b).compose(c.c(p0.m(), FragmentEvent.STOP)).subscribe(p2, d0.b);
       return;
    }
    public void d(QRecoTag p0,int p1,String p2,String p3,String p4){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof0, "16")) {
             return;
          }
       }
       a uoa = a.k();
       if (!TextUtils.x(this.b.mSessionId)) {
          uoa.e("search_session_id", this.b.mSessionId);
       }
       if (!TextUtils.x(p4)) {
          uoa.e("input_text", p4);
       }
       if (p1.a(this.b)) {
          uoa.e("subid", p1.d(this.b));
          uoa.e("subtype", "PHOTO_COLLECTION");
       }
       d uod = d.r();
       uod.a(p2);
       uod.h(a.k().h(this.b()).h(this.a(p0)).e("button_name", p3).d("params", uoa.j()).i());
       ClientEvent$ElementPackage uElementPack = uod.d();
       f0 ta = this.a;
       uod = (this.b.isKboxType())? "ALADDIN": "SEARCH_RESULT";
       t.n(p1, ta, uElementPack, t.a(ta, uod, this.b), this.b);
       return;
    }
    public void e(QRecoTag p0,int p1){
       String str;
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof0, "15")) {
          return;
       }
       f0 ta = this.a;
       ClientEvent$ElementPackage uElementPack = PatchProxy.applyOneRefs(p0, this, uof0, "17");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          a uoa = a.k().h(this.b()).h(this.a(p0));
          JsonObject jsonObject = new JsonObject();
          if (!TextUtils.x(this.b.mSessionId)) {
             jsonObject.c0("search_session_id", this.b.mSessionId);
          }
          if (this.b.isKboxType()) {
             str = (this.b.mItemStyleType == 1)? "weak": "strong";
             jsonObject.c0("feedback_style", str);
          }
          String str1 = "subtype";
          if (p1.a(this.b)) {
             jsonObject.c0("subid", p1.d(this.b));
             jsonObject.c0(str1, "PHOTO_COLLECTION");
          }
          SearchItem mTkItemInfo = this.b.mTkItemInfo;
          if (mTkItemInfo != null) {
             if (!TextUtils.x(mTkItemInfo.mSubId)) {
                jsonObject.c0("subid", this.b.mTkItemInfo.mSubId);
             }
             if (!TextUtils.x(this.b.mTkItemInfo.mSubType)) {
                jsonObject.c0(str1, this.b.mTkItemInfo.mSubType);
             }
          }
          uoa.d("params", jsonObject);
          d uod = d.r();
          uod.a("PHOTO_PRESS_FEEDBACK_SUBCARD");
          uod.h(uoa.i());
          uElementPack = uod.d();
       }
       f0 ta1 = this.a;
       str = (this.b.isKboxType())? "ALADDIN": "SEARCH_RESULT";
       t.n(p1, ta, uElementPack, t.a(ta1, str, this.b), this.b);
       return;
    }
    public final void f(g p0,List p1,f0$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f0.class, "5")) {
          return;
       }
       FragmentActivity activity = this.a.getActivity();
       if (activity == null) {
          return;
       }
       p0.g = p1;
       p0.f = this.a;
       p0.e = this.j;
       d uod = new d(activity);
       uod.G(z.a);
       uod.O(a0.a);
       uod.L(p0);
       f0.k = uod.Y(new f0$b(this, p2, p1));
       return;
    }
    public void g(SearchResultFragment p0,SearchItem p1,View p2,View p3,f0$c p4){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof0, "2")) {
             return;
          }
       }
       this.h(p0, p1, p2, p3, p4, false);
       return;
    }
    public void h(SearchResultFragment p0,SearchItem p1,View p2,View p3,f0$c p4,boolean p5){
       f0 uof0 = f0.class;
       int i = 0;
       if (PatchProxy.isSupport(uof0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uof0, "3")) {
             return;
          }
       }
       this.b = p1;
       this.a = p0;
       this.d = i;
       this.g = p2;
       this.h = p3;
       this.f = p4;
       if (p1.isKboxType()) {
          SearchItem mExtInfo = this.b.mExtInfo;
          if (mExtInfo != null && mExtInfo.mSearchFeedBackEntity != null) {
          label_0046 :
             if (p2 != null && p3 != null) {
                w2 ow2 = new w2(this, p2, p3, p5, p4);
                this.c(p0, p1, mExtInfo);
             }
          }
       }else {
          goto label_0046 ;
       }
       return;
    }
    public void i(SearchResultFragment p0,SearchItem p1,int p2,f0$c p3){
       if (PatchProxy.isSupport(f0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, f0.class, "1")) {
          return;
       }
       this.b = p1;
       this.a = p0;
       this.d = true;
       this.e = p2;
       this.f = p3;
       this.c(p0, p1, new v2(this, p2, p3));
       return;
    }
}
