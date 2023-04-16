package com.yxcorp.gifshow.music.cloudmusic.h$a;
import com.yxcorp.gifshow.music.utils.a$a;
import com.yxcorp.gifshow.music.cloudmusic.h;
import java.lang.Object;
import java.lang.Throwable;
import kqb.b;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;

public class h$a implements a$a	// class@002018
{
    public final long a;
    public final h b;

    public void h$a(h p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Throwable p0){
       b.b(this, p0);
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       h c = this.b.c;
       if (c != null && c.isAdded()) {
          this.b.f(p0.getPath(), this.a);
       }
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b.c(this, p0, p1);
    }
}
