package com.trello.rxlifecycle3.components.RxActivity;
import gr8.a;
import android.app.Activity;
import mrd.a;
import java.lang.Object;
import gr8.b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import brd.t;
import gr8.c;
import com.trello.rxlifecycle3.android.a;
import android.os.Bundle;

public abstract class RxActivity extends Activity implements a	// class@000fe6
{
    public final a b;

    public void RxActivity(){
       super();
       this.b = a.g();
    }
    public b T8(Object p0){
       return c.c(this.b, p0);
    }
    public final b ge(){
       return a.a(this.b);
    }
    public final t m(){
       return this.b.hide();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b.onNext(ActivityEvent.CREATE);
    }
    public void onDestroy(){
       this.b.onNext(ActivityEvent.DESTROY);
       super.onDestroy();
    }
    public void onPause(){
       this.b.onNext(ActivityEvent.PAUSE);
       super.onPause();
    }
    public void onResume(){
       super.onResume();
       this.b.onNext(ActivityEvent.RESUME);
    }
    public void onStart(){
       super.onStart();
       this.b.onNext(ActivityEvent.START);
    }
    public void onStop(){
       this.b.onNext(ActivityEvent.STOP);
       super.onStop();
    }
}
