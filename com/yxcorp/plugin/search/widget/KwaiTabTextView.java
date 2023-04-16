package com.yxcorp.plugin.search.widget.KwaiTabTextView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.CharSequence;

public class KwaiTabTextView extends FrameLayout	// class@0007ca
{
    public TextView b;

    public void KwaiTabTextView(Context p0){
       super(p0);
    }
    public void KwaiTabTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void KwaiTabTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, KwaiTabTextView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a3caa);
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(KwaiTabTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiTabTextView.class, "2")) {
          return;
       }
       super.setSelected(p0);
       this.b.setSelected(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTabTextView.class, "1")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
}
