package eba.a;
import nba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import laa.e;
import com.kuaishou.edit.draft.Sticker;
import eba.b;

public class a extends c implements a	// class@0020fe
{

    public void a(File p0,List p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       for (int i = 0; i < this.p(); i = i + 1) {
          Sticker$b uob = this.n(i);
          StickerResult$b uob1 = uob.getResult().toBuilder();
          boolean b = false;
          if (uob1.instance.getResourceHeight() - b <= 0 || uob1.instance.getResourceWidth() - b <= 0) {
             File uFile = DraftUtils.t(uob.getResult(), this);
             if (uFile != null) {
                b0 uob0 = BitmapUtil.E(uFile.getAbsolutePath());
                uob1.r((double)uob0.a);
                uob1.q((double)uob0.b);
             }
          }
          uob1.v(0x3f800000);
          float f = 0.01f;
          DraftUtils uDraftUtils = DraftUtils.class;
          if (PatchProxy.isSupport(uDraftUtils)) {
             Object obj = PatchProxy.applyTwoRefs(uob1, Float.valueOf(f), null, uDraftUtils, "70");
             if (obj != PatchProxyResult.class) {
                uob1 = obj;
             label_009e :
                uob.h(uob1);
             }
          }
          float f1 = uob1.instance.getCenterX() * f;
          uob1.f(f1);
          f1 = uob1.getCenterY() * f;
          uob1.g(f1);
          f1 = uob1.getScale() * f;
          uob1.t(f1);
          goto label_009e ;
       }
       return;
    }
    public e i(GeneratedMessageLite p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.q(), p0, this.c);
       }
       return uob;
    }
    public String r(){
       return "sticker";
    }
}
