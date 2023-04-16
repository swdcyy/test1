package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import k2b.e0;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import android.content.Intent;
import android.net.Uri;

public final class TemplatePreviewPresenter$d implements View$OnClickListener	// class@001313
{
    public final TemplatePreviewPresenter b;

    public void TemplatePreviewPresenter$d(TemplatePreviewPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       CharSequence text;
       StringBuilder str1;
       String id;
       Intent intent;
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplatePreviewPresenter$d.class, "1")) {
          return;
       }
       Context context = this.b.getContext();
       if (context != null) {
          CreationReporter b = CreationReporter.b;
          e0 uoe0 = this.b.S8();
          TemplatePreviewPresenter r = this.b.r;
          String str = "";
          if (r != null) {
             text = r.getText();
             if (text != null) {
             label_002b :
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidTwoRefs(uoe0, text, b, CreationReporter.class, "5")) {
                   a.p(uoe0, "page");
                   a.p(text, "buttonText");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.params = b.a(b.b(text));
                   uElementPack.action2 = "ECOSYS_BUTTON";
                   u1.L(str, uoe0, 1, uElementPack, new ClientContent$ContentPackage());
                }
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                boolean b1 = a.g(qCurrentUser.getId(), this.b.v);
                if (SystemUtil.M(context, "com.kwai.videoeditor")) {
                   if (b1) {
                      str1 = "kwaiying://create";
                   }else {
                      str1 = "kwaiying://mv?id=";
                      TemplatePreviewPresenter x = this.b.x;
                      if (x != null) {
                         id = x.getId();
                         if (id != null) {
                            str = id;
                         }
                      }
                      str1 = str1+str;
                   }
                   context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str1)));
                }else {
                   intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.kwai.videoeditor"));
                   intent.addFlags(0x10000000);
                   context.startActivity(intent);
                }
             }
          }
          text = str;
          goto label_002b ;
       }
       return;
    }
}
