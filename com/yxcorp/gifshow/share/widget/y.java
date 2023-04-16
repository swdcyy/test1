package com.yxcorp.gifshow.share.widget.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.a0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;

public class y extends Accessor	// class@001d3a
{
    public final ForwardGridSectionWithImPanelFragment$d c;
    public final a0 d;

    public void y(a0 p0,ForwardGridSectionWithImPanelFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
