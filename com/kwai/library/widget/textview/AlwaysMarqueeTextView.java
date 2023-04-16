package com.kwai.library.widget.textview.AlwaysMarqueeTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;

public class AlwaysMarqueeTextView extends TextView	// class@000a30
{

    public void AlwaysMarqueeTextView(Context p0){
       super(p0);
    }
    public void AlwaysMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AlwaysMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean isFocused(){
       return true;
    }
}
