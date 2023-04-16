package c4a.a;
import j4a.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import tkd.b;
import tkd.d;
import os5.l;
import java.util.Map;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;

public class a extends b	// class@000545
{

    public void a(){
       super();
    }
    public void a(ClientContent$ContentPackage p0,ClientEvent$ElementPackage p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       this.d(p0);
       return;
    }
    public void b(ClientContent$ContentPackage p0,ClientEvent$ElementPackage p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "2")) {
          return;
       }
       this.d(p0);
       return;
    }
    public final void d(ClientContent$ContentPackage p0){
       Iterator iterator;
       Map$Entry uEntry;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       if (p0 != null && p0.tagPackage != null) {
          Map map = d.a(-1492894991).Rf();
          if (!q.h(map)) {
             p0 = p0.tagPackage;
             ClientContent$TagPackage params = p0.params;
             String str = PatchProxy.applyTwoRefs(params, map, this, uoa, "4");
             if (str != PatchProxyResult.class) {
             }else {
                JsonObject jsonObject = null;
                if (!TextUtils.x(params)) {
                   try{
                      jsonObject = a.a.h(params, JsonObject.class);
                   }catch(java.lang.Exception e2){
                      Log.e("RecruitPlcLogParamHandler", "appendParam", e2);
                   }
                }
             }
             p0.params = str;
          }
       }
       return;
    }
}
