package com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import t3c.g;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import k2b.u1;
import h3c.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.follow.model.ProfileYiTianConfig;
import java.lang.reflect.Type;
import mw4.a;
import k2b.e0;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$b$a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import java.util.ArrayList;
import mz6.a;
import mz6.b$d;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.util.List;

public class AvatarFragment$b$b extends m	// class@0012fb
{
    public final AvatarFragment$b c;

    public void AvatarFragment$b$b(AvatarFragment$b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b1;
       ImageSelectSupplier$c uoc;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$b$b.class, str)) {
          return;
       }
       AvatarFragment$b$b tc = this.c;
       AvatarFragment$b s = tc.s;
       String str1 = TextUtils.k(tc.q.mId);
       Objects.requireNonNull(s);
       boolean b = true;
       if (!PatchProxy.applyVoidOneRefs(str1, s, g.class, str)) {
          a.p(str1, "userId");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x75df;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
          profilePacka.visitedUid = str1;
          uContentPack.profilePackage = profilePacka;
          u1.u(b, uElementPack, uContentPack);
       }
       a c = a.c;
       Context context = this.c.getContext();
       Objects.requireNonNull(c);
       ArrayList obj = PatchProxy.applyOneRefs(context, c, a.class, str);
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          a.p(context, "context");
          ProfileYiTianConfig profileYiTia = a.o(ProfileYiTianConfig.class);
          b1 = (profileYiTia != null && (profileYiTia.mEnablePhotographShowYiTian != null && c.a(context)))? true: false;
       }
       if (b1) {
          tc = this.c;
          tc.s.i(tc.p, b);
          uoc = ImageSelectSupplier$c.a();
          uoc.b(new AvatarFragment$b$b$a(this));
          obj = new ArrayList();
          a uoa = a.b();
          uoa.g(R.string.arg_RES_7f1036a0);
          obj.add(uoa.a());
          uoa = a.b();
          uoa.g(ImageSelectSupplier.p);
          obj.add(uoa.a());
          uoa = a.b();
          uoa.g(ImageSelectSupplier.q);
          obj.add(uoa.a());
          uoc.c(obj);
       }else {
          uoc = null;
       }
       this.c.P8(uoc, null);
       return;
    }
}
