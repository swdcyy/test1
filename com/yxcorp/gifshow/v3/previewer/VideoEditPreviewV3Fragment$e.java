package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$e;
import voc.v;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import voc.u;
import lnc.a1;

public class VideoEditPreviewV3Fragment$e implements v	// class@001585
{
    public final EditorItemFunc a;
    public final VideoEditPreviewV3Fragment b;

    public void VideoEditPreviewV3Fragment$e(VideoEditPreviewV3Fragment p0,EditorItemFunc p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean G0(){
       VideoEditPreviewV3Fragment$e obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (j.g(this.b.M) || DraftUtils.e(this.b.M)) {
          obj = this.a;
          if (obj != EditorItemFunc.EFFECT && (obj != EditorItemFunc.EFFECT_V2 && (obj != EditorItemFunc.MODEL_MAGIC_FINGER && (obj == EditorItemFunc.FRAME || obj == EditorItemFunc.FRAME_V2)))) {
             return false;
          }
       }
       if (DraftUtils.I(this.b.M)) {
          obj = this.a;
          if (obj == EditorItemFunc.FILTER || obj == EditorItemFunc.PRETTIFY) {
             return false;
          }
       }
       return true;
    }
    public boolean a(){
       return u.c(this);
    }
    public String b(){
       VideoEditPreviewV3Fragment$e obj = PatchProxy.apply(null, this, VideoEditPreviewV3Fragment$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == EditorItemFunc.EFFECT_V2) {
          return a1.p(0x7f10014a);
       }
       if (obj == EditorItemFunc.MODEL_MAGIC_FINGER) {
          return a1.p(0x7f10014d);
       }
       if (obj == EditorItemFunc.FRAME || obj == EditorItemFunc.FRAME_V2) {
          return a1.p(0x7f100149);
       }
       if (obj == EditorItemFunc.FILTER || obj == EditorItemFunc.PRETTIFY) {
          return a1.p(0x7f100147);
       }
       if (obj == EditorItemFunc.AICUT) {
          return a1.p(0x7f103dc3);
       }
       return "";
    }
}
