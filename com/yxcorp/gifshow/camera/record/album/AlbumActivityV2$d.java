package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$d;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.aicut.AICutProjectOption;
import com.kuaishou.android.model.music.MusicType;
import tkd.b;
import tkd.d;
import h69.b;
import sb9.b0;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import r79.c;

public class AlbumActivityV2$d implements IAlbumMainFragment$g	// class@001ca2
{
    public final AlbumActivityV2 a;

    public void AlbumActivityV2$d(AlbumActivityV2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2$d.class, "2")) {
          return;
       }
       AlbumActivityV2$d ta = this.a;
       boolean b = false;
       ta.h1 = b;
       if (ta.g1 != null && ta.L3()) {
          ta = this.a;
          AlbumActivityV2 p = ta.P;
          AlbumActivityV2 x = ta.X;
          AlbumActivityV2 y = ta.Y;
          AlbumActivityV2 z = ta.Z;
          if (z != null) {
             b = z.getValue();
          }
          AlbumActivityV2$d ta1 = this.a;
          ta = this.a;
          d.a(-873393519).Pu(ta1, ta1.O, new AICutProjectOption(p, x, y, b), (b0.f() ^ 0x01), false, false, ta.o1, ta.U0);
          this.a.S3();
       }
       this.a.b2(1);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumActivityV2$d.class, "1")) {
          return;
       }
       AlbumActivityV2$d ta = this.a;
       if (ta.g1 != null && ta.L3()) {
          ta = this.a;
          AlbumActivityV2 p = ta.P;
          AlbumActivityV2 x = ta.X;
          AlbumActivityV2 y = ta.Y;
          AlbumActivityV2 z = ta.Z;
          int i = (z == null)? 0: z.getValue();
          AlbumActivityV2$d ta1 = this.a;
          d.a(-873393519).Pu(ta1, ta1.O, new AICutProjectOption(p, x, y, i), true, true, false, ta1.o1, ta1.U0);
          this.a.S3();
       }
       return;
    }
    public void c(){
       this.a.h1 = true;
    }
}
