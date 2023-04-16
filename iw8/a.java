package iw8.a;
import n3d.a;
import com.yxcorp.gifshow.activity.policy.PostPolicyAlbumActivity;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import android.app.Activity;
import gq.a;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j46.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;

public final class a implements a	// class@00272e
{
    public final PostPolicyAlbumActivity b;

    public void a(PostPolicyAlbumActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a a;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 4196 && (p1 != -1 && !tb.isFinishing())) {
          p1 = 0;
          Object[] objArray = new Object[p1];
          String str = "PostPolicyAlbumActivity";
          a.D().w(str, "on album callback", objArray);
          if (!PatchProxy.applyVoid(null, tb, PostPolicyAlbumActivity.class, "5")) {
             if (tb.O == null) {
                Object[] objArray1 = new Object[p1];
                a.D().w(str, "source intent is null", objArray1);
             }else {
                objArray = new Object[p1];
                a.D().w(str, "startSourceActivity", objArray);
                a = a.a;
                PostPolicyAlbumActivity o = tb.O;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidOneRefs(o, a, a.class, "3") && o != null) {
                   String str1 = "isPotentialAuthorStatus";
                   if (o.hasExtra(str1)) {
                      o.removeExtra(str1);
                   }
                   o.putExtra("isPotentialAuthorStatusEntered", true);
                }
                tb.O.putExtra("start_enter_page_animation", p1);
                tb.O.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100e6);
                tb.O.putExtra("autoStartAssistant", true);
                tb.O.putExtra("camera_constant_default_select_tab", 12);
                tb.O.putExtra("keyUsePageAnimationFromIntent", true);
                tb.startActivity(tb.O);
             }
          }
          tb.finish();
       }
    label_009f :
       return;
    }
}
