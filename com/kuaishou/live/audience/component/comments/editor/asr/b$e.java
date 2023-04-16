package com.kuaishou.live.audience.component.comments.editor.asr.b$e;
import android.text.TextWatcher;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class b$e implements TextWatcher	// class@000aa5
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b$e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b$e.class, "1")) {
          return;
       }
       this.b.X8();
       return;
    }
}
