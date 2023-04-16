package com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment$b;
import android.widget.AdapterView$OnItemSelectedListener;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment;
import android.widget.EditText;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.text.Editable;

public final class LivePlayTestActivity$TestContainerFragment$b implements AdapterView$OnItemSelectedListener	// class@00181b
{
    public final LivePlayTestActivity$TestContainerFragment b;
    public final EditText c;

    public void LivePlayTestActivity$TestContainerFragment$b(LivePlayTestActivity$TestContainerFragment p0,EditText p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       String str;
       if (PatchProxy.isSupport(LivePlayTestActivity$TestContainerFragment$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, LivePlayTestActivity$TestContainerFragment$b.class, "1")) {
          return;
       }
       this.c.clearFocus();
       this.b.ch();
       LivePlayTestActivity$TestContainerFragment$b tc = this.c;
       a.o(tc, "input");
       Editable text = tc.getText();
       if (text != null) {
          str = text.toString();
          if (str != null) {
          label_003e :
             int i = 1;
             if (p2 != i) {
                i = 2;
                if (p2 != i) {
                   if (p2 == 3) {
                      this.b.eh(str, 3);
                   }
                }else {
                   this.b.eh(str, i);
                }
             }else {
                this.b.eh(str, i);
             }
             return;
          }
       }
       str = "";
       goto label_003e ;
    }
    public void onNothingSelected(AdapterView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTestActivity$TestContainerFragment$b.class, "2")) {
          return;
       }
       this.b.ch();
       return;
    }
}
