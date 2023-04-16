package com.tencent.open.b;
import android.app.Dialog;
import android.content.Context;
import com.tencent.open.b$1;
import java.lang.String;
import android.os.Bundle;
import com.tencent.open.a;

public abstract class b extends Dialog	// class@000f52
{
    public a a;
    public final WebChromeClient b;

    public void b(Context p0,int p1){
       super(p0, p1);
       this.b = new b$1(this);
    }
    public abstract void a(String p0);
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.a = new a();
    }
}
