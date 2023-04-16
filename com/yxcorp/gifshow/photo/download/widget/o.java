package com.yxcorp.gifshow.photo.download.widget.o;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.util.Map;
import java.lang.Integer;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.Float;
import java.lang.Math;

public class o extends DownloadPicDialog$g	// class@000f4d
{
    public final Integer b;
    public final File c;
    public final DownloadPicDialog d;

    public void o(DownloadPicDialog p0,Map p1,Integer p2,File p3){
       this.d = p0;
       this.b = p2;
       this.c = p3;
       super(p1);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.intValue();
    }
    public File f(){
       return this.c;
    }
    public int g(){
       return 1;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (this.b.intValue() != (this.d.C - i)) {
          i = false;
       }
       return i;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "5")) {
          return;
       }
       this.a.put(Integer.valueOf(((this.b.intValue() + this.d.E) + 1)), Integer.valueOf(-1));
       return;
    }
    public void onProgress(float p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oo, "3")) {
          return;
       }
       this.a.put(Integer.valueOf(((this.b.intValue() + this.d.E) + 1)), Integer.valueOf(Math.round((float)(int)(p0 * 100.00f))));
       return;
    }
    public void onStart(){
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       this.a.put(Integer.valueOf(((this.b.intValue() + this.d.E) + 1)), Integer.valueOf(100));
       return;
    }
}
