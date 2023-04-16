package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c$a;
import m79.d;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c;
import com.kwai.feature.post.api.aicut.AICutProjectOption;
import java.lang.Object;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import h69.b;
import o56.c;
import o56.a;
import xf6.g;
import lnc.eb;
import java.util.Objects;
import kotlin.jvm.internal.a;
import brd.t;
import lnc.kb;
import erd.o;
import com.yxcorp.gifshow.camera.record.album.a;
import com.yxcorp.gifshow.camera.record.album.b;
import erd.g;
import crd.b;
import sb9.b0;
import androidx.recyclerview.widget.RecyclerView;
import d16.a;
import w69.d0;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.util.List;

public class AlbumActivityV2$c$a implements d	// class@001c9f
{
    public final AICutProjectOption b;
    public final AlbumActivityV2$c c;

    public void AlbumActivityV2$c$a(AlbumActivityV2$c p0,AICutProjectOption p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,int p1){
    }
    public void b(c p0,int p1){
       AlbumActivityV2$c$a uoc$a = AlbumActivityV2$c$a.class;
       if (PatchProxy.isSupport(uoc$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc$a, "1")) {
          return;
       }
       AlbumActivityV2$c$a tc = this.c;
       AlbumActivityV2$c d = tc.d;
       AlbumActivityV2$c d1 = this.c.d;
       tc.b.Pu(d, d.O, this.b, false, d.h1, d.N3(), d1.o1, d1.U0);
       this.c.d.S3();
       return;
    }
    public void c(c p0){
       eb a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumActivityV2$c$a.class, "2")) {
          return;
       }
       if (a.a().c() && g.T0()) {
          a = eb.a;
          String path = p0.getPath();
          Objects.requireNonNull(a);
          a.p(path, "path");
          t ot = a.b().map(new kb(path));
          a.o(ot, "checkSo\(\).map {\n      va¡­@map ret.toString\(\)\n    }");
          ot.subscribe(a.b, b.b);
       }
       AlbumActivityV2$c$a tc = this.c;
       AlbumActivityV2$c d = tc.d;
       AlbumActivityV2$c d1 = this.c.d;
       tc.b.Pu(d, d.O, this.b, false, d.h1, d.N3(), d1.o1, d1.U0);
       this.c.d.S3();
       if (this.c.d.R3() || (this.c.d.P3() || b0.f())) {
          int i = this.c.d.O.Ed().computeVerticalScrollOffset();
          a uoa = this.c.d.O3();
          if (uoa != null && (uoa.i() != null && ((this.c.d.O3().i().h() - i) > 0 && this.c.d.O.Xe() instanceof AlbumHomeFragment))) {
             this.c.d.O.Xe().oh();
          }
       }
    label_00cd :
       return;
    }
    public void d(List p0){
    }
}
