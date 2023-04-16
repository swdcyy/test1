package androidx.lifecycle.ViewModelProviders;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.lang.IllegalStateException;
import java.lang.String;
import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelStore;
import androidx.activity.ComponentActivity;

public class ViewModelProviders	// class@00080b
{

    public void ViewModelProviders(){
       super();
    }
    public static Activity checkActivity(Fragment p0){
       FragmentActivity activity = p0.getActivity();
       if (activity != null) {
          return activity;
       }
       throw new IllegalStateException("Can\'t create ViewModelProvider for detached fragment");
    }
    public static Application checkApplication(Activity p0){
       Application application = p0.getApplication();
       if (application != null) {
          return application;
       }
       throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can\'t request ViewModel before onCreate call.");
    }
    public static ViewModelProvider of(Fragment p0){
       return ViewModelProviders.of(p0, null);
    }
    public static ViewModelProvider of(Fragment p0,ViewModelProvider$Factory p1){
       ViewModelProvider$AndroidViewModelFactory instance;
       Application uApplication = ViewModelProviders.checkApplication(ViewModelProviders.checkActivity(p0));
       if (p1 == null) {
          instance = ViewModelProvider$AndroidViewModelFactory.getInstance(uApplication);
       }
       return new ViewModelProvider(p0.getViewModelStore(), instance);
    }
    public static ViewModelProvider of(FragmentActivity p0){
       return ViewModelProviders.of(p0, null);
    }
    public static ViewModelProvider of(FragmentActivity p0,ViewModelProvider$Factory p1){
       ViewModelProvider$AndroidViewModelFactory instance;
       Application uApplication = ViewModelProviders.checkApplication(p0);
       if (p1 == null) {
          instance = ViewModelProvider$AndroidViewModelFactory.getInstance(uApplication);
       }
       return new ViewModelProvider(p0.getViewModelStore(), instance);
    }
}
