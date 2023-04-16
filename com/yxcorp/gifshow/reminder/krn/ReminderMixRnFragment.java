package com.yxcorp.gifshow.reminder.krn.ReminderMixRnFragment;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.yxcorp.gifshow.reminder.krn.ReminderMixRnFragment$a;
import zj0.x;
import sec.a;
import java.lang.Throwable;
import java.util.HashMap;
import lc5.b;

public class ReminderMixRnFragment extends KwaiRnTab	// class@001ae7
{
    public static final int K;

    public void ReminderMixRnFragment(){
       super();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderMixRnFragment.class, "4")) {
          return;
       }
       try{
          super.onCreate(p0);
          this.Gg(new ReminderMixRnFragment$a(this));
       }catch(java.lang.Exception e4){
          String[] stringArray = new String[0];
          b.e("ReminderMixRnFragment Exception", e4, null, a.a(stringArray));
       }
       return;
    }
}
