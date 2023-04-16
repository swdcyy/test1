package com.yxcorp.gifshow.v3.editor.cover.j2;
import y30.e;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ppc.k2;
import io.reactivex.g;

public class j2 implements e	// class@000e75
{

    public void j2(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public t j9(c p0,VideoSDKPlayerView p1,float p2){
       if (PatchProxy.isSupport(j2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, j2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGenerator", "generateCover\(\) called with: draft = ["+p0+"], videoPlayer = ["+p1+"], assetTransformedScale = ["+p2+"]", objArray);
       return t.create(new k2(p0, p1, p2));
    }
}
