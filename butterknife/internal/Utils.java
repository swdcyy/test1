package butterknife.internal.Utils;
import android.util.TypedValue;
import java.lang.Object;
import java.lang.AssertionError;
import java.util.Arrays;
import java.lang.String;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.a;
import java.util.List;
import butterknife.internal.ImmutableList;

public final class Utils	// class@000ba8
{
    public static final TypedValue VALUE;

    static {
       Utils.VALUE = new TypedValue();
    }
    public void Utils(){
       super();
       throw new AssertionError("No instances.");
    }
    public static Object[] arrayFilteringNull(Object[] p0){
       int len = p0.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             int i2 = i1 + 1;
             p0[i1] = oobject;
             i1 = i2;
          }
          i = i + 1;
       }
       if (i1 != len) {
          p0 = Arrays.copyOf(p0, i1);
       }
       return p0;
    }
    public static Object castParam(Object p0,String p1,int p2,String p3,int p4,Class p5){
       try{
          return p5.cast(p0);
       }catch(java.lang.ClassCastException e2){
          p2++;
          p4++;
          throw new IllegalStateException("Parameter #"+p2+" of method \'"+p1+"\' was of the wrong type for parameter #"+p4+" of method \'"+p3+"\'. See cause for more info.", e2);
       }
    }
    public static Object castView(View p0,int p1,String p2,Class p3){
       try{
          return p3.cast(p0);
       }catch(java.lang.ClassCastException e6){
          throw new IllegalStateException("View \'"+Utils.getResourceEntryName(p0, p1)+"\' with ID "+p1+" for "+p2+" was of the wrong type. See cause for more info.", e6);
       }
    }
    public static Object findOptionalViewAsType(View p0,int p1,String p2,Class p3){
       return Utils.castView(p0.findViewById(p1), p1, p2, p3);
    }
    public static View findRequiredView(View p0,int p1,String p2){
       View view = p0.findViewById(p1);
       if (view != null) {
          return view;
       }
       throw new IllegalStateException("Required view \'"+Utils.getResourceEntryName(p0, p1)+"\' with ID "+p1+" for "+p2+" was not found. If this view is optional add \'@Nullable\' \(fields\) or \'@Optional\' \(methods\) annotation.");
    }
    public static Object findRequiredViewAsType(View p0,int p1,String p2,Class p3){
       return Utils.castView(Utils.findRequiredView(p0, p1, p2), p1, p2, p3);
    }
    public static float getFloat(Context p0,int p1){
       TypedValue vALUE = Utils.VALUE;
       p0.getResources().getValue(p1, vALUE, true);
       if (vALUE.type == 4) {
          return vALUE.getFloat();
       }
       throw new Resources$NotFoundException("Resource ID #0x"+Integer.toHexString(p1)+" type #0x"+Integer.toHexString(vALUE.type)+" is not valid");
    }
    public static String getResourceEntryName(View p0,int p1){
       if (p0.isInEditMode()) {
          return "<unavailable while editing>";
       }
       return p0.getContext().getResources().getResourceEntryName(p1);
    }
    public static Drawable getTintedDrawable(Context p0,int p1,int p2){
       TypedValue vALUE = Utils.VALUE;
       if (!p0.getTheme().resolveAttribute(p2, vALUE, true)) {
          throw new Resources$NotFoundException("Required tint color attribute with name "+p0.getResources().getResourceEntryName(p2)+" and attribute ID "+p2+" was not found.");
       }
       Drawable uDrawable = a.r(ContextCompat.getDrawable(p0, p1).mutate());
       a.n(uDrawable, ContextCompat.getColor(p0, vALUE.resourceId));
       return uDrawable;
    }
    public static List listFilteringNull(Object[] p0){
       return new ImmutableList(Utils.arrayFilteringNull(p0));
    }
}
