package bu7.c0;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import du7.b;
import java.lang.ClassCastException;

public final class c0 implements Runnable	// class@00047f
{
    public final String b;

    public void c0(String p0){
       this.b = p0;
    }
    public final void run(){
       c0 tb = this.b;
       FragmentActivity uFragmentAct = ActivityContext.g().e();
       try{
          b.d(uFragmentAct, tb);
       }catch(java.lang.ClassCastException e0){
          e0.printStackTrace();
       }
       return;
    }
}
