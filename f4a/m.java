package f4a.m;
import android.os.Environment;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import tkd.b;
import tkd.d;
import nl9.d;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.b;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;

public class m	// class@0022b1
{
    public static final String a;

    static {
       m.a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
    }
    public void m(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (m.f(p0) == APKDownloadTask$DownloadStatus.COMPLETED)? true: false;
       return b;
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (m.f(p0) == APKDownloadTask$DownloadStatus.STARTED)? true: false;
       return b;
    }
    public static boolean c(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return SystemUtil.M(p0, p1);
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (m.f(p0) == APKDownloadTask$DownloadStatus.PAUSED)? true: false;
       return b;
    }
    public static APKDownloadTask e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x4bd38ddd).KK(p0);
    }
    public static APKDownloadTask$DownloadStatus f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       APKDownloadTask uAPKDownload = d.a(0x4bd38ddd).KK(p0);
       if (uAPKDownload == null) {
          return APKDownloadTask$DownloadStatus.INITIALIZED;
       }
       return uAPKDownload.mCurrentStatus;
    }
    public static void g(String p0,String p1){
       boolean b;
       m om = m.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, om, "1")) {
          return;
       }
       APKDownloadTask uAPKDownload = m.e(p0);
       if (m.a(p0)) {
          p0 = PatchProxy.applyOneRefs(p1, null, om, "5");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else {
             p0 = m.a+File.separator+p1;
             b = (!TextUtils.x(p0) && (b.K(p0) && new File(p0).exists()))? true: false;
          }
          if (!b) {
             uAPKDownload.setToDeletedStatus();
          }
       }
       return;
    }
    public static boolean h(PlcEntryDataAdapter p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getBizType() == 1) {
          b = true;
       }
       return b;
    }
}
