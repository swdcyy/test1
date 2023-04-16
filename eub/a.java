package eub.a;
import eub.i;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import q16.a$a;
import q16.a;
import com.kuaishou.edit.draft.Workspace$Type;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import eub.a$a;
import erd.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;

public class a extends i	// class@00281a
{
    public String j;
    public Integer k;
    public boolean l;

    public void a(String p0,Integer p1,boolean p2){
       a.p(p0, "workspaceDraftDirNameOrPath");
       a uoa = new a$a().f();
       a.o(uoa, "EditPageParam.Builder\(\).build\(\)");
       super(uoa, null);
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public t i(){
       t ot;
       File obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l != null) {
          DraftFileManager uDraftFileMa = DraftFileManager.E();
          a.o(uDraftFileMa, "DraftFileManager.getInstance\(\)");
          obj = new File(uDraftFileMa.O(), this.s());
       }else {
          obj = new File(this.s());
       }
       Object[] objArray = new Object[0];
       a.D().w("EditPageDraftNoUiPublishStageImpl", "buildWorkspaceDraft workSpaceDraftFile:"+obj+", forceVisibilityExpiration:"+this.r(), objArray);
       if (!obj.exists()) {
          ot = t.error(new RuntimeException("EditPageDraftNoUiPublishStageImpl buildWorkspaceDraft draft not exist"));
          a.o(ot, "Observable.error\(Runtime¡­eDraft draft not exist\"\)\)");
          return ot;
       }else {
          ot = DraftFileManager.E().X(obj).doOnNext(new a$a(this));
          a.o(ot, "DraftFileManager.getInst¡­spaceDraft = it\n        }");
          return ot;
       }
    }
    public void n(c p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "loaderResult");
       Object[] objArray = new Object[0];
       a.D().w("EditPageDraftNoUiPublishStageImpl", "onLoadProject", objArray);
       return;
    }
    public Integer r(){
       return this.k;
    }
    public String s(){
       return this.j;
    }
}
