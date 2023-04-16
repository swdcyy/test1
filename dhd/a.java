package dhd.a;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ihc.a;
import android.content.Context;
import zgd.a;
import com.yxcorp.gifshow.settings.SettingItem;
import java.lang.Enum;
import k2b.e0;
import msd.a;
import nsd.u;
import ehc.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import x56.d;
import android.app.Application;
import o56.a;
import brd.t;
import y56.a;
import gr8.b;
import ihc.c;
import brd.x;
import t45.d;
import brd.z;
import dhd.a$a;
import erd.o;
import dhd.a$b;
import erd.g;
import crd.b;
import dhd.a$c;
import dhd.a$d;
import dhd.a$e;

public final class a extends CleanCacheItem	// class@000cc9
{
    public final String w;
    public final a x;
    public boolean y;

    public void a(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       String str = this.b.getString(R.string.arg_RES_7f104ab8);
       a.o(str, "context.getString\(R.string.storage_space\)");
       this.w = str;
       a uoa = new a(this.d, SettingItem.STORAGE_SPACE.name(), null, 4, null);
       this.x = str;
    }
    public g f(){
       return this.x;
    }
    public String getTitle(){
       return this.w;
    }
    public void k(){
       Application uApplication;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       d t = CheckDiskModule.t;
       String str = "AppEnv.getAppContext\(\)";
       if (t != null && t.hideAppTotalDiskSize != null) {
          uApplication = a.b();
          a.o(uApplication, str);
          a.a(uApplication).compose(this.l()).subscribeOn(d.c).map(a$a.b).observeOn(d.a).subscribe(new a$b(this));
       }else {
          uApplication = a.b();
          a.o(uApplication, str);
          a.b(uApplication).compose(this.l()).subscribeOn(d.c).map(a$c.b).observeOn(d.a).subscribe(new a$d(this));
       }
       if (this.y == null) {
          uApplication = a.b();
          a.o(uApplication, str);
          a.a(uApplication).subscribeOn(d.c).subscribe(a$e.b);
          this.y = true;
       }
       return;
    }
}
