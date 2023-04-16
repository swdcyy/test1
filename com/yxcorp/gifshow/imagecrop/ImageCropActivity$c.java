package com.yxcorp.gifshow.imagecrop.ImageCropActivity$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import c79.a;
import java.io.File;
import android.net.Uri;
import kotlin.jvm.internal.a;
import mxa.a;
import c79.a$a;
import g79.a;
import w69.r0;
import android.content.Context;
import c79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import w69.x;

public final class ImageCropActivity$c implements View$OnClickListener	// class@00194e
{
    public final ImageCropActivity b;

    public void ImageCropActivity$c(ImageCropActivity p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       a$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity$c.class, "1")) {
          return;
       }
       ImageCropActivity$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ImageCropActivity.class, "14")) {
          a = a.a;
          Uri uri = Uri.fromFile(new File(tb.u));
          a.h(uri, "Uri.fromFile\(File\(mFile\)\)");
          a uoa = new a(tb);
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(tb, uri, uoa, a, a$a.class, "9")) {
             a.q(tb, "context");
             a.q(uri, "uri");
             a.c.e().d(tb, uri, uoa);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ImageCropActivity.class, "22")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 828;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 187;
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.direction = 0;
          uClickEvent.type = 1;
          uClickEvent.urlPackage = urlPackage;
          uClickEvent.elementPackage = uElementPack;
          uClickEvent.extraMessage = "";
          a.c.f().e(uClickEvent);
       }
       return;
    }
}
