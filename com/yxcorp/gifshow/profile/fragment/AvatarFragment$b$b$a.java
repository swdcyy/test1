package com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$b$a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$b;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import h3c.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.net.Uri;
import android.content.Intent;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import k2b.e0;
import t3c.g;

public class AvatarFragment$b$b$a implements ImageSelectSupplier$b	// class@0012fa
{
    public final AvatarFragment$b$b b;

    public void AvatarFragment$b$b$a(AvatarFragment$b$b p0){
       this.b = p0;
       super();
    }
    public void onCancel(DialogInterface p0){
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(AvatarFragment$b$b$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AvatarFragment$b$b$a.class, "1")) {
          return;
       }
       if (p1 == 0x7f1036a0) {
          a c = a.c;
          Context context = this.b.c.getContext();
          String str = "";
          Objects.requireNonNull(c);
          a uoa = a.class;
          if (!PatchProxy.applyVoidTwoRefs(context, str, c, uoa, "4")) {
             a.p(context, "context");
             a.p(str, "taskID");
             str = "from=avatar&subfrom=p_to_photo&backurl=kwai://avatar&kstaskid=&alert=换头像&alertmessage=照片保存成功，赶紧打开快手上传最新头像吧～";
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("m2u3://third_take_photo?"+str));
             if (c.c(context, intent)) {
                if (!PatchProxy.applyVoidTwoRefs(context, intent, c, uoa, "5")) {
                   intent.addFlags(0x10000000);
                   context.startActivity(intent);
                }
             }else {
                c.b(context, "m2u3://third_take_photo?"+str);
             }
          }
          AvatarFragment$b$b c1 = this.b.c;
          c1.s.h(c1.p, true);
       }
       return;
    }
    public void show(){
    }
}
