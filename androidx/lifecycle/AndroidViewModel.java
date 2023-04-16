package androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import android.app.Application;

public class AndroidViewModel extends ViewModel	// class@0007b6
{
    public Application mApplication;

    public void AndroidViewModel(Application p0){
       super();
       this.mApplication = p0;
    }
    public Application getApplication(){
       return this.mApplication;
    }
}
