package eub.b;
import eub.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import eub.i$a;
import eub.i;
import y26.b$a;
import g6c.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.l;
import tkd.b;
import tkd.d;
import w26.a;
import y26.b;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w26.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import faa.a;
import q87.c;

public class b extends a	// class@00281b
{

    public void b(String p0,boolean p1){
       a.p(p0, "workspaceDraftDirNameOrPath");
       super(p0, null, p1);
       p0.e = true;
    }
    public int j(b$a p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "sharePageParamBuilder");
       a.p(p1, "noUiPublishManager");
       p0.Z0 = l.c("KEY_ENABLE_EDIT_PUBLISH_TEST_CASE_UPLOADER", false) ^ 0x01;
       c uoc = p1.b().b();
       a.m(uoc);
       return d.a(0x27e26f6e).lS(null, p0.g(), true, uoc, null);
    }
    public void n(c p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "loaderResult");
       Object[] objArray = new Object[0];
       a.D().w("EditPageDraftNoUiPublishTestStageImpl", "onLoadProject", objArray);
       return;
    }
}
