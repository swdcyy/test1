package ok0.n;
import ok0.b;
import ok0.i;
import ok0.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import android.view.View;
import com.kuaishou.ksmvvm.command.KSCommand;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;

public interface abstract n implements b, i, e	// class@00351b
{

    void J0(LiveData p0,Observer p1);
    void W1(View[] p0,KSCommand[] p1);
    void Z5(Observer p0,LiveData[] p1);
    void h3(EditText p0,MutableLiveData p1);
    void o3(View p0,KSCommand[] p1);
}
