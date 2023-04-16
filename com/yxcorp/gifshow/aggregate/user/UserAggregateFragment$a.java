package com.yxcorp.gifshow.aggregate.user.UserAggregateFragment$a;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import na5.a;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import g69.e;
import com.kwai.component.fpsrecorder.ListScrollFpsRecorder;
import na5.d$a;
import java.lang.StringBuilder;
import na5.b;
import na5.d;
import com.kwai.component.fpsrecorder.PageFpsRecorder;

public class UserAggregateFragment$a	// class@001935
{
    public final ListScrollFpsRecorder a;
    public final PageFpsRecorder b;
    public final UserAggregateFragment c;

    public void UserAggregateFragment$a(UserAggregateFragment p0,a p1,String p2,BaseFragment p3,RecyclerView p4){
       this.c = p0;
       super();
       e uoe = new e(this);
       d$a uoa = new d$a(p1, p2+"_SCROLL");
       uoa.c(true);
       uoa.b(uoe);
       this.a = new ListScrollFpsRecorder(p3, p4, uoa.a());
       d$a uoa1 = new d$a(p1, p2+"_PAGE");
       uoa1.b(uoe);
       this.b = new PageFpsRecorder(p3, uoa1.a());
    }
}
