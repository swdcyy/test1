package hnd.c$d;
import java.lang.Runnable;
import hnd.c;
import xvc.b;
import bod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontDelayChangeActionV3;
import ood.d;
import java.lang.Integer;
import tvc.a;

public final class c$d implements Runnable	// class@000f94
{
    public final c b;
    public final b c;
    public final a d;

    public void c$d(c p0,b p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "1")) {
          return;
       }
       KSStore kSStore = this.b.a();
       if (kSStore != null) {
          TextDesignFontChangeActionV3 textDesignFo = new TextDesignFontChangeActionV3(this.c.getLayerIndex(), this.c.isSubtitle(), this.c.getTextTemplateItem(), this.d, this.c.getLastAlignType(), this.c.getTextLayerIndex(), this.c.getCommit());
          kSStore.a(v9);
       }
       return;
    }
}
