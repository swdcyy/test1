package l69.f;
import pk7.a;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import h69.a;
import java.util.Objects;
import h69.g;
import java.lang.StringBuilder;
import java.io.File;
import q87.c;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;

public class f implements a	// class@002c98
{

    public void f(){
       super();
    }
    public void hh(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,long p3){
       a this;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, f.class, "1")) {
          return;
       }
       String str = "videoProject";
       a.p(p0, str);
       this = a.b;
       Objects.requireNonNull(this);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, a.class, "5")) {
          a.p(p0, str);
          if (p2 != null) {
             Object[] objArray = new Object[0];
             g.D().w("AICutApi", "stylePath = "+p2+",file.exists="+new File(p2).exists(), objArray);
          }
          EditorSmartClipTask.applyThemeOnProject(p0, p1, p2, "", p3, new ArrayList(), new HashMap());
          p0.setAudioAssets(p0.audioAssets());
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
