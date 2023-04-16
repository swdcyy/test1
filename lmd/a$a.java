package lmd.a$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;

public final class a$a extends DecorationContainerView$e	// class@001c53
{

    public void a$a(){
       super();
    }
    public void w(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          super.w(p0);
          if (p0 instanceof NewRelayStickerDrawer) {
             p0.enterEditingMode();
          }
       }
       return;
    }
}
