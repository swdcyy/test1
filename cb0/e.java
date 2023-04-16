package cb0.e;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel$c;
import com.kuaishou.gifshow.smartalbum.logic.SmartAlbumManager$SAException;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@000301
{
    public final SmartAlbumLoadingViewModel b;

    public void e(SmartAlbumLoadingViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          this.b.o.o8(-3, null, null);
          if (!p0 instanceof SmartAlbumManager$SAException) {
             PostUtils.D("SmartAlbumLoadingVM", "startAICut", p0);
          }
       }
       return;
    }
}
