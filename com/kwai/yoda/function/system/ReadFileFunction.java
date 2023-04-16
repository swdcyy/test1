package com.kwai.yoda.function.system.ReadFileFunction;
import ay7.a;
import com.kwai.yoda.function.system.ReadFileFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.system.ReadFileFunction$b;
import yz7.e;
import java.lang.CharSequence;
import java.util.Locale;
import kotlin.jvm.internal.a;
import java.io.File;
import java.io.ByteArrayOutputStream;
import android.util.Base64OutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import isd.a;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import kotlin.io.FilesKt__UtilsKt;
import com.kwai.yoda.function.system.ReadFileFunction$GetAudioRecordResultParam;
import com.kwai.yoda.bridge.YodaException;
import kotlin.TypeCastException;

public final class ReadFileFunction extends a	// class@0011f1
{
    public static final ReadFileFunction$a d;

    static {
       ReadFileFunction.d = new ReadFileFunction$a(null);
    }
    public void ReadFileFunction(){
       super();
    }
    public String c(){
       return "readFile";
    }
    public String d(){
       return "system";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ReadFileFunction readFileFunc = ReadFileFunction.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, readFileFunc, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       String str = null;
       ReadFileFunction$b uob = e.a(p1, ReadFileFunction$b.class);
       String str1 = "The Input parameter is invalid.";
       int i = 0x1e84f;
       if (uob == null) {
          throw new YodaException(i, str1);
       }
       ReadFileFunction$b uob1 = (!uob.filepath.length())? 1: null;
       if (!uob1) {
          uob1 = uob.encoding;
          Locale uS = Locale.US;
          a.h(uS, "Locale.US");
          if (uob1 != null) {
             String str2 = uob1.toLowerCase(uS);
             a.h(str2, "\(this as java.lang.String\).toLowerCase\(locale\)");
             if (str2.hashCode() == -1396204209 && str2.equals("base64")) {
                File uFile = new File(uob.filepath);
                if (uFile.exists()) {
                   uob = PatchProxy.applyOneRefs(uFile, this, readFileFunc, "2");
                   if (uob != patchProxyRe) {
                   }else {
                      a.q(uFile, "file");
                      ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                      Base64OutputStream uBase64Outpu = new Base64OutputStream(uByteArrayOu, 0);
                      FileInputStream uFileInputSt = new FileInputStream(uFile);
                      a.l(uFileInputSt, uBase64Outpu, 0, 2, str);
                      b.a(uFileInputSt, str);
                      b.a(uBase64Outpu, str);
                      String str3 = uByteArrayOu.toString();
                      a.h(str3, "outputStream.toString\(\)");
                      b.a(uByteArrayOu, str);
                      a.h(str3, "ByteArrayOutputStream\(\).¡­utStream.toString\(\)\n    }");
                      uByteArrayOu = str3;
                   }
                   ReadFileFunction$GetAudioRecordResultParam getAudioReco = new ReadFileFunction$GetAudioRecordResultParam();
                   getAudioReco.mResult = 1;
                   getAudioReco.data = uob;
                   getAudioReco.type = FilesKt__UtilsKt.Y(uFile);
                   return getAudioReco;
                }else {
                   throw new YodaException(0x1e8b0, "File not exist.");
                }
             }else {
                throw new YodaException(i, str1);
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
          }
       }else {
          throw new YodaException(i, str1);
       }
    }
}
