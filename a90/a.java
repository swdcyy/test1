package a90.a;
import java.lang.String;
import android.graphics.Color;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import h90.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import z80.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Number;
import java.lang.Math;
import java.util.Objects;
import java.lang.Boolean;

public final class a	// class@0000ff
{
    public static int a;
    public static final a b;

    static {
       a.b = new a();
       a.a = Color.parseColor("#FFBB4246");
    }
    public void a(){
       super();
    }
    public final e a(String p0,o1 p1){
       e uoe;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "assetTag");
       Object[] objArray = new Object[0];
       a.D().w("MediaSceneAssetHelper", "findAssetByAssetTag invoked with assetTag = "+p0, objArray);
       if (p1 == null) {
          return null;
       }
       Iterator iterator = p1.v0().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uoe = iterator.next();
          a.o(uoe, "area");
          if (TextUtils.n(p0, uoe.b())) {
             break ;
          }
       }
       return uoe;
    }
    public final void b(String p0,String p1,o1 p2){
       Object obj = p0;
       Object obj1 = p1;
       o1 oo1 = p2;
       String str = "16";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, str)) {
          return;
       }
       a.p(obj, "assetTag");
       a.p(obj1, "assetPath");
       Object[] objArray = new Object[0];
       a.D().w("MediaSceneAssetHelper", "innerReplaceAsset\(\) invoked with assetTag = "+obj+" and "+"assetPath = "+obj1, objArray);
       e uoe = this.a(obj, oo1);
       if (uoe != null) {
          int i = str.a().matcher(obj1).matches() ^ 0x01;
          long l = (long)p1.hashCode();
          QMedia obj2 = PatchProxy.apply(null, uoe, e.class, "17");
          long l1 = (obj2 != PatchProxyResult.class)? obj2.longValue(): Math.round((uoe.f() * 0x408f400000000000));
          int i1 = i;
          QMedia qMedia = v4;
          obj2 = new QMedia(l, p1, l1, -1, i1);
          if (i1 == 1) {
             qMedia.mClipDuration = qMedia.duration;
          }
          a b = a.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidThreeRefs(uoe, qMedia, p2, b, a.class, "11")) {
             a.p(qMedia, "media");
             Object[] objArray1 = new Object[0];
             a.D().w("MediaSceneAssetHelper", "replaceAssetByAssetTag invoked", objArray1);
             if (oo1 != null) {
                QMedia path = qMedia.path;
                Object obj3 = PatchProxy.applyTwoRefs(path, qMedia, uoe, e.class, "1");
                if (obj3 != PatchProxyResult.class) {
                   obj3.booleanValue();
                }else {
                   uoe.p(path, qMedia, 0, true);
                }
                if (!PatchProxy.applyVoidOneRefs(qMedia, oo1, o1.class, "12")) {
                   oo1.n.add(qMedia);
                }
             }
          }
       }
    label_00f9 :
       return;
    }
}
