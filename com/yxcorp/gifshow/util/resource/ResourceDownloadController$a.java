package com.yxcorp.gifshow.util.resource.ResourceDownloadController$a;
import android.os.Handler;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import android.os.Looper;
import android.os.Message;
import com.yxcorp.download.DownloadManager;
import java.lang.Object;
import java.util.Objects;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Set;

public class ResourceDownloadController$a extends Handler	// class@000cd5
{
    public final ResourceDownloadController a;

    public void ResourceDownloadController$a(ResourceDownloadController p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       Object[] objArray;
       super.handleMessage(p0);
       Message what = p0.what;
       if (what != 3) {
          if (what == 4) {
             Objects.requireNonNull(DownloadManager.n());
             objArray = new Object[0];
             a.C().w("DownloadController", "change level "+p0.arg1, objArray);
          }
       }else {
          this.a.b.remove(p0.obj);
          this.a.c.remove(p0.obj);
          this.a.d.remove(p0.obj);
          this.a.a();
          objArray = new Object[0];
          a.C().w("DownloadController", "remove key "+p0.obj, objArray);
       }
       return;
    }
}
