package com.kuaishou.gifshow.kuaishan.logic.a$a;
import erd.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;

public final class a$a implements f	// class@0019f9
{
    public static final a$a a;

    static {
       a$a.a = new a$a();
    }
    public void a$a(){
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KS_Hodor", "downloadAeBuiltInRes: Cancellable do", objArray);
       KSDownloadHelperX.o.a().b();
       return;
    }
}
