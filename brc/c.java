package brc.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import xvc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yqc.b;
import java.util.Objects;
import yqc.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yqc.a;
import nsd.u;
import tvc.c;
import com.yxcorp.gifshow.v3.editor.frame_v2.vm.FrameMiddleware;
import tvc.e;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;
import brc.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.frame_v2.action.FrameAttachAction;
import xvc.g;
import brc.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Number;
import taa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Preview;
import kotlin.Triple;
import wqc.c;
import com.google.common.collect.ImmutableList;
import java.util.List;
import wqc.b;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.v3.EditorItemFunc;

public final class c extends EditReduxViewModel	// class@000465
{
    public final EditFrameRepo l;

    public void c(EditFrameRepo p0,f p1){
       a.p(p0, "frameRepo");
       a.p(p1, "editRepo");
       b$a e = b.e;
       Objects.requireNonNull(e);
       Object obj = PatchProxy.apply(null, e, b$a.class, "1");
       b uob = (obj != PatchProxyResult.class)? obj: new b(0, null, 0, null, 15, null);
       c[] uocArray = new c[]{new FrameMiddleware(p0)};
       super(false, p1, uob, uocArray, null, 16, null);
       this.l = p0;
       return;
    }
    public e v0(b p0,e p1){
       b a;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj1 = PatchProxy.applyTwoRefs(p0, obj, this, c.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = "action";
          a.p(p0, obj1);
          String str1 = "oldState";
          a.p(obj, str1);
          a = b.a;
          Objects.requireNonNull(a);
          Object[] obj2 = PatchProxy.applyTwoRefs(p0, obj, a, b.class, str);
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             a.p(p0, obj1);
             a.p(obj, str1);
             obj2 = new Object[0];
             a.D().s("FrameReducer", "action : "+p0.getClass().getSimpleName(), obj2);
             if (p0 instanceof FrameAttachAction) {
                a uoa = obj.d();
                obj = b.a(obj, 0, null, obj.e(), uoa.a(uoa.a, uoa.b, uoa.c), 3, null);
             }
          }
          obj1 = obj;
       }
       return obj1;
    }
    public e w0(g p0,e p1){
       a a;
       int i;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       String obj1 = PatchProxy.applyTwoRefs(p0, obj, this, c.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = "draftState";
          a.p(p0, obj1);
          String str1 = "oldState";
          a.p(obj, str1);
          a = a.a;
          Objects.requireNonNull(a);
          a uoa = a.class;
          Object obj2 = PatchProxy.applyTwoRefs(p0, obj, a, uoa, "1");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             a.p(p0, obj1);
             a.p(obj, str1);
             c uoc = p0.i();
             if (uoc != null) {
                a obj3 = PatchProxy.applyOneRefs(uoc, a, uoa, "3");
                str1 = "workspaceDraft.previewDraft";
                if (obj3 != patchProxyRe) {
                   i = obj3.intValue();
                }else {
                   obj3 = uoc.P0();
                   a.o(obj3, str1);
                   Preview preview1 = obj3.v();
                   i = (preview1 != null)? preview1.getFrameType(): 1;
                }
                Triple triple = PatchProxy.applyOneRefs(uoc, a, uoa, str);
                int i1 = 0;
                if (triple != patchProxyRe) {
                }else {
                   patchProxyRe = c.b.a().get(i1);
                   a.o(patchProxyRe, "EditCanvasEnvV2.CANVAS_BACKGROUND_LOCAL_DATA[0]");
                   a uoa1 = uoc.P0();
                   a.o(uoa1, str1);
                   Preview preview = uoa1.v();
                   if (preview != null) {
                      a.o(preview, "preview");
                      int paddingAreaT = preview.getPaddingAreaType();
                      int i2 = 2;
                      if (paddingAreaT != i2) {
                         i2 = 3;
                         if (paddingAreaT != i2) {
                            i2 = 4;
                            triple = (paddingAreaT != i2)? new Triple(patchProxyRe.e(), Integer.valueOf(patchProxyRe.f()), Float.valueOf(patchProxyRe.b())): new Triple(String.valueOf(preview.getPaddingAreaIdentifier()), Integer.valueOf(i2), Float.valueOf((float)preview.getGaussianBlurRadius()));
                         }else {
                            triple = new Triple(String.valueOf(preview.getPaddingAreaIdentifier()), Integer.valueOf(i2), Float.valueOf((float)preview.getGaussianBlurRadius()));
                         }
                      }else {
                         triple = new Triple(String.valueOf(preview.getPaddingAreaIdentifier()), Integer.valueOf(i2), Float.valueOf((float)preview.getGaussianBlurRadius()));
                      }
                   }else {
                      triple = new Triple(patchProxyRe.e(), Integer.valueOf(patchProxyRe.f()), Float.valueOf(patchProxyRe.b()));
                   }
                }
                Object[] objArray = new Object[i1];
                a.D().w("FrameMapper", "backgroundDataV2="+triple, objArray);
                obj = b.a(obj, i, obj.d().a(triple.getFirst(), triple.getSecond().intValue(), triple.getThird().floatValue()), 0, null, 12, null);
             }
          }
          obj1 = obj;
       }
       return obj1;
    }
    public EditorItemFunc y0(){
       return EditorItemFunc.FRAME_V2;
    }
}
