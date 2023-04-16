package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import cuc.a;
import cuc.b;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction$a;
import nsd.u;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cuc.a$a;
import tvc.e;
import tvc.a;
import cuc.b$a;

public abstract class PicTemplateAction extends b implements a, b	// class@00134c
{
    public static final PicTemplateAction$a Companion;

    static {
       PicTemplateAction.Companion = new PicTemplateAction$a(null);
    }
    public void PicTemplateAction(){
       super();
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       b this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, a$a.class, "1");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "vmp");
          a.p(p1, "store");
          a.p(p2, "state");
          this = this.handle(p1, p2);
       }
       return this;
    }
    public b handle(ViewModelProvider p0,KSStore p1,e p2){
       return this.handle(p0, p1, p2);
    }
    public b handle(KSStore p0,PicTemplateState p1){
       b this;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, a$a.class, "2");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "store");
          a.p(p1, "state");
          this = null;
       }
       return this;
    }
    public b handle(KSStore p0,e p1){
       return this.handle(p0, p1);
    }
    public void post(KSStore p0,a p1){
       this.post(p0, p1);
    }
    public void post(KSStore p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateAction.class, "3")) {
          return;
       }
       a.p(p0, "$this$post");
       a.p(p1, "action");
       a$a.a(this, p0, p1);
       return;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       return b$a.a(this, p0);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
