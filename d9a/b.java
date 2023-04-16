package d9a.b;
import im8.g;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d9a.l;
import java.util.Map;
import java.util.HashMap;

public final class b implements g	// class@001eba
{
    public final b b;
    public final b c;
    public final PublishSubject d;
    public final y e;
    public final t f;
    public final PublishSubject g;
    public final y h;
    public final t i;
    public final PublishSubject j;
    public final y k;
    public final t l;

    public void b(){
       super();
       this.b = new b(Boolean.FALSE);
       this.c = new b(Integer.valueOf(0));
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.d = publishSubje;
       this.e = publishSubje;
       t ot = publishSubje.hide();
       a.o(ot, "mSimilarPhotoDisableAutoPlayNextSubject.hide\(\)");
       this.f = ot;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.g = publishSubje;
       this.h = publishSubje;
       ot = publishSubje.hide();
       a.o(ot, "mSimilarPhotoBottomBarViewSubject.hide\(\)");
       this.i = ot;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<String>\(\)");
       this.j = publishSubje;
       this.k = publishSubje;
       ot = publishSubje.hide();
       a.o(ot, "mSerialLastEpisodeSwitchToFirst.hide\(\)");
       this.l = ot;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new l());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
