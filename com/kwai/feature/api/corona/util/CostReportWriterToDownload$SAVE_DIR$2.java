package com.kwai.feature.api.corona.util.CostReportWriterToDownload$SAVE_DIR$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import java.io.File;
import android.app.Application;
import kotlin.jvm.internal.a;

public final class CostReportWriterToDownload$SAVE_DIR$2 extends Lambda implements a	// class@000e38
{
    public static final CostReportWriterToDownload$SAVE_DIR$2 INSTANCE;

    static {
       CostReportWriterToDownload$SAVE_DIR$2.INSTANCE = new CostReportWriterToDownload$SAVE_DIR$2();
    }
    public void CostReportWriterToDownload$SAVE_DIR$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, this, CostReportWriterToDownload$SAVE_DIR$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.B.getExternalFilesDir("");
       if (obj == null) {
          Application b = a.B;
          a.o(b, "AppEnv.APP");
          obj = b.getExternalCacheDir();
       }
       if (obj != null) {
          objArray = obj.getAbsolutePath();
       }
       return String.valueOf(objArray);
    }
}
