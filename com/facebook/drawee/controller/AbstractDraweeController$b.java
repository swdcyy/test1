package com.facebook.drawee.controller.AbstractDraweeController$b;
import kb.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.lang.String;
import kb.c;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.NullPointerException;

public class AbstractDraweeController$b extends b	// class@001083
{
    public final String a;
    public final boolean b;
    public final AbstractDraweeController c;

    public void AbstractDraweeController$b(AbstractDraweeController p0,String p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailureImpl(c p0){
       this.c.onFailureInternal(this.a, p0, p0.e(), true);
    }
    public void onNewResultImpl(c p0){
       boolean b = p0.a();
       boolean b1 = p0.c();
       float progress = p0.getProgress();
       Object result = p0.getResult();
       if (result != null) {
          this.c.onNewResultInternal(this.a, p0, result, progress, b, this.b, b1);
       }else if(b){
          this.c.onFailureInternal(this.a, p0, new NullPointerException(), true);
       }
       return;
    }
    public void onProgressUpdate(c p0){
       this.c.onProgressUpdateInternal(this.a, p0, p0.getProgress(), p0.a());
    }
}
