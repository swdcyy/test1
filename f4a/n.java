package f4a.n;
import f4a.i;
import f4a.o;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.content.Context;
import f4a.m;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.detail.plc.helper.e;
import ok.h;

public class n implements i, o	// class@0022b2
{
    public GameCenterDownloadParams a;

    public void n(GameCenterDownloadParams p0){
       super();
       this.a = p0;
    }
    public boolean a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return TextUtils.n(this.h(), "wait");
    }
    public boolean b(String p0,String p1,Activity p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.g(p0) && (!this.a(p0) && (!this.d(p0) && (!this.c(p0) && !this.f(p2, p1)))))? true: false;
       return b;
    }
    public boolean c(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return TextUtils.n(this.h(), "complete");
    }
    public boolean d(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       p0 = this.h();
       boolean b = (TextUtils.n(p0, "pause") || TextUtils.n(p0, "error"))? true: false;
       return b;
    }
    public GameCenterDownloadParams e(){
       return this.a;
    }
    public boolean f(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m.c(p0, p1);
    }
    public boolean g(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return TextUtils.n(this.h(), "progress");
    }
    public final String h(){
       Object obj = PatchProxy.apply(null, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(d.a(-1986139969).gameDownloadProgress(this.a)).transform(e.b).or("");
    }
}
