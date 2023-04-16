package j79.f;
import erd.g;
import com.yxcorp.gifshow.album.preview.MediaPreviewActivity;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import com.yxcorp.utility.Log;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public final class f implements g	// class@002774
{
    public final MediaPreviewActivity b;

    public void f(MediaPreviewActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.f = null;
       if (tb.e == null) {
       }else {
          Log.g("MediaPreviewActivity", "finish: remove mMediaPreviewFragment");
          tb.getSupportFragmentManager().beginTransaction().u(tb.e).m();
          tb.e = null;
       }
       return;
    }
}
