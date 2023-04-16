package h79.a;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import h79.a$a;
import nsd.u;
import android.content.Context;
import java.lang.String;
import android.database.Cursor;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import h79.a$b;
import java.util.concurrent.Callable;
import h79.a$c;
import erd.o;
import java.util.List;
import tkd.b;
import tkd.d;
import ra0.d;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.smartalbum.SmartAlbumTab;
import com.yxcorp.gifshow.models.QMedia;

public final class a extends BaseLoaderImpl	// class@002561
{
    public final String n;
    public static final a$a o;

    static {
       a.o = new a$a(null);
    }
    public void a(Context p0,int p1,String p2,Cursor p3,MediaFilterList p4,int p5,u p6){
       MediaFilterList mediaFilterL = (p5 & 0x10)? new MediaFilterList(): null;
       a.p(p0, "context");
       a.p(p2, "scene");
       a.p(mediaFilterL, "filter");
       super(p0, p1, null, mediaFilterL);
       this.n = p2;
       return;
    }
    public static final t B(a p0,int p1,int p2,String p3){
       return super.h(p1, p2, p3);
    }
    public t h(int p0,int p1,String p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "albumPath");
       t ot = t.fromCallable(new a$b(this)).flatMap(new a$c(this, p0, p1, p2));
       a.o(ot, "Observable.fromCallable ¡­ntRatio, albumPath\)\n    }");
       return ot;
    }
    public void m(int p0){
    }
    public int s(){
       return 0;
    }
    public List w(){
       Object[] objArray1;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x1bf6ff1d;
       b uob = d.a(i);
       a.o(uob, "PluginManager.get\(SmartA¡­ternalPlugin::class.java\)");
       List list = uob.u2();
       a.o(list, "sceneTabs");
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             objArray1 = iterator.next();
             if (!a.g(objArray1.mId, this.n)) {
                continue ;
             }
          }else {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             objArray = d.a(i).f4(objArray1.mId);
             break ;
          }
          break ;
       }
       return objArray;
    }
    public void x(int p0){
    }
    public void y(int p0,QMedia p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "qMedia");
       return;
    }
    public void z(int p0){
    }
}
