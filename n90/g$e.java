package n90.g$e;
import erd.g;
import n90.g;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.String;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import androidx.lifecycle.MutableLiveData;
import java.lang.System;
import t90.j;

public final class g$e implements g	// class@0026d8
{
    public final g b;
    public final o1 c;
    public final long d;
    public final String e;

    public void g$e(g p0,o1 p1,long p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       g$e uoe = g$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoe, "1")) {
          Object[] objArray = new Object[0];
          e.D().s("KuaiShanAlbumDataHelper", "doPrepareMedias progress:"+i, objArray);
          int i1 = (g7.b(this.c.k0()))? (int)(((float)i * 0x3f000000) + 50.00f): i;
          this.b.g().setValue(Integer.valueOf(i1));
          if (i == 100) {
             j.h(7, (System.currentTimeMillis() - this.d), this.e);
          }
       }
       return;
    }
}
