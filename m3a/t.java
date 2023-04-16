package m3a.t;
import m3a.t$a;
import nsd.u;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import m3a.t$b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import qvb.q;
import qvb.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uw9.o;
import java.lang.StringBuilder;
import m3a.r;
import q87.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import m3a.b;

public final class t	// class@002f23
{
    public int a;
    public final List b;
    public final List c;
    public final t$b d;
    public final i e;
    public final QPhoto f;
    public static final t$a g;

    static {
       t.g = new t$a(null);
    }
    public void t(i p0,QPhoto p1){
       a.p(p0, "mPageList");
       a.p(p1, "mEnterPhoto");
       super();
       this.e = p0;
       this.f = p1;
       int i = -1;
       this.a = i;
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       this.c = new ArrayList();
       this.d = new t$b(this);
       List items = p0.getItems();
       a.o(items, "mPageList.items");
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = items.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          if (!a.g(obj1, this.f)) {
             a.o(obj1, "it");
             if (!obj1.isVideoType() || (obj1.isAd() || (obj1.isLiveStream() || this.c(obj1)))) {
             label_006f :
                if (i1) {
                   uArrayList1.add(obj);
                }
             }
          }
          i1 = 1;
          goto label_006f ;
       }
       uArrayList.addAll(uArrayList1);
       int i2 = this.b.indexOf(this.f);
       this.a = i2;
       if (i2 == i) {
          this.b.add(i1, this.f);
          this.a = i1;
       }
       this.e.h(this.d);
       return;
    }
    public final QPhoto a(){
       Object[] objArray1;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       int i = 0;
       if (obj >= null && obj < this.b.size()) {
          objArray1 = new Object[i];
          o.C().w("SmallWindowPlayController", "getCurrentPhoto: "+r.a(this.b.get(this.a)), objArray1);
          return this.b.get(this.a);
       }else {
          objArray1 = new Object[i];
          o.C().w("SmallWindowPlayController", "getCurrentPhoto: null", objArray1);
          return objArray;
       }
    }
    public final QPhoto b(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ot, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if ((this.b.size() - this.a) < 3) {
          Object[] objArray1 = new Object[0];
          o.C().w("SmallWindowPlayController", "getNextPhoto: load more", objArray1);
          this.e.load();
       }
       Object[] obj1 = PatchProxy.apply(objArray, this, ot, "8");
       int i = 1;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if((this.a + i) < this.b.size()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          objArray = new Object[0];
          o.C().w("SmallWindowPlayController", "getNextPhoto: "+r.a(this.b.get((this.a + i)))+", index "+(this.a + i), objArray);
          int i1 = this.a + i;
          this.a = i1;
          return this.b.get(i1);
       }else {
          obj1 = new Object[0];
          o.C().w("SmallWindowPlayController", "getNextPhoto: null", obj1);
          return objArray;
       }
    }
    public final boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       boolean b = true;
       if (!MusicExperienceUtils.a()) {
          Music music = d6.c(p0);
          if (music != null && music.isCopyrightRiskMusic() == b) {
          label_002e :
             return b;
          }
       }
       b = false;
       goto label_002e ;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, t.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("SmallWindowPlayController", "notifyPause", objArray);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(0);
       }
       return;
    }
}
