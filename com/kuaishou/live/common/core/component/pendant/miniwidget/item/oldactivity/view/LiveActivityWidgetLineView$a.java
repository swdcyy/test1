package com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetLineView$a;
import android.os.CountDownTimer;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetLineView;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Long;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;

public class LiveActivityWidgetLineView$a extends CountDownTimer	// class@0016fa
{
    public final TextView a;
    public final LiveActivityWidgetLineView b;

    public void LiveActivityWidgetLineView$a(LiveActivityWidgetLineView p0,long p1,long p2,TextView p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, LiveActivityWidgetLineView$a.class, "2")) {
          return;
       }
       this.a.setText("更新中");
       return;
    }
    public void onTick(long p0){
       String str;
       Object obj = this;
       if (PatchProxy.isSupport(LiveActivityWidgetLineView$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), obj, LiveActivityWidgetLineView$a.class, "1")) {
          return;
       }
       LiveActivityWidgetLineView$a a = obj.a;
       LiveActivityWidgetLineView$a b = obj.b;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(LiveActivityWidgetLineView.class)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(p0), b, LiveActivityWidgetLineView.class, "7");
          if (str != PatchProxyResult.class) {
          }else {
          label_003b :
             long l = p0 / 0x5265c00;
             long l1 = 24 * l;
             long l2 = (p0 / 0x36ee80) - l1;
             long l3 = l2 * 60;
             l1 = l1 * 60;
             long l4 = ((p0 / 0xea60) - l3) - l1;
             long l5 = (((p0 / 1000) - (l4 * 60)) - (l3 * 60)) - (l1 * 60);
             if (l - null > 0) {
                Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(l2),Long.valueOf(l4)};
                str = String.format(Locale.US, "%s天%s时%s分", objArray);
             }else {
                Object[] objArray1 = new Object[]{Long.valueOf(l2),Long.valueOf(l4),Long.valueOf(l5)};
                str = String.format(Locale.US, "%s时%s分%s秒", objArray1);
             }
          }
       }else {
          goto label_003b ;
       }
       a.setText(str);
       return;
    }
}
