package a1d.e;
import android.view.View$OnClickListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.userlogin.selectcountry.SelectCountryActivity;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a1d.h;
import n3d.a;

public final class e implements View$OnClickListener	// class@000021
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "3")) {
       }else {
          Intent intent = new Intent(tb.getContext(), SelectCountryActivity.class);
          intent.putExtra("start_enter_page_animation", R.anim.arg_RES_7f010105);
          intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f01010d);
          tb.getActivity().t1(intent, 256, new h(tb));
       }
       return;
    }
}
