package com.yxcorp.gifshow.detail.common.information.cocreate.panel.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import android.text.TextPaint;
import cy9.f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.information.cocreate.panel.CoCreatorsFragment;

public class b extends PresenterV2	// class@00140e
{
    public CoCreateInfo p;
    public CoCreatorsFragment q;
    public TextView r;
    public View s;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       CoCreateInfo mWindowLabel = this.p.mWindowLabelText;
       if (mWindowLabel != null) {
          this.r.setText(mWindowLabel);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.co_creator_panel_title);
       this.r = textView;
       textView.getPaint().setFakeBoldText(true);
       p0 = m1.f(p0, R.id.co_creator_panel_close);
       this.s = p0;
       p0.setOnClickListener(new f(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.p = this.q8(CoCreateInfo.class);
       return;
    }
}
