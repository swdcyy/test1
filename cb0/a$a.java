package cb0.a$a;
import android.view.View$OnClickListener;
import cb0.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import fb0.l;
import ra0.b;
import q87.c;

public final class a$a implements View$OnClickListener	// class@0002f8
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.m.finish();
       this.b.i.o0("interrupt", null);
       l.f("CANCEL_PRODUCE_TIME_ALBUM");
       Object[] objArray = new Object[0];
       b.D().s("SmartAlbumLoadingVB", "backPressed", objArray);
       return;
    }
}
