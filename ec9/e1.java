package ec9.e1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import java.lang.Integer;
import java.lang.Boolean;
import cc9.k;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;

public final class e1 extends k	// class@002170
{
    public final f1 b;

    public void e1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       boolean b;
       Object obj = this;
       q obj1 = p0;
       e1 uoe1 = e1.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoe1, "1")) {
       }else {
          a.p(obj1, "action");
          this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, false, false, 255, null));
          obj1 = this.a().j();
          if (obj1.f().isEmpty() ^ 1) {
             int i = obj1.b();
             g og = obj1.d();
             if (og instanceof MagicAssistantTemplate) {
                b = og.isCollection();
                if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.valueOf(b), obj, uoe1, "3")) {
                   b uob = this.a().j();
                   if (!uob.g()) {
                      this.a().h(q.a(uob, null, 0, 0, null, false, true, false, false, 223, null));
                   }
                   this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, b, false, 191, null));
                   obj.b.w0(new k(13, i));
                }
             }else if(og instanceof KSAssistantTemplate){
                if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, uoe1, "4")) {
                   if (!this.a().j().g()) {
                      this.a().h(q.a(this.a().j(), null, 0, 0, null, false, true, false, false, 223, null));
                   }
                   this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, false, false, 191, null));
                   obj.b.w0(new k(31, i));
                }
             }else if(og instanceof MusicAssistantTemplate){
                b = og.isCollection();
                if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.valueOf(b), obj, uoe1, "2")) {
                   if (!this.a().j().g()) {
                      this.a().h(q.a(this.a().j(), null, 0, 0, null, false, true, false, false, 223, null));
                   }
                   this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, b, false, 191, null));
                   obj.b.w0(new k(22, i));
                }
             }
             obj.b.w0(new k(1, obj1.b()));
          }
       }
       return;
    }
}
