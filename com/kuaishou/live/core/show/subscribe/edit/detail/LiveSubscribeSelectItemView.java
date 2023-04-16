package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeSelectItemView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.subscribe.edit.detail.n;
import com.kuaishou.live.core.show.subscribe.edit.detail.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.ImageView;
import tk2.g0;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import z1.a;

public class LiveSubscribeSelectItemView extends SelectShapeRelativeLayout	// class@001104
{
    public TextView c;
    public TextView d;
    public a e;
    public LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo f;
    public CompoundButton$OnCheckedChangeListener g;
    public CheckBox h;
    public TextView i;
    public static final int j;

    public void LiveSubscribeSelectItemView(Context p0){
       super(p0, null);
    }
    public void LiveSubscribeSelectItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribeSelectItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = n.a;
       this.g = m.b;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeSelectItemView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribeSelectItemView.class, "2")) {
          this.c = m1.f(this, 0x7f0a2636);
          this.d = m1.f(this, 0x7f0a262e);
          this.i = m1.f(this, 0x7f0a2635);
          if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribeSelectItemView.class, "3")) {
             CheckBox uCheckBox = m1.f(this, R.id.live_subscribe_item_checkbox);
             this.h = uCheckBox;
             uCheckBox.setOnCheckedChangeListener(this.g);
          }
          if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribeSelectItemView.class, "4")) {
             m1.f(this, R.id.live_subscribe_item_close).setOnClickListener(new g0(this));
          }
       }
       return;
    }
    public void setCheckedWithoutNotify(boolean p0){
       if (PatchProxy.isSupport(LiveSubscribeSelectItemView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveSubscribeSelectItemView.class, "7")) {
          return;
       }
       this.h.setOnCheckedChangeListener(null);
       this.h.setChecked(p0);
       this.h.setOnCheckedChangeListener(this.g);
       return;
    }
    public void setDeleteSubscribeListener(a p0){
       this.e = p0;
    }
    public void setOnCheckedChangedListener(CompoundButton$OnCheckedChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeSelectItemView.class, "5")) {
          return;
       }
       this.g = p0;
       this.h.setOnCheckedChangeListener(p0);
       return;
    }
}
