package ond.a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;

public final class a extends AtlasOrSinglePictureSubViewBinder	// class@002023
{

    public void a(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0, p1, p2);
    }
    public List G(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F().o0().j();
    }
    public String H(){
       return "AtlasForLongPictureSubViewBinder";
    }
}
