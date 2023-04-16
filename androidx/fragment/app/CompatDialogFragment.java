package androidx.fragment.app.CompatDialogFragment;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import java.lang.Class;
import androidx.fragment.app.DialogFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.reflect.Field;
import g79.a;
import w69.l;
import java.lang.Throwable;

public abstract class CompatDialogFragment extends RxDialogFragment	// class@000773
{
    public Class c;
    public Field d;
    public Field e;
    public static final boolean f;

    static {
    }
    public void CompatDialogFragment(){
       super();
       this.c = null;
       this.d = null;
       this.e = null;
    }
    public final Class Vg(){
       if (this.c == null) {
          String name = DialogFragment.class.getName();
          Class class = this.getClass();
          do {
             class = class.getSuperclass();
          } while (class == null || TextUtils.equals(class.getName(), name));
          if (class != null && TextUtils.equals(class.getName(), name)) {
             this.c = class;
          }
       }
       return this.c;
    }
    public final Field Wg(){
       if (this.d == null) {
          Class uClass = this.Vg();
          if (uClass == null) {
             return this.d;
          }
          try{
             Field declaredFiel = uClass.getDeclaredField("mDismissed");
             this.d = declaredFiel;
             declaredFiel.setAccessible(true);
             return this.d;
          }catch(java.lang.NoSuchFieldException e0){
          }catch(java.lang.SecurityException e0){
          }catch(java.lang.Exception e0){
          }
       label_002d :
          return this.d;
       }else {
          goto label_002d ;
       }
    }
    public final Field Xg(){
       if (this.e == null) {
          Class uClass = this.Vg();
          if (uClass == null) {
             return this.e;
          }
          try{
             Field declaredFiel = uClass.getDeclaredField("mShownByMe");
             this.e = declaredFiel;
             declaredFiel.setAccessible(true);
             return this.e;
          }catch(java.lang.NoSuchFieldException e0){
          }catch(java.lang.SecurityException e0){
          }catch(java.lang.Exception e0){
          }
       label_002d :
          return this.e;
       }else {
          goto label_002d ;
       }
    }
    public boolean Yg(){
       try{
          return this.mShownByMe;
       }catch(java.lang.IllegalAccessError e0){
          return this.Zg();
       }catch(java.lang.Error e0){
          a.c.c().onException(e0);
          return false;
       }
    }
    public final boolean Zg(){
       Field uField = this.Xg();
       if (uField == null) {
          return false;
       }
       try{
          return uField.getBoolean(this);
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.IllegalArgumentException e0){
       }catch(java.lang.Exception e0){
       }
       a.c.c().onException(e0);
       return v1;
    }
    public void ah(boolean p0){
       try{
          this.mDismissed = p0;
       }catch(java.lang.IllegalAccessError e0){
          this.bh(p0);
       }catch(java.lang.Error e2){
          a.c.c().onException(e2);
       }
       return;
    }
    public final void bh(boolean p0){
       Field uField = this.Wg();
       try{
          int i = 0;
          uField.setBoolean(this, p0);
       }catch(java.lang.IllegalAccessException e1){
       }catch(java.lang.IllegalArgumentException e1){
       }catch(java.lang.Exception e1){
       }
       a.c.c().onException(e1);
       return;
    }
    public final void ch(boolean p0){
       Field uField = this.Xg();
       try{
          int i = 0;
          uField.setBoolean(this, p0);
       }catch(java.lang.IllegalAccessException e1){
       }catch(java.lang.IllegalArgumentException e1){
       }catch(java.lang.Exception e1){
       }
       a.c.c().onException(e1);
       return;
    }
    public void dh(boolean p0){
       try{
          this.mShownByMe = p0;
       }catch(java.lang.IllegalAccessError e0){
          this.ch(p0);
       }catch(java.lang.Error e2){
          a.c.c().onException(e2);
       }
       return;
    }
}
