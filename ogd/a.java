package ogd.a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.fragment.AlbumSettingFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class a implements View$OnClickListener	// class@001f19
{
    public final AlbumSettingFragment b;

    public void a(AlbumSettingFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, AlbumSettingFragment.class, "5")) {
       }else if(tb.getActivity() == null){
          tb.getActivity().finish();
       }
       return;
    }
}
