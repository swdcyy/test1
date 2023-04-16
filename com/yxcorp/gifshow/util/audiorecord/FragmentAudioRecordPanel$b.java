package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$b;
import android.view.View$OnKeyListener;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;

public class FragmentAudioRecordPanel$b implements View$OnKeyListener	// class@001f3b
{
    public boolean b;
    public final FragmentAudioRecordPanel c;

    public void FragmentAudioRecordPanel$b(FragmentAudioRecordPanel p0){
       this.c = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p1 == 4) {
          if (!p2.getAction()) {
             this.b = true;
          }else if(p2.getAction() == 1 && this.b != null){
             this.c.Ug();
             this.b = false;
          }else {
             this.b = false;
          }
          return true;
       }else {
          this.b = false;
          return false;
       }
    }
}
