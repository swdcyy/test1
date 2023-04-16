package ix9.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.f;
import java.lang.Object;
import android.view.View;
import com.kwai.component.tabs.panel.h$b;
import tkd.b;
import tkd.d;
import um5.b;
import com.kuaishou.android.model.mix.DynamicTabInfo;
import java.lang.String;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import js6.a;

public final class g implements View$OnClickListener	// class@0028b5
{
    public final f b;

    public void g(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       if (!tb.V8()) {
          tb.a9();
          f y = tb.y;
          d.a(-2119626676).nv(y.mLogTabName, y.mTitleSubCount, tb.w);
       }else {
          a.b.GO("clickCommentWonderfulTabEvent", "");
       }
       return;
    }
}
