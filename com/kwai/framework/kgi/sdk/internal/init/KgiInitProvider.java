package com.kwai.framework.kgi.sdk.internal.init.KgiInitProvider;
import android.content.ContentProvider;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.content.ContentValues;
import java.lang.Boolean;
import x76.a;
import android.database.Cursor;

public final class KgiInitProvider extends ContentProvider	// class@0015a0
{

    public void KgiInitProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KgiInitProvider.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       a.p(p0, "uri");
       return -1;
    }
    public String getType(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiInitProvider.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uri");
       return null;
    }
    public Uri insert(Uri p0,ContentValues p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, KgiInitProvider.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "uri");
       return null;
    }
    public boolean onCreate(){
       Object obj = PatchProxy.apply(null, this, KgiInitProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.b();
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       if (PatchProxy.isSupport(KgiInitProvider.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p1 = PatchProxy.apply(objArray, this, KgiInitProvider.class, "2");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       a.p(p0, "uri");
       return null;
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KgiInitProvider.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       a.p(p0, "uri");
       return -1;
    }
}
