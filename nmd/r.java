package nmd.r;
import z1.a;
import nmd.q;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import qvc.b;

public final class r implements a	// class@001e74
{
    public final q a;
    public final NewTagStickerElement b;

    public void r(q p0,NewTagStickerElement p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else if(this.b.isAdded()){
          this.b.removeOnTextChangeWatcher(this.a.A);
          if (p0 != null) {
             this.b.updateText(p0);
          }
          this.b.addOnTextChangeWatcher(this.a.A);
       }
       return;
    }
}
