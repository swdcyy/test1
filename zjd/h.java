package zjd.h;
import android.app.Activity;
import android.view.LayoutInflater;
import zjd.h$a;
import android.view.View;
import bkd.b;

public interface abstract h	// class@002b48
{

    View c(Activity p0,LayoutInflater p1,h$a p2);
    void d(b p0,int p1);
    void onDestroyView();
    void onFragmentPause();
    void onFragmentResume();
}
