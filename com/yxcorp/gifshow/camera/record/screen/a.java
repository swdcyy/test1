package com.yxcorp.gifshow.camera.record.screen.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.screen.b;
import java.lang.Object;
import java.util.Objects;
import yg9.a;
import t45.c;

public final class a implements Runnable	// class@000f05
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       c.a(new a(tb));
    }
}
