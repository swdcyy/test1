package ofd.c;
import lkd.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import nfd.j2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ufd.f;
import android.view.View;

public final class c implements b	// class@001f17
{
    public final Fragment a;

    public void c(Fragment p0){
       this.a = p0;
    }
    public final Object get(){
       BaseFragment uBaseFragmen = j2.b(this.a);
       View[] viewArray = (uBaseFragmen instanceof f)? uBaseFragmen.tg(): null;
       return viewArray;
    }
}
