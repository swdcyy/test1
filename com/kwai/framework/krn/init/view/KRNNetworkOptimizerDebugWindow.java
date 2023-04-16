package com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.framework.krn.init.view.KRNNetworkOptimizerDebugWindow$a;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.krn.init.preload.a;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.view.KeyEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KRNNetworkOptimizerDebugWindow extends FrameLayout	// class@00161b
{
    public View b;
    public TextView c;
    public TextView d;
    public ImageView e;

    public void KRNNetworkOptimizerDebugWindow(Context p0){
       super(p0);
       View view = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0852, this);
       this.b = view;
       view.setFocusable(true);
       this.b.setFocusableInTouchMode(true);
       this.b.requestFocus();
       this.c = this.b.findViewById(0x7f0a2d99);
       this.d = this.b.findViewById(0x7f0a2d98);
       ImageView imageView = this.b.findViewById(R.id.close_btn);
       this.e = imageView;
       imageView.setOnClickListener(new KRNNetworkOptimizerDebugWindow$a(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KRNNetworkOptimizerDebugWindow.class, "2")) {
          return;
       }
       a.M().R();
       return;
    }
    public void b(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KRNNetworkOptimizerDebugWindow.class, "3")) {
          return;
       }
       this.d.setText(p0);
       this.requestLayout();
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KRNNetworkOptimizerDebugWindow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getKeyCode() != 4) {
          return super.dispatchKeyEvent(p0);
       }
       this.a();
       return true;
    }
}
