package com.kuaishou.PostDir$a;
import android.os.FileObserver;
import com.kuaishou.PostDir;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.b;
import java.lang.StringBuilder;
import java.util.Set;
import o56.a;
import gq.a;
import q87.c;

public class PostDir$a extends FileObserver	// class@00076d
{
    public final String a;
    public final PostDir b;

    public void PostDir$a(PostDir p0,String p1,int p2,String p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void onEvent(int p0,String p1){
       if (PatchProxy.isSupport(PostDir$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PostDir$a.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (b.d.b != null) {
          return;
       }
       p0 = p0 & 0x0fff;
       String str = this.a+"/"+p1;
       PostDir mUsedFile = this.b.mUsedFile;
       _monitor_enter(mUsedFile);
       int i = 0;
       if (this.b.mUsedFile.contains(str)) {
          if (a.d()) {
             Object[] objArray = new Object[i];
             a.D().y("PostDir", "onEvent\(\) has access="+p1, objArray);
          }
          _monitor_exit(mUsedFile);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("PostDir", "onEvent\(\) event="+PostDir.eventToString(p0)+" "+str, objArray1);
          this.b.mUsedFile.add(str);
          _monitor_exit(mUsedFile);
          return;
       }
    }
}
