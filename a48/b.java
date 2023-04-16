package a48.b;
import android.view.View$OnClickListener;
import com.mini.about.ui.AboutFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.about.ui.AboutMainInfoFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;

public final class b implements View$OnClickListener	// class@000026
{
    public final AboutFragment b;

    public void b(AboutFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, AboutFragment.class, "3")) {
       }else {
          AboutMainInfoFragment uAboutMainIn = new AboutMainInfoFragment();
          uAboutMainIn.setArguments(tb.getArguments());
          e uoe = tb.requireFragmentManager().beginTransaction();
          tb = PatchProxy.applyOneRefs(uoe, tb, AboutFragment.class, "4");
          if (tb != PatchProxyResult.class) {
             uoe = tb;
          }else {
             uoe.z(R.anim.arg_RES_7f0100c0, 0x7f0100c5, R.anim.arg_RES_7f0100c0, 0x7f0100c5);
          }
          String b = AboutMainInfoFragment.b;
          uoe.g(R.id.root, uAboutMainIn, b);
          uoe.j(b);
          uoe.m();
       }
       return;
    }
}
