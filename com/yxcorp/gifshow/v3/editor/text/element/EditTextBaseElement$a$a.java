package com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class EditTextBaseElement$a$a implements Runnable	// class@0013f4
{
    public final EditTextBaseElement$a b;
    public final boolean c;

    public void EditTextBaseElement$a$a(EditTextBaseElement$a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EditTextBaseElement$a$a.class, "1")) {
          return;
       }
       this.b.b(this.c);
       return;
    }
}
