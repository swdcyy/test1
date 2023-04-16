package ls1.d;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import ls1.d$a;
import ub.b;
import ls1.f;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.lang.Boolean;

public final class d	// class@003011
{
    public final LiveResourceFileUtil$LiveResourceFileType a;
    public final String b;

    public void d(LiveResourceFileUtil$LiveResourceFileType p0,String p1){
       a.p(p0, "resourceFileType");
       a.p(p1, "resourceDirAbsolutePath");
       super();
       this.a = p0;
       this.b = p1;
       LiveResourceFileUtil.h(p0);
    }
    public final void a(KwaiBindableImageView p0,String p1,String p2,l p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "3")) {
          return;
       }
       a.p(p0, "targetView");
       a.p(p3, "bindFailureListener");
       if (TextUtils.isEmpty(p1)) {
          p3.invoke(null);
          return;
       }else {
          File uFile = LiveResourceFileUtil.j(this.a, this.b(p1, p2));
          if (uFile != null && uFile.exists()) {
             p0.w(uFile, 0, 0, new d$a(p3));
          }else {
             b.P(f.a, "do not has resource");
             p3.invoke(null);
          }
          return;
       }
    }
    public final String b(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveResourceFileUtil$LiveResourceFileType mFilePathInf = this.a.mFilePathInfo;
       a.o(mFilePathInf, "resourceFileType.mFilePathInfo");
       obj = mFilePathInf.a()+'/'+this.b;
       if (!TextUtils.isEmpty(p1)) {
          obj = obj+'/'+p1;
       }
       return obj+'/'+p0;
    }
    public final boolean c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       File uFile = LiveResourceFileUtil.j(this.a, this.b(p0, p1));
       if (uFile != null && uFile.exists() == true) {
          b = true;
       }
       return b;
    }
}
