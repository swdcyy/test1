package com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper;
import tw8.a;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$config$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$schemeUri$2;
import java.lang.String;
import com.kuaishou.android.model.mix.Location;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tw8.a$a;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import q87.c;
import android.net.Uri;
import android.net.Uri$Builder;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Boolean;
import tw8.c;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.share.helper.KrnLocationHelper$b;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class KrnLocationHelper implements a	// class@00138c
{
    public final p a;
    public final p b;
    public static final KrnLocationHelper$a c;

    static {
       KrnLocationHelper.c = new KrnLocationHelper$a(null);
    }
    public void KrnLocationHelper(){
       super();
       this.a = s.c(KrnLocationHelper$config$2.INSTANCE);
       this.b = s.c(new KrnLocationHelper$schemeUri$2(this));
    }
    public Location a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnLocationHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.a(this, p0);
    }
    public Intent b(Bundle p0,Context p1){
       Intent intent;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnLocationHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundle");
       a.p(p1, "context");
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("PostLocationHelper", "KrnLocationHelper, deal intent", objArray);
       intent = new Intent();
       this.e();
       Uri$Builder uBuilder = Uri.parse(this.e()).buildUpon();
       String str = "MEDIA_LOCATION_LIST";
       Serializable serializable = SerializableHook.getSerializable(p0, str);
       if (serializable != null) {
          uBuilder.appendQueryParameter(str, a.a.q(serializable));
       }
       str = "location";
       serializable = SerializableHook.getSerializable(p0, str);
       if (serializable != null) {
          uBuilder.appendQueryParameter(str, a.a.q(serializable));
       }
       String str1 = p0.getString("photo_task_id", null);
       if (str1 != null) {
          uBuilder.appendQueryParameter("taskId", str1);
       }
       intent.setData(uBuilder.build());
       obj = new Object[i];
       a.b().w("PostLocationHelper", "intent data: "+intent.getData(), obj);
       return intent;
    }
    public boolean c(Bundle p0){
       KrnLocationHelper krnLocationH = KrnLocationHelper.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, krnLocationH, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bundle");
       if (SerializableHook.getSerializable(p0, "photo_location") != null) {
          return false;
       }
       p0 = PatchProxy.apply(null, null, c.class, "1");
       boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): a.t().d("enablePublishPoiOffsite", false);
       if (b) {
          return false;
       }else {
          b = PatchProxy.apply(null, this, krnLocationH, "4");
          if (b != PatchProxyResult.class) {
             b = b.booleanValue();
          }else if(!TextUtils.isEmpty(this.d().downLoadUri) && !TextUtils.isEmpty(this.d().a())){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             return false;
          }else {
             return true;
          }
       }
    }
    public final KrnLocationHelper$b d(){
       Object obj = PatchProxy.apply(null, this, KrnLocationHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final String e(){
       Object obj = PatchProxy.apply(null, this, KrnLocationHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
