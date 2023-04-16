package com.k.a.BActivity;
import android.app.Activity;
import android.os.Bundle;
import com.k.a.BSProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import com.k.a.BSProvider$a;
import gx7.k;
import dx7.f;
import fn.a;
import java.lang.Runnable;
import f97.d;

public class BActivity extends Activity	// class@0006e8
{

    public void BActivity(){
       super();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       k.a.j();
       f.d.d();
       d.b(new a(this, BSProvider.d.a().getAndSet(false)));
       this.finish();
    }
}
