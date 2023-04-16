package com.yxcorp.gifshow.photo.download.widget.n;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.util.Map;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.Float;
import java.lang.Math;

public class n extends DownloadPicDialog$g	// class@000f4c
{
    public boolean b;
    public final int c;
    public final StatModel d;
    public final DownloadPicDialog e;

    public void n(DownloadPicDialog p0,Map p1,int p2,StatModel p3){
       this.e = p0;
       this.c = p2;
       this.d = p3;
       super(p1);
       this.b = false;
    }
    public int d(){
       return this.c;
    }
    public StatModel e(){
       return this.d;
    }
    public int g(){
       return 2;
    }
    public boolean h(){
       return true;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.a.put(Integer.valueOf(this.c), Integer.valueOf(true));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "5")) {
          return;
       }
       this.onStart();
       this.a.put(Integer.valueOf(this.c), Integer.valueOf(-1));
       return;
    }
    public void onProgress(float p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, on, "3")) {
          return;
       }
       this.i();
       int i = (int)(p0 * 100.00f);
       if (i < this.a.get(Integer.valueOf(this.c)).intValue()) {
          return;
       }
       this.a.put(Integer.valueOf(this.c), Integer.valueOf(Math.round((float)i)));
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.i();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       this.i();
       this.a.put(Integer.valueOf(this.c), Integer.valueOf(100));
       return;
    }
}
