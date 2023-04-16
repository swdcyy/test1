package com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import sqc.y;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ooc.f;
import java.lang.Iterable;
import t45.d;
import brd.z;
import sqc.w;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.f;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g$a;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g$b;
import com.kwai.video.editorsdk2.kve.EditorKveAnalyzeTask$EnhanceResult;

public final class g	// class@000f8d
{
    public EditorKveAnalyzeTask$EnhanceResult a;
    public final int b;
    public final EditorSdk2V2$VideoEditorProject c;
    public final String d;

    public void g(int p0,EditorSdk2V2$VideoEditorProject p1,String p2){
       a.p(p1, "project");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final int a(){
       return this.b;
    }
    public final t b(boolean p0,List p1,String p2){
       g obj;
       int this;
       t ot;
       z a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, g.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p1, "modelFilePaths");
       obj = this.c;
       g td = this.d;
       y oy = y.class;
       this = 1;
       if (PatchProxy.isSupport(oy)) {
          Object[] objArray = new Object[]{obj,Boolean.valueOf(p0),td,p1,p2};
          ot = PatchProxy.apply(objArray, null, oy, "1");
          if (ot != patchProxyRe) {
          }else if(!obj.trackAssetsSize()){
             ot = t.error(new RuntimeException("project.trackAssets\(\) is empty or null"));
          }else {
             EditorSdk2V2$TrackAsset trackAsset = obj.trackAssets(0);
             if (!TextUtils.x(td) && new File(td).exists()) {
                this = 0;
             }
             if (this) {
                td = trackAsset.assetPath();
             }
             objArray = new Object[0];
             a.D().w("RxEnhanceApi", "startEnhanceAnalyzeV2\(\) called with:project  firstProjectPath="+trackAsset.assetPath()+" originalPath="+td+" useFace = ["+p0+"]", objArray);
             a = d.a;
             ot = t.fromIterable(f.a(trackAsset)).subscribeOn(d.c).observeOn(a).flatMap(new w(td)).buffer(y.a.length).flatMap(new f(p0, td, p1, p2)).observeOn(a);
          }
       }else {
          goto label_0052 ;
       }
       t ot1 = ot.map(new g$a(this)).onErrorReturn(new g$b(this));
       a.o(ot1, "RxEnhanceApi.startEnhanc¡­ this@SingleEnhanceTask }");
       return ot1;
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "SingleEnhanceTask\(index="+this.b+", result=";
       g ta = this.a;
       if (ta != null) {
          objArray = ta.getLutPath();
       }
       return obj+objArray+')';
    }
}
