package bg.c;
import android.util.TypedValue;
import java.lang.Object;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.SoftAssertions;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import android.graphics.drawable.ColorDrawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;

public class c	// class@000b29
{
    public static final TypedValue a;

    static {
       c.a = new TypedValue();
    }
    public void c(){
       super();
    }
    public static Drawable a(Context p0,ReadableMap p1){
       TypedValue a;
       int intx;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, c.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p1.getString("type");
       boolean b = true;
       if (("ThemeAttrAndroid").equals(obj1)) {
          String str = p1.getString("attribute");
          SoftAssertions.assertNotNull(str);
          int identifier = p0.getResources().getIdentifier(str, "attr", "android");
          if (identifier) {
             a = c.a;
             if (p0.getTheme().resolveAttribute(identifier, a, b)) {
                return p0.getResources().getDrawable(a.resourceId, p0.getTheme());
             }else {
                throw new JSApplicationIllegalArgumentException("Attribute "+str+" couldn\'t be resolved into a drawable");
             }
          }else {
             throw new JSApplicationIllegalArgumentException("Attribute "+str+" couldn\'t be found in the resource list");
          }
       }else if(("RippleAndroid").equals(obj1)){
          obj1 = "color";
          if (p1.hasKey(obj1) && !p1.isNull(obj1)) {
             intx = p1.getInt(obj1);
          }else {
             a = c.a;
             if (p0.getTheme().resolveAttribute(0x101042c, a, b)) {
                intx = p0.getResources().getColor(a.resourceId);
             }else {
                throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn\'t be resolved into a drawable");
             }
          }
          obj1 = "borderless";
          ColorDrawable uColorDrawab = (p1.hasKey(obj1) && (p1.isNull(obj1) || !p1.getBoolean(obj1)))? new ColorDrawable(-1): obj;
          int[][] ointArray = new int[][b];
          int[] ointArray1 = new int[0];
          ointArray[0] = ointArray1;
          int[] ointArray2 = new int[b];
          ointArray2[0] = intx;
          return new RippleDrawable(new ColorStateList(ointArray, ointArray2), obj, uColorDrawab);
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: "+obj1);
       }
    }
}
