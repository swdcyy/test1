package com.kwai.live.gzone.debugconfig.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.debugconfig.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.SettingSelectData;
import com.kwai.framework.testconfig.ui.DebugOptionSelectActivity;
import v47.a;
import erd.g;

public final class a implements View$OnClickListener	// class@000cd2
{
    public final d b;
    public final GifshowActivity c;

    public void a(d p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       DebugOptionSelectActivity.x3(this.c, DebugOptionSelectActivity.v3(tb.l, "游戏直播间样式配置", tb.b.getText().toString()), new a(tb));
    }
}
