package com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import juc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qvc.b;
import android.graphics.Canvas;
import android.widget.EditText;
import android.graphics.Typeface;

public abstract class TextDrawerLayout extends RelativeLayout	// class@00150d
{
    public final b b;
    public HashMap c;

    public void TextDrawerLayout(Context p0,b p1){
       a.p(p0, "context");
       a.p(p1, "textDrawer");
       super(p0);
       this.b = p1;
    }
    public abstract void a(b p0);
    public abstract void b(Canvas p0);
    public abstract void c();
    public abstract boolean d();
    public abstract void e(String p0);
    public abstract void f(b p0);
    public abstract void g();
    public abstract EditText getFocusEditText();
    public final b getTextDrawer(){
       return this.b;
    }
    public abstract void h();
    public abstract void i(Typeface p0);
    public abstract void setAcceptEvent(boolean p0);
    public abstract void setText(String p0);
}
