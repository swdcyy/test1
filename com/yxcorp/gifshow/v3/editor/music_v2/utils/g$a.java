package com.yxcorp.gifshow.v3.editor.music_v2.utils.g$a;
import com.kwai.video.editorsdk2.RemuxTask;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class g$a	// class@00112b
{
    public final long a;
    public final RemuxTask b;
    public final String c;
    public final String d;
    public final String e;

    public void g$a(long p0,RemuxTask p1,String p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public String a(){
       return this.d;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoToAudioExportResultData{mProgress="+this.a+", mRemuxTask="+this.b+", mVideoAbsPath=\'"+this.c+'''+", mAudioPath=\'"+this.d+'''+'}';
    }
}
