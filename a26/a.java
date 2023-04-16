package a26.a;
import java.lang.Object;
import java.lang.String;
import k2b.u1;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.ArrayList;
import android.graphics.Bitmap;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a	// class@000014
{
    public String a;
    public Workspace$Type b;
    public PhotoEditInfo c;
    public List d;
    public InteractStickerInfo e;
    public Bitmap f;
    public float g;
    public boolean h;
    public String i;
    public int j;

    public void a(int p0){
       super();
       this.j = p0;
       String str = u1.f();
       a.o(str, "Logger.generateTaskSessionId\(\)");
       this.a = str;
       this.b = Workspace$Type.UNKNOWN;
       this.d = new ArrayList();
       this.g = 0x3f800000;
    }
    public final boolean a(){
       return this.h;
    }
    public final Bitmap b(){
       return this.f;
    }
    public final float c(){
       return this.g;
    }
    public final PhotoEditInfo d(){
       return this.c;
    }
    public final String e(){
       return this.a;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void g(Workspace$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
