package com.yxcorp.gifshow.upload.r1$b$e;
import erd.g;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.retrofit.model.RetrofitException;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import lnc.s6;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.upload.UploadException;
import java.lang.Exception;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;

public class r1$b$e implements g	// class@001ea3
{
    public final r1$b b;

    public void r1$b$e(r1$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, r1$b$e.class, "1")) {
       }else {
          r1$b$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, r1$b.class, "6")) {
             String str = "UploadManager";
             if (p0 == null || TextUtils.x(p0.getMessage())) {
                if (p0 != null) {
                   a.D().e(str, "reportExceptionToKeep ", p0);
                   ExceptionHandler.handleCaughtException(new UploadException(p0));
                }
             }else {
                String message = p0.getMessage();
                int i = 0;
                if (!p0 instanceof RetrofitException || (message.contains("FileNotFoundException") && (message.contains("NetworkException") || message.contains("Network disconnected")))) {
                   objArray = new Object[i];
                   a.D().w(str, "ignore NetworkException "+p0, objArray);
                }else if((p0.getMessage()).contains("KSUploaderCloseReason")){
                   objArray = new Object[i];
                   a.D().w(str, "ignore KSUploaderCloseReason "+p0, objArray);
                }else if(s6.B() && (p0 instanceof KwaiException && p0.getErrorCode() == 0xc384)){
                   objArray = new Object[i];
                   a.D().w(str, "ignore UploadForbid "+p0, objArray);
                }else {
                   UploadException uploadExcept = new UploadException(p0);
                   Object[] objArray1 = new Object[i];
                   a.D().w(str, "reportExceptionToKeep exception: "+uploadExcept.getLocalizedMessage(), objArray1);
                   ExceptionHandler.handleCaughtException(uploadExcept);
                }
             }
          }
       }
       return;
    }
}
