package com.yxcorp.gifshow.share.widget.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.a0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class w extends Accessor	// class@001d38
{
    public final ForwardGridSectionWithImPanelFragment$d c;
    public final a0 d;

    public void w(a0 p0,ForwardGridSectionWithImPanelFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
