package cb0.d;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import sa0.c;
import com.kuaishou.gifshow.smartalbum.model.SmartAlbumUiItem;
import java.lang.Object;
import h69.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import ra0.b;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel$c;
import tkd.b;
import tkd.d;
import h69.b;
import kotlin.jvm.internal.a;
import i69.f;
import k69.f;
import brd.t;

public final class d implements g	// class@000300
{
    public final SmartAlbumLoadingViewModel b;
    public final c c;
    public final SmartAlbumUiItem d;

    public void d(SmartAlbumLoadingViewModel p0,c p1,SmartAlbumUiItem p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0.b().isEmpty()){
          Object[] objArray = new Object[0];
          b.D().A("SmartAlbumLoadingVM", "medias is empty", objArray);
          this.c.J(this.d.getId());
          this.b.o.o8(-3, null, null);
       }else {
          a.o(p0, "it");
          p0 = d.a(-873393519).Br(p0);
          p0.d(this.b.p);
          p0.start();
          this.b.m = p0;
       }
       return;
    }
}
