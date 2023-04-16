package com.yxcorp.gifshow.channel.stagger.c;
import pa5.n;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import a9c.e;
import com.kwai.framework.model.channel.HotChannel;
import nj9.a;
import nj9.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import com.kwai.framework.model.feed.BaseFeed;
import pa5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
import yp.x;
import java.util.List;
import org.json.JSONException;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.w;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.model.mix.TagItem;
import y8c.f$b;
import com.yxcorp.gifshow.channel.stagger.c$a;
import com.yxcorp.gifshow.log.e;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import ok.n;
import com.kuaishou.android.model.feed.PhotoType;
import android.view.ViewGroup;
import y8c.f;
import ga5.e;
import java.util.Objects;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aua.e;
import yta.m1;
import com.yxcorp.gifshow.homepage.presenter.v;
import yta.l1;
import yta.z;
import com.kwai.component.feedstaggercard.model.CardStyle;
import ja5.h;
import com.yxcorp.gifshow.homepage.presenter.z;
import com.kwai.component.feedstaggercard.widget.HomeFeedCornerCardBackgroundView;
import ml8.c;
import bua.h;
import com.yxcorp.gifshow.homepage.presenter.j;
import gj9.b;
import qa5.h;
import nj9.c;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView;
import y8c.q;

public class c extends n	// class@001065
{
    public HotChannel F;
    public final a G;
    public final b H;
    public final boolean I;

    public void c(PhotoItemViewParam p0,e p1,HotChannel p2){
       super(p0, p1);
       this.G = new a();
       this.H = new b();
       this.F = p2;
       this.I = TextUtils.n(this.z.mChannelTabId, "33");
    }
    public static void A1(c p0,JSONObject p1,BaseFeed p2,boolean p3){
       boolean b;
       a uoa = super.u1();
       if (uoa != null) {
          uoa.a(p1, p2, p3);
       }
       try{
          String str = "is_outlook_title";
          String obj = PatchProxy.applyOneRefs(p2, p0, c.class, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             CoverMeta uCoverMeta = r1.D0(p2);
             CommonMeta uCommonMeta = r1.w0(p2);
             if (uCoverMeta != null) {
                uCoverMeta = uCoverMeta.mCoverStyle;
                if (uCoverMeta != null && (uCoverMeta.isShowDesc != null && !TextUtils.x(uCommonMeta.mDescription))) {
                   b = true;
                }
             }
             b = false;
          }
          obj = (b)? "true": "false";
          p1.put(str, obj);
          p1.put("lv_params", x.g(p2));
          p1.put("show_tag", p0.C1(p2));
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return;
    }
    public final List C1(BaseFeed p0){
       List obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoMeta photoMeta = r1.u1(p0);
       obj = null;
       if (photoMeta == null) {
          return obj;
       }
       List list = w.S(photoMeta);
       if (list != null && list.size()) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().mName);
          }
       }
       return obj;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$a uoa = new c$a(p0, this.x, this.F, this.B, this.C, this.u1());
       return obj;
    }
    public int f0(int p0){
       QPhoto obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.N0(p0);
       n.j(obj);
       if (obj.isNewLiveMode()) {
          return PhotoType.LIVE_NEW_STYLE.toInt();
       }else {
          return super.f0(p0);
       }
    }
    public f h1(ViewGroup p0,int p1){
       n obj;
       n tz;
       f uof;
       PresenterV2 presenterV2;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.I != null && (PhotoType.IMAGE == PhotoType.fromInt(p1) && !e.g())) {
          c tG = this.G;
          tz = this.z;
          obj = this.D;
          Objects.requireNonNull(tG);
          uof = PatchProxy.applyThreeRefs(tz, p0, obj, tG, a.class, "1");
          if (uof != patchProxyRe) {
          }else {
             View view = a.i(p0, R.layout.arg_RES_7f0d093c);
             presenterV2 = new PresenterV2();
             presenterV2.U7(new e(tz.mFeedMode));
             presenterV2.U7(new m1(tz.mPage));
             presenterV2.U7(new v());
             presenterV2.U7(new l1());
             presenterV2.U7(new z(obj, tz.mPage, false));
             presenterV2.U7(new h());
             if (tz.mEnablePhotoReduce != null) {
                presenterV2.U7(new z(tz.mPage));
             }
             uof = new f(HomeFeedCornerCardBackgroundView.a(view, obj), presenterV2);
          }
          return uof;
       }else if(PhotoType.LIVE_NEW_STYLE == PhotoType.fromInt(p1)){
          c tH = this.H;
          tz = this.z;
          obj = this.D;
          Objects.requireNonNull(tH);
          uof = PatchProxy.applyThreeRefs(tz, p0, obj, tH, b.class, "1");
          if (uof != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             presenterV2.U7(new h());
             presenterV2.U7(new j(tz.mPage));
             uof = new f(HomeFeedCornerCardBackgroundView.a(a.i(p0, 0x7f0d0926), obj), presenterV2);
          }
          return uof;
       }else {
          return super.h1(p0, p1);
       }
    }
    public a u1(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public h v1(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.k.h0(), this);
    }
}
