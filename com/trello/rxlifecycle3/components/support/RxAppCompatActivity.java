package com.trello.rxlifecycle3.components.support.RxAppCompatActivity;
import gr8.a;
import androidx.appcompat.app.AppCompatActivity;
import mrd.a;
import java.lang.Object;
import gr8.b;
import com.trello.rxlifecycle3.android.ActivityEvent;
import brd.t;
import gr8.c;
import com.trello.rxlifecycle3.android.a;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public abstract class RxAppCompatActivity extends AppCompatActivity implements a	// class@000fe8
{
    public final a b;

    public void RxAppCompatActivity(){
       super();
       this.b = a.g();
    }
    public void RxAppCompatActivity(int p0){
       super(p0);
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
