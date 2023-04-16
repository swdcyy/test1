package com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig$b;
import android.net.Uri;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.x0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yx.j0;
import android.os.Parcel;

public final class AdMKPageConfig implements Parcelable	// class@001836
{
    public final String b;
    public final String c;
    public String d;
    public final String e;
    public PhotoAdvertisement$TkTemplateInfo f;
    public final String g;
    public final int h;
    public final Uri i;
    public final int j;
    public final Uri k;
    public final Integer l;
    public final boolean m;
    public static final Parcelable$Creator CREATOR;
    public static final AdMKPageConfig$a n;

    static {
       AdMKPageConfig.n = new AdMKPageConfig$a(null);
       AdMKPageConfig.CREATOR = new AdMKPageConfig$b();
    }
    public void AdMKPageConfig(Uri p0,Integer p1,boolean p2){
       a.p(p0, "uri");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       String str = x0.b(p0, "pageId", "");
       a.o(str, "SafetyUriUtil.getQueryPa¡­FromUri\(uri, PAGE_ID, \"\"\)");
       this.b = str;
       str = x0.b(p0, "pageVersion", "0");
       a.o(str, "SafetyUriUtil.getQueryPa¡­i\(uri, PAGE_VERSION, \"0\"\)");
       this.c = str;
       this.d = x0.a(p0, "backupUrl");
       str = x0.b(p0, "midPageTemplateId", "0");
       a.o(str, "SafetyUriUtil.getQueryPa¡­ID_PAGE_TEMPLATE_ID, \"0\"\)");
       this.e = str;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = new PhotoAdvertisement$TkTemplateInfo();
       tkTemplateIn.templateId = x0.b(p0, "templateId", "");
       tkTemplateIn.templateMd5 = x0.b(p0, "templateMd5", "");
       tkTemplateIn.templateUrl = x0.b(p0, "templateUrl", "");
       String str1 = x0.b(p0, "templateVersion", "0");
       a.o(str1, "SafetyUriUtil.getQueryPa¡­i, TEMPLATE_VERSION, \"0\"\)");
       tkTemplateIn.templateVersionCode = Integer.parseInt(str1);
       this.f = tkTemplateIn;
       str = p0.toString();
       a.o(str, "uri.toString\(\)");
       this.g = str;
       this.h = this.h(p0, "pageConversionType", -1);
       p0 = x0.f(this.d);
       a.o(p0, "SafetyUriUtil.parseUriFromString\(backupUrl\)");
       this.i = p0;
       this.j = this.h(p0, "layoutType", 0);
    }
    public final String a(){
       return this.d;
    }
    public final boolean b(){
       return this.m;
    }
    public final Integer c(){
       return this.l;
    }
    public final int d(){
       return this.j;
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.b;
    }
    public final String f(){
       return this.c;
    }
    public final PhotoAdvertisement$TkTemplateInfo g(){
       return this.f;
    }
    public final int h(Uri p0,String p1,int p2){
       if (PatchProxy.isSupport(AdMKPageConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AdMKPageConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String str = x0.a(p0, p1);
       a.o(str, "SafetyUriUtil.getQueryParameterFromUri\(uri, key\)");
       p2 = Integer.parseInt(str);
       return p2;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AdMKPageConfig.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AdMKPageConfig.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeParcelable(this.k, p1);
       AdMKPageConfig tl = this.l;
       if (tl != null) {
          p0.writeInt(1);
          tl = tl.intValue();
       }else {
          tl = 0;
       }
       p0.writeInt(tl);
       p0.writeInt(this.m);
       return;
    }
}
