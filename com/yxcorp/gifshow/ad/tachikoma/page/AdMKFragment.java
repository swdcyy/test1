package com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.g2;
import c59.a;
import androidx.fragment.app.Fragment;
import lnc.g2$a;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import moc.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import c59.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.i$a;
import q2b.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.util.HashMap;
import java.lang.Boolean;
import lnc.y0;
import yx.j0;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.lang.Long;
import java.util.ArrayList;
import im8.c;
import c59.l;

public final class AdMKFragment extends BaseFragment	// class@001831
{
    public g2 j;
    public QPhoto k;
    public AdMKPageConfig l;
    public b m;
    public HashMap n;
    public static final AdMKFragment$a o;

    static {
       AdMKFragment.o = new AdMKFragment$a(null);
    }
    public void AdMKFragment(){
       super(null, null, null, null, 15, null);
    }
    public String o(){
       return "AD_MK_PAGE";
    }
    public void onCreate(Bundle p0){
       int i;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMKFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, AdMKFragment.class, "3")) {
          this.j = new g2(this, new a(this));
       }
       p0 = this.getArguments();
       AdMKPageConfig parcelable = (p0 != null)? p0.getParcelable("ad_mk_config"): objArray;
       this.l = parcelable;
       if (parcelable != null) {
          Integer integer = parcelable.c();
          i = (integer != null)? integer.intValue(): 0;
          QPhoto qPhoto = b.c(i, QPhoto.class);
          this.k = qPhoto;
          PhotoAdvertisement photoAdverti = k.B(qPhoto);
          String str1 = (photoAdverti != null)? String.valueOf(photoAdverti.mCreativeId): objArray;
          PhotoAdvertisement$TkTemplateInfo templateId = parcelable.g().templateId;
          a.o(templateId, "it.templateInfo.templateId");
          b uob = new b(templateId, parcelable.g().templateVersionCode, str1, parcelable.e(), parcelable.e, parcelable.h);
          this.m = photoAdverti;
       }
       AdMKFragment tm = this.m;
       if (tm != null && !PatchProxy.applyVoid(objArray, tm, b.class, str)) {
          tm.a = SystemClock.elapsedRealtime();
       }
       if (!PatchProxy.applyVoid(objArray, this, AdMKFragment.class, "8")) {
          b.a(0x4b316083).Y0(i.a().s("AD_MK_PAGE").t(1).e(7).b());
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdMKFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.h(p0, 0x7f0d005c, p1, false, 1);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, AdMKFragment.class, "10")) {
       }else {
          AdMKFragment tn = this.n;
          if (tn != null) {
             tn.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       FragmentActivity activity;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdMKFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       String str = "7";
       if (!PatchProxy.applyVoid(objArray, this, AdMKFragment.class, str)) {
          AdMKFragment tl = this.l;
          if (tl == null || this.k == null) {
             Boolean uBoolean = (tl != null)? Boolean.valueOf(tl.b()): objArray;
             if (!y0.p(uBoolean)) {
                Object[] objArray1 = new Object[0];
                j0.f("AdMKFragment", "onBindPresenterInternal running ,may be this activity is recycle ", objArray1);
                activity = this.getActivity();
                if (activity != null) {
                   activity.finish();
                }
             }
          }
          tl = this.m;
          if (tl != null && !PatchProxy.applyVoid(objArray, tl, b.class, str)) {
             b.b(tl, 0, null, null, 6, null);
          }
          tl = this.j;
          if (tl != null) {
             ArrayList uArrayList = PatchProxy.apply(objArray, this, AdMKFragment.class, "5");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
                uArrayList.add(c.a("FRAGMENT", this));
                AdMKFragment tk = this.k;
                if (tk != null) {
                   uArrayList.add(tk);
                }
                tk = this.l;
                if (tk != null) {
                   uArrayList.add(tk);
                }
                tk = this.m;
                if (tk != null) {
                   uArrayList.add(tk);
                }
                uArrayList.add(c.a("MK_PAGE_JSON_INFO", new l()));
                uArrayList.add(c.a("MK_PAGE_RENDER_TIME", Long.valueOf(0)));
                tk = this.l;
                if (tk != null) {
                   objArray = Integer.valueOf(tk.d());
                }
                uArrayList.add(c.a("LAYOUT_TYPE", objArray));
             }
             tl.b(uArrayList);
          }
       }
    label_00d0 :
       return;
    }
}
