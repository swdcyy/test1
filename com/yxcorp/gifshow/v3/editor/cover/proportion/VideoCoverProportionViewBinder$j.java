package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$j;
import tyc.x4;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import tyc.b2;
import tyc.b2$a;
import tpc.e0;
import di0.b;
import tpc.v$b;
import tpc.u;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class VideoCoverProportionViewBinder$j implements x4	// class@000eaa
{
    public final VideoCoverProportionViewBinder a;

    public void VideoCoverProportionViewBinder$j(VideoCoverProportionViewBinder p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       VideoCoverProportionViewBinder$j oj = VideoCoverProportionViewBinder$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "1")) {
          return;
       }
       if (p0) {
          b2 uob2 = this.a.I().F();
          if (uob2 != null) {
             b2$a.a(uob2, false, 1, null);
          }
          v$b uob = this.a.G().x0().u(this.a.G().y0());
          if (uob != null) {
             u a = u.a;
             String str = uob.a();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(str, a, u.class, "3")) {
                a.p(str, "ratio");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COVER_ADJUST_SCALE_EXPAND";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("detail_name", a.a(str));
                uElementPack.params = jsonObject.toString();
                u1.u(1, uElementPack, null);
             }
          }
       }
    label_007e :
       return;
    }
}
