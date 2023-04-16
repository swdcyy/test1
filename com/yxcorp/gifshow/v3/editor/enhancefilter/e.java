package com.yxcorp.gifshow.v3.editor.enhancefilter.e;
import io.reactivex.g;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import brd.v;
import sqc.x;
import com.kwai.video.editorsdk2.kve.EditorKveAnalyzeTask;
import android.content.Context;
import lnc.a1;
import com.kwai.video.editorsdk2.kve.EditorKveAnalyzeTask$Listener;
import sqc.v;
import erd.f;
import sqc.y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.StringBuilder;
import m35.b;
import faa.a;
import q87.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import brd.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;

public final class e implements g	// class@000f89
{
    public final String b;
    public final boolean c;
    public final List d;
    public final String e;
    public final List f;

    public void e(String p0,boolean p1,List p2,String p3,List p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       File obj1;
       String absolutePath;
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       EditorKveAnalyzeTask uEditorKveAn = new EditorKveAnalyzeTask(a1.c(), new x(p0, tb));
       p0.setCancellable(new v(uEditorKveAn));
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          File obj = PatchProxy.applyTwoRefs(tb, Boolean.valueOf(tc), null, oy, "3");
          if (obj != PatchProxyResult.class) {
             obj1 = obj;
          }else if(TextUtils.x(tb)){
             obj1 = null;
          }else {
             obj = PostUtils.g("[>|18|>]");
             obj1 = new File(obj, b.b(tb+"_"+tc));
             if (obj1.exists()) {
                absolutePath = obj1.getAbsolutePath();
             }else if(obj1.mkdir()){
                absolutePath = obj1.getAbsolutePath();
             }else {
                absolutePath = obj.getAbsolutePath();
             }
             obj1 = absolutePath;
          }
       }else {
          goto label_003b ;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxEnhanceApi", "startAnalyze: resultPath="+obj1, objArray);
       if (TextUtils.x(obj1)) {
          p0.onError(new RuntimeException("cant get result path "));
       }else if(td.isEmpty() || TextUtils.x(te)){
          uEditorKveAn.startEnhance(null, obj1, tc, tf);
       }else {
          uEditorKveAn.startEnhance(0, obj1, tc, tf, td, te);
       }
       return;
    }
}
