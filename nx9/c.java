package nx9.c;
import java.lang.Integer;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.util.Random;
import com.kwai.sdk.switchconfig.a;
import nx9.c$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import java.util.List;
import nx9.a;
import ok.x;
import com.google.common.base.Suppliers;
import nx9.b;
import android.os.Build$VERSION;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import xf6.d;
import xf6.l;
import uid.a;

public final class c	// class@003209
{
    public static final ImmutableList a;
    public static final Random b;
    public static final List c;
    public static final x d;
    public static final x e;

    static {
       c.a = ImmutableList.of(Integer.valueOf(0x7f104c40), Integer.valueOf(0x7f104c43), Integer.valueOf(0x7f104c44), Integer.valueOf(0x7f104c45), Integer.valueOf(0x7f104c46), Integer.valueOf(0x7f104c47), Integer.valueOf(0x7f104c48), Integer.valueOf(0x7f104c49), Integer.valueOf(0x7f104c4a), Integer.valueOf(0x7f104c41), Integer.valueOf(0x7f104c42));
       c.b = new Random();
       c.c = a.t().getValue("overallEmotionResource", new c$a().getType(), null);
       c.d = Suppliers.a(a.b);
       c.e = Suppliers.a(b.b);
    }
    public void c(){
       super();
    }
    public static boolean a(){
       if (Build$VERSION.SDK_INT <= 23) {
          return false;
       }
       return true;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableCommentDislike");
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (f.e("commentPanelColor") != 1) {
          obj = (l.e("KEY_ENABLE_COMMENT_OLD_AT_API", i) == 1)? 1: 0;
          if (!obj) {
          label_002e :
             return i;
          }
       }
       i = true;
       goto label_002e ;
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (f.e("commentPanelColor") != 2) {
          obj = (l.e("KEY_ENABLE_COMMENT_OLD_AT_API", i) == 2)? 1: 0;
          if (!obj) {
          label_002f :
             return i;
          }
       }
       i = true;
       goto label_002f ;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.b();
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (d.s()) {
          if (d.s() == -1) {
             b = false;
          }
          return b;
       }else if(c.e.get().intValue()){
          b = false;
       }
       return b;
    }
    public static List g(){
       return c.c;
    }
}
