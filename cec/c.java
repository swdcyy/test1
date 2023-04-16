package cec.c;
import java.lang.Runnable;
import cec.d;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.os.Bundle;
import java.lang.String;

public final class c implements Runnable	// class@000586
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void run(){
       d p = this.b.p;
       if (p == null) {
       }else {
          Fragment parentFragme = p.getParentFragment();
          if (parentFragme instanceof TabHostFragment) {
             parentFragme.Ih("recommend", new Bundle());
          }
       }
       return;
    }
}
