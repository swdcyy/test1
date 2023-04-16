package androidx.lifecycle.ViewModelProvider$KeyedFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class ViewModelProvider$KeyedFactory implements ViewModelProvider$Factory	// class@000806
{

    public void ViewModelProvider$KeyedFactory(){
       super();
    }
    public ViewModel create(Class p0){
       throw new UnsupportedOperationException("create\(String, Class<?>\) must be called on implementaions of KeyedFactory");
    }
    public abstract ViewModel create(String p0,Class p1);
}
