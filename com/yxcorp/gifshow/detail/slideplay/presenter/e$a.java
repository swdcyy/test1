package com.yxcorp.gifshow.detail.slideplay.presenter.e$a;
import jkd.c;
import com.yxcorp.gifshow.detail.slideplay.presenter.e;
import java.lang.Object;
import jkd.b;
import java.lang.String;

public class e$a implements c	// class@00185e
{
    public final e a;

    public void e$a(e p0){
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
