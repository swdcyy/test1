package com.yxcorp.gifshow.reminder.mix.ReminderMixFragment$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.reminder.mix.ReminderMixFragment;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.page.cost.list.g;

public class ReminderMixFragment$1 extends LinearLayoutManager	// class@001aea
{
    public final ReminderMixFragment r;

    public void ReminderMixFragment$1(ReminderMixFragment p0,Context p1){
       this.r = p0;
       super(p1);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderMixFragment$1.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       this.r.G.d();
       return;
    }
}
