package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$a;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import java.io.Serializable;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import android.os.Parcelable;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import moc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;

public final class PlcDynamicContainerActivity$a	// class@000fc6
{

    public void PlcDynamicContainerActivity$a(){
       super();
    }
    public void PlcDynamicContainerActivity$a(u p0){
       super();
    }
    public final Intent a(Context p0,PlcDynamicContainerConfig p1,Serializable p2,String p3,String p4,long p5,long p6,String p7){
       Intent obj;
       k2 ok21;
       String str;
       PlcDynamicContainerActivity$a uoa = PlcDynamicContainerActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5),Long.valueOf(p6),p7};
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       a.p(p1, "containerConfig");
       a.p(p7, "sourceUri");
       obj = new Intent(p0, PlcDynamicContainerActivity.class);
       obj.putExtra("CONTAINER_CONFIG", p1);
       obj.putExtra("PlcDynamicContainerToken", p3);
       obj.putExtra("EXTRA_KEY_ROUTE_HANDLE_START_TIMESTAMP", p5);
       obj.putExtra("EXTRA_KEY_ROUTE_HANDLE_FINISH_TIMESTAMP", p6);
       obj.putExtra("EXTRA_KEY_SOURCE_URI", p7);
       k2 ok2 = null;
       int i = -1;
       if (p2 instanceof Map) {
          ok21 = p2.get("QPhoto");
          if (ok21 != null) {
             if (!ok21 instanceof QPhoto) {
                ok21 = ok2;
             }
             if (ok21 != null) {
                i = b.d(ok21);
             }
          }
       }
       obj.putExtra("SOURCE_PHOTO_SAVE_ID", i);
       if (!TextUtils.x(p4)) {
          str = "[router]";
       }else if(!TextUtils.x(p1.getCodSourcePage())){
          p4 = TextUtils.I(p1.getCodSourcePage());
          str = "[scheme]";
       }else {
          ok21 = b.a(0x4b316083);
          a.o(ok21, "Singleton.get\(ILogManager::class.java\)");
          ok21 = ok21.f();
          if (ok21 != null) {
             ok2 = ok21.d;
          }
          p4 = TextUtils.I(ok2);
          str = "[log sdk]";
       }
       if (TextUtils.x(p4)) {
          str = "[default unknown]";
          p4 = "UNKNOWN";
       }
       PlcDynamicLogger.c("source page:"+p4+", priority:"+str);
       obj.putExtra("codSourcePage", p4);
       return obj;
    }
}
