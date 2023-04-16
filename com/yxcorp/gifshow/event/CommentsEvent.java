package com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import java.lang.Object;

public class CommentsEvent	// class@000e80
{
    public final int a;
    public final QPhoto b;
    public final CommentsEvent$Operation c;
    public final QComment d;

    public void CommentsEvent(int p0,QPhoto p1,QComment p2,CommentsEvent$Operation p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
}
