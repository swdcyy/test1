package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q79.d;
import r79.c;
import l79.m;
import o79.q;
import e17.i;
import e17.s;
import kotlin.jvm.internal.a;
import r79.a;
import w69.k;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import g79.a;
import w69.x;

public final class AlbumSelectedContainer$b implements View$OnClickListener	// class@001a98
{
    public final AlbumSelectedContainer b;

    public void AlbumSelectedContainer$b(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$b.class, "1")) {
          return;
       }
       c uoc = AlbumSelectedContainer.g(this.b).w0();
       if (uoc != null) {
          int i = AlbumSelectedContainer.g(this.b).d0(uoc);
          if (i != -1) {
             AlbumSelectedContainer.g(this.b).y(i);
             AlbumSelectedContainer.f(this.b).Y0();
          }else if(this.b.G != null && !q.c(uoc)){
             a.h(s.f(R.string.arg_RES_7f1018bc), "ToastUtil.info\(R.string.¡­lbum_preview_cant_select\)");
          }else {
             AlbumSelectedContainer.g(this.b).h0(uoc);
             AlbumSelectedContainer.f(this.b).a1(AlbumSelectedContainer.g(this.b).d0(uoc));
          }
          if (AlbumSelectedContainer.g(this.b).s0().m().o()) {
             AlbumSelectedContainer$b tb = this.b;
             AlbumSelectedContainer r = tb.R;
             String str = String.valueOf(tb.N);
             if (!PatchProxy.applyVoidTwoRefs(r, str, null, d.class, "28")) {
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("is_full_screen", str);
                uElementPack.params = jsonObject.toString();
                uClickEvent.elementPackage = uElementPack;
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                uClickEvent.urlPackage = urlPackage;
                urlPackage.page2 = r;
                urlPackage.params = "task_id="+d.a;
                uElementPack.action2 = "PICK_PICTURE";
                a.c.f().e(uClickEvent);
             }
          }else {
             d.p(this.b.R);
          }
       }
       return;
    }
}
