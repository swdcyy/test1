package com.kwai.video.krtc.c;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.lang.Integer;

public class c	// class@000776
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void c(){
       super();
       this.g = 0;
       this.f = 0;
       this.e = 0;
       this.b = 0;
       this.a = 0;
       this.d = 0;
       this.c = 0;
    }
    public String a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("KtvBgmContext", "ktv vad result: "+p0.toString());
       int i = 0;
       this.g = i;
       this.f = i;
       this.e = i;
       if (p0.size() > 2) {
          this.e = p0.get(i).intValue();
          this.f = p0.get(1).intValue();
          this.g = p0.get(2).intValue();
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.c),Integer.valueOf(this.d),Integer.valueOf(this.b),Integer.valueOf(this.e),Integer.valueOf(this.f),Integer.valueOf(this.g)};
       return String.format("{\"bgmStartPos\":%d,\"bgmEndPos\":%d,\"bgmFileDur\":%d,\"totalLyricsCnt\":%d,\"shouldSingLyricsCnt\":%d,\"realSingLyricsCnt\":%d}", objArray);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.a(0);
       return;
    }
    public void a(int p0){
       this.c = p0;
       this.g = 0;
       this.f = 0;
       this.e = 0;
       this.b = 0;
       this.a = 0;
       this.d = 0;
    }
    public void b(){
       this.d = this.a;
    }
}
