package com.kwai.logger.upload.retrieve.klink.a;
import j85.e;
import java.lang.Object;
import java.lang.String;
import y87.b;
import java.lang.StringBuilder;
import t87.d;
import y87.a;
import java.lang.Runnable;
import f97.a;

public final class a implements e	// class@000eef
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       d.a("ObiwanUploader", "KLink onNoticeAccept = "+p0+", action = "+p1+",extra = "+new String(p2));
       a.a(new a(p0, p2));
    }
}
