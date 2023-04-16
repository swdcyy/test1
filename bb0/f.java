package bb0.f;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import com.kuaishou.gifshow.smartalbum.model.SmartAlbumUiItem;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingActivity;
import java.lang.Long;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;

public final class f implements g	// class@00025c
{
    public final SmartAlbumHorizontalListFragment b;
    public final SmartAlbumUiItem c;

    public void f(SmartAlbumHorizontalListFragment p0,SmartAlbumUiItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          SmartAlbumLoadingActivity.G3(tb.getActivity(), 103, tb.D, tc);
          tb.p.onNext(Long.valueOf(tc.getId()));
          tb.B = true;
       }else {
          d.a(0x6758ee6d).Gh();
       }
       return;
    }
}
