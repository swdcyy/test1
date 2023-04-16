package com.yxcorp.gifshow.photo.download.widget.m;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;

public class m extends DownloadPicDialog$g	// class@000f4b
{
    public final DownloadPicDialog b;

    public void m(DownloadPicDialog p0,Map p1){
       this.b = p0;
       super(p1);
    }
    public int g(){
       return 0;
    }
    public boolean h(){
       return true;
    }
    public void onProgress(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "2")) {
          return;
       }
       int i = (int)(p0 * 100.00f);
       int i1 = 2;
       if (i >= this.a.get(Integer.valueOf(i1)).intValue() && i != 100) {
          this.a.put(Integer.valueOf(i1), Integer.valueOf(Math.round((float)i)));
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.a.put(Integer.valueOf(2), Integer.valueOf(1));
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.a.put(Integer.valueOf(2), Integer.valueOf(100));
       return;
    }
}
