package androidx.lifecycle.ViewModelProvider$NewInstanceFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public class ViewModelProvider$NewInstanceFactory implements ViewModelProvider$Factory	// class@000807
{

    public void ViewModelProvider$NewInstanceFactory(){
       super();
    }
    public ViewModel create(Class p0){
       String str = "Cannot create an instance of ";
       try{
          return p0.newInstance();
       }catch(java.lang.InstantiationException e1){
          throw new RuntimeException(str+p0, e1);
       }catch(java.lang.IllegalAccessException e1){
          throw new RuntimeException(str+p0, e1);
       }
    }
}
