package com.kwai.library.widget.textview.DisableSaveInstanceStateTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Parcelable;
import android.view.View$BaseSavedState;

public class DisableSaveInstanceStateTextView extends TextView	// class@000a32
{

    public void DisableSaveInstanceStateTextView(Context p0){
       super(p0);
    }
    public void DisableSaveInstanceStateTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DisableSaveInstanceStateTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public Parcelable onSaveInstanceState(){
       super.onSaveInstanceState();
       return View$BaseSavedState.EMPTY_STATE;
    }
}
