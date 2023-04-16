package com.yxcorp.gifshow.widget.EmojiEditText$b;
import android.view.View$OnKeyListener;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;

public class EmojiEditText$b implements View$OnKeyListener	// class@001830
{
    public final List b;

    public void EmojiEditText$b(){
       super();
       this.b = new ArrayList();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       Iterator obj;
       if (PatchProxy.isSupport(EmojiEditText$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, EmojiEditText$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.iterator();
       int i = 0;
    label_0029 :
       boolean b = false;
       while (obj.hasNext()) {
          if (obj.next().onKey(p0, p1, p2) || b) {
             b = true;
          }else {
             goto label_0029 ;
          }
       }
       return b;
    }
}
