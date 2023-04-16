package nmd.f0$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.d$a;
import nmd.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryShowAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class f0$a implements d$a	// class@001e54
{
    public final f0 a;

    public void f0$a(f0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f0$a.class, "1")) {
          return;
       }
       this.a.m.t0(new StickerLibraryShowAction());
       return;
    }
}
