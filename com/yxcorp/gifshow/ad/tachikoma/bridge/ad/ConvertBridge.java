package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ConvertBridge;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import msd.l;
import mxb.u;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.d;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import tw.j;
import a59.j;
import java.util.concurrent.atomic.AtomicBoolean;
import a09.c;

public class ConvertBridge extends e	// class@001810
{
    public f b;

    public void ConvertBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "convert";
    }
    public Object c(JSONObject p0,a p1){
       j oj;
       AtomicBoolean uAtomicBoole;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, ConvertBridge.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       ConvertBridge tb = this.b;
       f h = tb.h;
       if (h != null) {
          h.invoke(Integer.valueOf(p0.optInt("itemClickType")));
          return this.e();
       }else {
          u ou = tb.a();
          if (ou == null) {
             return this.e();
          }
          Activity uActivity = this.b.b();
          if (!uActivity instanceof GifshowActivity) {
             uActivity = null;
          }
          if (uActivity != null) {
             d uod = d.a();
             uod.c(this.d(this.f(this.b), p0.optJSONObject("clientExtData")));
             uod.d(new ConvertBridge$invokeBridgeFunction$$inlined$let$lambda$1(this, ou, p0));
             uod.b(p0.optInt("itemClickType"));
             uod.g(p0.optBoolean("isSupportPauseDownload", true));
             a.o(uod, "ClickParams.newInstance\(¡­RT_PAUSE_DOWNLOAD, true\)\)");
             ou.c(this.b.e(), uActivity, uod);
          }
          if (!j.D(this.b.e())) {
             oj = this.b.g();
             if (oj != null) {
                uAtomicBoole = oj.c();
                if (uAtomicBoole != null) {
                   uAtomicBoole.set(true);
                }
             }
          }else {
             j oj1 = this.b.g();
             if (oj1 != null) {
                c uoc = oj1.b();
                if (uoc != null) {
                   uoc.b(p0.optInt("itemClickType"));
                   oj = this.b.g();
                   if (oj != null) {
                      uAtomicBoole = oj.a();
                      if (uAtomicBoole != null) {
                         uAtomicBoole.set(true);
                      }
                   }
                }
             }
          }
          return this.e();
       }
    }
}
