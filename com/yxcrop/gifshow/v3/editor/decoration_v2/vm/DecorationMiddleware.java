package com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import uld.g;
import tvc.a;
import tvc.e;
import xvc.b;
import xld.a;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import brd.a0;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$b;
import erd.g;
import crd.b;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$c;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$d;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.GenerateBitmapFileAction;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.action.GenerateInteractStickerFileAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.io.File;
import qkd.b;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationReleaseAction;

public class DecorationMiddleware extends c	// class@000a40
{
    public final p b;
    public final g c;
    public boolean d;

    public void DecorationMiddleware(){
       super();
       this.b = s.c(DecorationMiddleware$compositeDisposable$2.INSTANCE);
       this.c = new g(false);
       this.d = true;
    }
    public e b(a p0,e p1){
       return this.d(p0, p1);
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, DecorationMiddleware.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public a d(b p0,a p1){
       NewEditTextElement obj = PatchProxy.applyTwoRefs(p0, p1, this, DecorationMiddleware.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "action");
       a.p(p1, "oldState");
       if (p0 instanceof WaitDrawerBitmapAction) {
          if (PostExperimentUtils.m()) {
             this.c().c(this.c.h().R(new DecorationMiddleware$a(this, p0), new DecorationMiddleware$b(p0)));
          }else {
             this.c().c(this.c.h().G(d.a).R(new DecorationMiddleware$c(this, p0), new DecorationMiddleware$d(p0)));
          }
       }else {
          String str = "NeedReGenerateFile: ";
          if (p0 instanceof GenerateBitmapFileAction) {
             Iterator iterator = p0.getElementList().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.isNeedReGenerateFile()) {
                   String outputFilePa = obj.getOutputFilePath();
                   Log.b("TextMiddleware", str+outputFilePa);
                   this.c.b(obj, outputFilePa);
                }
             }
          }else if(p0 instanceof GenerateInteractStickerFileAction){
             NewEditStickerBaseDrawer element = p0.getElement();
             String elementOutpu = element.getElementOutputPath();
             if (element.isNeedReGenerateFile() || !b.S(new File(elementOutpu))) {
                Log.b("TextMiddleware", str+elementOutpu);
                this.c.b(element, elementOutpu);
             }
          }else if(p0 instanceof DecorationReleaseAction){
             this.f();
          }
       }
       return p1;
    }
    public final boolean e(){
       return this.d;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, DecorationMiddleware.class, "3")) {
          return;
       }
       if (this.d != null) {
          this.d = false;
          this.c().dispose();
       }
       return;
    }
    public final void g(boolean p0){
       this.d = p0;
    }
}
