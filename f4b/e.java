package f4b.e;
import erd.g;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import ekd.k1;
import s5b.b;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import e4b.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.a;
import boc.b0;
import android.content.SharedPreferences;
import qfc.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.io.File;
import o56.c;
import android.app.Application;
import java.lang.Enum;

public final class e implements g	// class@002898
{
    public final long b;
    public final MagicBusinessId c;

    public void e(long p0,MagicBusinessId p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().A("refresh_magic", "complete. total cost "+k1.t(this.b), objArray);
       p0 = "CategoryPreference";
       String str = "MagicDbCleanVersion";
       if (PatchProxy.applyVoidOneRefs(tc, null, b.class, "6")) {
       }else {
          String m = a.m;
          String str1 = "";
          try{
             String str2 = b0.a.getString(str, str1);
             Object[] objArray1 = new Object[i];
             a.C().w(p0, "getMagicEmojiCacheVersion_"+str2, objArray1);
             str1 = str2;
          }catch(java.lang.Exception e6){
             PostUtils.D("ks://MagicDbCleanVersion", "readError", e6);
          }
          if (!m.equals(str1)) {
             Object[] objArray2 = new Object[i];
             b.D().A("MagicEmojiDataCacheHelper", "setCleanAppVersion"+a.m, objArray2);
             try{
                m = a.m;
                Object[] objArray3 = new Object[i];
                a.C().w(p0, "setMagicEmojiCacheVersion  "+m, objArray3);
                g.a(b0.a.edit().putString(str, m));
             }catch(java.lang.Exception e11){
                PostUtils.D("ks://MagicDbCleanVersion", "writeError", e11);
             }
             p0 = new File(a.a().a().getCacheDir(), tc.name()+"_magic_emoji_data");
             if (p0.exists()) {
                p0.delete();
             }
             p0 = new File(a.a().a().getCacheDir(), tc.name()+"_multi_magic_emoji_data");
             if (p0.exists()) {
                p0.delete();
             }
             p0 = new File(a.a().a().getCacheDir(), tc.name()+"_brief_magic_emoji_data");
             if (p0.exists()) {
                p0.delete();
             }
          }
       }
       return;
    }
}
