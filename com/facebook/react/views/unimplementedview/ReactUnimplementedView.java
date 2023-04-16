package com.facebook.react.views.unimplementedview.ReactUnimplementedView;
import android.widget.LinearLayout;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class ReactUnimplementedView extends LinearLayout	// class@001432
{
    public AppCompatTextView b;

    public void ReactUnimplementedView(Context p0){
       super(p0);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(p0);
       this.b = uAppCompatTe;
       uAppCompatTe.setLayoutParams(new LinearLayout$LayoutParams(-2, -1));
       this.b.setGravity(17);
       this.b.setTextColor(-1);
       this.setBackgroundColor(0x55ff0000);
       this.setGravity(1);
       this.setOrientation(1);
       this.addView(this.b);
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactUnimplementedView.class, "1")) {
          return;
       }
       this.b.setText("\'"+p0+"\' is not Fabric compatible yet.");
       return;
    }
}
