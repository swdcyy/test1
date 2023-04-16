package com.kuaishou.gifshow.files.security.SensitiveFileDefender;
import com.kuaishou.gifshow.files.security.SensitiveFileDefender$mSensitiveFiles$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;

public final class SensitiveFileDefender	// class@0019c5
{
    public static final p a;
    public static final SensitiveFileDefender b;

    static {
       SensitiveFileDefender.b = new SensitiveFileDefender();
       SensitiveFileDefender.a = s.c(SensitiveFileDefender$mSensitiveFiles$2.INSTANCE);
    }
    public void SensitiveFileDefender(){
       super();
    }
    public static final void a(){
       SensitiveFileDefender sensitiveFil = SensitiveFileDefender.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, sensitiveFil, "2")) {
          return;
       }
       SensitiveFileDefender b = SensitiveFileDefender.b;
       Objects.requireNonNull(b);
       Iterator obj = PatchProxy.apply(objArray, b, sensitiveFil, "1");
       if (obj == PatchProxyResult.class) {
          obj = SensitiveFileDefender.a.getValue();
       }
       obj = obj.iterator();
       while (obj.hasNext()) {
          File uFile = obj.next();
          if (uFile.exists()) {
             uFile.setLastModified(0);
          }
       }
       Result.constructor-impl(l1.a);
       return;
    }
}
