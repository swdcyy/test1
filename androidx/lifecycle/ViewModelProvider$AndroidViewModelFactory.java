package androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider$NewInstanceFactory;
import android.app.Application;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public class ViewModelProvider$AndroidViewModelFactory extends ViewModelProvider$NewInstanceFactory	// class@000804
{
    public Application mApplication;
    public static ViewModelProvider$AndroidViewModelFactory sInstance;

    public void ViewModelProvider$AndroidViewModelFactory(Application p0){
       super();
       this.mApplication = p0;
    }
    public static ViewModelProvider$AndroidViewModelFactory getInstance(Application p0){
       if (ViewModelProvider$AndroidViewModelFactory.sInstance == null) {
          ViewModelProvider$AndroidViewModelFactory.sInstance = new ViewModelProvider$AndroidViewModelFactory(p0);
       }
       return ViewModelProvider$AndroidViewModelFactory.sInstance;
    }
    public ViewModel create(Class p0){
       if (!AndroidViewModel.class.isAssignableFrom(p0)) {
          return super.create(p0);
       }
       int i = 1;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[0] = Application.class;
          Object[] objArray = new Object[i];
          objArray[0] = this.mApplication;
          return p0.getConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.NoSuchMethodException e1){
          throw new RuntimeException(v0+p0, e1);
       }catch(java.lang.IllegalAccessException e1){
          throw new RuntimeException(v0+p0, e1);
       }catch(java.lang.InstantiationException e1){
          throw new RuntimeException(v0+p0, e1);
       }catch(java.lang.reflect.InvocationTargetException e1){
          throw new RuntimeException(v0+p0, e1);
       }
    }
}
