package com.yxcorp.gifshow.v3.editor.text.d1$a;
import xsc.c;
import com.yxcorp.gifshow.v3.editor.text.d1;
import java.lang.Object;
import xsc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.util.ArrayList;

public class d1$a implements c	// class@0013b7
{
    public final d1 a;

    public void d1$a(d1 p0){
       this.a = p0;
       super();
    }
    public void a(){
       b.d(this);
    }
    public void b(int p0,int p1){
       b.e(this, p0, p1);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d1$a.class, "1")) {
          return;
       }
       this.a.i().j = true;
       return;
    }
    public void d(int p0,int p1,ArrayList p2){
       b.a(this, p0, p1, p2);
    }
    public void e(int p0,int p1,String p2){
       b.c(this, p0, p1, p2);
    }
    public void onAttach(){
       b.b(this);
    }
}
