package androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.Object;
import java.lang.String;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.util.HashMap;
import android.view.View;
import java.lang.Class;
import java.util.Set;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.lang.NoSuchMethodException;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Character;
import java.lang.Boolean;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import java.lang.Float;
import androidx.constraintlayout.widget.ConstraintAttribute$a;
import java.lang.Enum;
import java.lang.CharSequence;
import java.lang.RuntimeException;
import java.lang.Math;
import e1.c;

public class ConstraintAttribute	// class@0006b1
{
    public String a;
    public ConstraintAttribute$AttributeType b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public void ConstraintAttribute(ConstraintAttribute p0,Object p1){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.j(p1);
    }
    public void ConstraintAttribute(String p0,ConstraintAttribute$AttributeType p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.j(p2);
    }
    public static int a(int p0){
       p0 = (p0 & (~ (p0 >> 31))) - 255;
       return ((p0 & (p0 >> 31)) + 255);
    }
    public static HashMap b(HashMap p0,View p1){
       HashMap hashMap = new HashMap();
       Class class = p1.getClass();
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ConstraintAttribute uConstraintA = p0.get(str);
          try{
             if (str.equals("BackgroundColor")) {
                hashMap.put(str, new ConstraintAttribute(uConstraintA, Integer.valueOf(p1.getBackground().getColor())));
             }else {
                Class[] uClassArray = new Class[0];
                Object[] objArray = new Object[0];
                hashMap.put(str, new ConstraintAttribute(uConstraintA, class.getMethod("getMap"+str, uClassArray).invoke(p1, objArray)));
             }
          }catch(java.lang.NoSuchMethodException e3){
             e3.printStackTrace();
             goto label_0011 ;
          }catch(java.lang.IllegalAccessException e3){
             e3.printStackTrace();
             goto label_0011 ;
          }catch(java.lang.reflect.InvocationTargetException e3){
             e3.printStackTrace();
             goto label_0011 ;
          }
       }
       return hashMap;
    }
    public static void g(Context p0,XmlPullParser p1,HashMap p2){
       ConstraintAttribute$AttributeType cOLOR_TYPE;
       Integer integer;
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.k0);
       int indexCount = typedArray.getIndexCount();
       String str = null;
       Boolean uBoolean = str;
       ConstraintAttribute$AttributeType uAttributeTy = uBoolean;
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          int i1 = 1;
          if (!index) {
             str = typedArray.getString(index);
             if (str != null && str.length() > 0) {
                str = Character.toUpperCase(str.charAt(0))+str.substring(i1);
             }
          }else if(index == i1){
             uBoolean = Boolean.valueOf(typedArray.getBoolean(index, 0));
             uAttributeTy = ConstraintAttribute$AttributeType.BOOLEAN_TYPE;
          }else if(index == 3){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.COLOR_TYPE;
             integer = Integer.valueOf(typedArray.getColor(index, 0));
          }else if(index == 2){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE;
             integer = Integer.valueOf(typedArray.getColor(index, 0));
          }else if(index == 7){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
             integer = Float.valueOf(TypedValue.applyDimension(i1, typedArray.getDimension(index, 0), c.c(p0.getResources())));
          }else if(index == 4){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
             integer = Float.valueOf(typedArray.getDimension(index, 0));
          }else if(index == 5){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.FLOAT_TYPE;
             integer = Float.valueOf(typedArray.getFloat(index, Float.NaN));
          }else if(index == 6){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.INT_TYPE;
             integer = Integer.valueOf(typedArray.getInteger(index, -1));
          }else if(index == 8){
             cOLOR_TYPE = ConstraintAttribute$AttributeType.STRING_TYPE;
             integer = typedArray.getString(index);
          }
          uAttributeTy = cOLOR_TYPE;
          uBoolean = integer;
          i = i + 1;
       }
       if (str != null && uBoolean != null) {
          p2.put(str, new ConstraintAttribute(str, uAttributeTy, uBoolean));
       }
       typedArray.recycle();
       return;
    }
    public static void h(View p0,HashMap p1){
       Class[] uClassArray;
       Object[] objArray;
       Class class = p0.getClass();
       Iterator iterator = p1.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ConstraintAttribute uConstraintA = p1.get(str);
          str = "set"+str;
          try{
             int i = 0;
             switch (ConstraintAttribute$a.a[uConstraintA.b.ordinal()]){
                 case 1:
                   uClassArray = new Class[1];
                   uClassArray[i] = Integer.TYPE;
                   objArray = new Object[1];
                   objArray[i] = Integer.valueOf(uConstraintA.g);
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 case 2:
                   uClassArray = new Class[1];
                   uClassArray[i] = Drawable.class;
                   ColorDrawable uColorDrawab = new ColorDrawable();
                   uColorDrawab.setColor(uConstraintA.g);
                   Object[] objArray1 = new Object[1];
                   objArray1[i] = uColorDrawab;
                   class.getMethod(str, uClassArray).invoke(p0, objArray1);
                   break;
                 case 3:
                   uClassArray = new Class[1];
                   uClassArray[i] = Integer.TYPE;
                   objArray = new Object[1];
                   objArray[i] = Integer.valueOf(uConstraintA.c);
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 case 4:
                   uClassArray = new Class[1];
                   uClassArray[i] = Float.TYPE;
                   objArray = new Object[1];
                   objArray[i] = Float.valueOf(uConstraintA.d);
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 case 5:
                   uClassArray = new Class[1];
                   uClassArray[i] = CharSequence.class;
                   objArray = new Object[1];
                   objArray[i] = uConstraintA.e;
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 case 6:
                   uClassArray = new Class[1];
                   uClassArray[i] = Boolean.TYPE;
                   objArray = new Object[1];
                   objArray[i] = Boolean.valueOf(uConstraintA.f);
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 case 7:
                   uClassArray = new Class[1];
                   uClassArray[i] = Float.TYPE;
                   objArray = new Object[1];
                   objArray[i] = Float.valueOf(uConstraintA.d);
                   class.getMethod(str, uClassArray).invoke(p0, objArray);
                   break;
                 default:
             }
          }catch(java.lang.NoSuchMethodException e2){
             e2.getMessage();
             goto label_000c ;
          }catch(java.lang.IllegalAccessException e2){
             e2.printStackTrace();
             goto label_000c ;
          }catch(java.lang.reflect.InvocationTargetException e2){
             e2.printStackTrace();
             goto label_000c ;
          }
       }
       return;
    }
    public ConstraintAttribute$AttributeType c(){
       return this.b;
    }
    public float d(){
       switch (ConstraintAttribute$a.a[this.b.ordinal()]){
           case 1:
           case 2:
             throw new RuntimeException("Color does not have a single color to interpolate");
           case 3:
             return (float)this.c;
           case 4:
             return this.d;
           case 5:
             throw new RuntimeException("Cannot interpolate String");
           case 6:
             float f = (this.f != null)? 0x3f800000: 0;
             return f;
             break;
           case 7:
             return this.d;
           default:
             return Float.NaN;
       }
    }
    public void e(float[] p0){
       int i = 0;
       switch (ConstraintAttribute$a.a[this.b.ordinal()]){
           case 1:
           case 2:
             ConstraintAttribute tg = this.g;
             p0[i] = (float)Math.pow((double)((float)((tg >> 16) & 0x00ff) / 0x437f0000), 2.20f);
             p0[1] = (float)Math.pow((double)((float)((tg >> 8) & 0x00ff) / 0x437f0000), 2.20f);
             p0[2] = (float)Math.pow((double)((float)(tg & 0x00ff) / 0x437f0000), 2.20f);
             p0[3] = (float)((tg >> 24) & 0x00ff) / 0x437f0000;
          label_006e :
             return;
             break;
           case 3:
             p0[i] = (float)this.c;
             goto label_006e ;
             break;
           case 4:
             p0[i] = this.d;
             goto label_006e ;
             break;
           case 5:
             throw new RuntimeException("Color does not have a single color to interpolate");
           case 6:
             int i1 = (this.f != null)? 0x3f800000: 0;
             p0[i] = i1;
             goto label_006e ;
             break;
           case 7:
             p0[i] = this.d;
             goto label_006e ;
             break;
           default:
             goto label_006e ;
       }
    }
    public int f(){
       int i = ConstraintAttribute$a.a[this.b.ordinal()];
       if (i != 1 && i != 2) {
          return 1;
       }
       return 4;
    }
    public void i(View p0,float[] p1){
       Class[] uClassArray;
       Object[] objArray;
       Class class = p0.getClass();
       String str = "set"+this.a;
       try{
          int i = 3;
          int i1 = 2;
          int i2 = 1;
          switch (ConstraintAttribute$a.a[this.b.ordinal()]){
              case 1:
                uClassArray = new Class[i2];
                uClassArray[0] = Integer.TYPE;
                objArray = new Object[i2];
                objArray[0] = Integer.valueOf(((((ConstraintAttribute.a((int)(p1[i] * 0x437f0000)) << 24) | (ConstraintAttribute.a((int)((float)Math.pow((double)p1[0], 0x3fdd1745d1745d17) * 0x437f0000)) << 16)) | (ConstraintAttribute.a((int)((float)Math.pow((double)p1[i2], 0x3fdd1745d1745d17) * 0x437f0000)) << 8)) | ConstraintAttribute.a((int)((float)Math.pow((double)p1[i1], 0x3fdd1745d1745d17) * 0x437f0000))));
                class.getMethod(str, uClassArray).invoke(p0, objArray);
                break;
              case 2:
                uClassArray = new Class[i2];
                uClassArray[0] = Drawable.class;
                ColorDrawable uColorDrawab = new ColorDrawable();
                uColorDrawab.setColor(((((ConstraintAttribute.a((int)(p1[i] * 0x437f0000)) << 24) | (ConstraintAttribute.a((int)((float)Math.pow((double)p1[0], 0x3fdd1745d1745d17) * 0x437f0000)) << 16)) | (ConstraintAttribute.a((int)((float)Math.pow((double)p1[i2], 0x3fdd1745d1745d17) * 0x437f0000)) << 8)) | ConstraintAttribute.a((int)((float)Math.pow((double)p1[i1], 0x3fdd1745d1745d17) * 0x437f0000))));
                Object[] objArray1 = new Object[i2];
                objArray1[0] = uColorDrawab;
                class.getMethod(str, uClassArray).invoke(p0, objArray1);
                break;
              case 3:
                uClassArray = new Class[i2];
                uClassArray[0] = Integer.TYPE;
                objArray = new Object[i2];
                objArray[0] = Integer.valueOf((int)p1[0]);
                class.getMethod(str, uClassArray).invoke(p0, objArray);
                break;
              case 4:
                uClassArray = new Class[i2];
                uClassArray[0] = Float.TYPE;
                objArray = new Object[i2];
                objArray[0] = Float.valueOf(p1[0]);
                class.getMethod(str, uClassArray).invoke(p0, objArray);
                break;
              case 5:
                throw new RuntimeException("unable to interpolate strings "+this.a);
              case 6:
                uClassArray = new Class[i2];
                uClassArray[0] = Boolean.TYPE;
                Method method = class.getMethod(str, uClassArray);
                objArray = new Object[i2];
                if (p1[0] - 0x3f000000 <= 0) {
                   i2 = false;
                }
                objArray[0] = Boolean.valueOf(i2);
                method.invoke(p0, objArray);
                break;
              case 7:
                uClassArray = new Class[i2];
                uClassArray[0] = Float.TYPE;
                objArray = new Object[i2];
                objArray[0] = Float.valueOf(p1[0]);
                class.getMethod(str, uClassArray).invoke(p0, objArray);
                break;
              default:
          }
       }catch(java.lang.NoSuchMethodException e14){
          c.c(p0);
          e14.printStackTrace();
       }catch(java.lang.IllegalAccessException e14){
          c.c(p0);
          e14.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e13){
          e13.printStackTrace();
       }
       return;
    }
    public void j(Object p0){
       switch (ConstraintAttribute$a.a[this.b.ordinal()]){
           case 1:
           case 2:
             this.g = p0.intValue();
             break;
           case 3:
             this.c = p0.intValue();
             break;
           case 4:
             this.d = p0.floatValue();
             break;
           case 5:
             this.e = p0;
             break;
           case 6:
             this.f = p0.booleanValue();
             break;
           case 7:
             this.d = p0.floatValue();
             break;
           default:
       }
       return;
    }
}
