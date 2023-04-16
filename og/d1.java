package og.d1;
import okhttp3.CookieJar;
import java.lang.String;
import java.lang.Object;
import okhttp3.HttpUrl;
import java.util.List;
import kotlin.jvm.internal.a;
import com.feature.post.bridge.util.UploadTokenHelper;
import java.util.Objects;
import java.util.ArrayList;
import okhttp3.Cookie$Builder;
import nsd.r0;
import java.util.Arrays;
import okhttp3.Cookie;
import java.lang.CharSequence;
import android.text.TextUtils;
import c97.d;
import h97.g;
import com.kwai.imsdk.m;

public final class d1 implements CookieJar	// class@00279f
{
    public final String a;
    public final String b;
    public final String c;

    public void d1(String p0,String p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public List loadForRequest(HttpUrl p0){
       a.p(p0, "url");
       String str = p0.host();
       a.o(str, "url.host\(\)");
       d1 tc = this.c;
       Objects.requireNonNull(UploadTokenHelper.a);
       ArrayList uArrayList = new ArrayList();
       Object[] objArray = new Object[]{this.a};
       String str1 = String.format("%s_st", Arrays.copyOf(objArray, 1));
       a.o(str1, "java.lang.String.format\(format, *args\)");
       Cookie uCookie = new Cookie$Builder().domain(str).name(str1).value(this.b).build();
       a.o(uCookie, "Cookie.Builder\(\).domain\(¡­e\(token\)\n        .build\(\)");
       uArrayList.add(uCookie);
       String str2 = "Azeroth.get\(\).commonParams";
       if (TextUtils.isEmpty(tc)) {
          d uod = d.a();
          a.o(uod, "Azeroth.get\(\)");
          g og = uod.b();
          a.o(og, str2);
          tc = og.getUserId();
          a.o(tc, "Azeroth.get\(\).commonParams.userId");
       }
       uCookie = new Cookie$Builder().domain(str).name("userId").value(tc).build();
       a.o(uCookie, "Cookie.Builder\(\).domain\(¡­lue\(userIdParams\).build\(\)");
       uArrayList.add(uCookie);
       d uod1 = d.a();
       a.o(uod1, "Azeroth.get\(\)");
       g og1 = uod1.b();
       a.o(og1, str2);
       uCookie = new Cookie$Builder().domain(str).name("did").value(og1.getDeviceId()).build();
       a.o(uCookie, "Cookie.Builder\(\).domain\(¡­nParams.deviceId\).build\(\)");
       uArrayList.add(uCookie);
       uod1 = d.a();
       a.o(uod1, "Azeroth.get\(\)");
       og1 = uod1.b();
       a.o(og1, str2);
       uCookie = new Cookie$Builder().domain(str).name("ver").value(og1.getAppVersion()).build();
       a.o(uCookie, "Cookie.Builder\(\).domain\(¡­arams.appVersion\).build\(\)");
       uArrayList.add(uCookie);
       uod1 = d.a();
       a.o(uod1, "Azeroth.get\(\)");
       og1 = uod1.b();
       a.o(og1, str2);
       uCookie = new Cookie$Builder().domain(str).name("sysver").value(og1.getSysRelease()).build();
       a.o(uCookie, "Cookie.Builder\(\).domain\(¡­arams.sysRelease\).build\(\)");
       uArrayList.add(uCookie);
       m om = m.F();
       a.o(om, "KwaiIMManager.getInstance\(\)");
       Objects.requireNonNull(om);
       Cookie uCookie1 = new Cookie$Builder().domain(str).name("imsdkver").value("11.3.10.0").build();
       a.o(uCookie1, "Cookie.Builder\(\).domain\(¡­stance\(\).version\).build\(\)");
       uArrayList.add(uCookie1);
       return uArrayList;
    }
    public void saveFromResponse(HttpUrl p0,List p1){
       a.p(p0, "url");
       a.p(p1, "cookies");
    }
}
