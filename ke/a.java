package ke.a;
import android.app.DatePickerDialog;
import android.content.Context;
import android.app.DatePickerDialog$OnDateSetListener;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.widget.DatePicker;
import java.lang.reflect.Method;
import android.widget.DatePicker$OnDateChangedListener;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.app.Dialog;

public class a extends DatePickerDialog	// class@0024ad
{

    public void a(Context p0,int p1,DatePickerDialog$OnDateSetListener p2,int p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5);
       this.b(p0, p3, p4, p5);
    }
    public void a(Context p0,DatePickerDialog$OnDateSetListener p1,int p2,int p3,int p4){
       super(p0, p1, p2, p3, p4);
       this.b(p0, p2, p3, p4);
    }
    public static Field a(Class p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       try{
          Field declaredFiel = p0.getDeclaredField(p2);
          declaredFiel.setAccessible(b);
          return declaredFiel;
       }catch(java.lang.NoSuchFieldException e0){
          Field[] declaredFiel1 = p0.getDeclaredFields();
          int len = declaredFiel1.length;
          int i = 0;
       label_0022 :
          if (i >= len) {
             return null;
          }
          object oobject = declaredFiel1[i];
          if (oobject.getType() == p1) {
             oobject.setAccessible(e0);
             return oobject;
          }else {
             i = i + 1;
             goto label_0022 ;
          }
       }
    }
    public final void b(Context p0,int p1,int p2,int p3){
       Class tYPE;
       Context uContext = p0;
       String str = "android.widget.DatePickerSpinnerDelegate";
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT == 24) {
          try{
             Class uClass = Class.forName("com.android.internal.R$styleable");
             Object obj = null;
             TypedArray typedArray = uContext.obtainStyledAttributes(obj, uClass.getField("DatePicker").get(obj), 0x101035c, 0);
             typedArray.recycle();
             if (typedArray.getInt(uClass.getField("DatePicker_datePickerMode").getInt(obj), 2) == 2) {
                DatePicker uDatePicker = a.a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field uField = a.a(DatePicker.class, Class.forName(str), "mDelegate");
                if (uField.get(uDatePicker).getClass() != Class.forName(str)) {
                   uField.set(uDatePicker, obj);
                   uDatePicker.removeAllViews();
                   Class[] uClassArray = new Class[]{Context.class,AttributeSet.class,tYPE,tYPE};
                   tYPE = Integer.TYPE;
                   Method declaredMeth = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", uClassArray);
                   declaredMeth.setAccessible(1);
                   Object[] objArray = new Object[]{uContext,obj,Integer.valueOf(0x101035c),Integer.valueOf(0)};
                   uField.set(uDatePicker, declaredMeth.invoke(uDatePicker, objArray));
                   uDatePicker.setCalendarViewShown(0);
                   uDatePicker.init(p1, p2, p3, this);
                }
             }
          }catch(java.lang.Exception e0){
             throw new RuntimeException(e0);
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.onStop();
       return;
    }
}
