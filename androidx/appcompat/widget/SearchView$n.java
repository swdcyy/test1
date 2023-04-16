package androidx.appcompat.widget.SearchView$n;
import java.lang.Object;
import android.widget.AutoCompleteTextView;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.UnsupportedClassVersionError;

public class SearchView$n	// class@000626
{
    public Method a;
    public Method b;
    public Method c;

    public void SearchView$n(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       SearchView$n.d();
       int i = 0;
       try{
          int i1 = 1;
          Class[] uClassArray = new Class[i];
          Method declaredMeth = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", uClassArray);
          this.a = declaredMeth;
          declaredMeth.setAccessible(i1);
          try{
             uClassArray = new Class[e0];
             declaredMeth = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", uClassArray);
             this.b = declaredMeth;
             declaredMeth.setAccessible(i1);
             try{
                uClassArray = new Class[i1];
                uClassArray[e0] = Boolean.TYPE;
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", uClassArray);
                this.c = method;
                method.setAccessible(i1);
                return;
             }catch(java.lang.NoSuchMethodException e0){
             }
          }catch(java.lang.NoSuchMethodException e0){
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public static void d(){
       if (Build$VERSION.SDK_INT < 29) {
          return;
       }
       throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    public void a(AutoCompleteTextView p0){
       try{
          SearchView$n.d();
          SearchView$n tb = this.b;
          if (tb != null) {
             int i = 0;
             Object[] objArray = new Object[i];
             tb.invoke(p0, objArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void b(AutoCompleteTextView p0){
       try{
          SearchView$n.d();
          SearchView$n ta = this.a;
          if (ta != null) {
             int i = 0;
             Object[] objArray = new Object[i];
             ta.invoke(p0, objArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void c(AutoCompleteTextView p0){
       try{
          SearchView$n.d();
          SearchView$n tc = this.c;
          if (tc != null) {
             int i = 1;
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.TRUE;
             tc.invoke(p0, objArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
