package aq4.c;
import android.view.View$OnTouchListener;
import aq4.j;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import im8.f;
import java.lang.Boolean;
import java.lang.String;
import rp4.a;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class c implements View$OnTouchListener	// class@0002c1
{
    public final j b;

    public void c(j p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       c tb = this.b;
       boolean b = false;
       if (tb.D.get().booleanValue() && !("text").equals(tb.G.get())) {
          if (p1.getAction() == 1) {
             Object[] objArray = new Object[b];
             a.D().s("StoryEditPanelPresenter", "onTouch up on editor container, pop back stack", objArray);
             if (("sticker").equals(tb.G.get())) {
                GifshowActivity activity = tb.getActivity();
                if (activity != null) {
                   activity.onBackPressed();
                }
             }else {
                tb.onBackPressed();
             }
          }
          b = true;
       }
       return b;
    }
}
