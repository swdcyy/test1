package com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;
import c2b.a;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d2b.a;
import java.lang.Integer;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout$a;
import d2b.c;
import android.view.View;

public class ClipLayout extends LinearLayout implements a	// class@001abd
{
    public ClipLayout$a b;
    public c c;

    public void ClipLayout(Context p0){
       super(p0, null, 0);
    }
    public void ClipLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ClipLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, ClipLayout.class, "1")) {
       }else if(PatchProxy.applyVoid(null, this, ClipLayout.class, "3")){
          this.c = new a(this);
       }
       return;
    }
    public void a(int p0){
       if (PatchProxy.isSupport(ClipLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ClipLayout.class, "5")) {
          return;
       }
       ClipLayout tb = this.b;
       if (tb != null) {
          tb.a(this, p0);
       }
       return;
    }
    public c getBehaviorControl(){
       return this.c;
    }
    public View getBehaviorView(){
       return this;
    }
    public c getClipControl(){
       return this.c;
    }
    public void setOnOffsetChangedListener(ClipLayout$a p0){
       this.b = p0;
    }
}
