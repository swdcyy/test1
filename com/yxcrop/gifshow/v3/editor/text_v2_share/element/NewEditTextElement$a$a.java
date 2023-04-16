package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$a$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class NewEditTextElement$a$a implements Runnable	// class@000b8b
{
    public final NewEditTextElement$a b;
    public final boolean c;
    public final String d;
    public final String e;

    public void NewEditTextElement$a$a(NewEditTextElement$a p0,boolean p1,String p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewEditTextElement$a$a.class, "1")) {
          return;
       }
       this.b.b(this.c, this.d, this.e);
       return;
    }
}
