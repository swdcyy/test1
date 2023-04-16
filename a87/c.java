package a87.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.net.Uri;
import xkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;

public final class c	// class@00007a
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "scheme");
       Uri uri = b.g(p0);
       if (uri != null) {
          return TextUtils.n(uri.getScheme(), "kwailive");
       }
       return false;
    }
    public static final boolean b(LiveStreamFeed p0){
       LiveStreamFeed liveStreamFe = null;
       Object obj = PatchProxy.applyOneRefs(p0, liveStreamFe, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          liveStreamFe = p0.mTypeViewList;
       }
       if (liveStreamFe != null) {
          if (p0 != null) {
             LiveStreamFeed mTypeViewLis = p0.mTypeViewList;
             if (mTypeViewLis != null) {
                int i = (!mTypeViewLis.length)? 1: 0;
                if (i != true) {
                label_002b :
                   a.m(p0);
                   p0 = p0.mTypeViewList;
                   i = p0.length;
                   int i1 = 0;
                   while (i1 < i) {
                      object oobject = p0[i1];
                      if (oobject != null && oobject.intValue() == 39) {
                         return true;
                      }
                      i1 = i1 + 1;
                   }
                }
             }else {
                goto label_002b ;
             }
          }else {
             goto label_002b ;
          }
       }
       return false;
    }
}
