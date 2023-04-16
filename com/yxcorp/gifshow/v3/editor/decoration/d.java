package com.yxcorp.gifshow.v3.editor.decoration.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationView;
import java.lang.Object;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import wpc.s;
import ekd.k1;

public final class d implements Runnable	// class@000f0d
{
    public final EditDecorationView b;
    public final int c;

    public void d(EditDecorationView p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       Bitmap uBitmap = BitmapFactory.decodeResource(a.a().a().getResources(), this.c);
       tb.l = uBitmap;
       tb.m.set(0, 0, uBitmap.getWidth(), tb.l.getHeight());
       k1.o(new s(tb));
    }
}
