package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$j;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import ng9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class AssistantModeController$j implements g	// class@001cef
{
    public final AssistantModeController b;

    public void AssistantModeController$j(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController$j.class, "1")) {
       }else if(p0.a != null){
          p0 = this.b;
          if (p0.E != null) {
             p0 = p0.o2().h();
             d d = this.b.d;
             a.o(d, "mCallerContext");
             BaseFragment uBaseFragmen = d.f();
             a.o(uBaseFragmen, "mCallerContext.fragment");
             Objects.requireNonNull(p0);
             c uoc = c.class;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, uBaseFragmen, p0, uoc, "15")) {
                a.p(uBaseFragmen, "page");
                p0 = new ClientEvent$ElementPackage();
                p0.action2 = "CANCEL_ENTER_AI_RECORD";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("cancel_type", "other");
                p0.params = jsonObject.toString();
                u1.L("", uBaseFragmen, 1, p0, null);
             }
             this.b.m2(false);
          }
       }
       return;
    }
}
