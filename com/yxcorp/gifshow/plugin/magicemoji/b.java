package com.yxcorp.gifshow.plugin.magicemoji.b;
import erd.o;
import com.yxcorp.gifshow.plugin.magicemoji.c;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import s5b.b;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import brd.t;
import uyb.h;
import uyb.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import uyb.k;

public final class b implements o	// class@000fee
{
    public final c b;
    public final File c;

    public void b(c p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       Object[] objArray;
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0;
       String str = (tc != null && tc.exists())? 1: null;
       String str1 = "MagicFaceController";
       if (!str) {
          objArray = new Object[i];
          b.D().w(str1, "checkMagicResource fail, need download", objArray);
          p0 = tb.v(p0, g.q(p0)).map(new h(tb));
       }else if(!tb.u(p0, tc)){
          objArray = new Object[i];
          b.D().w(str1, "MagicFaceWithoutRes check md5 failed, need download!", objArray);
          p0 = tb.v(p0, g.q(p0)).map(new i(tb));
       }else if(g.A(p0)){
          Object[] objArray1 = new Object[i];
          b.D().w(str1, "MagicFaceWithoutRes is not completed, need download!", objArray1);
          Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "28");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(g.B(p0)){
             i = 2;
          }
          if (g.s(p0)) {
             i = i | 0x04;
          }
          if (g.w(p0)) {
             i = i | 0x08;
          }
          if (g.x(p0)) {
             i = i | 0x10;
          }
          if (g.t(p0)) {
             i = i | 0x20;
          }
          if (g.u(p0)) {
             i = i | 0x40;
          }
          p0 = tb.v(p0, i).map(new k(tc));
       }else {
          Object[] objArray2 = new Object[i];
          b.D().w(str1, "MagicFaceRes is completed!", objArray2);
          p0 = t.just(tc);
       }
       return p0;
    }
}
