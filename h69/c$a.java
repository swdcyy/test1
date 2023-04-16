package h69.c$a;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$From;
import h69.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;

public final class c$a	// class@002551
{
    public String a;
    public List b;
    public ArrayList c;
    public Workspace$Type d;
    public Workspace$Source e;
    public Workspace$From f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public MemorySceneType m;
    public String n;
    public ClientContent$LocalIntelligentAlbumPackage o;
    public String p;

    public void c$a(){
       super();
       this.a = "";
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = Workspace$Type.AI_CUT;
       this.e = Workspace$Source.IMPORT;
       this.f = Workspace$From.FROM_UNKNOW;
       this.p = "";
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public final List b(){
       return this.b;
    }
    public final void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void e(int p0){
       this.k = p0;
    }
    public final void f(Workspace$Source p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void g(Workspace$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
}
