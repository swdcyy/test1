package etb.g;
import android.view.View$OnClickListener;
import etb.n;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dtb.c;
import k2b.h;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.setting.NoticeBoxSettingActivity;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class g implements View$OnClickListener	// class@0027f5
{
    public final n b;

    public void g(n p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, n.class, "6")) {
       }else if(tb.getActivity() == null){
          n s = tb.s;
          if (!PatchProxy.applyVoidOneRefs(s, objArray, c.class, "5")) {
             h.m("3155612", "NOTIFICATION_SETTING_BUTTON").i(s);
          }
          Activity activity = tb.getActivity();
          n a = tb.A;
          NoticeBoxSettingActivity noticeBoxSet = NoticeBoxSettingActivity.class;
          if (!PatchProxy.applyVoidTwoRefs(activity, a, objArray, noticeBoxSet, "3")) {
             Intent intent = new Intent(activity, noticeBoxSet);
             SerializableHook.putExtra(intent, "NOTICE_BOX_PLATE_SETTINGS", a);
             activity.startActivity(intent);
          }
       }
       return;
    }
}
