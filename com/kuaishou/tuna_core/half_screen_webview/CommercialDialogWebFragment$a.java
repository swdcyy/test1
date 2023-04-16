package com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$LayoutStyle;
import androidx.fragment.app.c;

public class CommercialDialogWebFragment$a	// class@0010c2
{
    public CommercialDialogWebFragment$LayoutStyle a;
    public String b;
    public String c;
    public boolean d;
    public c e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public float m;
    public HashMap n;
    public boolean o;

    public void CommercialDialogWebFragment$a(String p0){
       super();
       this.a = CommercialDialogWebFragment$LayoutStyle.STYLE_DEFAULT;
       this.g = -1;
       this.m = 0.30f;
       this.o = true;
       this.b = p0;
       this.c = "";
    }
    public CommercialDialogWebFragment$a a(boolean p0){
       this.i = p0;
       return this;
    }
    public CommercialDialogWebFragment$a b(int p0){
       this.h = true;
       this.g = p0;
       return this;
    }
    public CommercialDialogWebFragment$a c(CommercialDialogWebFragment$LayoutStyle p0){
       this.a = (p0 == null)? CommercialDialogWebFragment$LayoutStyle.STYLE_DEFAULT: p0;
       return this;
    }
    public CommercialDialogWebFragment$a d(c p0,String p1){
       this.d = true;
       this.e = p0;
       this.f = p1;
       return this;
    }
    public CommercialDialogWebFragment$a e(String p0){
       this.l = p0;
       return this;
    }
    public CommercialDialogWebFragment$a f(boolean p0){
       this.j = p0;
       return this;
    }
}
