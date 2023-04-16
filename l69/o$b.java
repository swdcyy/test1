package l69.o$b;
import erd.o;
import l69.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import l69.t;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.c;
import java.util.Collection;
import h69.g;
import java.lang.StringBuilder;
import q87.c;

public final class o$b implements o	// class@002ca3
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, o$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "musicList");
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(t.a.a(iterator.next()));
          }
          this.b.b().T().addAll(uArrayList);
          Object[] objArray = new Object[0];
          g.D().w("KwaiAICutProject", "loadRecoMusicList get recommend music size="+p0.size(), objArray);
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
