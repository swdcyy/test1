package com.yxcorp.gifshow.v3.editor.sticker.tag.a$a;
import qvc.b;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ttc.e;

public class a$a implements b	// class@0012b3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a a = this.a.A;
       if (a != null) {
          a.c(p1);
       }
       return;
    }
}
