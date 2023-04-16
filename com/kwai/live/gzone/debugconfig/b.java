package com.kwai.live.gzone.debugconfig.b;
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
import v47.b;
import erd.g;

public final class b implements View$OnClickListener	// class@000cd3
{
    public final d b;
    public final GifshowActivity c;

    public void b(d p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b tb = this.b;
       DebugOptionSelectActivity.x3(this.c, DebugOptionSelectActivity.v3(tb.m, "”Œœ∑÷±≤•º‰Tab≈‰÷√", tb.c.getText().toString()), new b(tb));
    }
}
