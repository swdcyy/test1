package com.yxcorp.gifshow.share.widget.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.a0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import java.lang.Object;
import com.kwai.sharelib.ui.SharePanelFragment;

public class p extends Accessor	// class@001d2f
{
    public final ForwardGridSectionWithImPanelFragment$d c;
    public final a0 d;

    public void p(a0 p0,ForwardGridSectionWithImPanelFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
