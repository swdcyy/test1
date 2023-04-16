package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c$b;
import m79.d;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import com.yxcorp.gifshow.camera.record.album.s;
import com.yxcorp.gifshow.activity.GifshowActivity;
import r79.c;
import java.util.List;

public class AlbumActivityV2$c$b implements d	// class@001ca0
{
    public final AlbumActivityV2$c b;

    public void AlbumActivityV2$c$b(AlbumActivityV2$c p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1){
       if (PatchProxy.isSupport(AlbumActivityV2$c$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AlbumActivityV2$c$b.class, "1")) {
          return;
       }
       AlbumActivityV2$c d = this.b.d;
       if (d.S == null) {
          d.S = new s(d);
       }
       d.f = true;
       return;
    }
    public void b(c p0,int p1){
    }
    public void c(c p0){
    }
    public void d(List p0){
    }
}
