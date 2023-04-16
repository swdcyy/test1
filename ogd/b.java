package ogd.b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.fragment.CommentSettingFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class b implements View$OnClickListener	// class@001f1a
{
    public final CommentSettingFragment b;

    public void b(CommentSettingFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, CommentSettingFragment.class, "5")) {
       }else if(tb.getActivity() == null){
          tb.getActivity().finish();
       }
       return;
    }
}
