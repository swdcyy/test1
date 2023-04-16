package com.yxcorp.gifshow.v3.EditorActivity$a;
import u26.a;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.RadioButton;

public class EditorActivity$a implements a	// class@000d11
{
    public final View a;
    public final EditorActivity b;

    public void EditorActivity$a(EditorActivity p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,int p1){
       EditorActivity$a uoa = EditorActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.W3(this.a.findViewById(p1));
       return;
    }
    public boolean b(){
       return true;
    }
}
