package com.kuaishou.tuna_map.activity.CommercialLocationPreviewActivity;
import je.a;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import zf6.l;
import ekd.i;
import e15.a;
import yz6.u;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import i05.a;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_map.activity.a;
import msd.a;
import c15.b;
import lnc.o5;
import ekd.j0;
import com.kuaishou.tuna_map.fragment.BusinessMapKrnFragment;
import java.util.Objects;
import com.kuaishou.tuna_map.fragment.BusinessMapKrnFragment$a;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Parcelable;
import d15.a;
import ps6.e;
import com.kwai.kds.krn.api.page.KwaiRnFragment;

public class CommercialLocationPreviewActivity extends SingleFragmentActivity implements a	// class@00116a
{
    public String A;
    public int B;
    public String C;
    public BusinessMapKrnFragment y;
    public a z;
    public static final int D;

    public void CommercialLocationPreviewActivity(){
       super();
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, CommercialLocationPreviewActivity.class, "6")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CommercialLocationPreviewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, CommercialLocationPreviewActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.n(this.A, "map")) {
          return "kwai://map/nav";
       }
       return "kwai://business/nav";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialLocationPreviewActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       i.h(this, 0, l.r());
       this.z = new a();
       if (u.b()) {
          this.finish();
       }
       return;
    }
    public Fragment u3(){
       Uri data;
       a uoa1;
       String str3;
       String str4;
       BusinessMapKrnFragment uBusinessMap1;
       a uoa = this;
       CommercialLocationPreviewActivity uCommercialL = CommercialLocationPreviewActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, uoa, uCommercialL, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       if (obj == null) {
          this.finish();
          return objArray;
       }else {
          String str = "lpPageId";
          String str1 = null;
          String str2 = "title";
          if (obj.getData() != null) {
             try{
                data = obj.getData();
                uoa1 = PatchProxy.applyOneRefs(data, uoa, uCommercialL, "4");
                if (uoa1 != patchProxyRe) {
                   str3 = str;
                }else {
                   String scheme = data.getScheme();
                   a uoa3 = new a();
                   if (TextUtils.x(scheme) || !("kwai").equals(scheme)) {
                      str3 = str;
                   }else {
                      Uri uri = x0.f(data.toString());
                      str4 = x0.a(uri, "latitude");
                      str3 = str;
                      uoa3.c = a.a(x0.a(uri, "longitude"), str1);
                      uoa3.b = a.a(str4, str1);
                      uoa3.d = x0.a(uri, str2);
                      uoa3.a = x0.a(uri, "address");
                   }
                   uoa1 = uoa3;
                }
             }catch(java.lang.Exception e0){
                str3 = str;
                b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("resolveLocationFromUri"), a.b);
                uoa1 = null;
             }catch(java.lang.Exception e0){
             }
             uoa.z = uoa1;
             uoa.A = data.getHost();
             uoa.B = o5.b(x0.a(data, str3), -1);
             uoa.C = x0.a(data, "callback");
             str4 = x0.a(data, "from");
             str = "from";
             uoa1 = 0;
          }else {
             str4 = str;
             uoa1 = PatchProxy.applyOneRefs(obj, uoa, uCommercialL, "5");
             if (uoa1 != patchProxyRe) {
                str = "from";
             }else {
                uoa1 = new a();
                str = "from";
                uoa1.c = obj.getDoubleExtra("longitude", str1);
                uoa1.b = obj.getDoubleExtra("latitude", str1);
                uoa1.d = j0.f(obj, str2);
                uoa1.a = j0.f(obj, "address");
             }
             uoa.z = uoa1;
             uoa.A = j0.f(obj, "host");
             uoa.B = j0.b(obj, str4, 0);
             uoa.C = j0.f(obj, "callback");
             str4 = j0.f(obj, str);
          }
          CommercialLocationPreviewActivity z = uoa.z;
          BusinessMapKrnFragment$a uoa2 = (z != null)? 1: null;
          if (!uoa2) {
             this.finish();
             return null;
          }else {
             BusinessMapKrnFragment uBusinessMap = null;
             CommercialLocationPreviewActivity c = uoa.C;
             LaunchModel$b obj1 = PatchProxy.applyThreeRefs(z, str4, c, null, BusinessMapKrnFragment.class, "2");
             if (obj1 != patchProxyRe) {
             }else {
                BusinessMapKrnFragment$a d = BusinessMapKrnFragment.D;
                Objects.requireNonNull(d);
                obj1 = PatchProxy.applyThreeRefs(z, str4, c, d, BusinessMapKrnFragment$a.class, "1");
                if (obj1 != patchProxyRe) {
                   uBusinessMap1 = obj1;
                }else if(z != null){
                   uBusinessMap = new BusinessMapKrnFragment();
                   Bundle uBundle = new Bundle();
                   obj1 = new LaunchModel$b();
                   obj1.i("ecology-tuna-poi-preview");
                   obj1.j("TunaPoiPreview");
                   a d1 = z.d;
                   String str5 = "";
                   if (d1 == null) {
                      d1 = str5;
                   }
                   obj1 = obj1.e("stitle", d1).a("latitude", (float)z.b).a("longitude", (float)z.c);
                   d1 = z.a;
                   if (d1 == null) {
                      str1 = str5;
                   }
                   obj1 = obj1.e("address", d1);
                   if (c == null) {
                      c = str5;
                   }
                   LaunchModel$b uob = obj1.e("callback", c);
                   if (str4 == null) {
                      str4 = str5;
                   }
                   LaunchModel$b uob1 = uob.e(str, str4);
                   a e = z.e;
                   if (e != null) {
                      str5 = e;
                   }
                   uBundle.putParcelable("rn_launch_model", uob1.e("userId", str5).e("containerSource", "BusinessMapKrnFragment").h());
                   uBusinessMap.setArguments(uBundle);
                   uBusinessMap.ah(new a(uBusinessMap));
                }
                uBusinessMap1 = uBusinessMap;
                obj1 = uBusinessMap1;
             }
             uoa.y = obj1;
             return obj1;
          }
       }
    }
    public int v3(){
       return 0x7f0a0fe6;
    }
    public int x3(){
       return 0x7f0d0028;
    }
}
