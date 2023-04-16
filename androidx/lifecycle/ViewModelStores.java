package androidx.lifecycle.ViewModelStores;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.ComponentActivity;

public class ViewModelStores	// class@00080e
{

    public void ViewModelStores(){
       super();
    }
    public static ViewModelStore of(Fragment p0){
       return p0.getViewModelStore();
    }
    public static ViewModelStore of(FragmentActivity p0){
       return p0.getViewModelStore();
    }
}
