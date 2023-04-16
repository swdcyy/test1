package bh8.m;
import java.lang.Object;
import bh8.p;
import android.text.Spanned;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Character;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import java.lang.Integer;
import android.os.Bundle;
import com.mini.plcmanager.PlcModel;
import android.widget.EditText;
import n88.b;
import w78.d;
import com.mini.channel.b;
import java.lang.Boolean;
import java.lang.ref.WeakReference;
import android.app.Activity;
import zi8.c;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import bh8.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class m	// class@00036c
{
    public boolean a;
    public p b;
    public PlcModel c;
    public WeakReference d;
    public EditText e;
    public TextView f;
    public View g;
    public SlipSwitchButton h;
    public SimpleDraweeView i;
    public b j;

    public void m(){
       super();
       this.a = false;
       this.b = new p();
    }
    public final int a(Spanned p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          return i;
       }
       int i1 = 0;
       while (i < p0.length()) {
          int i2 = Character.codePointAt(p0, i);
          i1 = (i2 >= 0 && i2 <= 255)? i1 + 1: i1 + 2;
          i = i + 1;
       }
       return i1;
    }
    public void b(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "6")) {
          return;
       }
       int i = this.a(p0);
       int i1 = i / 2;
       i1 = i1 + (i % 2);
       if (i1 > 0 && (i1 <= 20 && (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty((p0.toString()).trim())))) {
          this.g.setEnabled(true);
       }else {
          this.g.setEnabled(false);
       }
       this.f.setText(p0);
       return;
    }
    public final void c(int p0,String p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "12")) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("key_channel_param", this.c.k);
       String str = (this.e.getText() == null)? "": this.e.getText().toString();
       uBundle.putString("key_channel_live_title", str);
       uBundle.putString("key_channel_live_url", p1);
       b.w0().j().W3(p0).d("key_channel_live_edit_event", uBundle);
       return;
    }
    public final void d(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, m.class, "13")) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("key_channel_param", p3);
       uBundle.putInt("key_channel_live_page_id", p1);
       uBundle.putInt("key_channel_live_result_code", p2);
       b.w0().j().W3(p0).d("key_channel_live_fail", uBundle);
       m td = this.d;
       if (td != null) {
          Activity uActivity = td.get();
          if (c.b(uActivity)) {
             uActivity.finish();
          }
       }
       return;
    }
    public final void e(int p0,boolean p1,int p2,String p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), p3, this, m.class, "11")) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putInt("key_channel_param", this.c.k);
       uBundle.putBoolean("key_channel_result", p1);
       String str = (this.e.getText() == null)? "": this.e.getText().toString();
       uBundle.putString("key_channel_live_title", str);
       uBundle.putString("key_channel_live_url", p3);
       uBundle.putInt("key_channel_live_result_code", p2);
       b.w0().j().W3(p0).d("key_channel_live_result", uBundle);
       return;
    }
    public final void f(int p0,int p1,View p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, m.class, "14")) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.setInterpolator(new LinearInterpolator());
       valueAnimato.setDuration(50);
       valueAnimato.addUpdateListener(new a(p2, p0, p1));
       valueAnimato.start();
       return;
    }
}
