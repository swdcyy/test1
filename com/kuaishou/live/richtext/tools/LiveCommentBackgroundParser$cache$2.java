package com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser$cache$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import e61.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import java.util.Objects;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser$a;
import java.lang.ref.SoftReference;

public final class LiveCommentBackgroundParser$cache$2 extends Lambda implements a	// class@000f75
{
    public static final LiveCommentBackgroundParser$cache$2 INSTANCE;

    static {
       LiveCommentBackgroundParser$cache$2.INSTANCE = new LiveCommentBackgroundParser$cache$2();
    }
    public void LiveCommentBackgroundParser$cache$2(){
       super(0);
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       LiveCommentBackgroundParser$a obj = PatchProxy.apply(objArray, this, LiveCommentBackgroundParser$cache$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveCommentBackgroundParser.c;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, LiveCommentBackgroundParser$a.class, str);
       if (uoa != patchProxyRe) {
       }else {
          int i = 0x100000;
          if (LiveCommentBackgroundParser.b == null) {
             LiveCommentBackgroundParser.b = new SoftReference(new a(i));
          }
          SoftReference b = LiveCommentBackgroundParser.b;
          if (b != null) {
             objArray = b.get();
          }
          if (objArray == null) {
             a uoa1 = new a(i);
             LiveCommentBackgroundParser.b = new SoftReference(uoa1);
             uoa = uoa1;
          }else {
             uoa = objArray;
          }
       }
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
