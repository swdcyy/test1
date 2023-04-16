package com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$tkBridge$2$a;
import tx4.l;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment$tkBridge$2;
import java.lang.Object;
import java.lang.String;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;
import kotlin.Result;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import tb7.d;
import k2b.u1;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Boolean;
import tx4.k;

public final class GrowthInvitePageFragment$tkBridge$2$a implements l	// class@0013ca
{
    public final GrowthInvitePageFragment$tkBridge$2 a;

    public void GrowthInvitePageFragment$tkBridge$2$a(GrowthInvitePageFragment$tkBridge$2 p0){
       this.a = p0;
       super();
    }
    public final Object a(String p0,String p1,h p2){
       GrowthInvitePageFragment$tkBridge$2 this$0;
       JsonElement jsonElement;
       JsonObject jsonObject;
       String str2;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthInvitePageFragment$tkBridge$2$a.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (p0 != null) {
          String str = "params";
          String str1 = "action2";
          int i = 0;
          switch (p0.hashCode()){
              case 0xa73dce72:
                if (p0.equals("KwaiBubble.logClick")) {
                   this$0 = this.a.this$0;
                   Objects.requireNonNull(this$0);
                   if (!PatchProxy.applyVoidOneRefs(p1, this$0, GrowthInvitePageFragment.class, "17")) {
                      if (p1 == null || !p1.length()) {
                         i = 1;
                      }
                      if (!i) {
                         jsonElement = c.d(p1);
                         a.o(jsonElement, "JsonParser.parseString\(jsonData\)");
                         jsonObject = jsonElement.r();
                         str2 = d.c(jsonObject, str1, null, 2, null);
                         jsonObject = d.c(jsonObject, str, null, 2, null);
                         if (!PatchProxy.applyVoidTwoRefs(str2, jsonObject, this$0, GrowthInvitePageFragment.class, "20")) {
                            ClickMetaData uClickMetaDa = new ClickMetaData();
                            uClickMetaDa.setType(1);
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = str2;
                            uElementPack.params = jsonObject;
                            uClickMetaDa.setElementPackage(uElementPack);
                            u1.B(uClickMetaDa);
                         }
                         Result.constructor-impl(l1.a);
                      }
                   }
                }
                break;
              case 0xe4640cd3:
                if (p0.equals("KwaiBubble.logShow")) {
                   this$0 = this.a.this$0;
                   Objects.requireNonNull(this$0);
                   if (!PatchProxy.applyVoidOneRefs(p1, this$0, GrowthInvitePageFragment.class, "16")) {
                      if (p1 == null || !p1.length()) {
                         i = 1;
                      }
                      if (!i) {
                         jsonElement = c.d(p1);
                         a.o(jsonElement, "JsonParser.parseString\(jsonData\)");
                         jsonObject = jsonElement.r();
                         str2 = d.c(jsonObject, str1, null, 2, null);
                         this$0.yh(str2, d.c(jsonObject, str, null, 2, null));
                         Result.constructor-impl(l1.a);
                      }
                   }
                }
                break;
              case 0x33a99997:
                if (p0.equals("KwaiBubble.dislike")) {
                   this.a.this$0.Ah();
                }
                break;
              case 0x40ff9fc7:
                if (p0.equals("KwaiBubble.logCustom")) {
                   this$0 = this.a.this$0;
                   Objects.requireNonNull(this$0);
                   if (!PatchProxy.applyVoidOneRefs(p1, this$0, GrowthInvitePageFragment.class, "18")) {
                      if (p1 == null || !p1.length()) {
                         i = 1;
                      }
                      if (!i) {
                         JsonElement jsonElement1 = c.d(p1);
                         a.o(jsonElement1, "JsonParser.parseString\(jsonData\)");
                         JsonObject jsonObject1 = jsonElement1.r();
                         p1 = d.c(jsonObject1, "key", null, 2, null);
                         u1.R(p1, d.c(jsonObject1, "value", null, 2, null), 9);
                         Result.constructor-impl(l1.a);
                      }
                   }
                }
                break;
              default:
          }
       }
    label_0154 :
       return Boolean.FALSE;
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
}
