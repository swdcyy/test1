package laa.e0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.io.FileInputStream;
import java.io.InputStream;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import ekd.p;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.StringBuilder;

public final class e0 implements Callable	// class@002d80
{
    public final DraftFileManager b;
    public final File c;

    public void e0(DraftFileManager p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       int i;
       Workspace workspace;
       e0 tb = this.b;
       e0 tc = this.c;
       Objects.requireNonNull(tb);
       c uoc = PatchProxy.applyOneRefs(tc, tb, DraftFileManager.class, "18");
       if (uoc != PatchProxyResult.class) {
       }else {
          File uFile = new File(tc, "workspace.pb");
          try{
             i = 0;
             try{
                FileInputStream uFileInputSt = new FileInputStream(uFile);
                workspace = Workspace.parseFrom(uFileInputSt);
                p.c(uFileInputSt);
                uoc = new c(tc, workspace, VideoContextDraftHelper.a(tc, workspace), tb.D(new File(tc, "flag.txt")));
             }catch(java.io.IOException e0){
             }catch(com.yxcorp.gifshow.edit.draft.model.DraftEditException e0){
             }
          }catch(java.io.IOException e0){
          }catch(com.yxcorp.gifshow.edit.draft.model.DraftEditException e0){
          }
          InputStream inputStream = i;
       }
       if (uoc != null) {
          return uoc;
       }else {
          throw new DraftEditException("Invalid workspace at "+tc.getAbsolutePath());
       }
    }
}
