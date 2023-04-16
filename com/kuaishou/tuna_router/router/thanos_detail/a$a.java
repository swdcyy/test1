package com.kuaishou.tuna_router.router.thanos_detail.a$a;
import qvb.q;
import com.kuaishou.tuna_router.router.thanos_detail.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qvb.p;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kuaishou.tuna_router.router.thanos_detail.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import qvb.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.detail.slideplay.c;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.nearby.NearbyParam;
import erb.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Long;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import tkd.b;
import tkd.d;
import wm5.a;
import android.view.View;
import vm5.o;

public class a$a implements q	// class@001182
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final a k;

    public void a$a(a p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,String p9){
       this.k = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.k.S8(this.j, p0);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       Object[] objArray1;
       boolean b;
       boolean b2;
       long l;
       Object obj = this;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, uoa, "1")) {
          return;
       }
       Activity activity = obj.k.getActivity();
       a s = obj.k.s;
       Objects.requireNonNull(s);
       Object[] objArray = null;
       a obj1 = PatchProxy.apply(objArray, s, b.class, "2");
       if (obj1 != PatchProxyResult.class) {
       }else {
          List items = s.getItems();
          if (!q.f(items)) {
             b t = s.t;
             if (t >= null && t < items.size()) {
                obj1 = items.get(s.t);
             }
          }
          objArray1 = objArray;
       label_0058 :
          if (objArray1 != null && activity instanceof GifshowActivity) {
             obj.k.s.f(obj);
             int i = 1001;
             String str = b.g(j.e(obj.k.s, f.b(objArray), c.i(i, objArray1))).id();
             PhotoDetailParam photoDetailP = new PhotoDetailParam(objArray1).setSource(i).setPhotoIndex(obj.k.s.t);
             photoDetailP.getDetailLogParam().setSchemaInfo(obj.b, "");
             if (!TextUtils.x(str)) {
                photoDetailP.setSlidePlayId(str);
             }
             b = true;
             String str1 = "DETAIL";
             boolean b1 = false;
             if (("sidebar").equals(obj.c)) {
                photoDetailP.getSlidePlayConfig().setEnablePullRefresh(b1);
                photoDetailP.setBizType(4);
                NearbyParam nearbyParam = new NearbyParam();
                a uoa1 = v8;
                obj1 = v8;
                b2 = false;
                uoa1 = new a(obj.d, obj.e, obj.f, Boolean.valueOf(Boolean.parseBoolean(obj.g)), obj.h, objArray1);
                nearbyParam.setMPoiParams(obj1);
                NasaSlideParam$a uoa2 = new NasaSlideParam$a();
                uoa2.T(str1);
                uoa2.C(b2);
                uoa2.q(b);
                uoa2.e(b2);
                uoa2.l(b2);
                uoa2.R(nearbyParam);
                l = (TextUtils.x(obj.i))? 0: Long.parseLong(obj.i);
                uoa2.d(l);
                str = (nearbyParam.isPoiDetailStyle())? "LOCAL_POI": "nearby";
                uoa2.Z(str);
                photoDetailP.setSource(1001);
                d.a(0x66aa3a58).z20(activity, 1025, photoDetailP, null, 0, 0, uoa2.a(), true, null);
             }else {
                b2 = false;
                NasaSlideParam$a uoa3 = new NasaSlideParam$a();
                uoa3.T(str1);
                uoa3.C(b2);
                uoa3.q(b);
                uoa3.e(b2);
                uoa3.l(b2);
                l = (TextUtils.x(obj.i))? 0: Long.parseLong(obj.i);
                uoa3.d(l);
                d.a(0x66aa3a58).z20(activity, 1025, photoDetailP, null, 0, 0, uoa3.a(), false, null);
             }
             activity.finish();
          }else {
             obj.k.S8(obj.j, p0);
          }
          return;
       }
       objArray1 = obj1;
       goto label_0058 ;
    }
}
