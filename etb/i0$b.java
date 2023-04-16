package etb.i0$b;
import com.yxcorp.gifshow.widget.m;
import etb.i0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import ctb.a;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import dtb.c;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$RightButtonInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class i0$b extends m	// class@0027f9
{
    public final i0 c;

    public void i0$b(i0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$b.class, "1")) {
          return;
       }
       i0$b tc = this.c;
       i0 t = tc.t;
       if (t.mUnread != null) {
          t.mUnread = false;
          tc.P8();
       }
       tc = this.c;
       c.h(tc.u, tc.t, "button", tc.v, (tc.s.e + 1));
       NoticeBoxVideoCardItem mRightButton = this.c.t.mRightButtonInfo;
       if (mRightButton != null && !TextUtils.x(mRightButton.mUrl)) {
          tc = this.c;
          tc.S8(tc.t.mRightButtonInfo.mUrl);
       }
       return;
    }
}
