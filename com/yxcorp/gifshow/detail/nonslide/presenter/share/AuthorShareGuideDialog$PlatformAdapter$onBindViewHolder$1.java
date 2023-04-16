package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import msd.a;
import yhc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1$1;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.kwai.sharelib.a;
import java.util.List;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$a;
import mhc.o2;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import k2b.u1;

public final class AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1 implements View$OnClickListener	// class@0015cf
{
    public final AuthorShareGuideDialog$b b;
    public final int c;

    public void AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1(AuthorShareGuideDialog$b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1.class, "1")) {
          return;
       }
       this.b.f.c.invoke();
       a a = a.a;
       a.c(this.b.f.c(), this.b.f.d(), null, new AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1$1(this)).c(o2.a(true, this.b.J0().get(this.c).a()));
       String str = this.b.J0().get(this.c).a();
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(str, a, uoa, "8")) {
          a.p(str, "channel");
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = "MASTER_SHARE_TIP_POPUP";
          uClickEvent.areaPackage = uAreaPackage;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHARE_BUTTON";
          i3 oi3 = i3.f();
          Objects.requireNonNull(a);
          String str1 = PatchProxy.applyOneRefs(str, a, uoa, "6");
          if (str1 != PatchProxyResult.class) {
          }else {
             switch (str.hashCode()){
                 case 0xa715146d:
                   if (str.equals("wechatMoments")) {
                      str1 = "WECHAT_TIMELINE";
                   }else {
                   label_00de :
                      str1 = "";
                   }
                   break;
                 case 0xd0ce8b26:
                   if (str.equals("wechat")) {
                      str1 = "WECHAT";
                   }else {
                      goto label_00de ;
                   }
                   break;
                 case 3616:
                   if (str.equals("qq")) {
                      str1 = "QQ";
                   }else {
                      goto label_00de ;
                   }
                   break;
                 case 0x671839d:
                   if (str.equals("qzone")) {
                      str1 = "QQ_ZONE";
                   }else {
                      goto label_00de ;
                   }
                   break;
                 case 0x6bc6ce8:
                   if (str.equals("weibo")) {
                      str1 = "SINA_WEIBO";
                   }else {
                      goto label_00de ;
                   }
                   break;
                 default:
                   goto label_00de ;
             }
          }
          oi3.d("share_platform", str1);
          uElementPack.params = oi3.e();
          uClickEvent.elementPackage = uElementPack;
          u1.a0(uClickEvent);
       }
       return;
    }
}
