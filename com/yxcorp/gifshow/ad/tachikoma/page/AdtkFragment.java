package com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import c59.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment$a;
import nsd.u;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
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
import c59.f;
import androidx.fragment.app.Fragment;
import lnc.g2$a;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import yx.j0;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import moc.b;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.i$a;
import q2b.i;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import im8.c;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment$b;
import java.lang.Runnable;
import ekd.k1;

public final class AdtkFragment extends BaseFragment implements o	// class@00183d
{
    public g2 j;
    public QPhoto k;
    public AdtkHalfFrameLayout l;
    public AdtkPageConfig m;
    public PhotoAdvertisement$TkTemplateInfo n;
    public PhotoAdvertisement$TkTemplateData o;
    public HashMap p;
    public static int q;
    public static final AdtkFragment$a r;

    static {
       AdtkFragment.r = new AdtkFragment$a(null);
       AdtkFragment.q = n.A(a.b());
    }
    public void AdtkFragment(){
       super(null, null, null, null, 15, null);
    }
    public String o(){
       return "AD_TK_PAGE";
    }
    public void onCreate(Bundle p0){
       Object[] objArray1;
       FragmentActivity activity;
       l$a a;
       AdtkPageConfig e;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, AdtkFragment.class, "3")) {
          this.j = new g2(this, new f(this));
       }
       p0 = this.getArguments();
       AdtkPageConfig parcelable = (p0 != null)? p0.getParcelable("adtk_config"): objArray;
       this.m = parcelable;
       String str = "AdtkFragment";
       int i = 0;
       if (parcelable == null) {
          objArray1 = new Object[i];
          j0.f(str, "adtkPageConfig is null ,may be this activity is recycle ", objArray1);
          activity = this.getActivity();
          if (activity != null) {
             activity.finish();
          }
          return;
       }else {
          a.m(parcelable);
          QPhoto qPhoto = b.c(parcelable.a(), QPhoto.class);
          if (qPhoto == null) {
             objArray1 = new Object[i];
             j0.f(str, "baseFeed is null ,may be this activity is recycle ", objArray1);
             activity = this.getActivity();
             if (activity != null) {
                activity.finish();
             }
             return;
          }else {
             this.k = qPhoto;
             if (!PatchProxy.applyVoid(objArray, this, AdtkFragment.class, "12")) {
                h oh = b.a(0x4b316083);
                i$a uoa = i.a().s("AD_TK_PAGE").t(1).e(7);
                StringBuilder str2 = "{\"tk_page_type\":";
                AdtkFragment tm1 = this.m;
                if (tm1 != null) {
                   e = tm1.e;
                   if (e != null) {
                   label_00b1 :
                      oh.Y0(uoa.u(str2+e+'}').b());
                   }
                }
                e = Integer.valueOf(i);
                goto label_00b1 ;
             }
             AdtkFragment tm = this.m;
             a.m(tm);
             String str1 = tm.b();
             PhotoAdvertisement photoAdverti = k.B(qPhoto);
             if (photoAdverti != null) {
                a = l.a;
                a.o(photoAdverti, "ad");
                this.n = a.a(str1, photoAdverti);
                this.o = a.b(str1, photoAdverti);
             }
             return;
          }
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdtkFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0094, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, AdtkFragment.class, "14")) {
       }else {
          AdtkFragment tp = this.p;
          if (tp != null) {
             tp.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdtkFragment.class, "8")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, AdtkFragment.class, "10")) {
          p0 = this.getView();
          AdtkHalfFrameLayout uAdtkHalfFra = (p0 != null)? p0.findViewById(R.id.adtk_half_container_view): objArray;
          this.l = uAdtkHalfFra;
          if (uAdtkHalfFra != null) {
             uAdtkHalfFra.setOnHalfPageHiddenListener(this);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AdtkFragment.class, "9")) {
          if (this.m == null || this.k == null) {
             Object[] objArray1 = new Object[0];
             j0.f("AdtkFragment", "onBindPresenterInternal running ,may be this activity is recycle ", objArray1);
          }else {
             AdtkFragment tj = this.j;
             if (tj != null) {
                ArrayList uArrayList = PatchProxy.apply(objArray, this, AdtkFragment.class, "5");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   PublishSubject publishSubje = PublishSubject.g();
                   a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
                   PublishSubject publishSubje1 = PublishSubject.g();
                   a.o(publishSubje1, "PublishSubject.create<Boolean>\(\)");
                   PublishSubject publishSubje2 = PublishSubject.g();
                   a.o(publishSubje2, "PublishSubject.create<Boolean>\(\)");
                   uArrayList.add(c.a("FRAGMENT", this));
                   uArrayList.add(c.a("TK_PAGE_HALF_LOADING_STATE", publishSubje));
                   uArrayList.add(c.a("TK_PAGE_HALF_EMPTY_STATE", publishSubje1));
                   uArrayList.add(c.a("TK_PAGE_HALF_EMPTY_RENDER_STATE", publishSubje2));
                   AdtkFragment tl = this.l;
                   if (tl != null) {
                      uArrayList.add(tl);
                   }
                   tl = this.k;
                   if (tl != null) {
                      uArrayList.add(tl);
                   }
                   tl = this.m;
                   if (tl != null) {
                      uArrayList.add(tl);
                   }
                }
                tj.b(uArrayList);
             }
          }
       }
       return;
    }
    public void t0(int p0){
       if (PatchProxy.isSupport(AdtkFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AdtkFragment.class, "6")) {
          return;
       }
       k1.o(new AdtkFragment$b(this, p0));
       return;
    }
}
