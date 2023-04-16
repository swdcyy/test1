package com.yxcorp.gifshow.edit.draft.model.g;
import erd.g;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import laa.l0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import ekd.k1;
import haa.d;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import haa.f;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import usd.k;
import ssd.e;
import usd.q;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Objects;
import laa.h;
import java.lang.Number;
import wkd.b;
import j80.c;
import java.io.File;
import android.os.StatFs;
import org.json.JSONObject;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import q2b.h$b;
import k2b.u1;

public final class g implements g	// class@001afe
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void accept(Object p0){
       l0 a;
       List list = p0;
       l0 ol0 = l0.class;
       int i = list.size();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = null;
       Object[] obj = null;
       if (!PatchProxy.isSupport(ol0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, ol0, "2")) {
          SharedPreferences$Editor obj1 = PatchProxy.apply(obj, obj, ol0, "1");
          String str1 = "log_draft_file_count_time";
          String str2 = "user";
          boolean b = true;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if((k1.i() - d.a.getLong(b.d(str2)+str1, str)) - 0x5265c00 <= 0){
             obj = new Object[0];
             f.D().w("DraftFileUtils", "have log draft file in 24h", obj);
          }else {
             int i2 = a.t().a("localAlbumCountReporterSampleRatio", 1000);
             if (i2 > 0) {
                int i3 = q.A0(new k(b, i2), e.b);
                Object[] objArray4 = new Object[0];
                f.D().w("DraftFileUtils", "random range:"+i2+" num: "+i3, objArray4);
                if (i3 != b) {
                }
             }
          }
          if (b) {
             obj1 = d.a.edit();
             obj1.putLong(b.d(str2)+str1, k1.i());
             g.a(obj1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COUNT_LOCAL_ALBUM_PHOTO";
             a = l0.a;
             Objects.requireNonNull(a);
             if (PatchProxy.isSupport(ol0)) {
                str1 = PatchProxy.applyOneRefs(Integer.valueOf(i), a, ol0, "4");
                if (str1 != patchProxyRe) {
                label_0170 :
                   uElementPack.params = str1;
                   h$b uob = h$b.e(10, "COUNT_LOCAL_ALBUM_PHOTO");
                   uob.k(uElementPack);
                   u1.r0(uob);
                }
             }
             long l2 = DraftFileManager.w(0).b();
             Object obj2 = PatchProxy.apply(null, null, ol0, "6");
             long l3 = (obj2 != patchProxyRe)? obj2.longValue(): new StatFs(b.a(-1504323719).n().getAbsolutePath()).getTotalBytes();
             JSONObject jSONObject = new JSONObject();
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             jSONObject.put("is_login", mE.isLogined());
             jSONObject.put("draft_count", i);
             jSONObject.put("total_disk", l3);
             jSONObject.put("used_disk", l2);
             Object[] objArray3 = new Object[0];
             f.D().w("DraftFileUtils", "buildFileCountParams jsonObject = "+jSONObject, objArray3);
             str1 = jSONObject.toString();
             a.o(str1, "jsonObject.toString\(\)");
             goto label_0170 ;
          }
       }
       int i1 = list.size();
       if (!PatchProxy.isSupport(ol0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), null, ol0, "3")) {
          long l = d.b();
          if (!l - str) {
             Object[] objArray = new Object[0];
             f.D().w("DraftFileUtils", "user have no record draft count, not need check, "+"local count: "+i1, objArray);
             d.c((long)i1);
          }else {
             Object[] objArray1 = new Object[0];
             f.D().w("DraftFileUtils", "before count "+l+" , this open app count is "+i1, objArray1);
             long l1 = (long)i1;
             if (l - l1) {
                d.c(l1);
                Object[] objArray2 = new Object[0];
                f.D().A("DraftFileUtils", "reportLocalAlbumCountException\(\) "+"draft num before="+l+"  now="+i1+' ', objArray2);
             }
          }
       }
       return;
    }
}
