package k2.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;

public abstract class a	// class@002456
{

    public void a(){
       super();
    }
    public Fragment instantiate(Context p0,String p1,Bundle p2){
       return Fragment.instantiate(p0, p1, p2);
    }
    public abstract View onFindViewById(int p0);
    public abstract boolean onHasView();
}
