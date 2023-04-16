package com.yxcorp.gifshow.ad.detail.presenter.player.l$b;
import jkd.c;
import com.yxcorp.gifshow.ad.detail.presenter.player.l;
import java.lang.Object;
import jkd.b;
import java.lang.String;

public class l$b implements c	// class@001687
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void onCancel(){
       b.a(this);
    }
    public void onFail(int p0,String p1){
       b.b(this, p0, p1);
    }
    public void onSuccess(){
    }
}
