package com.yxcorp.gifshow.v3.editor.text.v0;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.yxcorp.gifshow.v3.editor.text.v0$a;
import java.lang.Object;
import nq.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager;
import r1c.x$b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.t;
import huc.u0;
import com.yxcorp.gifshow.v3.editor.text.u0;
import erd.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.yxcorp.gifshow.activity.preview.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import huc.o1;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.f;
import com.kwai.flash.Flash$Type;

public class v0 extends GraphTask	// class@001504
{

    public void v0(v0$a p0){
       super(p0);
       this.c.set(new a());
    }
    public String[] e(){
       String[] obj = PatchProxy.apply(null, this, v0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "dependOn isPicturesType:"+this.s(), objArray);
       if (this.s()) {
          obj = new String[]{"StartGraphMTNSTask","PhotosCropWorkCountDownNSTask"};
          return obj;
       }else {
          obj = new String[]{"StartGraphMTNSTask"};
          return obj;
       }
    }
    public Object key(){
       return "StickerTextNSTask";
    }
    public void l(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0.class, "1")) {
          return;
       }
       this.b.b = GraphTaskExecuteManager.i("StartGraphMTNSTask", p0);
       Object[] objArray = new Object[0];
       a.D().w("GraphTask", "realFillRequest mSGMTResult:"+this.b.b, objArray);
       return;
    }
    public synchronized void m(){
       if (PatchProxy.applyVoid(null, this, v0.class, "2")) {
          return;
       }
       super.m();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("GraphTask", "realRun", objArray);
       if (this.b.b != null) {
          if (!this.s() || this.b.a.a1() == Workspace$Type.SINGLE_PICTURE) {
             this.r().blockingSubscribe(new u0(this), u0.b);
             objArray = new Object[i];
             a.D().w("GraphTask", "realRun single picture generate interactSticker info", objArray);
          }
          if (this.b.b.b() != null) {
             GraphTask tb = this.b;
             this.c.get().f(f.b(tb.a, tb.b.b(), this.b.b.e));
             objArray = new Object[i];
             a.D().w("GraphTask", "realRun video generate sticker text info", objArray);
          }
          if (this.b.b.a() != null) {
             GraphTask tb1 = this.b;
             this.c.get().d(a.a.q(f.e(tb1.a, tb1.b.a())));
             objArray = new Object[i];
             a.D().w("GraphTask", "realRun photos generate sticker text info", objArray);
          }
          if (PostExperimentUtils.A(this.b.a)) {
             o1.b(this.b.a);
          }
          Object[] objArray1 = new Object[i];
          a.D().w("GraphTask", "realRun SGMTResult not null", objArray1);
       }
       return;
    }
    public final t r(){
       Size c;
       Object obj = PatchProxy.apply(null, this, v0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = 0x3f800000;
       Size size = 1;
       if (this.s()) {
          size = this.b.b.c().b;
          c = this.b.b.c().c;
       }else if(this.b.b.b() != null){
          size = this.b.b.b().projectOutputWidth();
          GraphTask tb = this.b;
          c = this.b.b.b().projectOutputHeight();
          f = b.m(tb.a, tb.b.b());
       }else {
          c = 1;
       }
       return f.f(this.b.a, size, c, f);
    }
    public final boolean s(){
       Object obj = PatchProxy.apply(null, this, v0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.b.a.a1());
    }
    public Flash$Type type(){
       return Flash$Type.BACKGROUND;
    }
}
