package goa.k;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.growth.invitecode.token.InviteCodeResponseCache;
import km8.b;

public final class k	// class@002b49
{
    public static final SharedPreferences a;
    public static final k b;

    static {
       k.b = new k();
       SharedPreferences sharedPrefer = n.b();
       a.o(sharedPrefer, "PreferenceUtil.getPreferences\(\)");
       k.a = sharedPrefer;
    }
    public void k(){
       super();
    }
    public final void a(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "8")) {
          return;
       }
       g.a(k.a.edit().putBoolean("askSourcePageShowed", p0));
       return;
    }
    public final void b(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "4")) {
          return;
       }
       g.a(k.a.edit().putBoolean("channelClipUnloginDialogShow", p0));
       return;
    }
    public final void c(InviteCodeResponseCache p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       if (p0 == null) {
          g.a(k.a.edit().remove("inviteCodeCache"));
       }else {
          g.a(k.a.edit().putString("inviteCodeCache", b.e(p0)));
       }
       return;
    }
}
