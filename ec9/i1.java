package ec9.i1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.util.List;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import ac9.h;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import ac9.l;
import cc9.t;
import ac9.k;
import cc9.m;
import java.util.Map;

public final class i1 extends k	// class@00217c
{
    public final f1 b;

    public void i1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       boolean b;
       b uob;
       int i;
       b uob2;
       Object obj = this;
       MagicAssistantTemplate obj1 = p0;
       i1 oi1 = i1.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oi1, "1")) {
       }else {
          a.p(obj1, "action");
          q oq = this.a().j();
          q oq1 = q.a(oq, null, oq.b(), obj1.b(), null, false, false, false, false, 249, null);
          this.a().h(oq1);
          if (oq1.e() != oq1.b() || oq.e() == -1) {
             g og = oq1.d();
             if (og instanceof MagicAssistantTemplate) {
                obj1 = obj1.b();
                b = og.isCollection();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(obj1), Boolean.valueOf(b), obj, oi1, "5")) {
                   uob = this.a().j();
                   if (!uob.g()) {
                      this.a().h(q.a(uob, null, 0, 0, null, false, true, b, false, 159, null));
                   }else {
                      this.a().h(q.a(uob, null, 0, 0, null, false, false, b, false, 191, null));
                   }
                   obj.b.w0(new k(13, obj1));
                }
             }else if(og instanceof KSAssistantTemplate){
                i = obj1.b();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, oi1, "6")) {
                   b uob1 = this.a().j();
                   if (!uob1.g()) {
                      this.a().h(q.a(uob1, null, 0, 0, null, false, true, false, false, 159, null));
                   }else {
                      this.a().h(q.a(uob1, null, 0, 0, null, false, false, false, false, 191, null));
                   }
                   obj.b.w0(new k(31, i));
                }
             }else if(og instanceof h){
                i = obj1.b();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, oi1, "4")) {
                   if (this.a().j().g()) {
                      this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, false, false, 159, null));
                   }else {
                      this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, false, false, 191, null));
                   }
                }
             }else if(og instanceof MusicAssistantTemplate){
                MusicAssistantTemplate musicAssista = obj1.b();
                b = og.isCollection();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(musicAssista), Boolean.valueOf(b), obj, oi1, "3")) {
                   uob = this.a().j();
                   if (!uob.g()) {
                      this.a().h(q.a(uob, null, 0, 0, null, false, true, b, false, 159, null));
                   }else {
                      this.a().h(q.a(this.a().j(), null, 0, 0, null, false, false, b, false, 191, null));
                   }
                   obj.b.w0(new k(22, musicAssista));
                }
             }else if(og instanceof l){
                i = obj1.b();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, oi1, "2")) {
                   uob2 = this.a().j();
                   if (uob2.g()) {
                      this.a().h(q.a(uob2, null, 0, 0, null, false, false, false, false, 159, null));
                   }else {
                      this.a().h(q.a(uob2, null, 0, 0, null, false, false, false, false, 191, null));
                   }
                   obj.b.w0(new t(true, i));
                }
             }else if(og instanceof k){
                i = obj1.b();
                if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, oi1, "7")) {
                   uob2 = this.a().j();
                   uob2.i().put(Integer.valueOf(i), new m(true));
                   if (uob2.g()) {
                      this.a().h(q.a(uob2, null, 0, 0, null, false, false, false, false, 159, null));
                   }else {
                      this.a().h(q.a(uob2, null, 0, 0, null, false, false, false, false, 191, null));
                   }
                }
             }
          }
       }
       return;
    }
}
