package androidx.fragment.app.Fragment$c;
import k2.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class Fragment$c extends a	// class@00077c
{
    public final Fragment a;

    public void Fragment$c(Fragment p0){
       this.a = p0;
       super();
    }
    public View onFindViewById(int p0){
       Fragment mView = this.a.mView;
       if (mView != null) {
          return mView.findViewById(p0);
       }
       throw new IllegalStateException("Fragment "+this+" does not have a view");
    }
    public boolean onHasView(){
       boolean b = (this.a.mView != null)? true: false;
       return b;
    }
}
