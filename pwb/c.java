package pwb.c;
import yf7.m;
import java.lang.Object;
import java.util.Map;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.framework.fileuploader.UploadUtils;

public final class c implements m	// class@002208
{

    public void c(){
       super();
    }
    public Object a(Map p0,File p1){
       t ot = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "params");
          a.p(p1, "file");
          ot = UploadUtils.uploadExceptionFile(p1, String.valueOf(p0.get("extraInfo")), String.valueOf(p0.get("fileExtend")));
          a.o(ot, "UploadUtils\n        .upl¡­\(file, extra, fileExtend\)");
       }
       return ot;
    }
}
