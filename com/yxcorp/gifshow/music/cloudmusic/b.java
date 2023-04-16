package com.yxcorp.gifshow.music.cloudmusic.b;
import y8c.g;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import lob.o;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import lob.f;
import ekd.j;

public abstract class b extends g	// class@001fee
{
    public int w;
    public CloudMusicHelper x;
    public final CloudMusicHelper$a y;

    public void b(CloudMusicHelper p0){
       super();
       this.w = -1;
       o oo = new o(this);
       this.y = oo;
       this.x = p0;
       p0.g(oo);
    }
    public ArrayList a1(int p0,f p1){
       g obj;
       Object[] objArray;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.k;
       if (obj instanceof CloudMusicRecyclerFragment) {
          objArray = new Object[]{obj,obj.Gh()};
          return j.a(objArray);
       }else {
          objArray = new Object[]{obj};
          return j.a(objArray);
       }
    }
}
