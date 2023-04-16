package com.yxcorp.plugin.setting.entries.holder.e0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.plugin.setting.helper.j;
import xgc.b;
import java.lang.String;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import wgc.b;
import wgc.a;
import wgc.d;
import tkd.b;
import tkd.d;
import gx5.d;
import com.kwai.framework.model.user.PhotoGuestConfig;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import android.view.View;

public class e0 implements c	// class@00084f
{
    public final GifshowActivity a;
    public final b b;
    public final j c;
    public PresenterV2 d;
    public d e;

    public void e0(GifshowActivity p0){
       super();
       this.a = p0;
       this.c = new j(p0);
       b uob = new b();
       this.b = uob;
       uob.c = a1.p(0x7f103f7b);
       uob.b = 0x7f08051a;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, e0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return QCurrentUser.ME.enablePhotoGuest();
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new d();
       }
       return this.e;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, e0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = -1188553266;
       i = (d.a(i).Hj() != null && d.a(i).Hj().mEnablePhotoViewerSwitch != null)? true: false;
       return i;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = new PresenterV2();
          obj.U7(new a());
          obj.U7(new e0$a(this.a, this.c));
          this.d = obj;
       }
       return this.d;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
