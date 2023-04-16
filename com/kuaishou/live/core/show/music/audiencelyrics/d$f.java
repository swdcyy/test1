package com.kuaishou.live.core.show.music.audiencelyrics.d$f;
import io.reactivex.g;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import qkd.c;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.io.IOException;
import brd.g;

public class d$f implements g	// class@000d34
{
    public final String b;
    public final d c;

    public void d$f(d p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       Lyrics lyrics;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$f.class, "1")) {
          return;
       }
       d$f tb = this.b;
       try{
          File uFile = new File(tb);
          lyrics = new g0().b(c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(uFile)), "UTF-8")));
       }catch(java.io.IOException e1){
          e1.printStackTrace();
       }
       p0.onNext(lyrics);
       return;
    }
}
