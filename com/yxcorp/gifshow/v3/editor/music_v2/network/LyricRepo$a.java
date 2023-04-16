package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.r5;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LyricRepo$a	// class@0010aa
{

    public void LyricRepo$a(){
       super();
    }
    public void LyricRepo$a(u p0){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LyricRepo$a.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(LyricRepo.h)) {
          return;
       }
       LyricRepo lyricRepo = r5.b().a(LyricRepo.h, LyricRepo.class);
       if (lyricRepo != null) {
          lyricRepo.g();
       }
       r5.b().d(LyricRepo.h);
       LyricRepo.h = "";
       return;
    }
    public final LyricRepo b(){
       Object[] objArray = null;
       LyricRepo obj = PatchProxy.apply(objArray, this, LyricRepo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(LyricRepo.h)) {
          obj = r5.b().a(LyricRepo.h, LyricRepo.class);
          if (obj != null) {
             return obj;
          }
       }
       obj = new LyricRepo(objArray);
       String str = r5.b().c(obj);
       a.o(str, "OnceDataHub.getInstance\(\).putData<Any>\(repo\)");
       LyricRepo.h = str;
       return obj;
    }
}
