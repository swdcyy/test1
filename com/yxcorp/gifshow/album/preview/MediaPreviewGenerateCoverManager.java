package com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager;
import java.lang.Object;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import g79.a;
import w69.p0;
import brd.z;
import com.yxcorp.gifshow.album.preview.g;
import java.lang.Runnable;
import crd.b;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$b;

public class MediaPreviewGenerateCoverManager	// class@001a31
{
    public boolean a;
    public LinkedHashMap b;
    public MediaPreviewGenerateCoverManager$b c;

    public void MediaPreviewGenerateCoverManager(){
       super();
       this.a = false;
       this.b = new MediaPreviewGenerateCoverManager$1(this, false, 0x3f400000, true);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewGenerateCoverManager.class, "5")) {
          return;
       }
       Iterator iterator = this.b.keySet().iterator();
       String str = "MediaPreviewGenerateCoverManager";
       if (!iterator.hasNext()) {
          Log.g(str, "no more task");
          return;
       }else if(this.a != null){
          return;
       }else {
          this.a = true;
          MediaPreviewGenerateCoverManager$a uoa = iterator.next();
          while (iterator.hasNext()) {
             uoa = iterator.next();
          }
          this.b.put(uoa, Boolean.TRUE);
          Log.g(str, "run task, index = "+uoa.a);
          a.c.i().d().d(new g(this, uoa));
          return;
       }
    }
    public void b(MediaPreviewGenerateCoverManager$b p0){
       this.c = p0;
    }
}
