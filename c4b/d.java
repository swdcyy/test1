package c4b.d;
import java.lang.Runnable;
import c4b.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import u4b.e;
import java.util.List;
import skd.a$a;
import skd.a;
import fg6.a;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class d implements Runnable	// class@0004ae
{
    public final f b;
    public final MagicEmoji$MagicFace c;

    public void d(f p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       f uof = f.class;
       _monitor_enter(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, uof, "9")) {
          _monitor_exit(tb);
       }else if(tc != null && (!MagicEmoji$MagicFace.isPlatformMagicFace(tc) && (MagicEmoji$MagicFace.isChildMagicFace(tc) || e.a(tc)))){
          _monitor_exit(tb);
       }else {
          List list = tb.d();
          int i = list.indexOf(tc);
          if (i != -1) {
             list.remove(i);
          }
          list.add(0, tc);
          String str = tb.c();
          if (!PatchProxy.applyVoidTwoRefs(str, list, tb, uof, "3")) {
             a$a uoa = tb.a.a();
             uoa.putString(str, a.a.q(list));
             g.a(uoa);
          }
          _monitor_exit(tb);
       }
       return;
    }
}
