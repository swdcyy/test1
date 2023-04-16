package bj0.d;
import java.lang.Object;
import com.kuaishou.krn.bridges.model.KrnDeviceInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import kj0.j;
import android.content.Context;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;
import com.yxcorp.utility.TextUtils;
import ekd.p0;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.n;
import android.content.res.Resources;
import cw9.c;

public final class d	// class@000394
{
    public static KrnInfo a;

    public void d(){
       super();
    }
    public static KrnDeviceInfo a(){
       KrnDeviceInfo obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KrnDeviceInfo();
       j oj = c.b().c();
       Context uContext = c.b().d();
       obj.mAppName = uContext.getPackageName();
       obj.mProductName = oj.getProductName();
       obj.mAppVersion = oj.getAppVersion();
       String mODEL = Build.MODEL;
       obj.mManufacturer = Build.MANUFACTURER+"\("+mODEL+"\)";
       obj.mModel = mODEL;
       obj.mSystemVersion = "ANDROID_"+Build$VERSION.RELEASE;
       obj.mUUID = oj.getDeviceId();
       obj.mOaid = TextUtils.k(oj.g());
       obj.mGlobalId = oj.getGlobalId();
       obj.mLocale = oj.getLocale();
       obj.mNetworkType = p0.g(uContext);
       obj.mImei = TextUtils.I(SystemUtil.m(uContext));
       obj.mMac = TextUtils.I(SystemUtil.o(uContext, oj.b()));
       obj.mAndroidId = (oj.b())? SystemUtil.d(uContext, ""): "";
       obj.mScreenWidth = n.y(uContext);
       obj.mScreenHeight = n.u(uContext);
       obj.mStatusBarHeight = n.A(uContext);
       obj.mTitleBarHeight = c.a(uContext.getResources(), 0x7f07047d);
       return obj;
    }
}
