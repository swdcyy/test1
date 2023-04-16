package dc9.c;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import ac9.g;
import java.lang.Number;
import k2b.e0;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import lnc.a1;
import java.lang.Long;
import bc9.k;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.lang.Iterable;
import g9c.a;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicFaceIconTipMsg;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;

public final class c	// class@0020b7
{
    public final LinkedHashSet a;
    public Integer b;
    public Long c;
    public g d;

    public void c(){
       super();
       this.a = new LinkedHashSet();
    }
    public final String a(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 1;
       if (p0 == null || p0.intValue() != obj) {
          obj = -124;
          if (p0 == null || p0.intValue() != obj) {
             obj = 2;
             if (p0 != null && p0.intValue() == obj) {
                return "KUAISHAN";
             }else {
                obj = 4;
                if (p0 != null && p0.intValue() == obj) {
                   return "MUSIC";
                }else if(p0 != null && p0.intValue() == -1){
                   return "OBJECT";
                }else {
                   return "";
                }
             }
          }
       }
       return "MAGICFACE";
    }
    public final String b(int p0){
       a$a obj;
       String str;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.I;
       if (p0 == obj.c()) {
          str = "magic";
       }else if(p0 == obj.e()){
          str = "tag";
       }else if(p0 == obj.b()){
          str = "ai";
       }else {
          str = "";
       }
       return str;
    }
    public final int c(g p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0.getType() == -124) {
          p2 = -124;
       }else {
          a$a i = a.I;
          if (p1 == i.c() || p1 == i.e()) {
             p2++;
          }
       }
       return p2;
    }
    public final void d(e0 p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "18")) {
          return;
       }
       a.p(p0, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUIT_AI_RECORD";
       i3 oi3 = i3.f();
       a.o(oi3, "JsonStringBuilder.newInstance\(\)");
       oi3.d("ai_func_type", this.b(p1));
       if (p1 == a.I.c()) {
          oi3.a("is_follow_shot", Boolean.TRUE);
       }
       uElementPack.params = oi3.e();
       u1.L("", p0, 1, uElementPack, null);
       return;
    }
    public final void e(boolean p0,e0 p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "17")) {
          return;
       }
       a.p(p1, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AI_RECORD";
       i3 oi3 = i3.f();
       String str = (p0)? "OPEN": "QUIT";
       oi3.d("click_type", str);
       a.o(oi3, "JsonStringBuilder.newIns¡­cted\) \"OPEN\" else \"QUIT\"\)");
       uElementPack.params = oi3.e();
       u1.L("", p1, 1, uElementPack, null);
       return;
    }
    public final void f(e0 p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "13")) {
          return;
       }
       a.p(p0, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AI_RECORD_GUIDE_BUBBLE";
       i3 oi3 = i3.f();
       String str = (p1)? "auto": "click";
       oi3.d("bubble_type", str);
       a.o(oi3, "JsonStringBuilder.newIns¡­uto\) \"auto\" else \"click\"\)");
       uElementPack.params = oi3.e();
       u1.M("", p0, 4, uElementPack, null, null);
       return;
    }
    public final void g(e0 p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       a.p(p0, "page");
       uoc = this.b;
       if (uoc == null || (this.c != null && this.d != null)) {
          a.m(uoc);
          c td = this.d;
          a.m(td);
          c tc = this.c;
          a.m(tc);
          this.j(uoc.intValue(), td, p0, 9, Long.valueOf((a1.k() - tc.longValue())), p1);
          this.b = null;
          this.c = null;
          this.d = null;
       }
    label_0054 :
       return;
    }
    public final void h(e0 p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4")) {
          return;
       }
       a.p(p0, "page");
       uoc = this.b;
       if (uoc == null || (this.c != null && this.d != null)) {
          a.m(uoc);
          c td = this.d;
          a.m(td);
          c tc = this.c;
          a.m(tc);
          this.j(uoc.intValue(), td, p0, 7, Long.valueOf((a1.k() - tc.longValue())), p1);
          this.b = null;
          this.c = null;
          this.d = null;
       }
    label_0053 :
       return;
    }
    public final void i(k p0,e0 p1,int p2){
       String this;
       String str1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "9")) {
          return;
       }
       a.p(p1, "page");
       if (p0 == null || this.a.isEmpty()) {
          this.a.clear();
          return;
       }else {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = this.a.iterator();
          String str = "is_follow_shot";
          this = "ai_func_type";
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             g og = p0.N0(i);
             if (og != null) {
                a.o(og, "assistantAdapter.getItem\(it\) ?: return@forEach");
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("ai_record_type", this.a(Integer.valueOf(og.getType())));
                jsonObject.c0("ai_record_id", og.getTemplateId());
                jsonObject.c0("ai_record_name", og.getTemplateName());
                jsonObject.a0("ai_record_index", Integer.valueOf(this.c(og, p2, i)));
                jsonObject.c0(this, this.b(p2));
                if (og instanceof MagicAssistantTemplate) {
                   MagicEmoji$MagicFace magicFace = og.getMagicFace();
                   if (magicFace != null) {
                      jsonObject.c0("req_id", TextUtils.k(magicFace.mRequestId));
                      magicFace = magicFace.mMagicFaceIconTipMsg;
                      if (magicFace != null) {
                         str1 = String.valueOf(magicFace.mStrategyId);
                         if (str1 != null) {
                         label_00b9 :
                            jsonObject.c0("strategy_id", str1);
                         }
                      }
                      str1 = "";
                      goto label_00b9 ;
                   }
                }
                if (p2 == a.I.c()) {
                   jsonObject.H(str, Boolean.TRUE);
                }
                jsonArray.G(jsonObject);
             }
          }
          this.a.clear();
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("template_list", jsonArray.toString());
          jsonObject1.c0(this, this.b(p2));
          if (p2 == a.I.c()) {
             jsonObject1.H(str, Boolean.TRUE);
          }
          String str2 = jsonObject1.toString();
          a.o(str2, "JsonObject\(\).let {\n     ¡­      it.toString\(\)\n    }");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AI_RECORD_TEMPLATE";
          uElementPack.params = str2;
          u1.D0("", p1, 3, uElementPack, null, null);
          return;
       }
    }
    public final void j(int p0,g p1,e0 p2,int p3,Long p4,int p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Integer.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AI_RECORD_LOADING_TEMPLATE";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("ai_record_type", this.a(Integer.valueOf(p1.getType())));
       jsonObject.c0("ai_record_id", p1.getTemplateId());
       jsonObject.c0("ai_record_name", p1.getTemplateName());
       jsonObject.a0("ai_record_index", Integer.valueOf(this.c(p1, p5, p0)));
       jsonObject.c0("ai_func_type", this.b(p5));
       if (p5 == a.I.c()) {
          jsonObject.H("is_follow_shot", Boolean.TRUE);
       }
       uElementPack.params = jsonObject.toString();
       h$b uob = h$b.e(p3, "AI_RECORD_LOADING_TEMPLATE");
       uob.k(uElementPack);
       if (p4 != null) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = p4.longValue();
          a.o(uob, "builder");
          uob.q(resultPackag);
       }
       u1.p0("", p2, uob);
       return;
    }
}
