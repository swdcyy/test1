package l69.a$d;
import erd.o;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import v69.d;
import v69.b;
import brd.t;
import cjd.e;
import l69.d;
import erd.g;

public final class a$d implements o	// class@002c91
{
    public final int b;
    public final int c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final int i;
    public final VideoTemplateProject j;

    public void a$d(int p0,int p1,List p2,List p3,List p4,String p5,String p6,int p7,VideoTemplateProject p8){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, a$d.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "finalSceneResult");
          p0 = b.b(d.b.a(), this.b, this.c, this.d, this.e, this.f, obj, this.g, this.h, this.i, 0, 0, 1536, null).map(new e()).doOnNext(new d(this));
       }
       return p0;
    }
}
