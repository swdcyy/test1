package com.trello.rxlifecycle3.components.support.RxDialogFragment;
import gr8.a;
import androidx.fragment.app.DialogFragment;
import mrd.a;
import java.lang.Object;
import gr8.b;
import com.trello.rxlifecycle3.android.FragmentEvent;
import brd.t;
import gr8.c;
import com.trello.rxlifecycle3.android.a;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;

public abstract class RxDialogFragment extends DialogFragment implements a	// class@000fe9
{
    public final a b;

    public void RxDialogFragment(){
       super();
       this.b = a.g();
    }
    public b T8(Object p0){
       return this.Ug(p0);
    }
    public final b Ug(FragmentEvent p0){
       return c.c(this.b, p0);
    }
    public final b ge(){
       return a.b(this.b);
    }
    public final t m(){
       return this.b.hide();
    }
    public void onAttach(Activity p0){
       super.onAttach(p0);
       this.b.onNext(FragmentEvent.ATTACH);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.b.onNext(FragmentEvent.CREATE);
    }
    public void onDestroy(){
       this.b.onNext(FragmentEvent.DESTROY);
       super.onDestroy();
    }
    public void onDestroyView(){
       this.b.onNext(FragmentEvent.DESTROY_VIEW);
       super.onDestroyView();
    }
    public void onDetach(){
       this.b.onNext(FragmentEvent.DETACH);
       super.onDetach();
    }
    public void onPause(){
       this.b.onNext(FragmentEvent.PAUSE);
       super.onPause();
    }
    public void onResume(){
       super.onResume();
       this.b.onNext(FragmentEvent.RESUME);
    }
    public void onStart(){
       super.onStart();
       this.b.onNext(FragmentEvent.START);
    }
    public void onStop(){
       this.b.onNext(FragmentEvent.STOP);
       super.onStop();
    }
    public void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       this.b.onNext(FragmentEvent.CREATE_VIEW);
    }
}
