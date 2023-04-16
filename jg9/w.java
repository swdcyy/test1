package jg9.w;
import java.util.concurrent.Callable;
import com.kwai.kve.SmartCoverTaskBuilder;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import com.kwai.kve.SmartCoverTask;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import xf6.g;
import android.graphics.Bitmap$Config;
import com.kwai.kve.FaceData;
import com.kwai.kve.SmartCoverResult;
import com.kwai.kve.ErrorInfo;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kwai.kve.ErrorInfo$ErrorCode;

public final class w implements Callable	// class@002abd
{
    public final SmartCoverTaskBuilder b;
    public final Bitmap c;

    public void w(SmartCoverTaskBuilder p0,Bitmap p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       FaceData[] uFaceDataArr;
       SmartCoverResult smartCoverRe;
       ErrorInfo errorInfo;
       Object[] objArray = null;
       Double uDouble = PatchProxy.apply(objArray, this, w.class, "1");
       if (uDouble != PatchProxyResult.class) {
       }else {
          SmartCoverTask smartCoverTa = this.b.build();
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          int i = 0;
          int i1 = 1;
          if (uoc.c() && g.h1()) {
             uFaceDataArr = new FaceData[i];
             smartCoverRe = smartCoverTa.analyze(Bitmap.createBitmap(i1, i1, Bitmap$Config.RGB_565), uFaceDataArr);
          }else {
             uFaceDataArr = new FaceData[i];
             smartCoverRe = smartCoverTa.analyze(this.c, uFaceDataArr);
          }
          if (smartCoverRe != null) {
             errorInfo = smartCoverRe.getErrorInfo();
             if (errorInfo != null && errorInfo.isOK() == i1) {
                smartCoverTa.release();
                uDouble = Double.valueOf(smartCoverRe.getScore());
             }
          }
          StringBuilder str = '(';
          a.o(smartCoverRe, "result");
          ErrorInfo errorInfo1 = smartCoverRe.getErrorInfo();
          if (errorInfo1 != null) {
             objArray = errorInfo1.getErrorCode();
          }
          ErrorInfo errorInfo2 = smartCoverRe.getErrorInfo();
          a.o(errorInfo2, "result.errorInfo");
          throw new IllegalStateException(str+objArray+')'+errorInfo2.getErrorMessage());
       }
       return uDouble;
    }
}
