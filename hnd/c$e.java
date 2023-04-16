package hnd.c$e;
import erd.g;
import hnd.c;
import xvc.b;
import zmd.a;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAttachAction;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import xld.a;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import hnd.b;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecFailedAction;
import tvc.a;
import vmd.c;
import e17.i;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ood.d;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import bod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessActionV3;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessAction;

public final class c$e implements g	// class@000f95
{
    public final c b;
    public final b c;
    public final a d;

    public void c$e(c p0,b p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       int i2;
       KSStore kSStore;
       d uod;
       a uoa;
       SubtitleRecSuccessActionV3 subtitleRecS;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
       }else {
          c$e tc = this.c;
          Integer integer = null;
          String lastMaterial = (tc instanceof SubtitleAttachAction)? tc.getLastMaterialId(): integer;
          c$e tc1 = this.c;
          String lastFontFile = (tc1 instanceof SubtitleAttachAction)? tc1.getLastFontFileName(): integer;
          c$e tc2 = this.c;
          Integer integer1 = (tc2 instanceof SubtitleAttachAction)? tc2.getLastColor(): integer;
          tc2 = this.c;
          if (tc2 instanceof SubtitleAttachAction) {
             integer = tc2.getLastAlignType();
          }
          Integer integer2 = integer;
          c$e tb = this.b;
          a.o(p0, "it");
          boolean b = this.d.u();
          Objects.requireNonNull(tb);
          c uoc = c.class;
          int i = 4;
          int i1 = 3;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{p0,lastMaterial,lastFontFile,integer1,integer2,Boolean.valueOf(b)};
             if (!PatchProxy.applyVoid(objArray, tb, uoc, "3")) {
             }
          }else {
          }
       }
    label_0114 :
       return;
    }
}
