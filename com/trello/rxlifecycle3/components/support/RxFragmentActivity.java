package com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.a;
import androidx.fragment.app.FragmentActivity;
import mrd.a;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.t;
import java.lang.Object;
import gr8.c;
import com.trello.rxlifecycle3.android.a;
import android.os.Bundle;

public abstract class RxFragmentActivity extends FragmentActivity implements a	// class@000fe7
{
    public final a b;

    public void RxFragmentActivity(){
       super();
       this.b = a.g();
    }
    public void RxFragmentActivity(int p0){
       super(p0);
       this.b = a.g();
    }
    public final b E2(ActivityEvent p0){
       return c.c(this.b, p0);
    }
    public b T8(Object p0){
       return this.E2(p0);
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
