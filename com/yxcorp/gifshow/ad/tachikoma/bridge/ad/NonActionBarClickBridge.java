package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.NonActionBarClickBridge;
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
import mxb.u;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.e;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;

public class NonActionBarClickBridge extends e	// class@001817
{
    public f b;

    public void NonActionBarClickBridge(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "nonActionBarClick";
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, NonActionBarClickBridge.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       u ou = this.b.a();
       if (ou == null) {
          return this.e();
       }
       if (this.b.e() == null) {
          return this.e();
       }
       int i = p0.optInt("itemClickType");
       Activity uActivity = this.b.b();
       if (!uActivity instanceof GifshowActivity) {
          uActivity = null;
       }
       if (uActivity != null) {
          QPhoto qPhoto = this.b.e();
          a.m(qPhoto);
          e uoe = new e(i);
          uoe.a(this.d(this.f(this.b), p0.optJSONObject("clientExtData")));
          uoe.b(new NonActionBarClickBridge$invokeBridgeFunction$$inlined$let$lambda$1(this, ou, i, p0));
          ou.a(qPhoto, uActivity, uoe);
       }
       return this.e();
    }
}
