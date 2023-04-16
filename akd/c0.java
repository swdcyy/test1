package akd.c0;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener;
import akd.d0$a;
import java.lang.Object;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener$UpgradeResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bkd.b$a;
import bkd.b;
import java.lang.Throwable;
import zjd.a;

public class c0 implements CheckUpgradeRequestListener	// class@00004b
{
    public final d0$a a;

    public void c0(d0$a p0){
       this.a = p0;
       super();
    }
    public void a(CheckUpgradeRequestListener$UpgradeResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       if (p0 != null) {
          b$a uoa = new b$a();
          uoa.f(p0.mDownloadUrl, p0.mVer, p0.mVerCode);
          uoa.h(p0.mX64DownloadUrl);
          uoa.g(p0.mVerTitle, p0.mVerMsg);
          uoa.c(p0.mForceUpdate);
          uoa.b(p0.mCanUpgrade);
          uoa.c = p0.mUseMarket;
          uoa.d(p0.mMediaUrl, p0.mMediaType);
          uoa.m = p0.mUpgradeNeedStartupTime;
          uoa.n = p0.mTaskId;
          uoa.e(p0.mNeedCheckSign);
          uoa.p = p0.mShowDialogInterval;
          uoa.q = p0.mUpdateType;
          this.a.a.a(uoa.a(), null);
       }else {
          this.a.a.a(null, new Throwable("Content is null"));
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       p0.getMessage();
       this.a.a.a(null, p0);
       return;
    }
}
