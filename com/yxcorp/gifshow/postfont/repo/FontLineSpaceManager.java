package com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager;
import com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager$localLineSpaceMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import qrd.l1;
import java.util.Objects;
import java.util.Map;

public final class FontLineSpaceManager	// class@0010a3
{
    public static final p a;
    public static final HashMap b;
    public static final FontLineSpaceManager c;

    static {
       FontLineSpaceManager.c = new FontLineSpaceManager();
       FontLineSpaceManager.a = s.c(FontLineSpaceManager$localLineSpaceMap$2.INSTANCE);
       FontLineSpaceManager.b = new HashMap();
    }
    public void FontLineSpaceManager(){
       super();
    }
    public static final int a(String p0){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FontLineSpaceManager uFontLineSpa = FontLineSpaceManager.class;
       HashMap obj = PatchProxy.applyOneRefs(p0, null, uFontLineSpa, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "font");
       obj = FontLineSpaceManager.b;
       _monitor_enter(obj);
       int i = 0;
       if (obj.containsKey(p0)) {
          Integer integer = obj.get(p0);
          if (integer != null) {
             i1 = integer.intValue();
          label_0031 :
             _monitor_exit(obj);
             if (!i1) {
                FontLineSpaceManager c = FontLineSpaceManager.c;
                Objects.requireNonNull(c);
                Object obj1 = PatchProxy.apply(null, c, uFontLineSpa, "1");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = FontLineSpaceManager.a.getValue();
                }
                Integer integer1 = obj1.get(p0);
                if (integer1 != null) {
                   i = integer1.intValue();
                }
             }else {
                i = i1;
             }
             return i;
          }
       }
       i1 = 0;
       goto label_0031 ;
    }
    public final void b(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontLineSpaceManager.class, "2")) {
          return;
       }
       a.p(p0, "map");
       HashMap b = FontLineSpaceManager.b;
       _monitor_enter(b);
       b.clear();
       b.putAll(p0);
       _monitor_exit(b);
       return;
    }
}
