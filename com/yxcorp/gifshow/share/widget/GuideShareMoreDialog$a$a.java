package com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.List;
import java.lang.String;
import msd.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import tkd.b;
import tkd.d;
import nu5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import nu5.a$a;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;

public final class GuideShareMoreDialog$a$a extends m	// class@001d01
{
    public final GifshowActivity c;
    public final List d;
    public final int e;
    public final String f;
    public final a g;

    public void GuideShareMoreDialog$a$a(GifshowActivity p0,List p1,int p2,String p3,a p4){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuideShareMoreDialog$a$a.class, "1")) {
          return;
       }
       if (!this.c.isDestroyed() && !this.c.isFinishing()) {
          d.a(-977155072).yV(this.c, 0, this.d.get(this.e), null, null, null, 0, 0);
       }
       GuideShareMoreDialog$a f = GuideShareMoreDialog.f;
       QPhoto mEntity = this.d.get(this.e).mEntity;
       a.o(mEntity, "photos[index].mEntity");
       GuideShareMoreDialog$a$a tf = this.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoidTwoRefs(mEntity, tf, f, GuideShareMoreDialog$a.class, "4")) {
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = tf;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAY_PHOTO";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(mEntity);
          u1.B(new ClickMetaData().setAreaPackage(uAreaPackage).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(mEntity)));
       }
       this.g.invoke();
       return;
    }
}
