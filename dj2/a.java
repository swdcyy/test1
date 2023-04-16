package dj2.a;
import u07.u;
import t02.a0;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.String;
import hm2.a$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class a implements u	// class@002534
{
    public final a0 b;

    public void a(a0 p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       a tb = this.b;
       String str = tb.i2.Xa();
       if (!TextUtils.isEmpty(str)) {
          str = str+"&scrollDown=true";
       }
       tb.i2.Y7(tb, str, tb.Z2.b().getChildFragmentManager(), "MicDisableInSpecialRoleDialog");
       return;
    }
}
